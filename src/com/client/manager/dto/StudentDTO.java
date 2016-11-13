/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.manager.dto;

import com.client.service.Clazz;
import com.client.service.Student;
import com.marksmana.info.Information;
import com.marksmana.utils.Json;

/**
 *
 * @author Giang
 */
public class StudentDTO {
    private Student s;

    public StudentDTO() {
        s = new Student();
    }

    public StudentDTO(Student s) {
        this.s = s;
    }

    public Student getStudent() {
        return s;
    }

    public void setStudent(Student s) {
        this.s = s;
    }

    public Clazz getClassId() {
        return s.getClassId();
    }

    public void setClassId(Clazz classId) {
        s.setClassId(classId);
    }

    public void setClassId(int classId) {
        Clazz c = new Clazz();
        c.setId(classId);
        s.setClassId(c);
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
        String json = Json.SerializeObject(i);
        s.setInfo(json);
    }

    public String getName() {
        return s.getName();
    }

    public void setName(String name) {
        s.setName(name);
    }
    
}
