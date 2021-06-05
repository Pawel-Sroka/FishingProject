package pl.fishingplace.fishingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.fishingplace.fishingproject.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
