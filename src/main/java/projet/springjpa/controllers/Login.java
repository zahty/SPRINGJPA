package projet.springjpa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class Login {
    @Controller
    @RequestMapping("")
    public class LoginController {
        @GetMapping("/login")
        public String login(Model model) {
            model.addAttribute("message", "Bienvenue, veuillez vous connecter");
            return "login/login";
        }

        @GetMapping("")
        public String dasboard() {
            return "/dashboard/dashboard";
        }
    }
}
