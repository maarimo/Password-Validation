package entities;

import exceptions.SenhaInvalidaException;

public class UsuarioComSenha {
	private String name;
	private String email;
	private String password;
	
	public UsuarioComSenha() {		
	}

	  public UsuarioComSenha(String name, String email, String password) throws SenhaInvalidaException {
	        if (!senhaValida(password)) {
	            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres, 1 letra maiúscula e 1 número.");
	        }
	        this.name = name;
	        this.email = email;
	        this.password = password;
	    }

	  private boolean senhaValida(String password) {
	        return password.length() >= 8 &&
	        		password.matches(".*[A-Z].*") &&
	        		password.matches(".*[0-9].*");
	    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void show() {
        System.out.println("Nome: " + name + " | Email: " + email);
    }
	
}
