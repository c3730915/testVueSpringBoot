package com.example.testvue;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class FormData {
    LocalDateTime date1;
    LocalDateTime date2;
    Boolean delivery;
    String desc;
    String name;
    String region;
    String resource;
    List<String> type;

}
