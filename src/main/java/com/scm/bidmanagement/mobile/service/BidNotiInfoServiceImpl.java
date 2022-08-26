package com.scm.bidmanagement.mobile.service;

import com.scm.bidmanagement.mobile.model.BidNotiInfoDto;
import com.scm.bidmanagement.mobile.repository.BidNotiInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
