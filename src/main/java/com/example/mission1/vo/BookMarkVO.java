package com.example.mission1.vo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BookMarkVO {
    private int no;
    private String name;
    private LocalDateTime rgsDt;
    private LocalDateTime updDt;

}
