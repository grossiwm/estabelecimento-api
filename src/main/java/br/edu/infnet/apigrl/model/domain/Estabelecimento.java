package br.edu.infnet.apigrl.model.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="TEstabelecimento", 
uniqueConstraints = @UniqueConstraint(columnNames={"cnpj"})
)
public class Estabelecimento extends Usuario {
	
	private String cnpj;
	private String endereco;
	private boolean edtech;
	
	@OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
	private List<Funcionario> funcionarios;
	
	public String getCnpj() {
		return cnpj;
	}
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isEdtech() {
		return edtech;
	}
	public void setEdtech(boolean edtech) {
		this.edtech = edtech;
	}
	
	

}