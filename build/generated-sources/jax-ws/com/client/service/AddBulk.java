
package com.client.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addBulk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addBulk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bulk" type="{http://ws.marksmana.com/}bulk" minOccurs="0"/>
 *         &lt;element name="subjectList" type="{http://ws.marksmana.com/}subject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addBulk", propOrder = {
    "bulk",
    "subjectList"
})
public class AddBulk {

    protected Bulk bulk;
    protected List<Subject> subjectList;

    /**
     * Gets the value of the bulk property.
     * 
     * @return
     *     possible object is
     *     {@link Bulk }
     *     
     */
    public Bulk getBulk() {
        return bulk;
    }

    /**
     * Sets the value of the bulk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bulk }
     *     
     */
    public void setBulk(Bulk value) {
        this.bulk = value;
    }

    /**
     * Gets the value of the subjectList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subject }
     * 
     * 
     */
    public List<Subject> getSubjectList() {
        if (subjectList == null) {
            subjectList = new ArrayList<Subject>();
        }
        return this.subjectList;
    }

}
