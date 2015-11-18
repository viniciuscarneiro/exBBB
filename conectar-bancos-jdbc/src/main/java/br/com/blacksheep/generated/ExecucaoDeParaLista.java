package br.com.blacksheep.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element name="execucaoDePara">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="valor" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="de" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="para" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="nome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "execucaoDePara" })
public class ExecucaoDeParaLista {

	@XmlElement(required = true)
	protected ExecucaoDePara execucaoDePara;

	/**
	 * Gets the value of the execucaoDePara property.
	 * 
	 * @return possible object is {@link ExecucaoDePara }
	 * 
	 */
	public ExecucaoDePara getExecucaoDePara() {
		return execucaoDePara;
	}

	/**
	 * Sets the value of the execucaoDePara property.
	 * 
	 * @param value
	 *            allowed object is {@link ExecucaoDePara }
	 * 
	 */
	public void setExecucaoDePara(ExecucaoDePara value) {
		this.execucaoDePara = value;
	}

}
