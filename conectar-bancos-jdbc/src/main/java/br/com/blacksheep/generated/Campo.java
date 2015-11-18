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
 *       &lt;attribute name="origem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destino" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="executarDePara" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Campo {

	@XmlAttribute(name = "origem")
	protected String origem;

	@XmlAttribute(name = "destino")
	protected String destino;

	@XmlAttribute(name = "executarDePara")
	protected String executarDePara;

	@XmlAttribute(name = "tipo")
	protected String tipo;

	/**
	 * Gets the value of the origem property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOrigem() {
		return origem;
	}

	/**
	 * Sets the value of the origem property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOrigem(String value) {
		this.origem = value;
	}

	/**
	 * Gets the value of the destino property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * Sets the value of the destino property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDestino(String value) {
		this.destino = value;
	}

	/**
	 * Gets the value of the executarDePara property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExecutarDePara() {
		return executarDePara;
	}

	/**
	 * Sets the value of the executarDePara property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExecutarDePara(String value) {
		this.executarDePara = value;
	}

	/**
	 * Gets the value of the tipo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Sets the value of the tipo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTipo(String value) {
		this.tipo = value;
	}

}
