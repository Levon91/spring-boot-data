package com.example.controller;

import com.example.manager.ItemManager;
import com.example.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import java.time.LocalDate;

import static org.springframework.util.StringUtils.trimWhitespace;

/**
 * Created by levont on 12/09/2016.
 */
@Controller
public class ItemController {

    @Autowired
    private ItemManager itemManager;

    @GET
    @RequestMapping(value = "/")
    public String getIndexPage() {
        return "index";
    }

    @GET
    @GetMapping("/add-item")
    public String addUserForm(Model model, @ModelAttribute("addItem") Item item){
        model.addAttribute("items", itemManager.findAll());
        return "add-item";
    }

    @POST
    @PostMapping("/add-item")
    public String addUserSubmit(@ModelAttribute Item item){
        itemManager.save(item);
        System.out.println(LocalDate.now());
        return "redirect:add-item";
    }

//    @POST
//    @PostMapping("/add-user")
//    public String removeUserSubmit(@ModelAttribute Integer userId){
//        userManager.delete(userId);
//        return "redirect:add-user";
//    }
}
