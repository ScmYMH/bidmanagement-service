package com.scm.bidmanagement.mail.controller;

import com.scm.bidmanagement.mail.model.MailDto;
import com.scm.bidmanagement.mail.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mail")
public class MailControlelr {

    @Autowired
    MailService mailService;

    @Autowired
    MailDto mailDto;

    @PostMapping("/send")
    public void sendMail(@RequestBody MailDto mailDto) {
        mailDto.setEmail("hyejahong218@gmail.com");
        mailService.sendMail(mailDto);
    }
}
