package com.generation.lojagames.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.generation.lojagames.model.Produto;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
    @Size(min = 5, max = 50, message = "O atributo nome é obrigatório")
    private String nome;
	
	@NotNull
	@DecimalMax(value = "0.0", message = "O atributo valor é obrigatório")
	@DecimalMax(value = "00000.00", message = "O atributo valor é obrigatório")
	private BigDecimal valor;
	
	@NotBlank
    @Size(min = 5, max = 50, message = "O atributo descrição é obrigatório")
	private String descricao;
	
	@NotBlank
    @Size(min = 5, max = 50, message = "O atributo marca é obrigatório")
	private String marca;
	
	@NotBlank
	private String foto;
	
	 @ManyToOne
	    @JsonIgnoreProperties("produto")
	    private Produto categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Produto getCategoria() {
		return categoria;
	}

	public void setCategoria(Produto categoria) {
		this.categoria = categoria;
	}
	
}