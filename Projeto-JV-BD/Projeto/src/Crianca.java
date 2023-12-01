import java.util.ArrayList;
import java.util.Scanner;

class Crianca {
    private String nome, nacionalidade;
    private int idCrianca, idade;
    private boolean adotada = false;
    private int altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAdotada() {
        return adotada;
    }

    public void setAdotada(boolean adotada) {
        this.adotada = adotada;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Crianca() {

    }

    public Crianca(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.adotada = false;
    }

    public int getIdCrianca() {
        return idCrianca;
    }

    public void setIdCrianca(int idCrianca) {
        this.idCrianca = idCrianca;
    }

    public boolean estaAdotada() {
        return adotada;
    }

    public void adotar() {
        System.out.println("Adotada");
    }
}
