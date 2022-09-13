package com.scm.bidmanagement.mail.service;

import com.scm.bidmanagement.mail.model.MailDto;

import java.util.List;

public interface MailService {

    void sendMail(MailDto mail);

    List<MailDto> getMailInfo(MailDto mailDto);
}
