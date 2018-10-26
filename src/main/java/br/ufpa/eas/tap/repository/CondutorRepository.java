package br.ufpa.eas.tap.repository;

import br.ufpa.eas.tap.domain.Condutor;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Condutor entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CondutorRepository extends JpaRepository<Condutor, Long> {

}
