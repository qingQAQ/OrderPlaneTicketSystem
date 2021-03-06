package cn.edu.hunu.bll;

import cn.edu.hunu.bean.FlightInfo;

import java.sql.SQLException;
import java.util.Set;

public interface IFlightService {

    void insertFlight(FlightInfo flightInfo) throws SQLException;
    Set<FlightInfo> getAllFlightInfo() throws SQLException;
    Set<FlightInfo> getFlightInfoDeparTime(String departureTime) throws SQLException;
    FlightInfo getFlightInfoDeparturePlace(String departurePlace);
    FlightInfo getFlightInfoDestination(String destination);
    void updateFlightInfo(FlightInfo flightInfo);

}
