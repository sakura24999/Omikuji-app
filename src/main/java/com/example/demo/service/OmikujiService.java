package com.example.demo.service;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.demo.Model.OmikujiModel;

@Service
public class OmikujiService {
    // データ(配列)をServiceに定義
    private final String[] results = {"大吉", "中吉", "小吉", "末吉", "凶"};
    private final String[] luckyitems = {"スマホケース", "カメラ", "本", "CDプレーヤー", "冷蔵庫", "机", "ボールペン"};

    // おみくじを引く処理
    public OmikujiModel drawOmikuji() {
        Random random = new Random();

        // ランダムでインデックスを選択
        int resultIndex = random.nextInt(results.length);
        int luckyitemIndex = random.nextInt(luckyitems.length);

        // 選択された結果とアイテムを取得
        String selectedRequest = results[resultIndex];
        String selectedLukyitem = luckyitems[luckyitemIndex];
        LocalDate today = LocalDate.now();

        // OmikujiModelを作成して返す
        return new OmikujiModel(selectedRequest, selectedLukyitem, today);
    }
}
