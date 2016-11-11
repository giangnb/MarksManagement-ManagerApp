/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.manager;

import com.client.manager.views.StartScreen;
import com.client.service.Admin;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Hashtable;

/**
 *
 * @author Giang
 */
public class Application {
    public static Admin ACCOUNT;
    public static Hashtable<String, Object> PROP;
    public static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    public static Image ICON;
    public static SimpleDateFormat DATE_FORMAT, TIME_FORMAT;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new StartScreen();
    }
    
}
