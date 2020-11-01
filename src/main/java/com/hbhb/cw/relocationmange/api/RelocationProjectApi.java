package com.hbhb.cw.relocationmange.api;

import org.springframework.web.bind.annotation.PutMapping;

public interface RelocationProjectApi {

    @PutMapping("/time")
    void updateContractDuration();

}
