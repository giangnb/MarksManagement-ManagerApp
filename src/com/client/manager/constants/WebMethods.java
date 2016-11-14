
package com.client.manager.constants;

import com.client.service.Bulk;
import com.client.service.Clazz;
import com.client.service.Student;
import com.client.service.Subject;
import com.client.service.Teacher;
import com.client.service.Admin;
import com.client.service.Properties;
import java.io.Serializable;

/**
 * Web Service methods implementation
 * @author Giang
 */
public class WebMethods implements Serializable{
    private WebMethods(){};

    public static int addAdmin(com.client.service.Admin adminAccount) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.addAdmin(adminAccount);
    }

    public static int addBulk(com.client.service.Bulk bulk) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.addBulk(bulk);
    }

    public static int addClass(com.client.service.Clazz _class) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.addClass(_class);
    }

    public static int addProperty(com.client.service.Properties poperty) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.addProperty(poperty);
    }

    public static java.util.List<com.client.service.Score> addScores(java.util.List<com.client.service.Score> scores) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.addScores(scores);
    }

    public static int addStudent(com.client.service.Student student) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.addStudent(student);
    }

    public static int addSubject(com.client.service.Subject subject) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.addSubject(subject);
    }

    public static int addTeacher(com.client.service.Teacher teacher) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.addTeacher(teacher);
    }

    public static Admin adminLogin(java.lang.String credential) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.adminLogin(credential);
    }

    public static void archiveToLog(int classId) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        port.archiveToLog(classId);
    }

    public static int archiveToLogByStudent(int studentId, java.lang.String remark) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.archiveToLogByStudent(studentId, remark);
    }

    public static int editArchiveRemark(int studentId, java.lang.String remark) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.editArchiveRemark(studentId, remark);
    }

    public static java.util.List<com.client.service.Admin> getAdmins(com.client.service.Admin currentAccount) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getAdmins(currentAccount);
    }

    public static Bulk getBulkById(int id) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getBulkById(id);
    }

    public static java.util.List<com.client.service.Bulk> getBulks() {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getBulks();
    }

    public static Clazz getClassById(int id) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getClassById(id);
    }

    public static java.util.List<com.client.service.Clazz> getClasses() {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getClasses();
    }

    public static java.util.List<com.client.service.Properties> getProperties() {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getProperties();
    }

    public static Properties getPropertyByKey(java.lang.String propertyKey) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getPropertyByKey(propertyKey);
    }

    public static String getPropertyValueByKey(java.lang.String propertyKey) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getPropertyValueByKey(propertyKey);
    }

    public static Student getStudentById(int id) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getStudentById(id);
    }
    public static java.util.List<com.client.service.Student> getStudentsByName(java.lang.String name) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getStudentsByName(name);
    }

    public static Subject getSubjectById(int id) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getSubjectById(id);
    }

    public static java.util.List<com.client.service.Subject> getSubjects() {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getSubjects();
    }

    public static java.util.List<com.client.service.Subject> getSubjectsByBulk(int bulkId) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getSubjectsByBulk(bulkId);
    }

    public static java.util.List<com.client.service.Subject> getSubjectsByTeacher(int teacherId) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getSubjectsByTeacher(teacherId);
    }

    public static Teacher getTeacherById(int id) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getTeacherById(id);
    }

    public static java.util.List<com.client.service.Teacher> getTeachers() {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getTeachers();
    }

    public static int removeAdmin(java.lang.String adminAccountId) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.removeAdmin(adminAccountId);
    }

    public static int removeBulk(int id) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.removeBulk(id);
    }

    public static int removeClass(int id) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.removeClass(id);
    }

    public static int removeProperty(java.lang.String popertyKey) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.removeProperty(popertyKey);
    }

    public static java.util.List<com.client.service.Score> removeScores(java.util.List<java.lang.Integer> ids) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.removeScores(ids);
    }

    public static int removeStudent(int id) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.removeStudent(id);
    }

    public static int removeSubject(int subjectId) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.removeSubject(subjectId);
    }

    public static Teacher teacherLogin(java.lang.String userId, java.lang.String password) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.teacherLogin(userId, password);
    }

    public static int updateAdmin(com.client.service.Admin adminAccount) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.updateAdmin(adminAccount);
    }

    public static int updateBulk(com.client.service.Bulk bulk) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.updateBulk(bulk);
    }

    public static int updateClass(com.client.service.Clazz _class) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.updateClass(_class);
    }

    public static int updateProperty(com.client.service.Properties poperty) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.updateProperty(poperty);
    }

    public static int updateScore(com.client.service.Score score) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.updateScore(score);
    }

    public static java.util.List<com.client.service.Score> updateScores(java.util.List<com.client.service.Score> scores) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.updateScores(scores);
    }

    public static int updateStudent(com.client.service.Student student) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.updateStudent(student);
    }

    public static int updateSubject(com.client.service.Subject subject) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.updateSubject(subject);
    }

    public static int updateTeacher(com.client.service.Teacher teacher) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.updateTeacher(teacher);
    }

    public static java.util.List<com.client.service.Student> getStudents() {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getStudents();
    }

    public static java.util.List<com.client.service.Student> getStudentsByClass(com.client.service.Clazz clazz) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.getStudentsByClass(clazz);
    }

    public static java.util.List<com.client.service.Student> addStudentsList(java.util.List<com.client.service.Student> studentList) {
        com.client.service.ApplicationWebService_Service service = new com.client.service.ApplicationWebService_Service();
        com.client.service.ApplicationWebService port = service.getApplicationWebServicePort();
        return port.addStudentsList(studentList);
    }
    
}