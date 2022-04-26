package com.solvd.Reflection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.army.Models.soldier.Soldier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionEx {

    private final static Logger logger = LogManager.getLogger(ReflectionEx.class);

    public static void main(String[] args) {

        Constructor[] constructor = Soldier.class.getDeclaredConstructors();
        Field[] fields = Soldier.class.getDeclaredFields();
        Method[] methods = Soldier.class.getDeclaredMethods();
        logger.info("Fields: " + Arrays.stream(fields).toList());
        logger.info("Methods : " + Arrays.stream(methods).toList());

        try {
            Soldier S = (Soldier) constructor[0].newInstance();
            logger.info("New soldier: "+ S.toString());
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            logger.error(e);
        }


    }

}
