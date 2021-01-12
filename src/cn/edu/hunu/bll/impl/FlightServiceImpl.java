package cn.edu.hunu.bll.impl;

import cn.edu.hunu.bean.FlightInfo;
import cn.edu.hunu.bll.IFlightService;

import java.util.Set;

public class FlightServiceImpl implements IFlightService {

    @Override
    public void insertFlight(FlightInfo flightInfo) {
        System.out.println("传到了bll"+flightInfo);
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
