import java.util.ArrayList;
import java.util.Scanner;

class Crianca {
    private String nome;
    private int idade;
    private boolean adotada;

    public Crianca(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.adotada = false;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean estaAdotada() {
        return adotada;
    }

    public void adotar() {
        adotada = true;
    }
}
