package com.scm.bidmanagement.mobile.repository;

import com.scm.bidmanagement.mobile.model.BidNotiInfoDto;
import com.scm.bidmanagement.mobile.model.LspNmDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BidNotiInfoMapper {

    List<BidNotiInfoDto> getBidNotiInfo(String ins_start_date, String ins_end_date, String subj);
    Integer postBidInsertInfo(BidNotiInfoDto bidNotiInfoDto);
    Integer delBidInsertInfo(BidNotiInfoDto bidNotiInfoDto);
    List<BidNotiInfoDto> getDetailNotiInfo(Integer bltn_content_no);
    Integer updateNotiInfo(BidNotiInfoDto bidNotiInfoDto);

    List<LspNmDto> getLspGrpNm();
}