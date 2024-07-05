/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mrfleipelima.library;

/**
 *
 * @author Felipe Lima - https://github.com/mrfelipelima
 */
public class Library {

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("A Bulssola de Ouro");
        livro.setArea("Infantojuvenil");
        livro.setAutores("Phillip Pullman");
        livro.setEdicao(6);
        livro.setEditora("Ponto de Leitura");
        livro.setAno(2009);
        livro.setNumFolhas(365);
        
        Usuario usuario = new Usuario();
        usuario.setNome("Felipe Lima");
        usuario.setIdade(27);
        usuario.setSexo("M");
        usuario.setTelefone("91 9 9160-8939");
        
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setDataEmprestimo("05/07/2024");
        emprestimo.setHora("10:12");
        emprestimo.setLivro(livro);
        emprestimo.setUsuario(usuario);
        
        System.out.println("==> REPORT EMPRESTIMO <==");
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Data: " + emprestimo.getDataEmprestimo());
        System.out.println("Hora: " + emprestimo.getHora());
        System.out.println("Usuario: " + emprestimo.getUsuario().getNome());
        System.out.println("***************");
    }
}
