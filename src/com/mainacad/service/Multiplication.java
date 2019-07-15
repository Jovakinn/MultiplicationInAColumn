package com.mainacad.service;

import java.util.logging.Logger;

public class Multiplication {

    private static Logger logger = Logger.getLogger(Multiplication.class.getName());

    public static void multiplication(Integer firstNum, Integer secoundNum){
     Integer secondNum3 = secoundNum % 10;
     Integer secondNum2 = (secoundNum / 10) % 10;
     Integer secondNum1 = (secoundNum / 100) % 10;

     Integer firstNum3 = firstNum % 10;
     Integer firstNum2 = (firstNum / 10) % 10;
     Integer firstNum1 = (firstNum / 100) % 10;



    }
}
