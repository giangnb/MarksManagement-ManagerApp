
package com.client.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAdmins complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAdmins">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentAccount" type="{http://ws.marksmana.com/}admin" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAdmins", propOrder = {
    "currentAccount"
})
public class GetAdmins {

    protected Admin currentAccount;

    /**
     * Gets the value of the currentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Admin }
     *     
     */
    public Admin getCurrentAccount() {
        return currentAccount;
    }

    /**
     * Sets the value of the currentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Admin }
     *     
     */
    public void setCurrentAccount(Admin value) {
        this.currentAccount = value;
    }

}
