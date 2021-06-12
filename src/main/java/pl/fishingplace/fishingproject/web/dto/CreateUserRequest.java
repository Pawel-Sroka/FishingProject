package pl.fishingplace.fishingproject.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.validation.constraints.Email;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {
    @Email
    private String userMail;
    private String userRole;
    private String userPassword;
    @UniqueElements
    private String userNick;
    private String userFooter;
    private Long userAmountOfPosts;
}
