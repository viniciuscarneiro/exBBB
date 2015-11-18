package br.com.blacksheep.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="de" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="para" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Valor {

	@XmlAttribute(name = "de")
	protected Integer de;

	@XmlAttribute(name = "para")
	protected Integer para;

	/**
	 * Gets the value of the de property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getDe() {
		return de;
	}

	/**
	 * Sets the value of the de property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setDe(Integer value) {
		this.de = value;
	}

	/**
	 * Gets the value of the para property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPara() {
		return para;
	}

	/**
	 * Sets the value of the para property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPara(Integer value) {
		this.para = value;
	}

}