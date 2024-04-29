package com.xhs.zbserver.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("solr-server")
public interface SolrService {
    @GetMapping("query")
    String query();
}
