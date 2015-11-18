
package br.com.blacksheep.generated;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="agendamento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="execucaoInicio">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="hora" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="minuto" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="execucaoIntervalo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="hora" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="minuto" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="banco" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="tipoBancoEnum">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="servidor">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="bancoDados">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="usuario">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="senha">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="delecaoConteudo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tabela" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="nome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="bancoId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="execucaoDeParaLista">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="execucaoDePara">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="valor" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="de" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="para" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="nome" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sincronizacaoBancoLista">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sincronizacaoBanco" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sincronizacaoTabela" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="campo" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="origem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="destino" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="executarDePara" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="origem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="destino" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="origemId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="destinoId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
@XmlType(name = "", propOrder = { "agendamento", "banco", "delecaoConteudo", "execucaoDeParaLista", "sincronizacaoBancoLista" })
@XmlRootElement(name = "sincronizacao")
public class Sincronizacao {

	@XmlElement(required = true)
	protected Agendamento agendamento;

	@XmlElement(required = true)
	protected Set<Banco> banco;

	@XmlElement(required = true)
	protected DelecaoConteudo delecaoConteudo;

	@XmlElement(required = true)
	protected ExecucaoDeParaLista execucaoDeParaLista;

	@XmlElement(required = true)
	protected SincronizacaoBancoLista sincronizacaoBancoLista;

	/**
	 * Gets the value of the agendamento property.
	 * 
	 * @return possible object is {@link Agendamento }
	 * 
	 */
	public Agendamento getAgendamento() {
		return agendamento;
	}

	/**
	 * Sets the value of the agendamento property.
	 * 
	 * @param value
	 *            allowed object is {@link Agendamento }
	 * 
	 */
	public void setAgendamento(Agendamento value) {
		this.agendamento = value;
	}

	/**
	 * Gets the value of the banco property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list
	 * will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for the banco property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getBanco().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Banco }
	 * 
	 * 
	 */
	public Set<Banco> getBanco() {
		if (banco == null) {
			banco = Sets.newHashSet();
		}
		return this.banco;
	}

	/**
	 * Gets the value of the delecaoConteudo property.
	 * 
	 * @return possible object is {@link DelecaoConteudo }
	 * 
	 */
	public DelecaoConteudo getDelecaoConteudo() {
		return delecaoConteudo;
	}

	/**
	 * Sets the value of the delecaoConteudo property.
	 * 
	 * @param value
	 *            allowed object is {@link DelecaoConteudo }
	 * 
	 */
	public void setDelecaoConteudo(DelecaoConteudo value) {
		this.delecaoConteudo = value;
	}

	/**
	 * Gets the value of the execucaoDeParaLista property.
	 * 
	 * @return possible object is {@link ExecucaoDeParaLista }
	 * 
	 */
	public ExecucaoDeParaLista getExecucaoDeParaLista() {
		return execucaoDeParaLista;
	}

	/**
	 * Sets the value of the execucaoDeParaLista property.
	 * 
	 * @param value
	 *            allowed object is {@link ExecucaoDeParaLista }
	 * 
	 */
	public void setExecucaoDeParaLista(ExecucaoDeParaLista value) {
		this.execucaoDeParaLista = value;
	}

	/**
	 * Gets the value of the sincronizacaoBancoLista property.
	 * 
	 * @return possible object is {@link SincronizacaoBancoLista }
	 * 
	 */
	public SincronizacaoBancoLista getSincronizacaoBancoLista() {
		return sincronizacaoBancoLista;
	}

	/**
	 * Sets the value of the sincronizacaoBancoLista property.
	 * 
	 * @param value
	 *            allowed object is {@link SincronizacaoBancoLista }
	 * 
	 */
	public void setSincronizacaoBancoLista(SincronizacaoBancoLista value) {
		this.sincronizacaoBancoLista = value;
	}

}
