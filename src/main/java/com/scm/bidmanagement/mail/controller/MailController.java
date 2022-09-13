package com.scm.bidmanagement.mail.controller;

import com.scm.bidmanagement.mail.model.MailDto;
import com.scm.bidmanagement.mail.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mail")
@Slf4j
public class MailController {

    @Autowired
    MailService mailService;

    @Autowired
    MailDto mailDto;

    @PostMapping("/send")
    public void sendMail(@RequestBody MailDto mailDto) {
        List<MailDto> iiiii = mailService.getMailInfo(mailDto);
        mailService.updByMail(mailDto);
        log.info("iiiii >>> " + iiiii);
        for(int i = 0; i < iiiii.size(); i++) {
            mailDto.setEmail(iiiii.get(i).getEmail());
            mailService.sendMail((mailDto));
        }
    }

}
