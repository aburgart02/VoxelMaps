package com.VoxelMaps.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController
{
    @RequestMapping("/account")
    public String getMainPage() {
        return "test";
    }
}
