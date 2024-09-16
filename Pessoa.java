//Definir a classe Pessoa 
public class Pessoa {
  // Atributos de classe
  private String nome;
  private int idade;

  // Constructor pra inicializar a classe
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // metodos da classe
  public String exibiInfor() {
    return "Nome: " + nome + " Idade: " + idade;

  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }
}