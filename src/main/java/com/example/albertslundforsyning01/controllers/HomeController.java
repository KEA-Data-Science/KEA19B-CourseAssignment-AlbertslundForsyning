package com.example.albertslundforsyning01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import persistence.DBCManager;
import persistence.SubscriberDAO;
import persistence.SubscriberDTO;

@Controller
public class HomeController
{
    @GetMapping("/")
    public String home(Model model)
    {
        model.addAttribute("subscribers", new SubscriberDAO(DBCManager.getConnection()).getSubscribers());

        return "index"; }

    @GetMapping("/fjernvarme/taoordningen")
    public String taoOrdningen(){ return "taoordningen"; }

    @GetMapping("/fjernvarme/energibesparelser")
    public String energiBesparelser(){ return "energibesparelser"; }

    @GetMapping("/fjernvarme/driftstatus")
    public String driftStatus(){ return "driftstatus"; }

    @PostMapping("/newSubscriber")
    public String registerSubscriber(WebRequest webRequest, Model model)
    {
        SubscriberDTO newSubscriber =
                new SubscriberDTO(0,
                                  webRequest.getParameter("name"),
                                  webRequest.getParameter("address"),
                                  webRequest.getParameter("email"),
                                  webRequest.getParameter("phonen"),
                                  webRequest.getParameter("comment"));

        SubscriberDAO dao = new SubscriberDAO(DBCManager.getConnection());


        System.out.println("This number should be not -1 === " + dao.insertSubscriber(newSubscriber));

        return "redirect:/";

    }

}
