package com.hellokoding.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
    @RequestMapping("/Home")
    public String Home(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "Home";
    }
    @RequestMapping("/CallForPapers")
    public String CallForPapers(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "CallForPapers";
    }
    @RequestMapping("/Submission")
    public String Submission(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "Submission";
    
    }
    @RequestMapping("/Registration")
    public String Registration(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "Registration";
    
    }
    @RequestMapping("/KeynoteSpeakers")
    public String KeynoteSpeakers(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "KeynoteSpeakers";
    
    }
    @RequestMapping("/VenueAndHotels")
    public String VenueAndHotels(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "VenueAndHotels";
    
    }
    @RequestMapping("/AboutCommittee")
    public String AboutCommittee(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "AboutCommittee";
    
    }
    @RequestMapping("/AboutHCMUTE")
    public String AboutHCMUTE(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "AboutHCMUTE";
    
    }
    @RequestMapping("/AboutICSSE")
    public String AboutICSSE(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "AboutICSSE";
    
    }
    @RequestMapping("/Contact")
    public String Contact(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "Contact";
    
    }
    @RequestMapping("/EditAC")
    public String EditAboutCommittee(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "EditAboutCommittee";
    
    }
    @RequestMapping("/EditHome")
    public String EditHome(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "EditHome";
    
    }
    @RequestMapping("/EditContact")
    public String EditContact(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "EditContact";
    
    }
    @RequestMapping("/EditAboutHCMUTE")
    public String EditAboutHCMUTE(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "EditAboutHCMUTE";
    
    }
    @RequestMapping("/EditSubmisson")
    public String EditSubmisson(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "EditSubmisson";
    
    }
    @RequestMapping("/EditKeynoteSpeakers")
    public String EditKeynoteSpeakers(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "EditKeynoteSpeakers";
    
    }
    @RequestMapping("/EditVenuAndHotels")
    public String EditVenuAndHotels(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "EditVenuAndHotels";
    
    }
    @RequestMapping("/EditAboutICSSE")
    public String EditAboutICSSE(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "EditAboutICSSE";
    }
}

