package com.yuqipu.TimeLine.service.impl;
//JDK在java.text包中，提供了对显示对象格式化的接口、类及异常处理

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GenerateUserUniqueID {
    //M,y,S等有自己的语法函数，这是形成生成的格式
    private static final String dateFormation = "yyyyMMddhhmmssS";
    private static final String numberFormation = "000";
    private static final int maximum = 999;
    private static int suffixNumber = 0;
    //    Creates a FieldPosition object for the given field. Fields are identified by constants, whose names typically end with _FIELD, in the various subclasses of Format.
    private static final FieldPosition HELPER_POSITION = new FieldPosition(0);
    private static final SimpleDateFormat dataFormat = new SimpleDateFormat(dateFormation);
    private static final NumberFormat numberFormat = new DecimalFormat(numberFormation);

    public GenerateUserUniqueID() {
    }
    /**
     * 生成用户唯一序列
     * @return String
     */
    public static synchronized String generateUserUniqueID() {
        StringBuffer userUniqueID = new StringBuffer();
        Calendar rightNow = Calendar.getInstance();

        //        Formats a number and appends the resulting text to the given string buffer. The number can be of any subclass of Number.
        dataFormat.format(rightNow.getTime(), userUniqueID, HELPER_POSITION);
        numberFormat.format(suffixNumber, userUniqueID, HELPER_POSITION);

        if (suffixNumber == maximum) {
            suffixNumber = 0;
        } else {
            suffixNumber++;
        }


        return userUniqueID.toString();
    }

}
