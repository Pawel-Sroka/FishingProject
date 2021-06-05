package pl.fishingplace.fishingproject.exceptions;

public class NoSuchUserSerchingByUserMailException extends RuntimeException {
    public NoSuchUserSerchingByUserMailException(String userMail) {
        super("User with mail: " + userMail + " not found");
    }
}
