/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.manager.constants;

/**
 *
 * @author Giang
 */
public class PasswordUtility {
    private static final String[] NUM = "1,5,2,6,3,7,4,9,0,8".split(",");
    private static final String[] CHAR= "z,x,c,v,b,n,m,q,w,e,r,t,p,o,i,u,y,f,d,s,a,j,k,l,g,h".split(",");
    private static final String[] GLYPH = "!,%,(,.,*,_,$,),@,-,?,=,+".split(",");
    public static final int WEAK = 0,MEDIUM = 1,STRONG = 2, MEDIUM_CHARS=3, STRONG_CHARS=4;
    
    public static String genreatePassword(int count, int type) {
        if (count==0) count = 5;
        if (count<0) count = -count;
        String p="";
        switch(type) {
            case WEAK:
                p = generateWeak(count);
                break;
            case MEDIUM:
                p = generateMed(count);
                break;
            case STRONG:
                p = generateStrong(count);
                break;
            case MEDIUM_CHARS:
                p = generateMedChars(count);
                break;
            case STRONG_CHARS:
                p = generateStrongChars(count);
                break;
        }
        return p;
    }

    private static String generateWeak(int count) {
        String p = "";
        for (int i = 0; i < count; i++) {
            p+=NUM[Integer.parseInt(Math.round(Math.ceil(Math.random()*(NUM.length-1)))+"")];
        }
        return p;
    }

    private static String generateMed(int count) {
        String p="";
        int sel;
        for (int i = 0; i < count; i++) {
            sel = Integer.parseInt(Math.round(Math.random()*1)+"");
            if (sel==0) {
                p+=NUM[Integer.parseInt(Math.round(Math.ceil(Math.random()*(NUM.length-1)))+"")];
            } else {
                p+=CHAR[Integer.parseInt(Math.round(Math.ceil(Math.random()*(CHAR.length-1)))+"")];
            }
        }
        return p;
    }
    
    private static String generateStrong(int count) {
        String p="";
        int sel;
        for (int i = 0; i < count; i++) {
            sel = Integer.parseInt(Math.round(Math.random()*3)+"");
            switch (sel) {
                case 0:
                    p+=NUM[Integer.parseInt(Math.round(Math.ceil(Math.random()*(NUM.length-1)))+"")];
                    break;
                case 1:
                    p+=CHAR[Integer.parseInt(Math.round(Math.ceil(Math.random()*(CHAR.length-1)))+"")];
                    break;
                case 2:
                    p+=GLYPH[Integer.parseInt(Math.round(Math.ceil(Math.random()*(GLYPH.length-1)))+"")];
                    break;
                default:
                    p+=CHAR[Integer.parseInt(Math.round(Math.ceil(Math.random()*(CHAR.length-1)))+"")].toUpperCase();
                    break;
            }
        }
        return p;
    }
    
    private static String generateMedChars(int count) {
        String p="";
        int sel;
        for (int i = 0; i < count; i++) {
            sel = Integer.parseInt(Math.round(Math.random()*1)+"");
            if (sel==0) {
                p+=CHAR[Integer.parseInt(Math.round(Math.ceil(Math.random()*(CHAR.length-1)))+"")].toUpperCase();
            } else {
                p+=CHAR[Integer.parseInt(Math.round(Math.ceil(Math.random()*(CHAR.length-1)))+"")];
            }
        }
        return p;
    }
    
    private static String generateStrongChars(int count) {
        String p="";
        int sel;
        for (int i = 0; i < count; i++) {
            sel = Integer.parseInt(Math.round(Math.random()*3)+"")+1;
            switch (sel) {
                case 1:
                    p+=CHAR[Integer.parseInt(Math.round(Math.ceil(Math.random()*(CHAR.length-1)))+"")];
                    break;
                case 2:
                    p+=GLYPH[Integer.parseInt(Math.round(Math.ceil(Math.random()*(GLYPH.length-1)))+"")];
                    break;
                default:
                    p+=CHAR[Integer.parseInt(Math.round(Math.ceil(Math.random()*(CHAR.length-1)))+"")].toUpperCase();
                    break;
            }
        }
        return p;
    }
}
