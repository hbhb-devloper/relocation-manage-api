package com.hbhb.cw.relocationmange.api;

import org.springframework.web.bind.annotation.PostMapping;

public interface RelocationWarnApi {

    @PostMapping("/add")
    void addWarn();
}
