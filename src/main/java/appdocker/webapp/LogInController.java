package appdocker.webapp;

import org.springframework.web.bind.annotation.*;


@RestController
public class LogInController {
    private final LogInService logInService;

    public LogInController(LogInService logInService) {
        this.logInService = logInService;
    }

   @PostMapping("/login")
   @ResponseBody
    public boolean login(@RequestBody UserDto userDto) {
        return logInService.login(userDto.getLogin(), userDto.getPassword());
    }
}
