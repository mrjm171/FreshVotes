package co.uk.pickmefirst.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import co.uk.pickmefirst.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

  User findByUsername(String username);

}