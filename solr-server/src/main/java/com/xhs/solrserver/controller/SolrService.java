package com.xhs.solrserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolrService {


    @GetMapping("/query")
    public String query(){
        return "solr";
    }
}
