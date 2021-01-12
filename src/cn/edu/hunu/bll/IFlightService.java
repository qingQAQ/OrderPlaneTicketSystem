package cn.edu.hunu.bll;

import cn.edu.hunu.bean.FlightInfo;

import java.util.Set;

public interface IFlightService {

    void insertFlight(FlightInfo flightInfo);
    Set<FlightInfo> getAllFlightInfo();
    FlightInfo getFlightInfoDeparTime(String departureTime);
    FlightInfo getFlightInfoDeparturePlace(String departurePlace);
    FlightInfo getFlightInfoDestination(String destination);
    void updateFlightInfo(FlightInfo flightInfo);

}
