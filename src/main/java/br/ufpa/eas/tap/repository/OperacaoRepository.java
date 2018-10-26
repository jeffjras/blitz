package br.ufpa.eas.tap.repository;

import br.ufpa.eas.tap.domain.Operacao;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Operacao entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OperacaoRepository extends JpaRepository<Operacao, Long> {

}
