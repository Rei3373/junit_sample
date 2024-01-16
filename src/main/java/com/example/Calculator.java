package com.example;

public class Calculator {
    // 乗算結果を返します
    public int multiply(int x, int y) {
        return x * y;
    }
    
    // 返り値を修正します
    public double devide(int x, int y) {
        // キャスト処理を追加します
        return (double)x / (double)y;
    }

    // 加算結果を返します
    public int sum(int x, int y) {
        return x + y;
    }

    // 減算結果を返します
    public int subtract(int x, int y) {
        return x - y;
    }
}