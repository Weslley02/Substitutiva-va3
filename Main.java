
public class Main {

	public static void main(String[]) {
		Jogador jogador = new Jogador("Nome 1", "raca 1");

		float valor = (float) 100;

		jogador.adicionarBau("tipo do tesouro 1", valor, 3);
		jogador.adicionarOuro("tipo do tesouro 2", valor);
		jogador.adicionarBau("tipo do tesouro 3", valor, 3);

		jogador.calcularTotal();
		jogador.retornarTesouroMaiorValor();

		jogador.setarArma("nome da arma", 10, TipoArma.ArcoeFlecha);
		jogador.setarCastelo(10, 20);

		jogador.adicionarMasmorra("masmorra", "Nivel baixo", 100);

		jogador.castelo.receberAtaque(20);

	}

}
