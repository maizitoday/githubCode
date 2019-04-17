package com.example.demo;

import entity.MaiziUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yubo
 * @version V2.0
 * @Description:
 * @date 2019/4/17 下午6:44
 * @Company: cecsm.com
 * @Copyright Copyright (c) 2017
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String  URL = "http://localhost:8001";

    @RequestMapping("getData")
    private MaiziUser getData()
    {
        return restTemplate.getForObject(URL+ "provide",MaiziUser.class);
    }
}
