package com.scm.bidmanagement.mobile.service;


import com.scm.bidmanagement.mobile.model.BidNotiInfoDto;

import java.util.List;

public interface BidNotiInfoService {

    List<BidNotiInfoDto> getBidNotiInfo(String ins_start_date, String ins_end_date, String subj);
}
