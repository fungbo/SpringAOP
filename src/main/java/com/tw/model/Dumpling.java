package com.tw.model;

import org.springframework.stereotype.Component;

@Component
public class Dumpling implements Food {
    public String getName() {
        return getClass().getSimpleName();
    }
}
