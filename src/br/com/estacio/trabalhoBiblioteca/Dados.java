package br.com.estacio.trabalhoBiblioteca;
// classe com atributos para classes Gibi/Livro/Revista herdarem.

public class Dados {

    protected String nome;
    protected String autor;
    protected String editora;
    protected String tema;
    protected String genero;

    public Dados() {
    }

    public String getTema() {
        return tema;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
