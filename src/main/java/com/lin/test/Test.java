package com.lin.test;

import com.lin.app.MySpringApplication;

import javax.servlet.ServletException;

public class Test {

    public static void main(String[] args) {
        try {
            MySpringApplication.run();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
