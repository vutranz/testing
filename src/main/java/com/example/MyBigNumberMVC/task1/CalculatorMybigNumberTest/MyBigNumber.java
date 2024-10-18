package com.example.MyBigNumberMVC.task1.CalculatorMybigNumberTest;

public class MyBigNumber {
    public String sum(String stn1, String stn2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int len1 = stn1.length();
        int len2 = stn2.length();
        int maxLength = Math.max(len1, len2);

        for (int i = 0; i < maxLength; i++) {

            int digit1 = (i < len1) ? stn1.charAt(len1 - 1 - i) - '0' : 0;
            int digit2 = (i < len2) ? stn2.charAt(len2 - 1 - i) - '0' : 0;

            int kq = digit1 + digit2 + carry;

            System.out.println(
                    "Bước " + (i + 1) + ": Lấy " + digit1 + " cộng với " + digit2 + " được " + (digit1 + digit2) + ".");

            if (carry > 0) {
                System.out.println("Cộng tiếp với nhớ " + carry + " được " + kq);
            }

            carry = kq / 10;
            kq = kq % 10;

            result.append(kq);

            if (i == 0) {
                System.out.println("        Lưu " + kq + " vào kết quả và nhớ " + carry);
            } else {
                System.out.println("        Lưu " + kq + " vào kết quả được kết quả mới là: \""
                        + result.reverse().toString() + "\"");
                System.out.println("        ghi nhớ " + carry);
                result.reverse();
            }
        }

        if (carry > 0) {
            result.append(carry);
            System.out.println("Lưu số nhớ cuối cùng " + carry + " vào kết quả.");
        }

        result.reverse();

        return result.toString();
    }
}
