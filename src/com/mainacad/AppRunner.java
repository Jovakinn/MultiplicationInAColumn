package com.mainacad;

import com.mainacad.service.Multiplication;

import java.util.Scanner;
import java.util.logging.Logger;

public class AppRunner {

    private static Logger logger = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Enter first number: ");
        Integer firstNum = scanner.nextInt();

        logger.info("Enter second number: ");
        Integer secondNum = scanner.nextInt();

        Multiplication.multiplication(firstNum, secondNum);

    }
}
