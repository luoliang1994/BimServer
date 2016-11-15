
package org.bimserver.generatedclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getQueryEngineByNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getQueryEngineByNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{org.buildingsmart.bimsie1}sQueryEnginePluginConfiguration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getQueryEngineByNameResponse", propOrder = {
    "_return"
})
public class GetQueryEngineByNameResponse {

    @XmlElement(name = "return")
    protected SQueryEnginePluginConfiguration _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SQueryEnginePluginConfiguration }
     *     
     */
    public SQueryEnginePluginConfiguration getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SQueryEnginePluginConfiguration }
     *     
     */
    public void setReturn(SQueryEnginePluginConfiguration value) {
        this._return = value;
    }

}
