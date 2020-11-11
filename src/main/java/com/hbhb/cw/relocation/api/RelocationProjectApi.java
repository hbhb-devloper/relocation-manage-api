package com.hbhb.cw.relocation.api;

import org.springframework.web.bind.annotation.PutMapping;

public interface RelocationProjectApi {

    @PutMapping("/time")
    void updateContractDuration();

}
