package com.example;

// staticインポート
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {
    // テストをするメソッド全てに@Testを付けます
	@Test
	void multiplyで5と6の乗算結果を取得する() {
	    Calculator sut = new Calculator();
	    int expected = 12;
	    // 5 x 6の結果を`multiply()`に計算させる
	    int actual = sut.multiply(5, 6);
	    assertThat(actual).isEqualTo(expected);
	}
	
	// パラメータ化します
    @ParameterizedTest
    // ints = {～}のようにするとパラメータはint型となります
    // Integer.MAX_VALUEはint型の最大値である2,147,483,647で奇数です
    @ValueSource(ints = {1, 3, 5, -3, -9, Integer.MAX_VALUE})
    // intsに定義されている要素数分テストを実行します
    public void 複数のパラメータが奇数であるかを検証する(int param){
        boolean actual = sut.isOdd(param);
        boolean expected = true;
        assertThat(actual).isEqualTo(expected);
    }
}
