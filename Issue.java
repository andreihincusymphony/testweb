package com.checkmarx.flow.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

public class Issue {

    private String id;
    private String url;
    private String title;
    private String body;
    private String state;
    private List<String> labels;
    private Map<String, String> metadata;
    // test
    // test
    //test
    //test. teree
    // and another one.......
}
