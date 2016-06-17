/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crescer.controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author alycio.neto
 */
@Controller
@RequestMapping(value = "/")
public class Example {
   
    @RequestMapping(value = "/exemplo", method = RequestMethod.GET)
    public String toIndex(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("name", "Alycio Bertazzo Neto");
        return "index";
    }
    
//    @ResponseBody
//    @RequestMapping(value = "/current_date_time")
//    public Date date() {
//        return new Date();
//    }
    
    @ResponseBody
    @RequestMapping(value = "/pessoa.json", method = RequestMethod.POST)
    public List<Pessoa> list(@RequestBody Pessoa p) {
        p.setNascimento(new Date());
        return Stream.of(p).collect(Collectors.toList());
    }
    
}
