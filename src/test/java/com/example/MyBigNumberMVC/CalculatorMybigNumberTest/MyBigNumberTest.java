package com.example.MyBigNumberMVC.CalculatorMybigNumberTest;

import com.example.MyBigNumberMVC.task1.CalculatorMybigNumberTest.MyBigNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyBigNumberTest {

    @Test
    public void testSum_SimpleNumbers() {
        MyBigNumber myBigNumber = new MyBigNumber();

        String result = myBigNumber.sum("1234", "897");
        assertEquals("2131", result, "Cộng 1234 và 897 phải bằng 2131");
    }

    @Test
    public void testSum_WithCarry() {
        MyBigNumber myBigNumber = new MyBigNumber();

        String result = myBigNumber.sum("999", "1");
        assertEquals("1000", result, "Cộng 999 và 1 phải bằng 1000");
    }

    @Test
    public void testSum_DifferentLengthNumbers() {
        MyBigNumber myBigNumber = new MyBigNumber();

        String result = myBigNumber.sum("1234", "56");
        assertEquals("1290", result, "Cộng 1234 và 56 phải bằng 1290");
    }

    @Test
    public void testSum_WithLeadingZeros() {
        MyBigNumber myBigNumber = new MyBigNumber();

        String result = myBigNumber.sum("00123", "00456");
        assertEquals("00579", result, "Cộng 00123 và 00456 phải bằng 579");
    }



    @Test
    public void testSum_OneEmptyString() {
        MyBigNumber myBigNumber = new MyBigNumber();

        String result = myBigNumber.sum("123", "");
        assertEquals("123", result, "Cộng 123 và chuỗi rỗng phải trả về 123");
    }
}
