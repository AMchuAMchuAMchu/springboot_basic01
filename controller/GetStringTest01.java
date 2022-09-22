package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description==>TODO
 * BelongsProject==>springboot_basic01
 * BelongsPackage==>com.itheima.controller
 * CreateTime==>2022-09-23 07:24:11
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@RestController
@RequestMapping("/anime")
public class GetStringTest01 {

    @GetMapping
    public String getAnime(){
        System.out.println("SAO >> 刀剑神域...");
        return "SAO >> 刀剑神域...";
    }

}
