package cn.edu.hunu.bll.impl;

import cn.edu.hunu.bean.FlightInfo;
import cn.edu.hunu.bll.IFlightService;
import cn.edu.hunu.dao.IFlightDao;
import cn.edu.hunu.dao.impl.FlightDaoIml;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceImpl implements IFlightService {

    IFlightDao iFlightDao;

    public FlightServiceImpl(){
        iFlightDao=new FlightDaoIml();
    }

    @Override
    public void insertFlight(FlightInfo flightInfo) throws SQLException {

        IFlightDao iFlightDao = new FlightDaoIml();
        iFlightDao.insertFlight(flightInfo);
    }

    @Override
    public Set<FlightInfo> getAllFlightInfo() throws SQLException {
        return iFlightDao.getAllFlightInfo();
    }

    @Override
    public Set<FlightInfo> getFlightInfoDeparTime(String departureTime) throws SQLException {
        return iFlightDao.getFlightInfoDeparTime(departureTime);
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
