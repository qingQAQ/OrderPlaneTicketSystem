package cn.edu.hunu.dao;

import cn.edu.hunu.bean.FlightInfo;

import java.util.Set;

public interface IFlightDao {

    void insertFlight(FlightInfo flightInfo);
    Set<FlightInfo> getAllFlightInfo();
    FlightInfo getFlightInfoDeparTime(String departureTime);
    FlightInfo getFlightInfoDeparturePlace(String departurePlace);
    FlightInfo getFlightInfoDestination(String destination);
    void updateFlightInfo(FlightInfo flightInfo);

}
