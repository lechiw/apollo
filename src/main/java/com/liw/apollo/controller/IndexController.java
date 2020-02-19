package com.liw.apollo.controller;

import com.liw.apollo.request.IndexRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：Index
 * create by Liw
 * create on 2020/2/17 0017
 **/

@RestController
public class IndexController {

    @Value("${xyz.name}")
    private String name ;

    @Value("${com.liw.name}")
    private String wName ;


    @GetMapping("/index1")
    public String index(){
        return "hello " + name + wName ;
    }

    @GetMapping("/index2")
    public IndexRequest indexRequest(){
        IndexRequest indexRequest = new IndexRequest();
        indexRequest.setId(123);
        indexRequest.setName("name");
        return indexRequest;
    }

    @GetMapping("/index3")
    public IndexRequest index3(@ModelAttribute IndexRequest indexRequest){
        return indexRequest;
    }
}
