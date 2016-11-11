/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.manager.dto;

import com.client.manager.Application;
import com.client.service.Admin;
import java.util.Date;

/**
 *
 * @author Giang
 */
public class AdminDTO {
    private Admin a;

    public AdminDTO() {
    }

    public AdminDTO(Admin a) {
        this.a = a;
    }

    public Admin getAdmin() {
        return a;
    }

    public void setAdmin(Admin a) {
        this.a = a;
    }

    public String getId() {
        return a.getId();
    }

    public void setId(String id) {
        a.setId(id);
    }

    public String getLastChange() {
        Date d = new Date(a.getLastChange());
        return Application.DATE_FORMAT.format(d)+" "+Application.TIME_FORMAT.format(d);
    }

    public void setLastChange(Date d) {
        a.setLastChange(d.getTime());
    }

    public String getLastLogin() {
        Date d = new Date(a.getLastLogin());
        return Application.DATE_FORMAT.format(d)+" "+Application.TIME_FORMAT.format(d);
    }

    public void setLastLogin(Date d) {
        a.setLastLogin(d.getTime());
    }

    public void setPass(String pass) {
        a.setPass(pass);
    }

    public String[] getProhibited() {
        return a.getProhibited().split(";");
    }

    public void setProhibited(String[] prohibited) {
        StringBuilder sb = new StringBuilder();
        for (String s : prohibited) {
            sb.append(s).append(";");
        }
        a.setProhibited(sb.toString());
    }

    @Override
    public String toString() {
        return a.getId();
    }
    
}
