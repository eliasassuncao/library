package br.com.estacio.trabalhoBiblioteca;
/**
 * Manipulando listas do tipo genérico e utilizando JSON.
 * @author Douglas Calora & Elias Assunção & William Alexandre.
 */
public class MetodoMain {

    public static void main(String[] args) {
        
        Biblioteca<Livro> listaDeLivros = new Biblioteca(); //instanciando biblioteca do tipo Livro.
        Livro livro1 = new Livro("As crônicas de Gelo e Fogo", "George Martin", "Leya Brasil"); //instanciando livro e passando atributos como parametros no método construtor.
        listaDeLivros.adicionarObjeto(livro1);//adicionando livro à biblioteca ListaDelivros.
        Livro livro2 = new Livro("Sherlock Holmes", "Arthur Conan Doylan", "Jorce Zahar");
        listaDeLivros.pesquisar(livro1); //pesquisando um Objeto dentro da listaDeLivros.
        listaDeLivros.pesquisar(livro2); //retornará "objeto não existe", pois o objeto pesquisado não foi adicionado à listaDeLivros.
        listaDeLivros.mostra();//listar todos os objetos e os contéudos do objeto da listaDeLivros.
        
        ////////////////////////////////////////////////////////////////////////////////////////////////
        
        Biblioteca<Gibi> listaDeGibi = new Biblioteca();
        Gibi gibi1 = new Gibi("Turma da monica", "Mauricio de souza", "Globo");//instanciando biblioteca do tipo Gibi.
        listaDeGibi.adicionarObjeto(gibi1);
        Gibi gibi2 = new Gibi("Deadpool", "Marvel", "Fabian Nicieza");
        listaDeGibi.adicionarObjeto(gibi2);
        listaDeGibi.removerObjeto(gibi2);//irá remover o objeto gibi2 adicionado à listaDeGibi.
        listaDeGibi.mostra();

        ///////////////////////////////////////////////////////////////////////////////////////////////
        
        Biblioteca<Revista> listaDeRevistas = new Biblioteca();//instanciando biblioteca do tipo Revista.
        Revista revista1 = new Revista("O próximo humano", "Documentario", "National Geographic");
        listaDeRevistas.adicionarObjeto(revista1);
        Revista revista2 = new Revista("Briga de sedãs", "Automotivo", "Quatro rodas");
        listaDeRevistas.adicionarObjeto(revista2);
        listaDeRevistas.mostrarTamanhoDaLista();//mostrará a quantidade de objetos na listaDeRevistas.
        listaDeRevistas.mostra();
        
      
        
        //---------- UTILIZANDO JSON ----------
        System.out.println(revista1.toJson().toString());//Revista 1 em JSON
        Revista revista3 = new Revista(revista2.toJson());//Criando Revista 3 a partir de revista 2, através do JSON
        System.out.println("Genêro: " + revista3.getGenero());//Retornando o genero para teste.
        
        System.out.println("------------------------------------------------------------------------------");
        
        System.out.println(livro1.toJson().toString());//Livro 1 em JSON
        Livro livro3 = new Livro(livro1.toJson());//Criando Livro 3 a partir do Livro 1, através do JSON
        System.out.println("Nome: " + livro3.getNome());//Retornando o nome para teste.
        
        System.out.println("------------------------------------------------------------------------------");
        
        System.out.println(livro2.toJson().toString());//Gibi 2 em JSON
        Gibi gibi3 = new Gibi(gibi2.toJson());//Criando Gibi 3 a partir do Gibi 2, através do JSON
        System.out.println("Autor " + gibi3.getAutor());//Retornando o autor para teste.
        
    }
}
