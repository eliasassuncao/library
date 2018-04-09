package br.com.estacio.trabalhoBiblioteca;
import json.JSONObject;
//classe herdada de Dados

public class Revista extends Dados {
    
    //método construtor.
    public Revista(String tema, String genero, String editora) {
        this.editora = editora;
        this.genero = genero;
        this.tema = tema;
    }
    
    //método construtor atavés de um Objeto JSON
    public Revista(JSONObject json) {
        this.editora = json.getString("Editora");
        this.genero = json.getString("Genêro");
        this.tema = json.getString("Tema");
    }
    
    //método para transformar objeto para JSONObject
    public JSONObject toJson(){
        json.JSONObject json = new JSONObject();
        json.put("Editora",this.editora);
        json.put("Genêro",this.genero);
        json.put("Tema",this.tema);
        return json;
    }

    //reescrita de método para classe Gibi.
    @Override
    public String toString() {
        return "Tema: " + tema + " / " + "Genero: " + genero + " / " + "Editora: " + editora;
    }
}
