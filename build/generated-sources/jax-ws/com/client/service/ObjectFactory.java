
package com.client.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.client.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetTeachers_QNAME = new QName("http://ws.marksmana.com/", "getTeachers");
    private final static QName _RemoveClass_QNAME = new QName("http://ws.marksmana.com/", "removeClass");
    private final static QName _AddSubjectResponse_QNAME = new QName("http://ws.marksmana.com/", "addSubjectResponse");
    private final static QName _GetStudents_QNAME = new QName("http://ws.marksmana.com/", "getStudents");
    private final static QName _AdminLogin_QNAME = new QName("http://ws.marksmana.com/", "adminLogin");
    private final static QName _GetScoresBySubject_QNAME = new QName("http://ws.marksmana.com/", "getScoresBySubject");
    private final static QName _GetAdmins_QNAME = new QName("http://ws.marksmana.com/", "getAdmins");
    private final static QName _AdminLoginResponse_QNAME = new QName("http://ws.marksmana.com/", "adminLoginResponse");
    private final static QName _RemoveBulkResponse_QNAME = new QName("http://ws.marksmana.com/", "removeBulkResponse");
    private final static QName _GetBulkByIdResponse_QNAME = new QName("http://ws.marksmana.com/", "getBulkByIdResponse");
    private final static QName _GetScoresByStudentAndSubject_QNAME = new QName("http://ws.marksmana.com/", "getScoresByStudentAndSubject");
    private final static QName _RemoveScoresResponse_QNAME = new QName("http://ws.marksmana.com/", "removeScoresResponse");
    private final static QName _GetScoresByStudentAndSubjectResponse_QNAME = new QName("http://ws.marksmana.com/", "getScoresByStudentAndSubjectResponse");
    private final static QName _RemoveProperty_QNAME = new QName("http://ws.marksmana.com/", "removeProperty");
    private final static QName _GetSubjectsByBulk_QNAME = new QName("http://ws.marksmana.com/", "getSubjectsByBulk");
    private final static QName _ArchiveToLogByStudent_QNAME = new QName("http://ws.marksmana.com/", "archiveToLogByStudent");
    private final static QName _AddAdmin_QNAME = new QName("http://ws.marksmana.com/", "addAdmin");
    private final static QName _Subject_QNAME = new QName("http://ws.marksmana.com/", "subject");
    private final static QName _GetPropertyValueByKeyResponse_QNAME = new QName("http://ws.marksmana.com/", "getPropertyValueByKeyResponse");
    private final static QName _UpdateScoresResponse_QNAME = new QName("http://ws.marksmana.com/", "updateScoresResponse");
    private final static QName _GetScoresBySubjectResponse_QNAME = new QName("http://ws.marksmana.com/", "getScoresBySubjectResponse");
    private final static QName _AddClass_QNAME = new QName("http://ws.marksmana.com/", "addClass");
    private final static QName _RemoveStudentResponse_QNAME = new QName("http://ws.marksmana.com/", "removeStudentResponse");
    private final static QName _TeacherLogin_QNAME = new QName("http://ws.marksmana.com/", "teacherLogin");
    private final static QName _UpdateStudent_QNAME = new QName("http://ws.marksmana.com/", "updateStudent");
    private final static QName _RemoveSubject_QNAME = new QName("http://ws.marksmana.com/", "removeSubject");
    private final static QName _GetSubjectByIdResponse_QNAME = new QName("http://ws.marksmana.com/", "getSubjectByIdResponse");
    private final static QName _AddStudent_QNAME = new QName("http://ws.marksmana.com/", "addStudent");
    private final static QName _GetBulkById_QNAME = new QName("http://ws.marksmana.com/", "getBulkById");
    private final static QName _AddTeacher_QNAME = new QName("http://ws.marksmana.com/", "addTeacher");
    private final static QName _UpdateTeacherResponse_QNAME = new QName("http://ws.marksmana.com/", "updateTeacherResponse");
    private final static QName _GetScoresBySubjectAndClassResponse_QNAME = new QName("http://ws.marksmana.com/", "getScoresBySubjectAndClassResponse");
    private final static QName _AddScoreResponse_QNAME = new QName("http://ws.marksmana.com/", "addScoreResponse");
    private final static QName _RemoveScores_QNAME = new QName("http://ws.marksmana.com/", "removeScores");
    private final static QName _UpdateClassResponse_QNAME = new QName("http://ws.marksmana.com/", "updateClassResponse");
    private final static QName _Properties_QNAME = new QName("http://ws.marksmana.com/", "properties");
    private final static QName _Clazz_QNAME = new QName("http://ws.marksmana.com/", "clazz");
    private final static QName _GetPropertyByKey_QNAME = new QName("http://ws.marksmana.com/", "getPropertyByKey");
    private final static QName _RemoveAdmin_QNAME = new QName("http://ws.marksmana.com/", "removeAdmin");
    private final static QName _UpdateSubjectResponse_QNAME = new QName("http://ws.marksmana.com/", "updateSubjectResponse");
    private final static QName _Student_QNAME = new QName("http://ws.marksmana.com/", "student");
    private final static QName _UpdateStudentResponse_QNAME = new QName("http://ws.marksmana.com/", "updateStudentResponse");
    private final static QName _RemoveBulk_QNAME = new QName("http://ws.marksmana.com/", "removeBulk");
    private final static QName _GetSubjectsByBulkResponse_QNAME = new QName("http://ws.marksmana.com/", "getSubjectsByBulkResponse");
    private final static QName _GetPropertyValueByKey_QNAME = new QName("http://ws.marksmana.com/", "getPropertyValueByKey");
    private final static QName _Admin_QNAME = new QName("http://ws.marksmana.com/", "admin");
    private final static QName _UpdatePropertyResponse_QNAME = new QName("http://ws.marksmana.com/", "updatePropertyResponse");
    private final static QName _AddScore_QNAME = new QName("http://ws.marksmana.com/", "addScore");
    private final static QName _Teacher_QNAME = new QName("http://ws.marksmana.com/", "teacher");
    private final static QName _GetBulks_QNAME = new QName("http://ws.marksmana.com/", "getBulks");
    private final static QName _AddBulk_QNAME = new QName("http://ws.marksmana.com/", "addBulk");
    private final static QName _UpdateTeacher_QNAME = new QName("http://ws.marksmana.com/", "updateTeacher");
    private final static QName _AddBulkResponse_QNAME = new QName("http://ws.marksmana.com/", "addBulkResponse");
    private final static QName _GetClassByIdResponse_QNAME = new QName("http://ws.marksmana.com/", "getClassByIdResponse");
    private final static QName _GetProperties_QNAME = new QName("http://ws.marksmana.com/", "getProperties");
    private final static QName _GetStudentsResponse_QNAME = new QName("http://ws.marksmana.com/", "getStudentsResponse");
    private final static QName _GetTeacherByIdResponse_QNAME = new QName("http://ws.marksmana.com/", "getTeacherByIdResponse");
    private final static QName _ArchiveToLog_QNAME = new QName("http://ws.marksmana.com/", "archiveToLog");
    private final static QName _GetTeacherById_QNAME = new QName("http://ws.marksmana.com/", "getTeacherById");
    private final static QName _UpdateAdmin_QNAME = new QName("http://ws.marksmana.com/", "updateAdmin");
    private final static QName _GetScoresBySubjectAndClass_QNAME = new QName("http://ws.marksmana.com/", "getScoresBySubjectAndClass");
    private final static QName _UpdateBulk_QNAME = new QName("http://ws.marksmana.com/", "updateBulk");
    private final static QName _AddProperty_QNAME = new QName("http://ws.marksmana.com/", "addProperty");
    private final static QName _TeacherLoginResponse_QNAME = new QName("http://ws.marksmana.com/", "teacherLoginResponse");
    private final static QName _AddSubject_QNAME = new QName("http://ws.marksmana.com/", "addSubject");
    private final static QName _GetStudentsByClassResponse_QNAME = new QName("http://ws.marksmana.com/", "getStudentsByClassResponse");
    private final static QName _GetClassesByTeacherResponse_QNAME = new QName("http://ws.marksmana.com/", "getClassesByTeacherResponse");
    private final static QName _GetTeacherByName_QNAME = new QName("http://ws.marksmana.com/", "getTeacherByName");
    private final static QName _GetStudentsByNameResponse_QNAME = new QName("http://ws.marksmana.com/", "getStudentsByNameResponse");
    private final static QName _ArchiveToLogByStudentResponse_QNAME = new QName("http://ws.marksmana.com/", "archiveToLogByStudentResponse");
    private final static QName _GetSubjectById_QNAME = new QName("http://ws.marksmana.com/", "getSubjectById");
    private final static QName _AddAdminResponse_QNAME = new QName("http://ws.marksmana.com/", "addAdminResponse");
    private final static QName _AddStudentsListResponse_QNAME = new QName("http://ws.marksmana.com/", "addStudentsListResponse");
    private final static QName _AddScores_QNAME = new QName("http://ws.marksmana.com/", "addScores");
    private final static QName _AddStudentsList_QNAME = new QName("http://ws.marksmana.com/", "addStudentsList");
    private final static QName _Bulk_QNAME = new QName("http://ws.marksmana.com/", "bulk");
    private final static QName _AddPropertyResponse_QNAME = new QName("http://ws.marksmana.com/", "addPropertyResponse");
    private final static QName _UpdateAdminResponse_QNAME = new QName("http://ws.marksmana.com/", "updateAdminResponse");
    private final static QName _AddTeacherResponse_QNAME = new QName("http://ws.marksmana.com/", "addTeacherResponse");
    private final static QName _RemovePropertyResponse_QNAME = new QName("http://ws.marksmana.com/", "removePropertyResponse");
    private final static QName _GetPropertiesResponse_QNAME = new QName("http://ws.marksmana.com/", "getPropertiesResponse");
    private final static QName _GetStudentByIdResponse_QNAME = new QName("http://ws.marksmana.com/", "getStudentByIdResponse");
    private final static QName _GetTeachersResponse_QNAME = new QName("http://ws.marksmana.com/", "getTeachersResponse");
    private final static QName _GetClassesResponse_QNAME = new QName("http://ws.marksmana.com/", "getClassesResponse");
    private final static QName _UpdateProperty_QNAME = new QName("http://ws.marksmana.com/", "updateProperty");
    private final static QName _Score_QNAME = new QName("http://ws.marksmana.com/", "score");
    private final static QName _GetStudentsByClass_QNAME = new QName("http://ws.marksmana.com/", "getStudentsByClass");
    private final static QName _UpdateBulkResponse_QNAME = new QName("http://ws.marksmana.com/", "updateBulkResponse");
    private final static QName _GetPropertyByKeyResponse_QNAME = new QName("http://ws.marksmana.com/", "getPropertyByKeyResponse");
    private final static QName _GetClassById_QNAME = new QName("http://ws.marksmana.com/", "getClassById");
    private final static QName _GetTeacherByNameResponse_QNAME = new QName("http://ws.marksmana.com/", "getTeacherByNameResponse");
    private final static QName _RemoveClassResponse_QNAME = new QName("http://ws.marksmana.com/", "removeClassResponse");
    private final static QName _RemoveSubjectResponse_QNAME = new QName("http://ws.marksmana.com/", "removeSubjectResponse");
    private final static QName _UpdateClass_QNAME = new QName("http://ws.marksmana.com/", "updateClass");
    private final static QName _UpdateScore_QNAME = new QName("http://ws.marksmana.com/", "updateScore");
    private final static QName _AddClassResponse_QNAME = new QName("http://ws.marksmana.com/", "addClassResponse");
    private final static QName _GetSubjectsResponse_QNAME = new QName("http://ws.marksmana.com/", "getSubjectsResponse");
    private final static QName _UpdateScoreResponse_QNAME = new QName("http://ws.marksmana.com/", "updateScoreResponse");
    private final static QName _EditArchiveRemark_QNAME = new QName("http://ws.marksmana.com/", "editArchiveRemark");
    private final static QName _ArchiveToLogResponse_QNAME = new QName("http://ws.marksmana.com/", "archiveToLogResponse");
    private final static QName _GetBulksResponse_QNAME = new QName("http://ws.marksmana.com/", "getBulksResponse");
    private final static QName _GetSubjects_QNAME = new QName("http://ws.marksmana.com/", "getSubjects");
    private final static QName _GetAdminsResponse_QNAME = new QName("http://ws.marksmana.com/", "getAdminsResponse");
    private final static QName _GetClassesByTeacher_QNAME = new QName("http://ws.marksmana.com/", "getClassesByTeacher");
    private final static QName _UpdateScores_QNAME = new QName("http://ws.marksmana.com/", "updateScores");
    private final static QName _GetSubjectsByTeacher_QNAME = new QName("http://ws.marksmana.com/", "getSubjectsByTeacher");
    private final static QName _AddScoresResponse_QNAME = new QName("http://ws.marksmana.com/", "addScoresResponse");
    private final static QName _RemoveAdminResponse_QNAME = new QName("http://ws.marksmana.com/", "removeAdminResponse");
    private final static QName _GetSubjectsByTeacherResponse_QNAME = new QName("http://ws.marksmana.com/", "getSubjectsByTeacherResponse");
    private final static QName _RemoveStudent_QNAME = new QName("http://ws.marksmana.com/", "removeStudent");
    private final static QName _GetStudentById_QNAME = new QName("http://ws.marksmana.com/", "getStudentById");
    private final static QName _EditArchiveRemarkResponse_QNAME = new QName("http://ws.marksmana.com/", "editArchiveRemarkResponse");
    private final static QName _GetStudentsByName_QNAME = new QName("http://ws.marksmana.com/", "getStudentsByName");
    private final static QName _GetClasses_QNAME = new QName("http://ws.marksmana.com/", "getClasses");
    private final static QName _UpdateSubject_QNAME = new QName("http://ws.marksmana.com/", "updateSubject");
    private final static QName _AddStudentResponse_QNAME = new QName("http://ws.marksmana.com/", "addStudentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.client.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemovePropertyResponse }
     * 
     */
    public RemovePropertyResponse createRemovePropertyResponse() {
        return new RemovePropertyResponse();
    }

    /**
     * Create an instance of {@link AddTeacherResponse }
     * 
     */
    public AddTeacherResponse createAddTeacherResponse() {
        return new AddTeacherResponse();
    }

    /**
     * Create an instance of {@link UpdateAdminResponse }
     * 
     */
    public UpdateAdminResponse createUpdateAdminResponse() {
        return new UpdateAdminResponse();
    }

    /**
     * Create an instance of {@link GetTeachersResponse }
     * 
     */
    public GetTeachersResponse createGetTeachersResponse() {
        return new GetTeachersResponse();
    }

    /**
     * Create an instance of {@link GetStudentByIdResponse }
     * 
     */
    public GetStudentByIdResponse createGetStudentByIdResponse() {
        return new GetStudentByIdResponse();
    }

    /**
     * Create an instance of {@link GetPropertiesResponse }
     * 
     */
    public GetPropertiesResponse createGetPropertiesResponse() {
        return new GetPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetStudentsByClass }
     * 
     */
    public GetStudentsByClass createGetStudentsByClass() {
        return new GetStudentsByClass();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link GetClassesResponse }
     * 
     */
    public GetClassesResponse createGetClassesResponse() {
        return new GetClassesResponse();
    }

    /**
     * Create an instance of {@link UpdateProperty }
     * 
     */
    public UpdateProperty createUpdateProperty() {
        return new UpdateProperty();
    }

    /**
     * Create an instance of {@link UpdateBulkResponse }
     * 
     */
    public UpdateBulkResponse createUpdateBulkResponse() {
        return new UpdateBulkResponse();
    }

    /**
     * Create an instance of {@link GetScoresBySubjectAndClass }
     * 
     */
    public GetScoresBySubjectAndClass createGetScoresBySubjectAndClass() {
        return new GetScoresBySubjectAndClass();
    }

    /**
     * Create an instance of {@link ArchiveToLog }
     * 
     */
    public ArchiveToLog createArchiveToLog() {
        return new ArchiveToLog();
    }

    /**
     * Create an instance of {@link GetTeacherById }
     * 
     */
    public GetTeacherById createGetTeacherById() {
        return new GetTeacherById();
    }

    /**
     * Create an instance of {@link UpdateAdmin }
     * 
     */
    public UpdateAdmin createUpdateAdmin() {
        return new UpdateAdmin();
    }

    /**
     * Create an instance of {@link GetClassByIdResponse }
     * 
     */
    public GetClassByIdResponse createGetClassByIdResponse() {
        return new GetClassByIdResponse();
    }

    /**
     * Create an instance of {@link GetProperties }
     * 
     */
    public GetProperties createGetProperties() {
        return new GetProperties();
    }

    /**
     * Create an instance of {@link GetStudentsResponse }
     * 
     */
    public GetStudentsResponse createGetStudentsResponse() {
        return new GetStudentsResponse();
    }

    /**
     * Create an instance of {@link GetTeacherByIdResponse }
     * 
     */
    public GetTeacherByIdResponse createGetTeacherByIdResponse() {
        return new GetTeacherByIdResponse();
    }

    /**
     * Create an instance of {@link GetStudentsByClassResponse }
     * 
     */
    public GetStudentsByClassResponse createGetStudentsByClassResponse() {
        return new GetStudentsByClassResponse();
    }

    /**
     * Create an instance of {@link AddSubject }
     * 
     */
    public AddSubject createAddSubject() {
        return new AddSubject();
    }

    /**
     * Create an instance of {@link AddProperty }
     * 
     */
    public AddProperty createAddProperty() {
        return new AddProperty();
    }

    /**
     * Create an instance of {@link TeacherLoginResponse }
     * 
     */
    public TeacherLoginResponse createTeacherLoginResponse() {
        return new TeacherLoginResponse();
    }

    /**
     * Create an instance of {@link UpdateBulk }
     * 
     */
    public UpdateBulk createUpdateBulk() {
        return new UpdateBulk();
    }

    /**
     * Create an instance of {@link AddAdminResponse }
     * 
     */
    public AddAdminResponse createAddAdminResponse() {
        return new AddAdminResponse();
    }

    /**
     * Create an instance of {@link GetSubjectById }
     * 
     */
    public GetSubjectById createGetSubjectById() {
        return new GetSubjectById();
    }

    /**
     * Create an instance of {@link ArchiveToLogByStudentResponse }
     * 
     */
    public ArchiveToLogByStudentResponse createArchiveToLogByStudentResponse() {
        return new ArchiveToLogByStudentResponse();
    }

    /**
     * Create an instance of {@link GetStudentsByNameResponse }
     * 
     */
    public GetStudentsByNameResponse createGetStudentsByNameResponse() {
        return new GetStudentsByNameResponse();
    }

    /**
     * Create an instance of {@link GetTeacherByName }
     * 
     */
    public GetTeacherByName createGetTeacherByName() {
        return new GetTeacherByName();
    }

    /**
     * Create an instance of {@link GetClassesByTeacherResponse }
     * 
     */
    public GetClassesByTeacherResponse createGetClassesByTeacherResponse() {
        return new GetClassesByTeacherResponse();
    }

    /**
     * Create an instance of {@link AddPropertyResponse }
     * 
     */
    public AddPropertyResponse createAddPropertyResponse() {
        return new AddPropertyResponse();
    }

    /**
     * Create an instance of {@link Bulk }
     * 
     */
    public Bulk createBulk() {
        return new Bulk();
    }

    /**
     * Create an instance of {@link AddScores }
     * 
     */
    public AddScores createAddScores() {
        return new AddScores();
    }

    /**
     * Create an instance of {@link AddStudentsList }
     * 
     */
    public AddStudentsList createAddStudentsList() {
        return new AddStudentsList();
    }

    /**
     * Create an instance of {@link AddStudentsListResponse }
     * 
     */
    public AddStudentsListResponse createAddStudentsListResponse() {
        return new AddStudentsListResponse();
    }

    /**
     * Create an instance of {@link GetClassesByTeacher }
     * 
     */
    public GetClassesByTeacher createGetClassesByTeacher() {
        return new GetClassesByTeacher();
    }

    /**
     * Create an instance of {@link GetAdminsResponse }
     * 
     */
    public GetAdminsResponse createGetAdminsResponse() {
        return new GetAdminsResponse();
    }

    /**
     * Create an instance of {@link GetSubjects }
     * 
     */
    public GetSubjects createGetSubjects() {
        return new GetSubjects();
    }

    /**
     * Create an instance of {@link RemoveAdminResponse }
     * 
     */
    public RemoveAdminResponse createRemoveAdminResponse() {
        return new RemoveAdminResponse();
    }

    /**
     * Create an instance of {@link AddScoresResponse }
     * 
     */
    public AddScoresResponse createAddScoresResponse() {
        return new AddScoresResponse();
    }

    /**
     * Create an instance of {@link GetSubjectsByTeacher }
     * 
     */
    public GetSubjectsByTeacher createGetSubjectsByTeacher() {
        return new GetSubjectsByTeacher();
    }

    /**
     * Create an instance of {@link UpdateScores }
     * 
     */
    public UpdateScores createUpdateScores() {
        return new UpdateScores();
    }

    /**
     * Create an instance of {@link GetStudentsByName }
     * 
     */
    public GetStudentsByName createGetStudentsByName() {
        return new GetStudentsByName();
    }

    /**
     * Create an instance of {@link EditArchiveRemarkResponse }
     * 
     */
    public EditArchiveRemarkResponse createEditArchiveRemarkResponse() {
        return new EditArchiveRemarkResponse();
    }

    /**
     * Create an instance of {@link GetStudentById }
     * 
     */
    public GetStudentById createGetStudentById() {
        return new GetStudentById();
    }

    /**
     * Create an instance of {@link GetSubjectsByTeacherResponse }
     * 
     */
    public GetSubjectsByTeacherResponse createGetSubjectsByTeacherResponse() {
        return new GetSubjectsByTeacherResponse();
    }

    /**
     * Create an instance of {@link RemoveStudent }
     * 
     */
    public RemoveStudent createRemoveStudent() {
        return new RemoveStudent();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link UpdateSubject }
     * 
     */
    public UpdateSubject createUpdateSubject() {
        return new UpdateSubject();
    }

    /**
     * Create an instance of {@link GetClasses }
     * 
     */
    public GetClasses createGetClasses() {
        return new GetClasses();
    }

    /**
     * Create an instance of {@link RemoveClassResponse }
     * 
     */
    public RemoveClassResponse createRemoveClassResponse() {
        return new RemoveClassResponse();
    }

    /**
     * Create an instance of {@link RemoveSubjectResponse }
     * 
     */
    public RemoveSubjectResponse createRemoveSubjectResponse() {
        return new RemoveSubjectResponse();
    }

    /**
     * Create an instance of {@link GetTeacherByNameResponse }
     * 
     */
    public GetTeacherByNameResponse createGetTeacherByNameResponse() {
        return new GetTeacherByNameResponse();
    }

    /**
     * Create an instance of {@link GetClassById }
     * 
     */
    public GetClassById createGetClassById() {
        return new GetClassById();
    }

    /**
     * Create an instance of {@link GetPropertyByKeyResponse }
     * 
     */
    public GetPropertyByKeyResponse createGetPropertyByKeyResponse() {
        return new GetPropertyByKeyResponse();
    }

    /**
     * Create an instance of {@link UpdateScore }
     * 
     */
    public UpdateScore createUpdateScore() {
        return new UpdateScore();
    }

    /**
     * Create an instance of {@link UpdateClass }
     * 
     */
    public UpdateClass createUpdateClass() {
        return new UpdateClass();
    }

    /**
     * Create an instance of {@link UpdateScoreResponse }
     * 
     */
    public UpdateScoreResponse createUpdateScoreResponse() {
        return new UpdateScoreResponse();
    }

    /**
     * Create an instance of {@link GetSubjectsResponse }
     * 
     */
    public GetSubjectsResponse createGetSubjectsResponse() {
        return new GetSubjectsResponse();
    }

    /**
     * Create an instance of {@link AddClassResponse }
     * 
     */
    public AddClassResponse createAddClassResponse() {
        return new AddClassResponse();
    }

    /**
     * Create an instance of {@link GetBulksResponse }
     * 
     */
    public GetBulksResponse createGetBulksResponse() {
        return new GetBulksResponse();
    }

    /**
     * Create an instance of {@link ArchiveToLogResponse }
     * 
     */
    public ArchiveToLogResponse createArchiveToLogResponse() {
        return new ArchiveToLogResponse();
    }

    /**
     * Create an instance of {@link EditArchiveRemark }
     * 
     */
    public EditArchiveRemark createEditArchiveRemark() {
        return new EditArchiveRemark();
    }

    /**
     * Create an instance of {@link AddAdmin }
     * 
     */
    public AddAdmin createAddAdmin() {
        return new AddAdmin();
    }

    /**
     * Create an instance of {@link Subject }
     * 
     */
    public Subject createSubject() {
        return new Subject();
    }

    /**
     * Create an instance of {@link ArchiveToLogByStudent }
     * 
     */
    public ArchiveToLogByStudent createArchiveToLogByStudent() {
        return new ArchiveToLogByStudent();
    }

    /**
     * Create an instance of {@link GetScoresBySubjectResponse }
     * 
     */
    public GetScoresBySubjectResponse createGetScoresBySubjectResponse() {
        return new GetScoresBySubjectResponse();
    }

    /**
     * Create an instance of {@link UpdateScoresResponse }
     * 
     */
    public UpdateScoresResponse createUpdateScoresResponse() {
        return new UpdateScoresResponse();
    }

    /**
     * Create an instance of {@link GetPropertyValueByKeyResponse }
     * 
     */
    public GetPropertyValueByKeyResponse createGetPropertyValueByKeyResponse() {
        return new GetPropertyValueByKeyResponse();
    }

    /**
     * Create an instance of {@link TeacherLogin }
     * 
     */
    public TeacherLogin createTeacherLogin() {
        return new TeacherLogin();
    }

    /**
     * Create an instance of {@link RemoveStudentResponse }
     * 
     */
    public RemoveStudentResponse createRemoveStudentResponse() {
        return new RemoveStudentResponse();
    }

    /**
     * Create an instance of {@link AddClass }
     * 
     */
    public AddClass createAddClass() {
        return new AddClass();
    }

    /**
     * Create an instance of {@link GetStudents }
     * 
     */
    public GetStudents createGetStudents() {
        return new GetStudents();
    }

    /**
     * Create an instance of {@link AddSubjectResponse }
     * 
     */
    public AddSubjectResponse createAddSubjectResponse() {
        return new AddSubjectResponse();
    }

    /**
     * Create an instance of {@link GetTeachers }
     * 
     */
    public GetTeachers createGetTeachers() {
        return new GetTeachers();
    }

    /**
     * Create an instance of {@link RemoveClass }
     * 
     */
    public RemoveClass createRemoveClass() {
        return new RemoveClass();
    }

    /**
     * Create an instance of {@link AdminLoginResponse }
     * 
     */
    public AdminLoginResponse createAdminLoginResponse() {
        return new AdminLoginResponse();
    }

    /**
     * Create an instance of {@link GetAdmins }
     * 
     */
    public GetAdmins createGetAdmins() {
        return new GetAdmins();
    }

    /**
     * Create an instance of {@link AdminLogin }
     * 
     */
    public AdminLogin createAdminLogin() {
        return new AdminLogin();
    }

    /**
     * Create an instance of {@link GetScoresBySubject }
     * 
     */
    public GetScoresBySubject createGetScoresBySubject() {
        return new GetScoresBySubject();
    }

    /**
     * Create an instance of {@link RemoveScoresResponse }
     * 
     */
    public RemoveScoresResponse createRemoveScoresResponse() {
        return new RemoveScoresResponse();
    }

    /**
     * Create an instance of {@link GetScoresByStudentAndSubject }
     * 
     */
    public GetScoresByStudentAndSubject createGetScoresByStudentAndSubject() {
        return new GetScoresByStudentAndSubject();
    }

    /**
     * Create an instance of {@link GetBulkByIdResponse }
     * 
     */
    public GetBulkByIdResponse createGetBulkByIdResponse() {
        return new GetBulkByIdResponse();
    }

    /**
     * Create an instance of {@link RemoveBulkResponse }
     * 
     */
    public RemoveBulkResponse createRemoveBulkResponse() {
        return new RemoveBulkResponse();
    }

    /**
     * Create an instance of {@link GetSubjectsByBulk }
     * 
     */
    public GetSubjectsByBulk createGetSubjectsByBulk() {
        return new GetSubjectsByBulk();
    }

    /**
     * Create an instance of {@link RemoveProperty }
     * 
     */
    public RemoveProperty createRemoveProperty() {
        return new RemoveProperty();
    }

    /**
     * Create an instance of {@link GetScoresByStudentAndSubjectResponse }
     * 
     */
    public GetScoresByStudentAndSubjectResponse createGetScoresByStudentAndSubjectResponse() {
        return new GetScoresByStudentAndSubjectResponse();
    }

    /**
     * Create an instance of {@link RemoveBulk }
     * 
     */
    public RemoveBulk createRemoveBulk() {
        return new RemoveBulk();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link UpdateStudentResponse }
     * 
     */
    public UpdateStudentResponse createUpdateStudentResponse() {
        return new UpdateStudentResponse();
    }

    /**
     * Create an instance of {@link Admin }
     * 
     */
    public Admin createAdmin() {
        return new Admin();
    }

    /**
     * Create an instance of {@link UpdatePropertyResponse }
     * 
     */
    public UpdatePropertyResponse createUpdatePropertyResponse() {
        return new UpdatePropertyResponse();
    }

    /**
     * Create an instance of {@link GetPropertyValueByKey }
     * 
     */
    public GetPropertyValueByKey createGetPropertyValueByKey() {
        return new GetPropertyValueByKey();
    }

    /**
     * Create an instance of {@link GetSubjectsByBulkResponse }
     * 
     */
    public GetSubjectsByBulkResponse createGetSubjectsByBulkResponse() {
        return new GetSubjectsByBulkResponse();
    }

    /**
     * Create an instance of {@link AddBulk }
     * 
     */
    public AddBulk createAddBulk() {
        return new AddBulk();
    }

    /**
     * Create an instance of {@link GetBulks }
     * 
     */
    public GetBulks createGetBulks() {
        return new GetBulks();
    }

    /**
     * Create an instance of {@link Teacher }
     * 
     */
    public Teacher createTeacher() {
        return new Teacher();
    }

    /**
     * Create an instance of {@link AddScore }
     * 
     */
    public AddScore createAddScore() {
        return new AddScore();
    }

    /**
     * Create an instance of {@link AddBulkResponse }
     * 
     */
    public AddBulkResponse createAddBulkResponse() {
        return new AddBulkResponse();
    }

    /**
     * Create an instance of {@link UpdateTeacher }
     * 
     */
    public UpdateTeacher createUpdateTeacher() {
        return new UpdateTeacher();
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link GetSubjectByIdResponse }
     * 
     */
    public GetSubjectByIdResponse createGetSubjectByIdResponse() {
        return new GetSubjectByIdResponse();
    }

    /**
     * Create an instance of {@link RemoveSubject }
     * 
     */
    public RemoveSubject createRemoveSubject() {
        return new RemoveSubject();
    }

    /**
     * Create an instance of {@link UpdateStudent }
     * 
     */
    public UpdateStudent createUpdateStudent() {
        return new UpdateStudent();
    }

    /**
     * Create an instance of {@link AddScoreResponse }
     * 
     */
    public AddScoreResponse createAddScoreResponse() {
        return new AddScoreResponse();
    }

    /**
     * Create an instance of {@link GetScoresBySubjectAndClassResponse }
     * 
     */
    public GetScoresBySubjectAndClassResponse createGetScoresBySubjectAndClassResponse() {
        return new GetScoresBySubjectAndClassResponse();
    }

    /**
     * Create an instance of {@link AddTeacher }
     * 
     */
    public AddTeacher createAddTeacher() {
        return new AddTeacher();
    }

    /**
     * Create an instance of {@link UpdateTeacherResponse }
     * 
     */
    public UpdateTeacherResponse createUpdateTeacherResponse() {
        return new UpdateTeacherResponse();
    }

    /**
     * Create an instance of {@link GetBulkById }
     * 
     */
    public GetBulkById createGetBulkById() {
        return new GetBulkById();
    }

    /**
     * Create an instance of {@link RemoveScores }
     * 
     */
    public RemoveScores createRemoveScores() {
        return new RemoveScores();
    }

    /**
     * Create an instance of {@link UpdateSubjectResponse }
     * 
     */
    public UpdateSubjectResponse createUpdateSubjectResponse() {
        return new UpdateSubjectResponse();
    }

    /**
     * Create an instance of {@link RemoveAdmin }
     * 
     */
    public RemoveAdmin createRemoveAdmin() {
        return new RemoveAdmin();
    }

    /**
     * Create an instance of {@link GetPropertyByKey }
     * 
     */
    public GetPropertyByKey createGetPropertyByKey() {
        return new GetPropertyByKey();
    }

    /**
     * Create an instance of {@link Clazz }
     * 
     */
    public Clazz createClazz() {
        return new Clazz();
    }

    /**
     * Create an instance of {@link Properties }
     * 
     */
    public Properties createProperties() {
        return new Properties();
    }

    /**
     * Create an instance of {@link UpdateClassResponse }
     * 
     */
    public UpdateClassResponse createUpdateClassResponse() {
        return new UpdateClassResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTeachers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getTeachers")
    public JAXBElement<GetTeachers> createGetTeachers(GetTeachers value) {
        return new JAXBElement<GetTeachers>(_GetTeachers_QNAME, GetTeachers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "removeClass")
    public JAXBElement<RemoveClass> createRemoveClass(RemoveClass value) {
        return new JAXBElement<RemoveClass>(_RemoveClass_QNAME, RemoveClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addSubjectResponse")
    public JAXBElement<AddSubjectResponse> createAddSubjectResponse(AddSubjectResponse value) {
        return new JAXBElement<AddSubjectResponse>(_AddSubjectResponse_QNAME, AddSubjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getStudents")
    public JAXBElement<GetStudents> createGetStudents(GetStudents value) {
        return new JAXBElement<GetStudents>(_GetStudents_QNAME, GetStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "adminLogin")
    public JAXBElement<AdminLogin> createAdminLogin(AdminLogin value) {
        return new JAXBElement<AdminLogin>(_AdminLogin_QNAME, AdminLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoresBySubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getScoresBySubject")
    public JAXBElement<GetScoresBySubject> createGetScoresBySubject(GetScoresBySubject value) {
        return new JAXBElement<GetScoresBySubject>(_GetScoresBySubject_QNAME, GetScoresBySubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdmins }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getAdmins")
    public JAXBElement<GetAdmins> createGetAdmins(GetAdmins value) {
        return new JAXBElement<GetAdmins>(_GetAdmins_QNAME, GetAdmins.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdminLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "adminLoginResponse")
    public JAXBElement<AdminLoginResponse> createAdminLoginResponse(AdminLoginResponse value) {
        return new JAXBElement<AdminLoginResponse>(_AdminLoginResponse_QNAME, AdminLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBulkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "removeBulkResponse")
    public JAXBElement<RemoveBulkResponse> createRemoveBulkResponse(RemoveBulkResponse value) {
        return new JAXBElement<RemoveBulkResponse>(_RemoveBulkResponse_QNAME, RemoveBulkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBulkByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getBulkByIdResponse")
    public JAXBElement<GetBulkByIdResponse> createGetBulkByIdResponse(GetBulkByIdResponse value) {
        return new JAXBElement<GetBulkByIdResponse>(_GetBulkByIdResponse_QNAME, GetBulkByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoresByStudentAndSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getScoresByStudentAndSubject")
    public JAXBElement<GetScoresByStudentAndSubject> createGetScoresByStudentAndSubject(GetScoresByStudentAndSubject value) {
        return new JAXBElement<GetScoresByStudentAndSubject>(_GetScoresByStudentAndSubject_QNAME, GetScoresByStudentAndSubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveScoresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "removeScoresResponse")
    public JAXBElement<RemoveScoresResponse> createRemoveScoresResponse(RemoveScoresResponse value) {
        return new JAXBElement<RemoveScoresResponse>(_RemoveScoresResponse_QNAME, RemoveScoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoresByStudentAndSubjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getScoresByStudentAndSubjectResponse")
    public JAXBElement<GetScoresByStudentAndSubjectResponse> createGetScoresByStudentAndSubjectResponse(GetScoresByStudentAndSubjectResponse value) {
        return new JAXBElement<GetScoresByStudentAndSubjectResponse>(_GetScoresByStudentAndSubjectResponse_QNAME, GetScoresByStudentAndSubjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "removeProperty")
    public JAXBElement<RemoveProperty> createRemoveProperty(RemoveProperty value) {
        return new JAXBElement<RemoveProperty>(_RemoveProperty_QNAME, RemoveProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjectsByBulk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getSubjectsByBulk")
    public JAXBElement<GetSubjectsByBulk> createGetSubjectsByBulk(GetSubjectsByBulk value) {
        return new JAXBElement<GetSubjectsByBulk>(_GetSubjectsByBulk_QNAME, GetSubjectsByBulk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveToLogByStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "archiveToLogByStudent")
    public JAXBElement<ArchiveToLogByStudent> createArchiveToLogByStudent(ArchiveToLogByStudent value) {
        return new JAXBElement<ArchiveToLogByStudent>(_ArchiveToLogByStudent_QNAME, ArchiveToLogByStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addAdmin")
    public JAXBElement<AddAdmin> createAddAdmin(AddAdmin value) {
        return new JAXBElement<AddAdmin>(_AddAdmin_QNAME, AddAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "subject")
    public JAXBElement<Subject> createSubject(Subject value) {
        return new JAXBElement<Subject>(_Subject_QNAME, Subject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPropertyValueByKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getPropertyValueByKeyResponse")
    public JAXBElement<GetPropertyValueByKeyResponse> createGetPropertyValueByKeyResponse(GetPropertyValueByKeyResponse value) {
        return new JAXBElement<GetPropertyValueByKeyResponse>(_GetPropertyValueByKeyResponse_QNAME, GetPropertyValueByKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateScoresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateScoresResponse")
    public JAXBElement<UpdateScoresResponse> createUpdateScoresResponse(UpdateScoresResponse value) {
        return new JAXBElement<UpdateScoresResponse>(_UpdateScoresResponse_QNAME, UpdateScoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoresBySubjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getScoresBySubjectResponse")
    public JAXBElement<GetScoresBySubjectResponse> createGetScoresBySubjectResponse(GetScoresBySubjectResponse value) {
        return new JAXBElement<GetScoresBySubjectResponse>(_GetScoresBySubjectResponse_QNAME, GetScoresBySubjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addClass")
    public JAXBElement<AddClass> createAddClass(AddClass value) {
        return new JAXBElement<AddClass>(_AddClass_QNAME, AddClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "removeStudentResponse")
    public JAXBElement<RemoveStudentResponse> createRemoveStudentResponse(RemoveStudentResponse value) {
        return new JAXBElement<RemoveStudentResponse>(_RemoveStudentResponse_QNAME, RemoveStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeacherLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "teacherLogin")
    public JAXBElement<TeacherLogin> createTeacherLogin(TeacherLogin value) {
        return new JAXBElement<TeacherLogin>(_TeacherLogin_QNAME, TeacherLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateStudent")
    public JAXBElement<UpdateStudent> createUpdateStudent(UpdateStudent value) {
        return new JAXBElement<UpdateStudent>(_UpdateStudent_QNAME, UpdateStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "removeSubject")
    public JAXBElement<RemoveSubject> createRemoveSubject(RemoveSubject value) {
        return new JAXBElement<RemoveSubject>(_RemoveSubject_QNAME, RemoveSubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjectByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getSubjectByIdResponse")
    public JAXBElement<GetSubjectByIdResponse> createGetSubjectByIdResponse(GetSubjectByIdResponse value) {
        return new JAXBElement<GetSubjectByIdResponse>(_GetSubjectByIdResponse_QNAME, GetSubjectByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBulkById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getBulkById")
    public JAXBElement<GetBulkById> createGetBulkById(GetBulkById value) {
        return new JAXBElement<GetBulkById>(_GetBulkById_QNAME, GetBulkById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTeacher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addTeacher")
    public JAXBElement<AddTeacher> createAddTeacher(AddTeacher value) {
        return new JAXBElement<AddTeacher>(_AddTeacher_QNAME, AddTeacher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTeacherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateTeacherResponse")
    public JAXBElement<UpdateTeacherResponse> createUpdateTeacherResponse(UpdateTeacherResponse value) {
        return new JAXBElement<UpdateTeacherResponse>(_UpdateTeacherResponse_QNAME, UpdateTeacherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoresBySubjectAndClassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getScoresBySubjectAndClassResponse")
    public JAXBElement<GetScoresBySubjectAndClassResponse> createGetScoresBySubjectAndClassResponse(GetScoresBySubjectAndClassResponse value) {
        return new JAXBElement<GetScoresBySubjectAndClassResponse>(_GetScoresBySubjectAndClassResponse_QNAME, GetScoresBySubjectAndClassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddScoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addScoreResponse")
    public JAXBElement<AddScoreResponse> createAddScoreResponse(AddScoreResponse value) {
        return new JAXBElement<AddScoreResponse>(_AddScoreResponse_QNAME, AddScoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveScores }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "removeScores")
    public JAXBElement<RemoveScores> createRemoveScores(RemoveScores value) {
        return new JAXBElement<RemoveScores>(_RemoveScores_QNAME, RemoveScores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateClassResponse")
    public JAXBElement<UpdateClassResponse> createUpdateClassResponse(UpdateClassResponse value) {
        return new JAXBElement<UpdateClassResponse>(_UpdateClassResponse_QNAME, UpdateClassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Properties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "properties")
    public JAXBElement<Properties> createProperties(Properties value) {
        return new JAXBElement<Properties>(_Properties_QNAME, Properties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Clazz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "clazz")
    public JAXBElement<Clazz> createClazz(Clazz value) {
        return new JAXBElement<Clazz>(_Clazz_QNAME, Clazz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPropertyByKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getPropertyByKey")
    public JAXBElement<GetPropertyByKey> createGetPropertyByKey(GetPropertyByKey value) {
        return new JAXBElement<GetPropertyByKey>(_GetPropertyByKey_QNAME, GetPropertyByKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "removeAdmin")
    public JAXBElement<RemoveAdmin> createRemoveAdmin(RemoveAdmin value) {
        return new JAXBElement<RemoveAdmin>(_RemoveAdmin_QNAME, RemoveAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSubjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateSubjectResponse")
    public JAXBElement<UpdateSubjectResponse> createUpdateSubjectResponse(UpdateSubjectResponse value) {
        return new JAXBElement<UpdateSubjectResponse>(_UpdateSubjectResponse_QNAME, UpdateSubjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "student")
    public JAXBElement<Student> createStudent(Student value) {
        return new JAXBElement<Student>(_Student_QNAME, Student.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateStudentResponse")
    public JAXBElement<UpdateStudentResponse> createUpdateStudentResponse(UpdateStudentResponse value) {
        return new JAXBElement<UpdateStudentResponse>(_UpdateStudentResponse_QNAME, UpdateStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBulk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "removeBulk")
    public JAXBElement<RemoveBulk> createRemoveBulk(RemoveBulk value) {
        return new JAXBElement<RemoveBulk>(_RemoveBulk_QNAME, RemoveBulk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjectsByBulkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getSubjectsByBulkResponse")
    public JAXBElement<GetSubjectsByBulkResponse> createGetSubjectsByBulkResponse(GetSubjectsByBulkResponse value) {
        return new JAXBElement<GetSubjectsByBulkResponse>(_GetSubjectsByBulkResponse_QNAME, GetSubjectsByBulkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPropertyValueByKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getPropertyValueByKey")
    public JAXBElement<GetPropertyValueByKey> createGetPropertyValueByKey(GetPropertyValueByKey value) {
        return new JAXBElement<GetPropertyValueByKey>(_GetPropertyValueByKey_QNAME, GetPropertyValueByKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Admin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "admin")
    public JAXBElement<Admin> createAdmin(Admin value) {
        return new JAXBElement<Admin>(_Admin_QNAME, Admin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePropertyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updatePropertyResponse")
    public JAXBElement<UpdatePropertyResponse> createUpdatePropertyResponse(UpdatePropertyResponse value) {
        return new JAXBElement<UpdatePropertyResponse>(_UpdatePropertyResponse_QNAME, UpdatePropertyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addScore")
    public JAXBElement<AddScore> createAddScore(AddScore value) {
        return new JAXBElement<AddScore>(_AddScore_QNAME, AddScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Teacher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "teacher")
    public JAXBElement<Teacher> createTeacher(Teacher value) {
        return new JAXBElement<Teacher>(_Teacher_QNAME, Teacher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBulks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getBulks")
    public JAXBElement<GetBulks> createGetBulks(GetBulks value) {
        return new JAXBElement<GetBulks>(_GetBulks_QNAME, GetBulks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBulk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addBulk")
    public JAXBElement<AddBulk> createAddBulk(AddBulk value) {
        return new JAXBElement<AddBulk>(_AddBulk_QNAME, AddBulk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTeacher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateTeacher")
    public JAXBElement<UpdateTeacher> createUpdateTeacher(UpdateTeacher value) {
        return new JAXBElement<UpdateTeacher>(_UpdateTeacher_QNAME, UpdateTeacher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBulkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addBulkResponse")
    public JAXBElement<AddBulkResponse> createAddBulkResponse(AddBulkResponse value) {
        return new JAXBElement<AddBulkResponse>(_AddBulkResponse_QNAME, AddBulkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getClassByIdResponse")
    public JAXBElement<GetClassByIdResponse> createGetClassByIdResponse(GetClassByIdResponse value) {
        return new JAXBElement<GetClassByIdResponse>(_GetClassByIdResponse_QNAME, GetClassByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getProperties")
    public JAXBElement<GetProperties> createGetProperties(GetProperties value) {
        return new JAXBElement<GetProperties>(_GetProperties_QNAME, GetProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getStudentsResponse")
    public JAXBElement<GetStudentsResponse> createGetStudentsResponse(GetStudentsResponse value) {
        return new JAXBElement<GetStudentsResponse>(_GetStudentsResponse_QNAME, GetStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTeacherByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getTeacherByIdResponse")
    public JAXBElement<GetTeacherByIdResponse> createGetTeacherByIdResponse(GetTeacherByIdResponse value) {
        return new JAXBElement<GetTeacherByIdResponse>(_GetTeacherByIdResponse_QNAME, GetTeacherByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveToLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "archiveToLog")
    public JAXBElement<ArchiveToLog> createArchiveToLog(ArchiveToLog value) {
        return new JAXBElement<ArchiveToLog>(_ArchiveToLog_QNAME, ArchiveToLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTeacherById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getTeacherById")
    public JAXBElement<GetTeacherById> createGetTeacherById(GetTeacherById value) {
        return new JAXBElement<GetTeacherById>(_GetTeacherById_QNAME, GetTeacherById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateAdmin")
    public JAXBElement<UpdateAdmin> createUpdateAdmin(UpdateAdmin value) {
        return new JAXBElement<UpdateAdmin>(_UpdateAdmin_QNAME, UpdateAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScoresBySubjectAndClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getScoresBySubjectAndClass")
    public JAXBElement<GetScoresBySubjectAndClass> createGetScoresBySubjectAndClass(GetScoresBySubjectAndClass value) {
        return new JAXBElement<GetScoresBySubjectAndClass>(_GetScoresBySubjectAndClass_QNAME, GetScoresBySubjectAndClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBulk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateBulk")
    public JAXBElement<UpdateBulk> createUpdateBulk(UpdateBulk value) {
        return new JAXBElement<UpdateBulk>(_UpdateBulk_QNAME, UpdateBulk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addProperty")
    public JAXBElement<AddProperty> createAddProperty(AddProperty value) {
        return new JAXBElement<AddProperty>(_AddProperty_QNAME, AddProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TeacherLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "teacherLoginResponse")
    public JAXBElement<TeacherLoginResponse> createTeacherLoginResponse(TeacherLoginResponse value) {
        return new JAXBElement<TeacherLoginResponse>(_TeacherLoginResponse_QNAME, TeacherLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addSubject")
    public JAXBElement<AddSubject> createAddSubject(AddSubject value) {
        return new JAXBElement<AddSubject>(_AddSubject_QNAME, AddSubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByClassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getStudentsByClassResponse")
    public JAXBElement<GetStudentsByClassResponse> createGetStudentsByClassResponse(GetStudentsByClassResponse value) {
        return new JAXBElement<GetStudentsByClassResponse>(_GetStudentsByClassResponse_QNAME, GetStudentsByClassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassesByTeacherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getClassesByTeacherResponse")
    public JAXBElement<GetClassesByTeacherResponse> createGetClassesByTeacherResponse(GetClassesByTeacherResponse value) {
        return new JAXBElement<GetClassesByTeacherResponse>(_GetClassesByTeacherResponse_QNAME, GetClassesByTeacherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTeacherByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getTeacherByName")
    public JAXBElement<GetTeacherByName> createGetTeacherByName(GetTeacherByName value) {
        return new JAXBElement<GetTeacherByName>(_GetTeacherByName_QNAME, GetTeacherByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getStudentsByNameResponse")
    public JAXBElement<GetStudentsByNameResponse> createGetStudentsByNameResponse(GetStudentsByNameResponse value) {
        return new JAXBElement<GetStudentsByNameResponse>(_GetStudentsByNameResponse_QNAME, GetStudentsByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveToLogByStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "archiveToLogByStudentResponse")
    public JAXBElement<ArchiveToLogByStudentResponse> createArchiveToLogByStudentResponse(ArchiveToLogByStudentResponse value) {
        return new JAXBElement<ArchiveToLogByStudentResponse>(_ArchiveToLogByStudentResponse_QNAME, ArchiveToLogByStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjectById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getSubjectById")
    public JAXBElement<GetSubjectById> createGetSubjectById(GetSubjectById value) {
        return new JAXBElement<GetSubjectById>(_GetSubjectById_QNAME, GetSubjectById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addAdminResponse")
    public JAXBElement<AddAdminResponse> createAddAdminResponse(AddAdminResponse value) {
        return new JAXBElement<AddAdminResponse>(_AddAdminResponse_QNAME, AddAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentsListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addStudentsListResponse")
    public JAXBElement<AddStudentsListResponse> createAddStudentsListResponse(AddStudentsListResponse value) {
        return new JAXBElement<AddStudentsListResponse>(_AddStudentsListResponse_QNAME, AddStudentsListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddScores }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addScores")
    public JAXBElement<AddScores> createAddScores(AddScores value) {
        return new JAXBElement<AddScores>(_AddScores_QNAME, AddScores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentsList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addStudentsList")
    public JAXBElement<AddStudentsList> createAddStudentsList(AddStudentsList value) {
        return new JAXBElement<AddStudentsList>(_AddStudentsList_QNAME, AddStudentsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bulk }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "bulk")
    public JAXBElement<Bulk> createBulk(Bulk value) {
        return new JAXBElement<Bulk>(_Bulk_QNAME, Bulk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPropertyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addPropertyResponse")
    public JAXBElement<AddPropertyResponse> createAddPropertyResponse(AddPropertyResponse value) {
        return new JAXBElement<AddPropertyResponse>(_AddPropertyResponse_QNAME, AddPropertyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateAdminResponse")
    public JAXBElement<UpdateAdminResponse> createUpdateAdminResponse(UpdateAdminResponse value) {
        return new JAXBElement<UpdateAdminResponse>(_UpdateAdminResponse_QNAME, UpdateAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTeacherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addTeacherResponse")
    public JAXBElement<AddTeacherResponse> createAddTeacherResponse(AddTeacherResponse value) {
        return new JAXBElement<AddTeacherResponse>(_AddTeacherResponse_QNAME, AddTeacherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePropertyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "removePropertyResponse")
    public JAXBElement<RemovePropertyResponse> createRemovePropertyResponse(RemovePropertyResponse value) {
        return new JAXBElement<RemovePropertyResponse>(_RemovePropertyResponse_QNAME, RemovePropertyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPropertiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getPropertiesResponse")
    public JAXBElement<GetPropertiesResponse> createGetPropertiesResponse(GetPropertiesResponse value) {
        return new JAXBElement<GetPropertiesResponse>(_GetPropertiesResponse_QNAME, GetPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getStudentByIdResponse")
    public JAXBElement<GetStudentByIdResponse> createGetStudentByIdResponse(GetStudentByIdResponse value) {
        return new JAXBElement<GetStudentByIdResponse>(_GetStudentByIdResponse_QNAME, GetStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTeachersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getTeachersResponse")
    public JAXBElement<GetTeachersResponse> createGetTeachersResponse(GetTeachersResponse value) {
        return new JAXBElement<GetTeachersResponse>(_GetTeachersResponse_QNAME, GetTeachersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getClassesResponse")
    public JAXBElement<GetClassesResponse> createGetClassesResponse(GetClassesResponse value) {
        return new JAXBElement<GetClassesResponse>(_GetClassesResponse_QNAME, GetClassesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateProperty")
    public JAXBElement<UpdateProperty> createUpdateProperty(UpdateProperty value) {
        return new JAXBElement<UpdateProperty>(_UpdateProperty_QNAME, UpdateProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Score }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "score")
    public JAXBElement<Score> createScore(Score value) {
        return new JAXBElement<Score>(_Score_QNAME, Score.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getStudentsByClass")
    public JAXBElement<GetStudentsByClass> createGetStudentsByClass(GetStudentsByClass value) {
        return new JAXBElement<GetStudentsByClass>(_GetStudentsByClass_QNAME, GetStudentsByClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBulkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateBulkResponse")
    public JAXBElement<UpdateBulkResponse> createUpdateBulkResponse(UpdateBulkResponse value) {
        return new JAXBElement<UpdateBulkResponse>(_UpdateBulkResponse_QNAME, UpdateBulkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPropertyByKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getPropertyByKeyResponse")
    public JAXBElement<GetPropertyByKeyResponse> createGetPropertyByKeyResponse(GetPropertyByKeyResponse value) {
        return new JAXBElement<GetPropertyByKeyResponse>(_GetPropertyByKeyResponse_QNAME, GetPropertyByKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getClassById")
    public JAXBElement<GetClassById> createGetClassById(GetClassById value) {
        return new JAXBElement<GetClassById>(_GetClassById_QNAME, GetClassById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTeacherByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getTeacherByNameResponse")
    public JAXBElement<GetTeacherByNameResponse> createGetTeacherByNameResponse(GetTeacherByNameResponse value) {
        return new JAXBElement<GetTeacherByNameResponse>(_GetTeacherByNameResponse_QNAME, GetTeacherByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveClassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "removeClassResponse")
    public JAXBElement<RemoveClassResponse> createRemoveClassResponse(RemoveClassResponse value) {
        return new JAXBElement<RemoveClassResponse>(_RemoveClassResponse_QNAME, RemoveClassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveSubjectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "removeSubjectResponse")
    public JAXBElement<RemoveSubjectResponse> createRemoveSubjectResponse(RemoveSubjectResponse value) {
        return new JAXBElement<RemoveSubjectResponse>(_RemoveSubjectResponse_QNAME, RemoveSubjectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateClass")
    public JAXBElement<UpdateClass> createUpdateClass(UpdateClass value) {
        return new JAXBElement<UpdateClass>(_UpdateClass_QNAME, UpdateClass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateScore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateScore")
    public JAXBElement<UpdateScore> createUpdateScore(UpdateScore value) {
        return new JAXBElement<UpdateScore>(_UpdateScore_QNAME, UpdateScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddClassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addClassResponse")
    public JAXBElement<AddClassResponse> createAddClassResponse(AddClassResponse value) {
        return new JAXBElement<AddClassResponse>(_AddClassResponse_QNAME, AddClassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjectsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getSubjectsResponse")
    public JAXBElement<GetSubjectsResponse> createGetSubjectsResponse(GetSubjectsResponse value) {
        return new JAXBElement<GetSubjectsResponse>(_GetSubjectsResponse_QNAME, GetSubjectsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateScoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateScoreResponse")
    public JAXBElement<UpdateScoreResponse> createUpdateScoreResponse(UpdateScoreResponse value) {
        return new JAXBElement<UpdateScoreResponse>(_UpdateScoreResponse_QNAME, UpdateScoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditArchiveRemark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "editArchiveRemark")
    public JAXBElement<EditArchiveRemark> createEditArchiveRemark(EditArchiveRemark value) {
        return new JAXBElement<EditArchiveRemark>(_EditArchiveRemark_QNAME, EditArchiveRemark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchiveToLogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "archiveToLogResponse")
    public JAXBElement<ArchiveToLogResponse> createArchiveToLogResponse(ArchiveToLogResponse value) {
        return new JAXBElement<ArchiveToLogResponse>(_ArchiveToLogResponse_QNAME, ArchiveToLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBulksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getBulksResponse")
    public JAXBElement<GetBulksResponse> createGetBulksResponse(GetBulksResponse value) {
        return new JAXBElement<GetBulksResponse>(_GetBulksResponse_QNAME, GetBulksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjects }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getSubjects")
    public JAXBElement<GetSubjects> createGetSubjects(GetSubjects value) {
        return new JAXBElement<GetSubjects>(_GetSubjects_QNAME, GetSubjects.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getAdminsResponse")
    public JAXBElement<GetAdminsResponse> createGetAdminsResponse(GetAdminsResponse value) {
        return new JAXBElement<GetAdminsResponse>(_GetAdminsResponse_QNAME, GetAdminsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClassesByTeacher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getClassesByTeacher")
    public JAXBElement<GetClassesByTeacher> createGetClassesByTeacher(GetClassesByTeacher value) {
        return new JAXBElement<GetClassesByTeacher>(_GetClassesByTeacher_QNAME, GetClassesByTeacher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateScores }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateScores")
    public JAXBElement<UpdateScores> createUpdateScores(UpdateScores value) {
        return new JAXBElement<UpdateScores>(_UpdateScores_QNAME, UpdateScores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjectsByTeacher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getSubjectsByTeacher")
    public JAXBElement<GetSubjectsByTeacher> createGetSubjectsByTeacher(GetSubjectsByTeacher value) {
        return new JAXBElement<GetSubjectsByTeacher>(_GetSubjectsByTeacher_QNAME, GetSubjectsByTeacher.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddScoresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addScoresResponse")
    public JAXBElement<AddScoresResponse> createAddScoresResponse(AddScoresResponse value) {
        return new JAXBElement<AddScoresResponse>(_AddScoresResponse_QNAME, AddScoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "removeAdminResponse")
    public JAXBElement<RemoveAdminResponse> createRemoveAdminResponse(RemoveAdminResponse value) {
        return new JAXBElement<RemoveAdminResponse>(_RemoveAdminResponse_QNAME, RemoveAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubjectsByTeacherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getSubjectsByTeacherResponse")
    public JAXBElement<GetSubjectsByTeacherResponse> createGetSubjectsByTeacherResponse(GetSubjectsByTeacherResponse value) {
        return new JAXBElement<GetSubjectsByTeacherResponse>(_GetSubjectsByTeacherResponse_QNAME, GetSubjectsByTeacherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "removeStudent")
    public JAXBElement<RemoveStudent> createRemoveStudent(RemoveStudent value) {
        return new JAXBElement<RemoveStudent>(_RemoveStudent_QNAME, RemoveStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getStudentById")
    public JAXBElement<GetStudentById> createGetStudentById(GetStudentById value) {
        return new JAXBElement<GetStudentById>(_GetStudentById_QNAME, GetStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditArchiveRemarkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "editArchiveRemarkResponse")
    public JAXBElement<EditArchiveRemarkResponse> createEditArchiveRemarkResponse(EditArchiveRemarkResponse value) {
        return new JAXBElement<EditArchiveRemarkResponse>(_EditArchiveRemarkResponse_QNAME, EditArchiveRemarkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getStudentsByName")
    public JAXBElement<GetStudentsByName> createGetStudentsByName(GetStudentsByName value) {
        return new JAXBElement<GetStudentsByName>(_GetStudentsByName_QNAME, GetStudentsByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClasses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "getClasses")
    public JAXBElement<GetClasses> createGetClasses(GetClasses value) {
        return new JAXBElement<GetClasses>(_GetClasses_QNAME, GetClasses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSubject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "updateSubject")
    public JAXBElement<UpdateSubject> createUpdateSubject(UpdateSubject value) {
        return new JAXBElement<UpdateSubject>(_UpdateSubject_QNAME, UpdateSubject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.marksmana.com/", name = "addStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

}
