package com.example.mission1.servlet;

import com.example.mission1.Property;
import com.example.mission1.vo.WifiVO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "wifiServlet", value = "/wifi-servlet")
public class WifiServlet extends HttpServlet {
    public List<WifiVO> selectWifiList() {

        List<WifiVO> wifiVOList = new ArrayList<WifiVO>();

        Connection conn = null;
        Statement stmt = null;
        ResultSet result = null;

        try {
            conn = DriverManager.getConnection(Property.DB_URL,Property.DB_ID,Property.DB_PW);
            stmt = conn.createStatement();

            String query = "select " +
                    " X_SWIFI_MGR_NO" +
                    ", X_SWIFI_WRDOFC" +
                    ", X_SWIFI_MAIN_NM" +
                    ", X_SWIFI_ADRES1 " +
                    ", X_SWIFI_ADRES2" +
                    ", X_SWIFI_INSTL_FLOOR" +
                    ", X_SWIFI_INSTL_TY" +
                    ", X_SWIFI_INSTL_MBY" +
                    ", X_SWIFI_SVC_SE" +
                    ", X_SWIFI_CMCWR" +
                    ", X_SWIFI_CNSTC_YEAR" +
                    ", X_SWIFI_INOUT_DOOR" +
                    ", X_SWIFI_REMARS3" +
                    ", LAT" +
                    ", LNT" +
                    ", WORK_DTTM" +
                    " from WIFI;";
            result = stmt.executeQuery(query);
            while(result.next()) {
                String xSwifiMgrNo = result.getString("X_SWIFI_MGR_NO");
                String xSwifiWrdofc = result.getString("X_SWIFI_WRDOFC");
                String xSwifiMainNm = result.getString("X_SWIFI_MAIN_NM");
                String xSwifiAdres1 = result.getString("X_SWIFI_ADRES1");
                String xSwifiAdres2 = result.getString("X_SWIFI_ADRES2");
                String xSwifiInstlFloor = result.getString("X_SWIFI_INSTL_FLOOR");
                String xSwifiInstlTy = result.getString("X_SWIFI_INSTL_TY");
                String xSwifiInstlMby = result.getString("X_SWIFI_INSTL_MBY");
                String xSwifiSvcSe = result.getString("X_SWIFI_SVC_SE");
                String xSwifiCmcwr = result.getString("X_SWIFI_CMCWR");
                String xSwifiCnstcYear = result.getString("X_SWIFI_CNSTC_YEAR");
                String xSwifiInoutDoor = result.getString("X_SWIFI_INOUT_DOOR");
                String xSwifiRemars3 = result.getString("X_SWIFI_REMARS3");
                Long lat = result.getLong("LAT");
                Long lnt = result.getLong("LNT");
                Date workDttm = result.getDate("WORK_DTTM");


                WifiVO wifiVO = new WifiVO();
                wifiVO.setXSwifiMgrNo(xSwifiMgrNo);
                wifiVO.setXSwifiWrdofc(xSwifiWrdofc);
                wifiVO.setXSwifiMainNm(xSwifiMainNm);
                wifiVO.setXSwifiAdres1(xSwifiAdres1);
                wifiVO.setXSwifiAdres2(xSwifiAdres2);
                wifiVO.setXSwifiInstlFloor(xSwifiInstlFloor);
                wifiVO.setXSwifiInstlTy(xSwifiInstlTy);
                wifiVO.setXSwifiInstlMby(xSwifiInstlMby);
                wifiVO.setXSwifiSvcSe(xSwifiSvcSe);
                wifiVO.setXSwifiCmcwr(xSwifiCmcwr);
                wifiVO.setXSwifiCnstcYear(xSwifiCnstcYear);
                wifiVO.setXSwifiInoutDoor(xSwifiInoutDoor);
                wifiVO.setXSwifiRemars3(xSwifiRemars3);
                wifiVO.setLat(lat);
                wifiVO.setLnt(lnt);
                wifiVO.setWorkDttm(workDttm);
                wifiVOList.add(wifiVO);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return wifiVOList;
    }
}