package appdocker.webapp.controller;

import appdocker.webapp.services.LogInService;
import org.springframework.web.bind.annotation.*;


@RestController
public class LogInController {
    public LogInService logInService;

    public LogInController(LogInService logInService) {
        this.logInService = logInService;
    }

   @GetMapping("/login")
    public boolean login(@RequestBody String login, @RequestBody String password) {
        return logInService.login(login, password);
    }
}
