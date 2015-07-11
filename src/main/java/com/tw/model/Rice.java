package com.tw.model;

import com.tw.aop.annotation.Metric;
import org.springframework.stereotype.Component;

@Component
public class Rice implements Food {
    @Metric
    public String getName() {
        return getClass().getSimpleName();
    }
}
