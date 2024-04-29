package com.xhs.zbserver.controller;

import com.xhs.zbserver.remote.SolrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Zbcontroller {

    @Autowired
    private SolrService solrService;

    @GetMapping("getZb")
    public String getZb(){
        String query = solrService.query();
        return query;
    }
}
