package Entities;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Empregado {
	Random gerador = new Random();
	
	private int id = gerador.nextInt(100);
	private String nome;
	private float salario;
	
	
	public Empregado(String nome, float salario) {
		super();

		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "id=" + id + ", nome=" + nome + ", salario=" + salario + "";
	}
	
	public void aumentaSalario(float porcentagem) {
		float porcentagemFormatada = porcentagem/100;
	
		System.out.println(porcentagemFormatada);
		this.salario += this.salario *= porcentagemFormatada;
	}
	
	public void Teste(List lista){
		for (List obj : lista) {
			System.out.println(obj.toString());
		}
	}
	
	
}
