package pl.fishingplace.fishingproject.exceptions;

public class NoSuchUserSerchingByUserNameException extends RuntimeException {
    public NoSuchUserSerchingByUserNameException(String userName) {
        super("User " + userName + " not found");
    }
}
