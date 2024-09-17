package USENumToText;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Number {
    // Mảng chứa các từ cho số nhỏ
    private static final String[] smallNumbers = {
        "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười", 
        "mười một", "mười hai", "mười ba", "mười bốn", "mười lăm", "mười sáu", "mười bảy", 
        "mười tám", "mười chín"
    };
    
    // Mảng chứa các từ cho hàng chục
    private static final String[] tens = {
        "", "", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"
    };
    
    // Mảng chứa các từ cho đơn vị lớn
    private static final String[] bigNumbers = {
        "", " nghìn", " triệu", " tỷ"
    };

    // Hàm chuyển đổi một số thành chuỗi
    public static String convert(long number) {
        if (number == 0) {
            return "không";
        }

        String result = "";
        int bigNumberIndex = 0;
        
        while (number > 0) {
            if (number % 1000 != 0) {
                result = convertUnderThousand((int)(number % 1000)) + bigNumbers[bigNumberIndex] + " " + result;
            }
            number /= 1000;
            bigNumberIndex++;
        }
        return result.trim();
    }

    // Hàm xử lý số nhỏ hơn 1000
    private static String convertUnderThousand(int number) {
        String result = "";
        
        if (number >= 100) {
            result += smallNumbers[number / 100] + " trăm ";
            number %= 100;
        }
        
        if (number >= 20) {
            result += tens[number / 10] + " ";
            if (number % 10 > 0) {
                result += smallNumbers[number % 10];
            }
        } else if (number > 0) {
            result += smallNumbers[number];
        }
        
        return result.trim();
    }
}
