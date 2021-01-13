package cn.edu.hunu.dao;

import cn.edu.hunu.bean.FlightInfo;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightDao {

    void insertFlight(FlightInfo flightInfo) throws SQLException;
    Set<FlightInfo> getAllFlightInfo() throws SQLException;
    FlightInfo getFlightInfoDeparTime(String departureTime);
    FlightInfo getFlightInfoDeparturePlace(String departurePlace);
    FlightInfo getFlightInfoDestination(String destination);
    void updateFlightInfo(FlightInfo flightInfo);

}
