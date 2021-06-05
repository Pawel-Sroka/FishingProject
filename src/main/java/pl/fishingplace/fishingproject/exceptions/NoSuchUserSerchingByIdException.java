package pl.fishingplace.fishingproject.exceptions;

public class NoSuchUserSerchingByIdException extends RuntimeException{
    public NoSuchUserSerchingByIdException(Long id){
                super("User with id: "+id+" do not exist");
    }
}
