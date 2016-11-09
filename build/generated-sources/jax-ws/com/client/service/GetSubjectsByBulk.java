
package com.client.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSubjectsByBulk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSubjectsByBulk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bulkId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSubjectsByBulk", propOrder = {
    "bulkId"
})
public class GetSubjectsByBulk {

    protected int bulkId;

    /**
     * Gets the value of the bulkId property.
     * 
     */
    public int getBulkId() {
        return bulkId;
    }

    /**
     * Sets the value of the bulkId property.
     * 
     */
    public void setBulkId(int value) {
        this.bulkId = value;
    }

}
