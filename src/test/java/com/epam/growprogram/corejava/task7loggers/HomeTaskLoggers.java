package com.epam.growprogram.corejava.task7loggers;

import com.epam.growprogram.corejava.task6loopsandArrays.HomeTaskLoopsAndArrays;
import java.util.logging.Logger;

public class HomeTaskLoggers {

    static Logger log = Logger.getLogger(HomeTaskLoopsAndArrays.class.getName());

    public static void main(String[] args) {

        log.info("I am in HomeTaskLoggers class");
        log.warning("Its a warning message");
    }
}