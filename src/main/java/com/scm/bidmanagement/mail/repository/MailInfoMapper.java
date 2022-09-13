package com.scm.bidmanagement.mail.repository;

import com.scm.bidmanagement.mail.model.MailDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MailInfoMapper {

    List<MailDto> getMailInfo(MailDto mailDto);
}
