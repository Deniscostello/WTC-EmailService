package ie.atu.wtcemailservice;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailController {
    private final EmailSendService sendService;

    public EmailController(EmailSendService sendService) {
        this.sendService = sendService;
    }

    @PostMapping("/email")
    public String emailUser(@RequestBody User user){
        String subject = "Hi " + user.getUsername() + " welcome to the platform";
        sendService.sendEmail(user.getEmail(), subject, "You are now registered");
        String confirmEmail = "User emailed";
        return confirmEmail;
    }
}