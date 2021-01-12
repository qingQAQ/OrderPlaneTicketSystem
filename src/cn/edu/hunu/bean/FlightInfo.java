package cn.edu.hunu.bean;

import javax.xml.crypto.Data;

public class FlightInfo {
    private String id;//
    private String type; //单程，双程
    private String planeModel; //飞机型号；
    private String setType;
    private String departurePlace; //出发地
    private String destination; //目的地
    private Data departureTime; //出发时间
    private Data arrivalTime; // 到达时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Data getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Data departureTime) {
        this.departureTime = departureTime;
    }

    public Data getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Data arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
