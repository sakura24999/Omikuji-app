package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Model.OmikujiModel;
import com.example.demo.service.OmikujiService;

@Controller
public class OmikujiController {
    
    @Autowired
    private OmikujiService omikujiService;  // Serviceを注入
    
    // トップページを表示（"/"でアクセス）
    @GetMapping("/")
    public String index() {
        return "index";  // String型で返す
    }
    
    // おみくじを引く処理（POSTリクエスト）
    @PostMapping("/draw")
    public String draw(Model model) {
        // Serviceからおみくじ結果を取得
        OmikujiModel result = omikujiService.drawOmikuji();
        
        // 結果をHTMLに渡す
        model.addAttribute("omikujiResult", result);
        
        return "result";  // result.htmlを表示
    }
}