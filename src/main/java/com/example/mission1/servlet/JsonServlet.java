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
            String X_SWIFI_MGR_NO = object.get("X_SWIFI_MGR_NO").getAsString();
            String X_SWIFI_WRDOFC = object.get("X_SWIFI_WRDOFC").getAsString();
            String X_SWIFI_MAIN_NM = object.get("X_SWIFI_MAIN_NM").getAsString();
            String X_SWIFI_ADRES1 = object.get("X_SWIFI_ADRES1").getAsString();
            String X_SWIFI_ADRES2 = object.get("X_SWIFI_ADRES2").getAsString();
            String X_SWIFI_INSTL_FLOOR = object.get("X_SWIFI_INSTL_FLOOR").getAsString();
            String X_SWIFI_INSTL_TY = object.get("X_SWIFI_INSTL_TY").getAsString();
            String X_SWIFI_INSTL_MBY = object.get("X_SWIFI_INSTL_MBY").getAsString();
            String X_SWIFI_SVC_SE = object.get("X_SWIFI_SVC_SE").getAsString();
            String X_SWIFI_CMCWR = object.get("X_SWIFI_CMCWR").getAsString();
            String X_SWIFI_CNSTC_YEAR = object.get("X_SWIFI_CNSTC_YEAR").getAsString();
            String X_SWIFI_INOUT_DOOR = object.get("X_SWIFI_INOUT_DOOR").getAsString();
            String X_SWIFI_REMARS3 = object.get("X_SWIFI_REMARS3").getAsString();
            String LAT = object.get("LAT").getAsString();
            String LNT = object.get("LNT").getAsString();
            String WORK_DTTM = object.get("WORK_DTTM").getAsString();

            System.out.println(object.get("list_total_count").getAsString());
            System.out.println(X_SWIFI_MGR_NO + " " + X_SWIFI_WRDOFC + " " + X_SWIFI_MAIN_NM + " " + X_SWIFI_ADRES1 + " " + X_SWIFI_ADRES2 + " " + X_SWIFI_INSTL_FLOOR + " " + X_SWIFI_INSTL_TY + " " + X_SWIFI_INSTL_MBY + " " + X_SWIFI_SVC_SE + " " + X_SWIFI_CMCWR + " " + X_SWIFI_CNSTC_YEAR + " " + X_SWIFI_INOUT_DOOR + " " + X_SWIFI_REMARS3 + " " + LAT + " " + LNT + " " + WORK_DTTM);
        }
        return 0;
    }
}
