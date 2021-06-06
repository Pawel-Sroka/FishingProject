package pl.fishingplace.fishingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.fishingplace.fishingproject.domain.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
