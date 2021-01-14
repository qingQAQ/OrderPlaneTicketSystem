package cn.edu.hunu.UI;

import cn.edu.hunu.bean.FlightInfo;
import cn.edu.hunu.bll.IFlightService;
import cn.edu.hunu.bll.impl.FlightServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

                    String errMess = e.getMessage();
                    System.out.println(errMess);
                    //ORA-12899: value too large for column "OPTS"."FLIGHT"."ID" (actual: 32, maximum: 30)
                    //ORA-12899: 列 "OPTS"."FLIGHT"."FLIGHT_ID" 的值太大 (实际值: 36, 最大值: 32)
                    //String pattern = "(\\w+-\\d{5}):(\\s\\w+)+\\s(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                    String pattern = "\\.(\"\\w+\")\\.(\"\\w+\")"; //正则表达式\w+-\d{5}:\s.\s"\w+"\.("\w+")\.("\w+")
                    Pattern r = Pattern.compile(pattern); //创建Pattern对象
                    Matcher m = r.matcher(errMess); //创建Matcher对象
                    if (m.find()){
                        String tableName = m.group(1);
                        String columnName = m.group(2);
                        System.out.println(tableName + "表的" + columnName + "这一列的值过大，请仔细检查");
                    }


                }

            }
            else if(choice == 2){
                IFlightService iFlightService = new FlightServiceImpl();
                try {

                    Set<FlightInfo> allFlights=iFlightService.getAllFlightInfo();
                    for(FlightInfo flight:allFlights){
                        System.out.println(flight);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            else if (choice == 3) {
                System.out.println("输入相应的编号选择您要查询航班的方式：");
                System.out.println("1，按起飞时间查询");
                System.out.println("2，按空座信息查询");
                System.out.println("3，按起飞第查询");
                System.out.println("4，按目的地查询");
                int choose = input.nextInt();
                if (choose == 1) {
                    System.out.println("请输入起飞时间：");
                    String departureTime = input.next();
                    IFlightService iFlightService = new FlightServiceImpl();
                    try {
                        Set<FlightInfo> flightInfo = iFlightService.getFlightInfoDeparTime(departureTime);
                        if(flightInfo != null){
                            System.out.println("查询结果：" );
                            for(FlightInfo flight:flightInfo){
                                System.out.println(flight);
                            }
                        }else{
                            System.out.println("没有查询到该时间的航班");
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }
            }


        }
    }
}
