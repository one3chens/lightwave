//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2011.01.10 at 12:40:22 PM EET
//


package com.rsa.names._2009._12.std_ext.ws_trust1_4.advice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttributeType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.rsa.com/names/2009/12/std-ext/WS-Trust1.4/advice}AttributeValue" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="FriendlyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType", propOrder = {
    "attributeValue"
})
public class AttributeType {

    @XmlElement(name = "AttributeValue")
    protected List<String> attributeValue;
    @XmlAttribute(name = "Name", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String name;
    @XmlAttribute(name = "FriendlyName")
    protected String friendlyName;

    /**
     * Gets the value of the attributeValue property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeValue property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeValue().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     *
     *
     */
    public List<String> getAttributeValue() {
        if (attributeValue == null) {
            attributeValue = new ArrayList<String>();
        }
        return this.attributeValue;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the friendlyName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Sets the value of the friendlyName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

}