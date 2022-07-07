public class Jogador {

	String nome;
	String raca;
	Castelo castelo;
	Arma arma;
	
	Tesouro new tesouro();
	
	Masmorra  = new Masmorra();

	Jogador(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}
	public float retornarTesouroMaiorValor() {
		Float maior = (float) 0;
		for(int x = 0; tesouros) {
			if (maior tesouros())
			maior = tesouros.calcularQuantidade();
		}
		System.out.println("Maior tesouro: " + maior);
		return maior;
	}
  void setarArma(String nome, int poderDeAtaque, TipoArma tipo) {
		arma = new Arma(nome, poderDeAtaque, tipo);
	}
  void setarCastelo(int poderDeDefesa, int vida) {
		castelo = new Castelo(poderDeDefesa, vida);
	}
	
}
