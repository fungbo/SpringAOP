package com.tw.model;

import com.tw.aop.annotation.Metric;
import org.springframework.stereotype.Component;

@Component
public class Noodle implements Food {
    @Metric
    public String getName() {
        return getClass().getSimpleName();
    }
}
