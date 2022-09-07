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
    public Integer postBidInsertInfo(@RequestBody BidNotiInfoDto bidNotiInfoDto) {
        return bidNotiInfoService.postBidInsertInfo(bidNotiInfoDto);
    }

    @PutMapping("/{bltn_content_no}")
    public Integer deleteBidNotiInfo(@PathVariable Integer bltn_content_no) {

        return bidNotiInfoService.delBidInsertInfo(bltn_content_no);

    }

    @GetMapping("/detail/{bltn_content_no}")
    public List<BidNotiInfoDto> getDetailNotiInfo(@PathVariable Integer bltn_content_no) {
        return bidNotiInfoService.getDetailNotiInfo(bltn_content_no);
    }

    @PutMapping("")
    public Integer updateNotiInfo(@RequestBody BidNotiInfoDto bidNotiInfoDto) {
        return bidNotiInfoService.updateNotiInfo(bidNotiInfoDto);
    }

}