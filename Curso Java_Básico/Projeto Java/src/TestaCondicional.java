
public class TestaCondicional {

	public static void main(String[] args) {
		int idade = 17;
		int quantidadePessoas = 3;
		System.out.println("Testando condicionais");
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja Bem Vindo!!");
		} else {
			if(quantidadePessoas >= 2) {
				
				System.out.println("voc� n�o tem 18, mas pode entrar,"
						+ "pois est� acompanhado");
			}
			else {
			System.out.println("Infelizmente voce n�o pode entrar");
			}
		}

	}

}
