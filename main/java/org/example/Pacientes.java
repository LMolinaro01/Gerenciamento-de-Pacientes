package org.example;

public class Pacientes {
    private int id;
    private String nome;
    private String tratamento;
    private String celular;
    private String genero;
    private String faixaEtaria;
    private String dia;
    private int idade;
    private int frequencia;
    //private String fisioResponsavel;

    public Pacientes(int id, String nome, String tratamento, String celular, String genero, int idade, String dia){
        this.id = id;
        this.nome = nome;
        this.tratamento = tratamento;
        this.celular = celular;
        this.genero = genero;
        this.idade = idade;
        this.dia = dia;
    }

    public Pacientes(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        try{
            if (!nome.equals(null) && !nome.isEmpty()){
                if (nome.matches(".*[;,'\\-+\\.].*")){
                    System.out.println("O nome não pode conter caracteres especiais.");
                }
                else {
                    this.nome = nome;
                }
            }else {
                System.out.println("O nome não pode estar vazio.");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getTratamento(){
        return tratamento;
    }

    public void setTratamento(String tratamento){
        try {
            if (tratamento.equals("Acupuntura") && getIdade() < 5){
                System.out.println("Tratamento não indicado para esta idade.");
            }
            else{
                this.tratamento = tratamento;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        //String validacaoCel = "^\\\\(?[1-9]{2}\\\\)? ?(?:[2-8]|9[0-9])[0-9]{3}\\\\-?[0-9]{4}$";
        try {
            //if (celular.matches(validacaoCel)){
            this.celular = celular;
            //}
            //else{
            //System.out.println("Número de Celular inválido.");
            //}
        } catch (Exception e){
            System.out.println("Houve um Erro na validação do Celular.");
            e.printStackTrace();
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        try{
            if (genero.matches(".*[;,'\\-+\\.].*")){
                System.out.println("O Gênero não pode conter caracteres especiais.");
            }
            else {
                this.genero = genero;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria() {
        try {
            if (idade >= 65) {
                faixaEtaria = "Idoso";
            } else if (idade >= 25) {
                faixaEtaria = "Adulto";
            } else if (idade >= 18) {
                faixaEtaria = "Jovem Adulto";
            } else if (idade >= 15) {
                faixaEtaria = "Adolescente";
            } else if (idade >= 11) {
                faixaEtaria = "Pré Adolescente";
            } else if (idade > 5) {
                faixaEtaria = "Criança";
            } else if (idade < 5) {
                faixaEtaria = "Criança Pequena";
            }
        } catch (Exception e) {
            System.out.println("Houve um Erro no cálculo da Faixa Etária.");
            e.printStackTrace();
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        try {
            if (idade > 0 && idade < 120) {
                this.idade = idade;
            }
            else {
                System.out.println("Idade inválida");
            }
        } catch (ClassCastException e){
            System.out.println("Houve um Erro na validação da Idade.");
            e.printStackTrace();
        }
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }


    /*public String getFisioResponsavel(){
        return fisioResponsavel;
    }

    public void setFisioResponsavel(String fisioResponsavel){
        try{
            if (!fisioResponsavel.equals(null) && !fisioResponsavel.isEmpty()){
                if (fisioResponsavel.matches(".*[;,'\\-+\\.].*")){
                    System.out.println("O Nome do Profissional Responsável não pode conter caracteres especiais.");
                }
                else {
                    this.fisioResponsavel = fisioResponsavel;
                }
            }else {
                System.out.println("O Nome do Profissional Responsável não pode estar vazio.");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }*/



    @Override
    public String toString(){
        return "\nInformações do Paciente: \n\n-Nome: " + getNome() + "\n-Idade: " + getIdade() + "\n-Gênero: " + getGenero() + "\n-Celular: " + getCelular() + "\n-Tratamento: " +getTratamento() + "\n-Faixa Etária: " + getFaixaEtaria();
    }
}