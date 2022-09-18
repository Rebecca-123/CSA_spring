package com.nighthawk.spring_portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // controller will handle HTTP requests
public class Words {
    @GetMapping("/words") // GET requests mapped to calcLet() method
    public String calcLet(@RequestParam(name="word", required=false, defaultValue="hello") String word, Model model){
        int count = word.length();
        model.addAttribute("word", word);
        model.addAttribute("num", count);


        int len = word.length();
        int rep = len / 2; 
        String ans = "no";
        for(int i = 0; i <= rep; i++){
            if(word.charAt(i) == word.charAt(len- 1 - i)){
                ans = "yes";
            }
            else{
                ans = "no";
                break;
            }
        }
        model.addAttribute("ans", ans);
        return "words";
    }

}
