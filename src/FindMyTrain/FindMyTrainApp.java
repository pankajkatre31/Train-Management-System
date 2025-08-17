package FindMyTrain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp
{
    public static void main(String[] args)
    {
        TrainSystem system=new TrainSystem();

        //adding new station
        Station station1= new Station("Nagpur","Ngp");
        Station station2= new Station("Nashik","Nsk");

        //adding new trains
        Train train1 = new Train("12850","Duranto","Express");
        Train train2 = new Train("12963","Rajdhani","superfast");

        //adding platforms
        Platform platform1 =new Platform(1);
        Platform platform2 =new Platform(2);

        List<Platform> platformList = new ArrayList<>();

        platformList.add(platform1);
        platformList.add(platform2);

        station1.setPlatformList(platformList);


        Schedule s1=new Schedule(train1,station1,"9:00 Am","9:05 AM",platform1);
        Schedule s2=new Schedule(train1,station1,"19:00 Am","19:05 Pm",platform2);

        system.addStations(station1);
        system.addStations(station2);
        system.addTrain(train1);
        system.addTrain(train2);
        system.addSchedule(s1);
        system.addSchedule(s2);


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the source:");
        String source =sc.nextLine();
        System.out.println("Enter the destination");
        String desc=sc.nextLine();
       List<Schedule> myTrains =system.findMyTrains(source, desc);
       System.out.println("Trains between " +source+ " and " +desc);
       Schedule schedule =myTrains.get(0);
       Train train =schedule.getTrain();
       System.out.println(train.toString());

    }
}
