package com.example;

// staticインポート
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {
	
	private Calculator sut;
	
	@BeforeEach
	public void setUp() {
		this.sut = new Calculator();
	}
	@AfterEach
	public void tearDown() {
		this.sut = null;
	}
	
    // テストをするメソッド全てに@Testを付けます
	@Test
	void multiplyで3と4の乗算結果を取得する() {
		 // Calculatorクラスのインスタンスを生成する
	    // テスト用のオブジェクトの変数名はよくsut(System under test、テスト対象の略)を用います
	    //Calculator sut = new Calculator();
	    // 想定する計算結果の用意
	    int expected = 12;
	    // 3 x 4の結果を`multiply()`に計算させる
	    int actual = sut.multiply(3, 4);
	    // 計算結果が12となるか検証する
	    assertThat(actual).isEqualTo(expected);
	}
	
	@Test
	void multiplyで5と6の乗算結果を取得する() {
	    //Calculator sut = new Calculator();
	    int expected = 30;
	    // 5 x 6の結果を`multiply()`に計算させる
	    int actual = sut.multiply(5, 6);
	    assertThat(actual).isEqualTo(expected);
	}
	
	@Test
	void devideで3と2の除算結果を取得する() {
	    //Calculator sut = new Calculator();
	    // 想定する計算結果の用意
	    double expected = 1.5;
	    // 3 ÷ 2の結果を`devide()`に計算させる
	    double actual = sut.devide(3, 2);
	    // 計算結果が1.5となるか検証する
	    assertThat(actual).isEqualTo(expected);
	}
	
	@Test
	public void 整数を0除算する() throws Exception {
	    assertThatThrownBy(()->{
	        Integer actual = 5 / 0;
	    })
	    .isInstanceOf(ArithmeticException.class)
	    .hasMessage("/ by zero");
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