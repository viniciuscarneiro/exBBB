package br.com.blacksheep.generated;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="campo" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="origem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="destino" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="executarDePara" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="origem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destino" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "campo" })
public class SincronizacaoTabela {

	@XmlElement(required = true)
	protected List<Campo> campo;

	@XmlAttribute(name = "origem")
	protected String origem;

	@XmlAttribute(name = "destino")
	protected String destino;

	/**
	 * Gets the value of the campo property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the campo property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getCampo().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Campo }
	 * 
	 * 
	 */
	public List<Campo> getCampo() {
		if (campo == null) {
			campo = new ArrayList<Campo>();
		}
		return this.campo;
	}

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

}
