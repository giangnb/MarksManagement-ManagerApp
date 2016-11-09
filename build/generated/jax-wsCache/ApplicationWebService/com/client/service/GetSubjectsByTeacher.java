
package com.client.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSubjectsByTeacher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSubjectsByTeacher">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="teacherId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSubjectsByTeacher", propOrder = {
    "teacherId"
})
public class GetSubjectsByTeacher {

    protected int teacherId;

    /**
     * Gets the value of the teacherId property.
     * 
     */
    public int getTeacherId() {
        return teacherId;
    }

    /**
     * Sets the value of the teacherId property.
     * 
     */
    public void setTeacherId(int value) {
        this.teacherId = value;
    }

}
