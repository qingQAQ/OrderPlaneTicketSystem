package cn.edu.hunu.dao.impl;

import cn.edu.hunu.bean.FlightInfo;
import cn.edu.hunu.dao.IFlightDao;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class FlightDaoIml implements IFlightDao {


    @Override
    public void insertFlight(FlightInfo flightInfo) throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn = DriverManager.getConnection(url,username,password);
        String sql = "INSERT INTO flight VALUES(?,?,?,?,?,?,?)";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,flightInfo.getId());
        pstmt.setString(2,flightInfo.getFlightID());
        pstmt.setString(3,flightInfo.getPlaneModel());
        pstmt.setInt(4,flightInfo.getRemainingSeats());
        pstmt.setString(5,flightInfo.getDeparturePlace());
        pstmt.setString(6,flightInfo.getDestination());
        pstmt.setString(7,flightInfo.getDepartureTime());

        pstmt.executeUpdate();

    }

    @Override
    public Set<FlightInfo> getAllFlightInfo() throws SQLException {
        Set<FlightInfo> allFlightInfo = new HashSet<>();
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn = DriverManager.getConnection(url,username,password);
        String sql = "SELECT * FROM flight";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            String id = rs.getString("FLIGHT_ID");
            String flightId = rs.getString("PLANE_TYPE"); //航班编号
            String planeModel = rs.getString("SEATS_NO"); //飞机型号
            int RemainingSeats= rs.getInt("TOTAL_SEATS_NUM"); //剩余座位数量
            String departurePlace= rs.getString("DEPARTURE_AIRPORT"); //出发地
            String destination= rs.getString("DESTINATION_AIRPORT"); //目的地
            String departureTime= rs.getString("DEPARTURE_TIME"); //出发时间

            FlightInfo flightInfo = new FlightInfo(id,flightId,planeModel,RemainingSeats,
                    departurePlace,destination,departureTime);
            allFlightInfo.add(flightInfo);
        }
        return allFlightInfo;
    }

    @Override
    public FlightInfo getFlightInfoDeparTime(String departureTime) {
        return null;
    }

    @Override
    public FlightInfo getFlightInfoDeparturePlace(String departurePlace) {
        return null;
    }

    @Override
    public FlightInfo getFlightInfoDestination(String destination) {
        return null;
    }

    @Override
    public void updateFlightInfo(FlightInfo flightInfo) {

    }
}
