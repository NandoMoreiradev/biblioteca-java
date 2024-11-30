package br.com.nandomoreira;

import java.util.Date;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private Boolean disponivel;
    private Date dataCadastro;
    private Date dataAtualizazao;

    public Livro(int id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor.getNome();
        this.disponivel = true;
        this.dataCadastro = new Date();
        this.dataAtualizazao = new Date();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public Date getDataAtualizazao() {
        return dataAtualizazao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        this.dataAtualizazao = new Date();
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override

    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", disponivel=" + disponivel +
                ", dataCadastro=" + dataCadastro +
                ", dataAtualizacao=" + dataAtualizazao +
                '}';
    }
}
