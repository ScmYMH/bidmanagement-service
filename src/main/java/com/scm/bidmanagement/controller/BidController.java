package com.scm.bidmanagement.controller;

import com.scm.bidmanagement.service.BidServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bid")
@Slf4j
public class BidController {
    @Autowired
    BidServiceImpl bidService;

}
