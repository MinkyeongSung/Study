package gui.project.ex00;

import com.google.gson.Gson;

class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

public class Lib01 {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("ssar");
        user.setPassword("2134");
        // 문자열로 바꿀 때 제이슨이라는 데이터로 바꿔줘야함
        // 그래서 Gson

        String testData = "{\"username\" : \"ssar\"}"; // 귀찮아
        System.out.println(testData);

        Gson gson = new Gson();
        String requestBody = gson.toJson(user);
        System.out.println(requestBody);
    }

}
