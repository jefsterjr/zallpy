package api.credito.models.repository;

import api.credito.models.entities.Analise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnaliseRepository extends JpaRepository<Analise, Long> {

    List<Analise> findAllByPropostaCpf(String cpf);
}
