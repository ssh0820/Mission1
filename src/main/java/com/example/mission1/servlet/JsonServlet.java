package com.example.mission1.servlet;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonServlet {

    private int maxSize = 0;

    public int jsonCheck(){
        int result = 0;



        return result;
    }

    public int jsonInsert(String json) {
        JsonParser jsonParser = new JsonParser();
        JsonArray jsonArray = (JsonArray) jsonParser.parseString(json);

        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject object = (JsonObject) jsonArray.get(i);
            String xSwifiMgrNo = object.get("X_SWIFI_MGR_NO").getAsString();
            String xSwifiWrdofc = object.get("X_SWIFI_WRDOFC").getAsString();
            String xSwifiMainNm = object.get("X_SWIFI_MAIN_NM").getAsString();
            String xSwifiAdres1 = object.get("X_SWIFI_ADRES1").getAsString();
            String xSwifiAdres2 = object.get("X_SWIFI_ADRES2").getAsString();
            String xSwifiInstlFloor = object.get("X_SWIFI_INSTL_FLOOR").getAsString();
            String xSwifiInstlTy = object.get("X_SWIFI_INSTL_TY").getAsString();
            String xSwifiInstlMby = object.get("X_SWIFI_INSTL_MBY").getAsString();
            String xSwifiSvcSe = object.get("X_SWIFI_SVC_SE").getAsString();
            String xSwifiCmcwr = object.get("X_SWIFI_CMCWR").getAsString();
            String xSwifiCnstcYear = object.get("X_SWIFI_CNSTC_YEAR").getAsString();
            String xSwifiInoutDoor = object.get("X_SWIFI_INOUT_DOOR").getAsString();
            String xSwifiRemars3 = object.get("X_SWIFI_REMARS3").getAsString();
            String lat = object.get("LAT").getAsString();
            String lnt = object.get("LNT").getAsString();
            String workDttm = object.get("WORK_DTTM").getAsString();

            System.out.println(object.get("list_total_count").getAsString());
            }
        return 0;
    }
}
