
package com.operation.service_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sumNumbers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sumNumbers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="one" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="second" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sumNumbers", propOrder = {
    "one",
    "second"
})
public class SumNumbers {

    protected int one;
    protected int second;

    /**
     * Gets the value of the one property.
     * 
     */
    public int getOne() {
        return one;
    }

    /**
     * Sets the value of the one property.
     * 
     */
    public void setOne(int value) {
        this.one = value;
    }

    /**
     * Gets the value of the second property.
     * 
     */
    public int getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     * 
     */
    public void setSecond(int value) {
        this.second = value;
    }

}
