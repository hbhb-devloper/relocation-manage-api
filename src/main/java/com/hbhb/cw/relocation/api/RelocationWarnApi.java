package com.hbhb.cw.relocation.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface RelocationWarnApi {

    @PostMapping("/add")
    void addWarn();

    @GetMapping("/count")
    Long countWarn(@RequestParam("unitId") Integer unitId);
}
