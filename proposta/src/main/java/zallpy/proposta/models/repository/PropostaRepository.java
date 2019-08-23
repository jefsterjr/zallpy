package zallpy.proposta.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zallpy.proposta.models.entities.Proposta;

@Repository
public interface PropostaRepository extends JpaRepository<Proposta, Long> {
}
