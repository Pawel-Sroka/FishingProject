package pl.fishingplace.fishingproject.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue
    private Long userId;
    @NotEmpty
    @Email
    private String userMail;
    private String userRole;
    private String userPassword;
    @UniqueElements
    private String userNick;
    private String userFooter;
    private Long userAmountOfPosts;
    @OneToMany(mappedBy = "author")
    private List<Topic> usersTopics;

}
