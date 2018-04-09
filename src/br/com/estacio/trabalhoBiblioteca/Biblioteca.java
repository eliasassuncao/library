package br.com.estacio.trabalhoBiblioteca;

import java.util.ArrayList;
// classe Genérica que contém listas de tipos genéricos.

public class Biblioteca<E> {

    //instanciando lista genérica.
    ArrayList<E> lista = new ArrayList();

    //método que adiciona Objeto à lista genérica.
    public void adicionarObjeto(E e) {
        lista.add(e);
    }

    //método que remove Objeto à lista genérica.
    public void removerObjeto(E e) {
        if (lista.contains(e) == true) {
            lista.remove(e);
        } else {
            System.out.println("Objeto não encontrado.");
        }
    }

    //método que mostra o tamanho da lista.
    public int mostrarTamanhoDaLista() {
        return this.lista.size();
    }

    //método que pesquisa um Objeto dentro da lista.
    public void pesquisar(E e) {
        if (lista.contains(e) == true) {
            System.out.println("Objeto existe no acervo.");
        } else {
            System.out.println("Objeto não existe no acervo.");
        }
    }

    //mostra o contéudo de todos Objetos da sua lista.
    public void mostra() {
        System.out.println("------------------------------------------------------------------------------");
        for (E e : lista) {
            System.out.println(e);
        }
        System.out.println("------------------------------------------------------------------------------");
    }

}
