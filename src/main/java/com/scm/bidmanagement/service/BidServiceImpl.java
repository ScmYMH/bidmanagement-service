package com.scm.bidmanagement.service;

import com.scm.bidmanagement.repository.BidMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BidServiceImpl {

    @Autowired
    BidMapper bidMapper;
}
