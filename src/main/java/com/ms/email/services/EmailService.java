package com.ms.email.services;

import com.ms.email.enums.EmailStatus;
import com.ms.email.models.EmailModel;
import com.ms.email.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    @Autowired
    private JavaMailSender emailSender;

//    public void sendEmail(EmailModel emailModel) {
//        emailModel.setSendEmailDate(LocalDateTime.now());
//        try{
//            SimpleMailMessage message = new SimpleMailMessage();
//            message.setFrom(emailModel.getEmailFrom());
//            message.setTo(emailModel.getEmailTo());
//            message.setSubject(emailModel.getSubject());
//            message.setText(emailModel.getText());
//            emailSender.send(message);
//
//            emailModel.setEmailStatus(EmailStatus.SENT);
//        } catch (MailException e){
//            emailModel.setEmailStatus(EmailStatus.ERROR);
//        } finally {
//            emailRepository.save(emailModel);
//            return;
//        }
//    }

    public EmailModel sendEmail(EmailModel emailModel) {
        emailModel.setSendEmailDate(LocalDateTime.now());
        try{
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(emailModel.getEmailFrom());
            message.setTo(emailModel.getEmailTo());
            message.setSubject(emailModel.getSubject());
            message.setText(emailModel.getText());
            emailSender.send(message);

            emailModel.setEmailStatus(EmailStatus.SENT);
        } catch (MailException e){
            emailModel.setEmailStatus(EmailStatus.ERROR);
        } finally {
            return emailRepository.save(emailModel);
        }
    }
}
