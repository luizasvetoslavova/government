package login.authentication;

public interface Authentication {
    boolean emailExists();
    boolean isPasswordCorrect();
}