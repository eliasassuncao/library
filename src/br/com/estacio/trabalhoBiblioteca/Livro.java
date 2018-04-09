package br.com.estacio.trabalhoBiblioteca;
import json.JSONObject;
//classe herdada de Dados

public class Livro extends Dados {

    //método construtor.
    public Livro(String nome, String autor, String editora) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
    }
    
    //método construtor atavés de um Objeto JSON
    public Livro(JSONObject json) {
        this.nome = json.getString("Nome");
        this.autor = json.getString("Autor");
        this.editora = json.getString("Editora");
    }
    
    //método para transformar objeto para JSONObject
    public JSONObject toJson(){
        json.JSONObject json = new JSONObject();
        json.put("Nome",this.nome);
        json.put("Autor",this.autor);
        json.put("Editora",this.editora);
        return json;
    }

    //reescrita de método para classe Gibi.
    @Override
    public String toString() {
        return "Nome do livro: " + nome + " / " + "Autor: " + autor + " / " + "Editora: " + editora;
    }

}
