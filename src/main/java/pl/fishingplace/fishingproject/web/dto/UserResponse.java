package pl.fishingplace.fishingproject.web.dto;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.stereotype.Component;
import pl.fishingplace.fishingproject.domain.Topic;

import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Component
public class UserResponse {
    private Long userId;
    private String userMail;
    private String userRole;
    private String userPassword;
    private String userNick;
    private String userFooter;
    private Long userAmountOfPosts;
    private List<Topic> usersTopics;
}
