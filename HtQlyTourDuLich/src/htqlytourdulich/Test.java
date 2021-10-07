/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htqlytourdulich;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Thanh
 */public class PhoneCheck {
    // Ham kiem tra dinh dang so dien thoai
    public void checkPhone(String str) throws PhoneException {
        // Bieu thuc chinh quy mo ta dinh dang so dien thoai
        String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";

        // Kiem tra dinh dang
        boolean kt = str.matches(reg);

        if (kt == false) {
            throw new PhoneException("Loi: Khong dung dinh dang!");
        } else {
            System.out.println("Dung dinh dang so dien thoai!");
        }
    }
}
public class Test {
    public class PhoneException extends Exception {
    // Ham khoi tao
    public PhoneException(String str) {
        super(str);
    }
}
    public static class PhoneCheck {
    // Ham kiem tra dinh dang so dien thoai
    public void checkPhone(String str) throws PhoneException {
        // Bieu thuc chinh quy mo ta dinh dang so dien thoai
        String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";

        // Kiem tra dinh dang
        boolean kt = str.matches(reg);

        if (kt == false) {
            System.out.println("sai dinh dangasd");
        } else {
            System.out.println("Dung dinh dang so dien thoai!");
        }
    }
}

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);

        // Khai bao doi tuong
        PhoneCheck phoneCheck = new PhoneCheck();

        // Nhap du lieu
        System.out.print("Nhap vao chuoi so dien thoai: ");
        String str = sc.nextLine();

        // Kiem tra dinh dang
        try {
            phoneCheck.checkPhone(str);
        } catch (PhoneException ex) {
            System.out.println(ex.getMessage());
        }

        sc.close();
        System.out.println("");
    }
    }
}
