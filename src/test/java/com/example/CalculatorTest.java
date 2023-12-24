package com.example;

// staticインポート
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

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
}
