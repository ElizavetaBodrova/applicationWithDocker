package appdocker.webapp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LogInService {
    private List<UserDto> users = new ArrayList<>() {
        {
            add(new UserDto("user1", "123"));
            add(new UserDto("user2", "1234"));
        }
    };

    public boolean login(String login, String password) {
        if (login != null && password != null) {
            return users.stream().anyMatch(u -> u.getLogin().equals(login) && u.getPassword().equals(password));
        } else {
            return false;
        }
    }

}
