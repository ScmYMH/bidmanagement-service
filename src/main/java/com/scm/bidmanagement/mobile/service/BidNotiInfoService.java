package com.scm.bidmanagement.mobile.service;


import com.scm.bidmanagement.mobile.model.BidNotiInfoDto;
import com.scm.bidmanagement.mobile.model.LspNmDto;

import java.util.List;

public interface BidNotiInfoService {

    List<BidNotiInfoDto> getBidNotiInfo(String ins_start_date, String ins_end_date, String subj);
    BidNotiInfoDto postBidInsertInfo(BidNotiInfoDto bidNotiInfoDto);
    Integer delBidInsertInfo(Integer bltn_content_no);
    List<BidNotiInfoDto> getDetailNotiInfo(Integer bltn_content_no);
    Integer updateNotiInfo(BidNotiInfoDto bidNotiInfoDto);
    List<LspNmDto> getLspGrpNm();
}