package br.com.blacksheep.generated;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.google.common.collect.Sets;

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
 *         &lt;element name="sincronizacaoBanco" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sincronizacaoTabela" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="campo" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="origem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="destino" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="executarDePara" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="origem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="destino" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="origemId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="destinoId" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "", propOrder = { "sincronizacaoBanco" })
public class SincronizacaoBancoLista {

	@XmlElement(required = true)
	protected Set<SincronizacaoBanco> sincronizacaoBanco;

	/**
	 * Gets the value of the sincronizacaoBanco property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live Set, not a snapshot. Therefore any modification you make to the returned Set
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the sincronizacaoBanco property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSincronizacaoBanco().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the Set {@link SincronizacaoBanco }
	 * 
	 * 
	 */
	public Set<SincronizacaoBanco> getSincronizacaoBanco() {
		if (sincronizacaoBanco == null) {
			sincronizacaoBanco = Sets.newHashSet();
		}
		return this.sincronizacaoBanco;
	}

}
