
public class Main {
  public static void main(String[] args){

    //Instalando o objeto Pessoa 
    Pessoa pessoa1 = new Pessoa("Miguel", 18);
    Pessoa pessoa2 = new Pessoa("Claudia", 18);
    Pessoa pessoa3 = new Pessoa("Ana", 18);

    System.out.println(pessoa3.exibiInfor());
    System.out.println(pessoa3.getNome());
    System.out.println(pessoa3.getIdade());
  }
}