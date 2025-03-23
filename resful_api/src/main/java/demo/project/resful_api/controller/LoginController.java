package demo.project.resful_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
 @GetMapping("/login")
    public String login() {
        return "login";  // Đảm bảo trả về trang login.html
    }

    @GetMapping("/signup")
    public String signup() {
        return "signup";  // Đảm bảo trả về trang signup.html
    }
}
