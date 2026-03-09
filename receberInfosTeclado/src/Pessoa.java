public class Pessoa {
    private String nome;
    private int idade;
    private String email;


    public Pessoa(String nome, int idade, String email){
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public void status(){
        System.out.println("Nome: " + this.nome + "\n" + "Idade: " + this.idade + "\n" + "E-mail: " + this.email);
    }
}
