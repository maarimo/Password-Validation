package application;

import java.util.Scanner;

import entities.UsuarioComSenha;
import exceptions.SenhaInvalidaException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Digite o nome: ");
			String name = sc.nextLine();
			
			System.out.print("Digite o email: ");
			String email = sc.nextLine();
			
			System.out.print("Digite a senha: ");
			String password = sc.nextLine();
			
			UsuarioComSenha usuario = new UsuarioComSenha(name, email, password);
			usuario.show();
		} catch (SenhaInvalidaException e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			System.out.println("Ending");
			sc.close();
		}
	}

}
