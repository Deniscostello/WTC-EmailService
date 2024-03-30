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
    public String emailUser(@Valid @RequestBody EmailData emailData){
        String subject = "Hi " + emailData.getName() + " welcome to the platfrom";
        sendService.sendEmail(emailData.getEmail(), subject, "You are now registered");
        String confirmEmail = "User emailed";
        return confirmEmail;
    }
}