package pl.fishingplace.fishingproject.exceptions;

public class NoSuchUserSerchingByUserNickException extends RuntimeException {
    public NoSuchUserSerchingByUserNickException(String userNick) {
        super("User " + userNick + " not found");
    }
}
