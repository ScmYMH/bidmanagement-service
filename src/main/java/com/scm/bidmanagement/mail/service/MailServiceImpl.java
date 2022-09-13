package com.scm.bidmanagement.mail.service;

import com.scm.bidmanagement.mail.model.MailDto;
import com.scm.bidmanagement.mail.repository.MailInfoMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class MailServiceImpl implements MailService{

    private JavaMailSender mailSender;

    @Autowired
    MailInfoMapper mailInfoMapper;

    public void sendMail(MailDto mail) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(mail.getEmail());
        message.setFrom("hyejahong218@gamil.com");
        message.setSubject(mail.getSubj());

        String msg = "=============================================\n";

        msg += mail.getBltn_content() + "\n";
        msg += "=============================================";

        message.setText(msg);
        mailSender.send(message);
    }

    public List<MailDto> getMailInfo(MailDto mailDto) {
         return mailInfoMapper.getMailInfo(mailDto);
    }
}
