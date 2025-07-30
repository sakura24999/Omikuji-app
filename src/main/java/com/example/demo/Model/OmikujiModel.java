package com.example.demo.Model;

import java.time.LocalDate;

public class OmikujiModel {
    // プライベートフィールド（データ保護）
    private String result;
    private String luckyitem;
    private LocalDate date;

    // コンストラクタ
    public OmikujiModel(String result, String luckyitem, LocalDate date) {
        this.result = result;
        this.luckyitem = luckyitem;
        this.date = date;
    }

    // ゲッター(読み取り用)
    public String getResult() {
        return result;
    }

    public String getLuckyitem() {
        return luckyitem;
    }

    public LocalDate getDate() {
        return date;
    }

    // セッター(書き込み用)
    public void setResult(String result) {
        this.result = result;
    }

    public void setLuckyitem(String luckyitem) {
        this.luckyitem = luckyitem;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
