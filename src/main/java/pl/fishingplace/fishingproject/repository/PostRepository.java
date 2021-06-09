package pl.fishingplace.fishingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.fishingplace.fishingproject.domain.Post;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
}
