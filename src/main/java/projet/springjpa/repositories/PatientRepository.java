package projet.springjpa.repositories;

import org.springframework.data.repository.CrudRepository;
import projet.springjpa.entities.PatientEntity;

public interface PatientRepository extends CrudRepository<PatientEntity, Integer> {
}
