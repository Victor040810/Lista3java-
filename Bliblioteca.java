/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bliblioteca;

/**
 *
 * @author Vycto
 */
public class Bliblioteca {

    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.livr("joão e maria ", " Irmaos Grimm", "", "2", 1000, "Literatur , Ficção", 568);
        l1.consultaLivro();
        Usuario u1 = new Usuario();
        u1.Us(" felipe ", " 06071219154", "QWS Q3 LT 12/10", "9 9855-512");
        u1.consultaUsuario(5);
        u1.setLemprestado(5);
        u1.getLemprestado();
        
         }
    }

