package com.scm.bidmanagement.mail.service;

import com.scm.bidmanagement.mail.model.MailDto;

public interface MailService {

    void sendMail(MailDto mail);
}
