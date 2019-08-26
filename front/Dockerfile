
FROM node:alpine

WORKDIR /front
COPY . /front/
EXPOSE 8300

RUN npm install -g --quiet

EXPOSE 8000
CMD [ "npm", "start" ]
