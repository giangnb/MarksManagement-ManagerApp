/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.manager.dto;

import com.client.service.Teacher;
import com.marksmana.info.Information;
import com.marksmana.utils.Json;

/**
 *
 * @author Giang
 */
public class TeacherDTO {
    private Teacher t;

    public TeacherDTO() {
        t = new Teacher();
    }

    public TeacherDTO(Teacher t) {
        this.t = t;
    }

    public Teacher getTeacher() {
        return t;
    }

    public void setTeacher(Teacher t) {
        this.t = t;
    }
    
    public Integer getId() {
        return t.getId();
    }

    public void setId(Integer id) {
        t.setId(id);
    }

    public Information getInfo() throws Exception {
        return Json.DeserializeObject(t.getInfo(), Information.class);
    }

    public void setInfo(Information i) throws Exception {
        String info = Json.SerializeObject(i);
        t.setInfo(info);
    }

    public String getName() {
        return t.getName();
    }

    public void setName(String name) {
        t.setName(name);
    }

    public void setPass(String pass) {
        t.setPass(pass);
    }

    public String getUsername() {
        return t.getUsername();
    }

    public void setUsername(String username) {
        t.setUsername(username);
    }

    @Override
    public String toString() {
        return t.getName();
    }
    
}
