package com.example.mission1;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
                int id = result.getInt("X_SWIFI_MGR_NO");
                System.out.println("X_SWIFI_MGR_NO = "+id);

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
}