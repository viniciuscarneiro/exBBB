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
 *       &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Senha {

	@XmlAttribute(name = "valor")
	protected String valor;

	/**
	 * Gets the value of the valor property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * Sets the value of the valor property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValor(String value) {
		this.valor = value;
	}

}
