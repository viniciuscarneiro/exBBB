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
 *       &lt;attribute name="hora" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="minuto" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ExecucaoInicio {

	@XmlAttribute(name = "hora")
	protected Integer hora;

	@XmlAttribute(name = "minuto")
	protected Integer minuto;

	/**
	 * Gets the value of the hora property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getHora() {
		return hora;
	}

	/**
	 * Sets the value of the hora property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setHora(Integer value) {
		this.hora = value;
	}

	/**
	 * Gets the value of the minuto property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMinuto() {
		return minuto;
	}

	/**
	 * Sets the value of the minuto property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMinuto(Integer value) {
		this.minuto = value;
	}

}
