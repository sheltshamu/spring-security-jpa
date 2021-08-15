package zw.co.afrosoft.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/afrosoft")
public class HomeController {

    public String home(){
        return ("<h1>Welcome To the Home Page</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome Admin</h1>");
    }
}
