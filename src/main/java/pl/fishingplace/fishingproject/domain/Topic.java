package pl.fishingplace.fishingproject.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Topic {
    @Id
    @GeneratedValue
    private Long postId;
    private String thread;
    private String topicName;
    @ManyToOne
    private User author;
    @OneToMany(mappedBy = "topic")
    private List<Post> posts;

}
