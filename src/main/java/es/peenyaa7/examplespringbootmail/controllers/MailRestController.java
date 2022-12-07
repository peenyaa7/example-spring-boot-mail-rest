package es.peenyaa7.examplespringbootmail.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.peenyaa7.examplespringbootmail.services.MailService;

@RestController
@RequestMapping("/mail")
public class MailRestController {
    
    @Autowired
    private MailService mailService;

    @GetMapping("/send")
    public ResponseEntity<?> sendMail(
        @RequestParam String to,
        @RequestParam String subject,
        @RequestParam String body
    ) {

        // Comprobamos que los parámetros no sean nulos
        if (to == null || subject == null || body == null) {
            return ResponseEntity.badRequest().body("Missing parameters");
        }

        // Enviamos el correo
        mailService.sendMail(to, subject, body);
        return ResponseEntity.ok("Mail sent to: " + to);
    }

}
