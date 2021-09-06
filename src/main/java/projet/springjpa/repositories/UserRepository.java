package projet.springjpa.repositories;

import org.springframework.data.repository.CrudRepository;
import projet.springjpa.entities.UserEntity;


public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
