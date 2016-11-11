/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.manager.dto;

import com.client.service.Bulk;
import com.client.service.Clazz;
import com.client.service.Teacher;
import com.marksmana.info.Information;
import com.marksmana.utils.Json;

/**
 *
 * @author Giang
 */
public class ClazzDTO {
    private Clazz c;

    public ClazzDTO() {
    }

    public ClazzDTO(Clazz c) {
        this.c = c;
    }

    public Clazz getClazz() {
        return c;
    }

    public void setCclazz(Clazz c) {
        this.c = c;
    }

    public Bulk getBulkId() {
        return c.getBulkId();
    }

    public void setBulkId(Bulk bulkId) {
        c.setBulkId(bulkId);
    }

    public void setBulkId(int bulkId) {
        Bulk b = new Bulk();
        b.setId(bulkId);
        c.setBulkId(b);
    }

    public Integer getId() {
        return c.getId();
    }

    public void setId(Integer id) {
        c.setId(id);
    }

    public Information getInfo() throws Exception {
        return Json.DeserializeObject(c.getInfo(), Information.class);
    }

    public void setInfo(Information i) throws Exception {
        String info = Json.SerializeObject(i);
        c.setInfo(info);
    }

    public String getName() {
        return c.getName();
    }

    public void setName(String name) {
        c.setName(name);
    }

    public Teacher getTeacherId() {
        return c.getTeacherId();
    }

    public void setTeacherId(Teacher teacherId) {
        c.setTeacherId(teacherId);
    }

    public void setTeacherId(int teacherId) {
        Teacher t = new Teacher();
        t.setId(teacherId);
        c.setTeacherId(t);
    }

    @Override
    public String toString() {
        return c.getName();
    }
    
}
