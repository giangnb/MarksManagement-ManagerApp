
package com.client.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for score complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="score">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coefficient" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="studentId" type="{http://ws.marksmana.com/}student" minOccurs="0"/>
 *         &lt;element name="subjectId" type="{http://ws.marksmana.com/}subject" minOccurs="0"/>
 *         &lt;element name="teacherId" type="{http://ws.marksmana.com/}teacher" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "score", propOrder = {
    "coefficient",
    "id",
    "score",
    "studentId",
    "subjectId",
    "teacherId"
})
public class Score {

    protected short coefficient;
    protected Long id;
    protected double score;
    protected Student studentId;
    protected Subject subjectId;
    protected Teacher teacherId;

    /**
     * Gets the value of the coefficient property.
     * 
     */
    public short getCoefficient() {
        return coefficient;
    }

    /**
     * Sets the value of the coefficient property.
     * 
     */
    public void setCoefficient(short value) {
        this.coefficient = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the score property.
     * 
     */
    public double getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     */
    public void setScore(double value) {
        this.score = value;
    }

    /**
     * Gets the value of the studentId property.
     * 
     * @return
     *     possible object is
     *     {@link Student }
     *     
     */
    public Student getStudentId() {
        return studentId;
    }

    /**
     * Sets the value of the studentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Student }
     *     
     */
    public void setStudentId(Student value) {
        this.studentId = value;
    }

    /**
     * Gets the value of the subjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Subject }
     *     
     */
    public Subject getSubjectId() {
        return subjectId;
    }

    /**
     * Sets the value of the subjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subject }
     *     
     */
    public void setSubjectId(Subject value) {
        this.subjectId = value;
    }

    /**
     * Gets the value of the teacherId property.
     * 
     * @return
     *     possible object is
     *     {@link Teacher }
     *     
     */
    public Teacher getTeacherId() {
        return teacherId;
    }

    /**
     * Sets the value of the teacherId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Teacher }
     *     
     */
    public void setTeacherId(Teacher value) {
        this.teacherId = value;
    }

}
