package game_project.model;

import java.util.HashMap;
import java.util.Map;

// 사용자 정보 DTO
public class LoginDTO {
    private String username;
    private String userId;
    private String password;

    public LoginDTO(){};

    public LoginDTO(String username, String userId, String password){
        this.username = username;
        this.userId = userId;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
