package com.example.mission1.servlet;

import com.example.mission1.Property;
import com.example.mission1.vo.WifiVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "wifiServlet", value = "/wifi-servlet")
public class WifiServlet extends HttpServlet {
    public static void main(String[] args) {

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
                String X_SWIFI_MGR_NO = result.getString("X_SWIFI_MGR_NO");
                String X_SWIFI_WRDOFC = result.getString("X_SWIFI_WRDOFC");
                String X_SWIFI_MAIN_NM = result.getString("X_SWIFI_MAIN_NM");
                String X_SWIFI_ADRES1 = result.getString("X_SWIFI_ADRES1");
                String X_SWIFI_ADRES2 = result.getString("X_SWIFI_ADRES2");
                String X_SWIFI_INSTL_FLOOR = result.getString("X_SWIFI_INSTL_FLOOR");
                String X_SWIFI_INSTL_TY = result.getString("X_SWIFI_INSTL_TY");
                String X_SWIFI_INSTL_MBY = result.getString("X_SWIFI_INSTL_MBY");
                String X_SWIFI_SVC_SE = result.getString("X_SWIFI_SVC_SE");
                String X_SWIFI_CMCWR = result.getString("X_SWIFI_CMCWR");
                String X_SWIFI_CNSTC_YEAR = result.getString("X_SWIFI_CNSTC_YEAR");
                String X_SWIFI_INOUT_DOOR = result.getString("X_SWIFI_INOUT_DOOR");
                String X_SWIFI_REMARS3 = result.getString("X_SWIFI_REMARS3");
                int LAT = result.getInt("LAT");
                int LNT = result.getInt("LNT");
                int WORK_DTTM = result.getInt("WORK_DTTM");

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

    }

    public static List<WifiVO> selectWifiList() {


        return null;
    }
}