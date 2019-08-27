angular.module('app.login', ['ngRoute']).controller('LoginController', ['$location', '$window', '$http', '$scope', function ($location, $window, $http, scope) {
    scope.initController = () => {
        $window.localStorage.setItem('token', '');
    };
    scope.login = () => {
        $http({
            url: 'http://localhost:8300/login',
            method: "POST",
            data: {
                'userName': scope.vm.username,
                'password': scope.vm.password
            }
        }).then(function (response) {
            if (response.data) {
                var token = $window.btoa(scope.vm.username + ':' + scope.vm.password);
                var userData = {
                    userName: scope.vm.username,
                    authData: token
                };
                $window.sessionStorage.setItem(
                    'userData', JSON.stringify(userData)
                );
                $http.defaults.headers.common['Authorization'] = 'Basic ' + token;
                $location.path('/proposta');
            } else {
                alert("Usuário não cadastrado")
            }
        });

    }
}]);
