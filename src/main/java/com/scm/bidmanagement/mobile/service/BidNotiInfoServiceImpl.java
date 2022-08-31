package com.scm.bidmanagement.mobile.service;

import com.scm.bidmanagement.mobile.model.BidNotiInfoDto;
import com.scm.bidmanagement.mobile.repository.BidNotiInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class BidNotiInfoServiceImpl implements BidNotiInfoService{

    @Autowired
    BidNotiInfoMapper bidNotiInfoMapper;

    @Override
    public List<BidNotiInfoDto> getBidNotiInfo(String ins_start_date, String ins_end_date, String subj) {

        return bidNotiInfoMapper.getBidNotiInfo(ins_start_date,ins_end_date,subj);
    }

    @Override
    public void postBidInsertInfo(BidNotiInfoDto bidNotiInfoDto) {

        Date today = new Date();

        bidNotiInfoDto.setDel_yn("N");
        bidNotiInfoDto.setIns_person_id("20130222000003");
        bidNotiInfoDto.setIns_date(new SimpleDateFormat("yyyyMMdd").format(today));
        bidNotiInfoDto.setIns_time(new SimpleDateFormat("HHmmss").format(today));
        bidNotiInfoDto.setDw_mail_send_f("N");

        bidNotiInfoMapper.postBidInsertInfo(bidNotiInfoDto);

        return;
    }

    @Override
    public Integer delBidInsertInfo(Integer bltn_content_no){

        Date today = new Date();

        BidNotiInfoDto bidNotiInfoDto = new BidNotiInfoDto();

        bidNotiInfoDto.setBltn_content_no(bltn_content_no);
        bidNotiInfoDto.setDel_yn("Y");
        bidNotiInfoDto.setUpd_date(new SimpleDateFormat("yyyyMMdd").format(today));
        bidNotiInfoDto.setUpd_time(new SimpleDateFormat("HHmmss").format(today));
        bidNotiInfoDto.setUpd_person_id("20130624000004");

         bidNotiInfoMapper.delBidInsertInfo(bidNotiInfoDto);
         return 0;
    }
}