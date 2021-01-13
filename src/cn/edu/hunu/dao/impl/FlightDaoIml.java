package cn.edu.hunu.dao.impl;

import cn.edu.hunu.bean.FlightInfo;
import cn.edu.hunu.dao.IFlightDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    public Set<FlightInfo> getAllFlightInfo() {
        return null;
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
