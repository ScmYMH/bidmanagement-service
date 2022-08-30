package com.scm.bidmanagement.mobile.controller;


import com.scm.bidmanagement.mobile.model.BidNotiInfoDto;
import com.scm.bidmanagement.mobile.service.BidNotiInfoServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bid/noti")
@Slf4j
public class BidNotiInfoController {

    @Autowired
    BidNotiInfoServiceImpl bidNotiInfoService;

    @GetMapping("")
    public List<BidNotiInfoDto> getBidNotiInfo(@RequestParam String ins_start_date, @RequestParam String ins_end_date, @RequestParam String subj) {
        return bidNotiInfoService.getBidNotiInfo(ins_start_date,ins_end_date,subj);
    }

    @PostMapping("")
    public List<BidNotiInfoDto> postBidInsertInfo(@RequestBody BidNotiInfoDto bidNotiInfoDto) {
        return bidNotiInfoService.postBidInsertInfo(bidNotiInfoDto);
    }

}