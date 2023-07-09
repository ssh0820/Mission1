package com.example.mission1.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WifiBookMarkMapngVO {
    private int no;
    private String xSwifiMgrNo;
    private int bookMarkNo;
    private LocalDateTime rgsDt;
    private LocalDateTime updDt;

}
