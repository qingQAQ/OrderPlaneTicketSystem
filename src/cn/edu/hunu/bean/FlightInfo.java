package cn.edu.hunu.bean;

import javax.xml.crypto.Data;

public class FlightInfo {
    private String id; //主键，UUID
    private String flightID; //航班编号
    private String planeModel; //飞机型号；
    private int RemainingSeats; //剩余座位数量
    private String departurePlace; //出发地
    private String destination; //目的地
    private String departureTime; //出发时间

    public FlightInfo(String id, String flightID, String planeModel, int remainingSeats, String departurePlace, String destination, String departureTime) {
        this.id = id;
        this.flightID = flightID;
        this.planeModel = planeModel;
        RemainingSeats = remainingSeats;
        this.departurePlace = departurePlace;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public void setPlaneModel(String planeModel) {
        this.planeModel = planeModel;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public int getRemainingSeats() {
        return RemainingSeats;
    }

    public void setRemainingSeats(int remainingSeats) {
        RemainingSeats = remainingSeats;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "FlightInfo{" +
                "航班编号='" + flightID + '\'' +
                ", 机型='" + planeModel + '\'' +
                ", 座位数量=" + RemainingSeats +
                ", 出发地='" + departurePlace + '\'' +
                ", 目的地='" + destination + '\'' +
                ", 出发时间=" + departureTime +
                '}';
    }
}
