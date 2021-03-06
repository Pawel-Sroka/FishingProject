package pl.fishingplace.fishingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.fishingplace.fishingproject.domain.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
}
