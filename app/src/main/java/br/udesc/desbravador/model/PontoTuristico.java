package br.udesc.desbravador.model;

import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.udesc.desbravador.model_DAO.BancoDesbravadoresHelpers;

public class PontoTuristico {

    private int id;
    private int idTipoPontoTuristico;
    private String tipo;
    private String nome;
    private Endereco endereco;
    private String descricao;
    private boolean curtir;
    private double estrelas;
    private Locale localizacao;
    private String facebook;
    private String instagram;
    //private HoraFuncionamento horaFuncionamento;
    //private double valorEntrada;


    public PontoTuristico(int id, int idTipoPontoTuristico, String tipo, String nome, Endereco endereco, String descricao, boolean curtir, double estrelas, Locale localizacao) {
        this.id = id;
        this.idTipoPontoTuristico = idTipoPontoTuristico;
        this.tipo = tipo;
        this.nome = nome;
        this.endereco = endereco;
        this.descricao = descricao;
        this.curtir = curtir;
        this.estrelas = estrelas;
        this.localizacao = localizacao;
    }

    public PontoTuristico(int id, int idTipoPontoTuristico, String nome,boolean curtir){
        this.id = id;
        this.idTipoPontoTuristico = idTipoPontoTuristico;
        this.nome = nome;
        this.curtir = curtir;
    }

    public int getId() {
        return id;
    }

    public int getIdTipoPontoTuristico() {
        return idTipoPontoTuristico;
    }

    public void setIdTipoPontoTuristico(int idTipoPontoTuristico) {
        this.idTipoPontoTuristico = idTipoPontoTuristico;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getCurtir() {
        return curtir;
    }

    public double getEstrelas() {
        return estrelas;
    }

    public Locale getLocalizacao() {
        return localizacao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCurtir(boolean curtir) {
        this.curtir = curtir;
    }

    public void setEstrelas(double estrelas) {
        this.estrelas = estrelas;
    }

    public void setLocalizacao(Locale localizacao) {
        this.localizacao = localizacao;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public List<PontoTuristico> getPontosTuristicosList(){

        List<PontoTuristico> pontosTuristicosList = new ArrayList<>();

        String sql = "SELECT * FROM" + BancoDesbravadoresHelpers.TB_PONTO_TURISTICO + ";";
        Cursor c = read.rawQuery(sql, null);

        while (c.moveToNext()){
            int id = c.getInt(c.getColumnIndex(id));
            String nome = c.getString(c.getColumnIndex(nome));
            String descricao = c.getString(c.getColumnIndex(descricao));

            PontoTuristico pontoTuristico = new PontoTuristico();
            pontoTuristico.setId(id);
            pontoTuristico.setNome(nome);
            pontoTuristico.setDescricao(descricao);

            pontoTuristico.add(pontoTuristico);

        }

        return pontosTuristicosList;
    }


}
