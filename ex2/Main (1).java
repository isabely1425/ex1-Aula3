
public class Main {
  public static void main(String[] args) {
    Filmes filme1 = new Filmes("O Poderoso Chefão", 1972, 175);
    Filmes filme2 = new Filmes("Pulp Fiction", 1994, 154);
    
    System.out.println(filme1.exibirInfo());
    System.out.println(filme2.exibirInfo());
  }
}