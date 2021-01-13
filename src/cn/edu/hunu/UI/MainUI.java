package cn.edu.hunu.UI;

import cn.edu.hunu.bean.FlightInfo;
import cn.edu.hunu.bll.IFlightService;
import cn.edu.hunu.bll.impl.FlightServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.UUID;

public class MainUI {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("按数字菜单进行选择：");
            System.out.println("按1，录入航班信息");
            System.out.println("按2，显示所有航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预定");
            System.out.println("按5，机票退订");
            System.out.println("按6，退出系统");

            int choice = input.nextInt();
            if(choice == 1){
                String uuid = UUID.randomUUID().toString();
                System.out.println(uuid.replace("-", ""));
                String id=uuid.replace("-", "");

                System.out.print("请输入航班编号：");
                String flightId = input.next();
                System.out.print("请输入飞机型号：");
                String planeModel = input.next();
                System.out.print("请输入座位数量：");
                int RemainingSeats = input.nextInt();
                System.out.print("请输入出发机场：");
                String departurePlace = input.next();
                System.out.print("请输入目的机场：");
                String destination = input.next();
                System.out.print("请输入出发时间：");
                String departureTime = input.next();
                FlightInfo flightInfo = new FlightInfo(id,flightId,planeModel,RemainingSeats,
                        departurePlace,destination,departureTime);

                IFlightService iFlightService = new FlightServiceImpl();
                try {
                    iFlightService.insertFlight(flightInfo);
                } catch (SQLException e) {
                    String erromessage = e.getMessage();
                    System.out.println(erromessage);
                    e.printStackTrace();
                }

            }


        }
    }
}
