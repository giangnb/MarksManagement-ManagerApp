
package com.client.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addProperty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addProperty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="poperty" type="{http://ws.marksmana.com/}properties" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addProperty", propOrder = {
    "poperty"
})
public class AddProperty {

    protected Properties poperty;

    /**
     * Gets the value of the poperty property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getPoperty() {
        return poperty;
    }

    /**
     * Sets the value of the poperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setPoperty(Properties value) {
        this.poperty = value;
    }

}
