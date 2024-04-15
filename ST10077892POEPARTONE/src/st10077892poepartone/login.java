package st10077892poepartone;


 public class login {
         public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }
         
         public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*\\d.*") &&
                password.matches(".*[@#$%^&+=!].*");
    }
         
         public String registerUser(String username, String password) {
        if (!checkUserName(username)) {
            return "Username is incorrectly formatted";
        } else if (!checkPasswordComplexity(password)) {
            return "Password does not meet the complexity requirements";
        } else {
            return "User registered successfully";
        }
    }
         
         public boolean loginUser(String storedUsername, String storedPassword, String enteredUsername, String enteredPassword) {
        return storedUsername.equals(enteredUsername) && storedPassword.equals(enteredPassword);
    }
         
         public String returnLoginStatus(boolean isLoggedIn) {
        if (isLoggedIn) {
            return "Successful login";
        } else {
            return "Failed login";
        }
    }
    }
