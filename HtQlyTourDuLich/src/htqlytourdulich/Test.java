/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htqlytourdulich;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Thanh
 */
public class Test {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date myDate = newDateFormat.parse("28/12/2013");
        newDateFormat.applyPattern("yyyy/MM/dd");
        String myDateString = newDateFormat.format(myDate);
        System.out.println(myDateString);
    }
}
