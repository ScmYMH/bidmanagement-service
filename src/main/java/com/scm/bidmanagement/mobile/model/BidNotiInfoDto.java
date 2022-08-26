package com.scm.bidmanagement.mobile.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class BidNotiInfoDto {

    private String lsp_grp_nm;
    private String lsp_grp_cd;
    private String subj;
    private String ins_person_id;
    private String ins_date;
    private String ins_time;
    private String dw_mail_send_f;
    private String ins_start_date;
    private String ins_end_date;
    private String ins_person_nm;


}

