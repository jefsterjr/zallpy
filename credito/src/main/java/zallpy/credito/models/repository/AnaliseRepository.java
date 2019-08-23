package zallpy.credito.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zallpy.credito.models.entities.Analise;

import java.util.List;

@Repository
public interface AnaliseRepository extends JpaRepository<Analise, Long> {

    List<Analise> findAllByPropostaCpf(String cpf);
}
