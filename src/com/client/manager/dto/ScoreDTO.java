/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.manager.dto;

import com.client.service.Score;
import com.client.service.Student;
import com.client.service.Subject;
import com.client.service.Teacher;

/**
 *
 * @author Giang
 */
public class ScoreDTO {
    private Score s;

    public ScoreDTO() {
    }

    public ScoreDTO(Score s) {
        this.s = s;
    }

    public Score getScore() {
        return s;
    }

    public void setScore(Score s) {
        this.s = s;
    }

    public int getCoefficient() {
        return s.getCoefficient();
    }

    public void setCoefficient(String coefficient) {
        s.setCoefficient(Short.parseShort(coefficient));
    }

    public Long getId() {
        return s.getId();
    }

    public void setId(Long id) {
        s.setId(id);
    }

    public double getScoreNumber() {
        return s.getScore();
    }

    public void setScoreNumber(double score) {
        s.setScore(score);
    }

    public Student getStudentId() {
        return s.getStudentId();
    }

    public void setStudentId(Student studentId) {
        s.setStudentId(studentId);
    }

    public void setStudentId(int studentId) {
        Student stu = new Student();
        stu.setId(studentId);
        s.setStudentId(stu);
    }

    public Subject getSubjectId() {
        return s.getSubjectId();
    }

    public void setSubjectId(Subject subjectId) {
        s.setSubjectId(subjectId);
    }

    public void setSubjectId(int subjectId) {
        Subject sj = new Subject();
        sj.setId(subjectId);
        s.setSubjectId(sj);
    }

    public Teacher getTeacherId() {
        return s.getTeacherId();
    }

    public void setTeacherId(Teacher teacherId) {
        s.setTeacherId(teacherId);
    }

    public void setTeacherId(int teacherId) {
        Teacher t = new Teacher();
        t.setId(teacherId);
        s.setTeacherId(t);
    }

    @Override
    public String toString() {
        return s.getScore()+"";
    }
    
}
