package pl.fishingplace.fishingproject.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.fishingplace.fishingproject.mappers.CreateUserRequestToUserMapper;
import pl.fishingplace.fishingproject.service.UserService;
import pl.fishingplace.fishingproject.web.dto.CreateUserRequest;
import pl.fishingplace.fishingproject.web.dto.UserResponse;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
    private final UserService service;
   private final CreateUserRequestToUserMapper createUserRequestToUserMapper;

   //@GetMapping("/{userId}")
    //public User findById(Long Id)

}
