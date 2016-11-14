/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.manager.dto;

import com.client.service.Subject;
import com.marksmana.info.Information;
import com.marksmana.utils.Json;

/**
 *
 * @author Giang
 */
public class SubjectDTO {
    private Subject s;

    public SubjectDTO() {
        s = new Subject();
    }

    public SubjectDTO(Subject s) {
        this.s = s;
    }

    public Subject getSubject() {
        return s;
    }

    public void setSubject(Subject s) {
        this.s = s;
    }

    public Integer getId() {
        return s.getId();
    }

    public void setId(Integer id) {
        s.setId(id);
    }

    public Information getInfo() throws Exception {
        return Json.DeserializeObject(s.getInfo(), Information.class);
    }

    public void setInfo(Information i) throws Exception {
        String info = Json.SerializeObject(i);
        s.setInfo(info);
    }

    public String getName() {
        return s.getName();
    }

    public void setName(String name) {
        s.setName(name);
    }

    @Override
    public String toString() {
        return s.getName();
    }
    
}
