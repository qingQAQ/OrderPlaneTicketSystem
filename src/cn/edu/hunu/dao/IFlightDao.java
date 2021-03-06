package cn.edu.hunu.dao;

import cn.edu.hunu.bean.FlightInfo;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightDao {

    void insertFlight(FlightInfo flightInfo) throws SQLException;
    Set<FlightInfo> getAllFlightInfo() throws SQLException;
    Set<FlightInfo> getFlightInfoDeparTime(String departureTime) throws SQLException;
    FlightInfo getFlightInfoDeparturePlace(String departurePlace);
    FlightInfo getFlightInfoDestination(String destination);
    void updateFlightInfo(FlightInfo flightInfo);

}
