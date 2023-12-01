public class CadastrarCrianca {
    private int idCrianca;
    private String nome;
    private Integer idade;
    private Double altura;
    private String nacionalidade;

    public int getIdCrianca(){
        return idCrianca;
    }
    public void setidCrianca(int i) {
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public Integer getIdade(){
        return idade;
    }
    public void setIdade(Integer idade){
        this.idade=idade;
    }
    public Double getAltura(){
        return altura;
    }
    public void setAltura( Double altura){
        this.altura=altura;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade=nacionalidade;
    }

}