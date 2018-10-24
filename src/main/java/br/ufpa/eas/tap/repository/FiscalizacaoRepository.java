package br.ufpa.eas.tap.repository;

import br.ufpa.eas.tap.domain.Fiscalizacao;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Fiscalizacao entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FiscalizacaoRepository extends JpaRepository<Fiscalizacao, Long> {

}
