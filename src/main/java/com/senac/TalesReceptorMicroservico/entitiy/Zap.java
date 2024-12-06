package com.senac.TalesReceptorMicroservico.entitiy;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "zap")
public class Zap implements Serializable {
	
	@Id
    @GeneratedValue
    @Column(name = "usuario_id", nullable = false)
    private int usuario_id;
	
	@Column(name = "usuario_nome", nullable = false)
    private String usuario_nome;
	
	@Column(name = "usuario_mensagem", nullable = false)
    private String usuario_mensagem;


    public Zap() {
    }

    public Zap(int usuario_id, String usuario_nome, String usuario_mensagem) {
        this.usuario_id = usuario_id;
        this.usuario_nome = usuario_nome;
        this.usuario_mensagem = usuario_mensagem;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUsuario_nome() {
        return usuario_nome;
    }

    public void setUsuario_nome(String usuario_nome) {
        this.usuario_nome = usuario_nome;
    }

    public String getUsuario_mensagem() {
        return usuario_mensagem;
    }

    public void setUsuario_mensagem(String usuario_mensagem) {
        this.usuario_mensagem = usuario_mensagem;
    }
}
