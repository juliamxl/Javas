package Program;

import java.util.ArrayList;
import java.util.Scanner;
import Entities.Empregado;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Empregado> Funcionarios = new ArrayList<>();

		int quantidade;

		System.out.println("Quantos funcionários serão registrados?");
		quantidade = sc.nextInt();

		for (int i = 1; i <= quantidade; i++) {

			System.out.println("Digite o nome do funcionário: ");
			String nome = sc.next();

			System.out.println("Digite o salário: ");
			float salario = sc.nextFloat();

			Funcionarios.add(new Empregado(nome, salario));

		}

		System.out.println("Esses são os funcionários cadastrados");
		for (Empregado obj : Funcionarios) {
			System.out.println(obj.toString());
		}

		System.out.println("De qual funcionário vc deseja aumentar em porcentagem o salário, digite o id:");
		int id = sc.nextInt();

		System.out.println("Agora digite a porcentagem: ");
		float porcentagem = sc.nextInt();

		for (Empregado obj : Funcionarios) {
			
			if (id == obj.getId()) {
				obj.aumentaSalario(porcentagem);
				
			} else {
				System.out.println("Este funcionário  não existe");
				break;
			}

		}

		System.out.println("Esses são os funcionários cadastrados depois do aumento de salário");
		for (Empregado obj : Funcionarios) {
			System.out.println(obj.toString());
		}
	}

}
