package appdocker.webapp.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LogInService {
    private Map<String,String> logins = new HashMap<>() {
        {
            put("user1","123");
            put("user2","1234");
        }
    };

    public boolean login(String login, String password) {
        if (login != null && password != null) {
            return logins.containsKey(login) && logins.get(login).equals(password);
        } else {
            return false;
        }
    }
}
