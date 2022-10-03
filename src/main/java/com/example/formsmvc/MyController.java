package com.example.formsmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails() {
        return "askDetails";

    }

    @RequestMapping("viewDetails")
    public String viewDetails(@RequestParam("employeeName") String empName, Model model) {

        empName = "MR." + empName;
        model.addAttribute("nameAttribute",empName);
        return "viewDetails";
    }
}
