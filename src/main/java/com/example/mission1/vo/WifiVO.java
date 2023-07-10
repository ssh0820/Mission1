package com.example.mission1.vo;

import lombok.Data;

import java.util.Date;

@Data
public class WifiVO {
    private int no;
    private String xSwifiMgrNo;
    private String xSwifiWrdofc;
    private String xSwifiMainNm;
    private String xSwifiAdres1;
    private String xSwifiAdres2;
    private String xSwifiInstlFloor;
    private String xSwifiInstlTy;
    private String xSwifiInstlMby;
    private String xSwifiSvcSe;
    private String xSwifiCmcwr;
    private String xSwifiCnstcYear;
    private String xSwifiInoutDoor;
    private String xSwifiRemars3;
    private Long lat;
    private Long lnt;
    private Date workDttm;

}
