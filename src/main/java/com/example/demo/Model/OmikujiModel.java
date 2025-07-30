package com.example.demo.Model;

import java.time.LocalDate;

public class OmikujiModel {
    private String result;
    private String luckyitem;
    private String date;

    // 　日付定義
    LocalDate today = LocalDate.now();

    // 結果定義
    String[] results = {"大吉", "中吉", "小吉", "末吉", "凶"};

    // ラッキーアイテム定義
    String[] luckyItems = {"スマホケース", "カメラ", "本", "CDプレーヤー", "冷蔵庫", "机", "ボールペン"};
}
