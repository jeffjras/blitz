package br.ufpa.eas.tap.repository;

import br.ufpa.eas.tap.domain.Orgao;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Orgao entity.
 */
@SuppressWarnings("unused")
@Repository
public interface OrgaoRepository extends JpaRepository<Orgao, Long> {

}
