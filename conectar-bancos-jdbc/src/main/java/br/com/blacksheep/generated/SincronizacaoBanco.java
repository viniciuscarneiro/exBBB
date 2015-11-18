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
 *         &lt;element name="sincronizacaoTabela" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="campo" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="origem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="destino" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="executarDePara" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="origem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="destino" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="origemId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destinoId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "sincronizacaoTabela" })
public class SincronizacaoBanco {

	@XmlElement(required = true)
	protected List<SincronizacaoTabela> sincronizacaoTabela;

	@XmlAttribute(name = "origemId")
	protected String origemId;

	@XmlAttribute(name = "destinoId")
	protected String destinoId;

	/**
	 * Gets the value of the sincronizacaoTabela property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the sincronizacaoTabela property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSincronizacaoTabela().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link SincronizacaoTabela }
	 * 
	 * 
	 */
	public List<SincronizacaoTabela> getSincronizacaoTabela() {
		if (sincronizacaoTabela == null) {
			sincronizacaoTabela = new ArrayList<SincronizacaoTabela>();
		}
		return this.sincronizacaoTabela;
	}

	/**
	 * Gets the value of the origemId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOrigemId() {
		return origemId;
	}

	/**
	 * Sets the value of the origemId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOrigemId(String value) {
		this.origemId = value;
	}

	/**
	 * Gets the value of the destinoId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDestinoId() {
		return destinoId;
	}

	/**
	 * Sets the value of the destinoId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDestinoId(String value) {
		this.destinoId = value;
	}
}