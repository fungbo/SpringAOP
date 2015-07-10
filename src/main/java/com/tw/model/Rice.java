package com.tw.model;

import com.tw.aop.annotation.Wrapper;
import org.springframework.stereotype.Component;

@Component
public class Rice implements Food {
    @Wrapper
    public String getName() {
        return getClass().getSimpleName();
    }
}
