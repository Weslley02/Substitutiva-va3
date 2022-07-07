public class Bau  {
  int multiplicador;

  Bau(String tipo, float valor, int multiplicador) {
    tipo = tipo;
    valor = valor;
    multiplicador = multiplicador;
  }


  public float calcularQuantidade() {
    return valor * multiplicador;
  }
}