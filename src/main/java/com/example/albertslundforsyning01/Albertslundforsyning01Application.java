package com.example.albertslundforsyning01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import persistence.DBCManager;
import persistence.SubscriberDAO;
import persistence.SubscriberDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@SpringBootApplication
public class Albertslundforsyning01Application
{
    public static void main(String[] args) throws SQLException
    {
//        System.out.println("Wilkommen alles!");
//
//        SubscriberDAO dao = new SubscriberDAO(DBCManager.getConnection());
//
//        SubscriberDTO newSubscriber = new SubscriberDTO(0,"Karate Kaj","Solovej 25","kark@smart.org",
//                                                        "203949392","");
//        dao.insertSubscriber(newSubscriber);
//
//        ArrayList<SubscriberDTO> subscribers = dao.getSubscribers();
//
//
//        System.out.println("Printing list of subscribers:");
//        for(SubscriberDTO sub:subscribers            )
//        {
//            System.out.println(sub);
//        }


        SpringApplication.run(Albertslundforsyning01Application.class, args);
    }
}
