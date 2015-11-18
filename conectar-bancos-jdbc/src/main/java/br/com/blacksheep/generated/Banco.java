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
 *         &lt;element name="id">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tipoBancoEnum">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="servidor">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bancoDados">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="usuario">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="senha">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="valor" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "", propOrder = { "id", "tipoBancoEnum", "servidor", "bancoDados", "usuario", "senha" })
public class Banco {

	@XmlElement(required = true)
	protected Id id;

	@XmlElement(required = true)
	protected TipoBancoEnum tipoBancoEnum;

	@XmlElement(required = true)
	protected Servidor servidor;

	@XmlElement(required = true)
	protected BancoDados bancoDados;

	@XmlElement(required = true)
	protected Usuario usuario;

	@XmlElement(required = true)
	protected Senha senha;

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link Id }
	 * 
	 */
	public Id getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link Id }
	 * 
	 */
	public void setId(Id value) {
		this.id = value;
	}

	/**
	 * Gets the value of the tipoBancoEnum property.
	 * 
	 * @return possible object is {@link TipoBancoEnum }
	 * 
	 */
	public TipoBancoEnum getTipoBancoEnum() {
		return tipoBancoEnum;
	}

	/**
	 * Sets the value of the tipoBancoEnum property.
	 * 
	 * @param value
	 *            allowed object is {@link TipoBancoEnum }
	 * 
	 */
	public void setTipoBancoEnum(TipoBancoEnum value) {
		this.tipoBancoEnum = value;
	}

	/**
	 * Gets the value of the servidor property.
	 * 
	 * @return possible object is {@link Servidor }
	 * 
	 */
	public Servidor getServidor() {
		return servidor;
	}

	/**
	 * Sets the value of the servidor property.
	 * 
	 * @param value
	 *            allowed object is {@link Servidor }
	 * 
	 */
	public void setServidor(Servidor value) {
		this.servidor = value;
	}

	/**
	 * Gets the value of the bancoDados property.
	 * 
	 * @return possible object is {@link BancoDados }
	 * 
	 */
	public BancoDados getBancoDados() {
		return bancoDados;
	}

	/**
	 * Sets the value of the bancoDados property.
	 * 
	 * @param value
	 *            allowed object is {@link BancoDados }
	 * 
	 */
	public void setBancoDados(BancoDados value) {
		this.bancoDados = value;
	}

	/**
	 * Gets the value of the usuario property.
	 * 
	 * @return possible object is {@link Usuario }
	 * 
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Sets the value of the usuario property.
	 * 
	 * @param value
	 *            allowed object is {@link Usuario }
	 * 
	 */
	public void setUsuario(Usuario value) {
		this.usuario = value;
	}

	/**
	 * Gets the value of the senha property.
	 * 
	 * @return possible object is {@link Senha }
	 * 
	 */
	public Senha getSenha() {
		return senha;
	}

	/**
	 * Sets the value of the senha property.
	 * 
	 * @param value
	 *            allowed object is {@link Senha }
	 * 
	 */
	public void setSenha(Senha value) {
		this.senha = value;
	}
}
