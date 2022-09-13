package com.scm.bidmanagement.mail.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class MailDto {

    private String email;
    private String bltn_content;
    private String subj;
    private String lsp_grp_cd;
    private Integer bltn_content_no;

}
