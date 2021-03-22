/**
 *
 *  @author 19.02009-0 Renan Scheidt Reschke <renanreschke@hotmail.com>
 *  @author 19.01370-0 Felipe Freitas Villani <felipevillani.2000@hotmail.com>
 *
 */

package reschke.scheidt.renan;

import java.util.Objects;

public class Usuario {
    //Atributos
    private String nome;
    private String senha;
    private String email;
    private static int qntUsuarios = 0;

    //Construtor
    public Usuario(String nome, String senha, String email){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.qntUsuarios += 1;
    }

    //Getters
    public String getNome(){        //Retorna o nome do usuário
        return this.nome;
    }

    public String getEmail() {      //Retorna o email do Usuário
        return email;
    }

    @Override
    public String toString() { //Retorna as informações do objeto como string
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
