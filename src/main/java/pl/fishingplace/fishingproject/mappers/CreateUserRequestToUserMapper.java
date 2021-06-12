package pl.fishingplace.fishingproject.mappers;

import pl.fishingplace.fishingproject.domain.Role;
import pl.fishingplace.fishingproject.domain.User;
import pl.fishingplace.fishingproject.web.dto.CreateUserRequest;

public class CreateUserRequestToUserMapper {
    public User toDomain(CreateUserRequest createUserRequest){
        return User.builder()
                .userMail(createUserRequest.getUserMail())
                .userRole(Role.USER_ROLE)
                .userPassword(createUserRequest.getUserPassword())
                .userNick(createUserRequest.getUserNick())
                .userFooter(createUserRequest.getUserFooter())
                .userAmountOfPosts(0L)
                .build();
    }
}
