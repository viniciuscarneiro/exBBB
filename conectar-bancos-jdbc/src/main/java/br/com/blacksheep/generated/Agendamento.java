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
 *         &lt;element name="execucaoInicio">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="hora" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="minuto" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="execucaoIntervalo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="hora" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="minuto" type="{http://www.w3.org/2001/XMLSchema}int" />
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
@XmlType(name = "", propOrder = { "execucaoInicio", "execucaoIntervalo" })
public class Agendamento {

	@XmlElement(required = true)
	protected ExecucaoInicio execucaoInicio;

	@XmlElement(required = true)
	protected ExecucaoIntervalo execucaoIntervalo;

	/**
	 * Gets the value of the execucaoInicio property.
	 * 
	 * @return possible object is {@link ExecucaoInicio }
	 * 
	 */
	public ExecucaoInicio getExecucaoInicio() {
		return execucaoInicio;
	}

	/**
	 * Sets the value of the execucaoInicio property.
	 * 
	 * @param value
	 *            allowed object is {@link ExecucaoInicio }
	 * 
	 */
	public void setExecucaoInicio(ExecucaoInicio value) {
		this.execucaoInicio = value;
	}

	/**
	 * Gets the value of the execucaoIntervalo property.
	 * 
	 * @return possible object is {@link ExecucaoIntervalo }
	 * 
	 */
	public ExecucaoIntervalo getExecucaoIntervalo() {
		return execucaoIntervalo;
	}

	/**
	 * Sets the value of the execucaoIntervalo property.
	 * 
	 * @param value
	 *            allowed object is {@link ExecucaoIntervalo }
	 * 
	 */
	public void setExecucaoIntervalo(ExecucaoIntervalo value) {
		this.execucaoIntervalo = value;
	}

}