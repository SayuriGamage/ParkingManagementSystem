package lk.ijse.userserver.repo;

import lk.ijse.userserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * ------------------------------------------------
 * Author: Sayuri Gamage
 * GitHub: https://github.com/sayuriGamage
 * Modified: 2025-06-25
 * ------------------------------------------------
 */



@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);
}
