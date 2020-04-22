package com.example.albertslundforsyning01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @GetMapping("/")
    public String home(){ return "index"; }

    @GetMapping("/fjernvarme/taoordningen")
    public String taoOrdningen(){ return "taoordningen"; }

    @GetMapping("/fjernvarme/energibesparelser")
    public String energiBesparelser(){ return "energibesparelser"; }

    @GetMapping("/fjernvarme/driftstatus")
    public String driftStatus(){ return "driftstatus"; }

}
