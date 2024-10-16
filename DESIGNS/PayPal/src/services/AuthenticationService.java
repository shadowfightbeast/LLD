package services;

public class AuthenticationService {
    public boolean login(String email, String password) {
        return true;
    }

    public void enableTwoFactorAuth(String userId) {
        System.out.println("work in progress");
    }

    public boolean verifyTwoFactorCode(String userId, String code) {
        return true;
    }
}
