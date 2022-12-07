package es.peenyaa7.examplespringbootmail.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    
    @Autowired
    private JavaMailSender emailSender; // Este servicio se inyecta automáticamente por Spring Boot Mail Starter

    public void sendMail(String to, String subject, String body) {
        
        // Creamos el correo
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        
        // Informamos por consola
        System.out.println("Sending mail to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);

        // Enviamos el correo
        emailSender.send(message);
    }

}
 