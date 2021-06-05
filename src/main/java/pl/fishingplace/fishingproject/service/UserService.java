package pl.fishingplace.fishingproject.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.fishingplace.fishingproject.domain.User;
import pl.fishingplace.fishingproject.exceptions.NoSuchUserSerchingByIdException;
import pl.fishingplace.fishingproject.exceptions.NoSuchUserSerchingByUserMailException;
import pl.fishingplace.fishingproject.exceptions.NoSuchUserSerchingByUserNameException;
import pl.fishingplace.fishingproject.repository.UserRepository;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User findById(Long id){
        return repository.findById(id).orElseThrow(()-> new NoSuchUserSerchingByIdException(id));
    }
    public User findByUserName(String userName){
        return repository.findByUserName(userName).orElseThrow(()->new NoSuchUserSerchingByUserNameException(userName));
    }
    public User findByUserMail(String userMail){
        return repository.findByUserMail(userMail).orElseThrow(()-> new NoSuchUserSerchingByUserMailException(userMail));
    }
}
