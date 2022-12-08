package br.udesc.desbravador.model;

import android.graphics.drawable.Drawable;

public class PontoTuristico {

    private int idPontoTuristico;
    private int idTipoPontoTuristico;
    private String nome;
    private String descricao;
    private String latitude;
    private String longitude;
    private String endereco;
    private int imagemPequena;
    private int imagemGrande;
    private int eUtil;
    private int eCnpj;
    private String telefone;
    private String whatsapp;
    private String facebook;
    private String instagram;
    private String email;
    private String funcionamento;

    public PontoTuristico() {

    }

    public PontoTuristico(int idPontoTuristico, int idTipoPontoTuristico, String nome, String descricao, String latitude, String longitude, String endereco, int imagemPequena, int imagemGrande, int eUtil, int eCnpj, String telefone, String whatsapp, String facebook, String instagram, String email, String funcionamento) {
        this.idPontoTuristico = idPontoTuristico;
        this.idTipoPontoTuristico = idTipoPontoTuristico;
        this.nome = nome;
        this.descricao = descricao;
        this.latitude = latitude;
        this.longitude = longitude;
        this.endereco = endereco;
        this.imagemPequena = imagemPequena;
        this.imagemGrande = imagemGrande;
        this.eUtil = eUtil;
        this.eCnpj = eCnpj;
        this.telefone = telefone;
        this.whatsapp = whatsapp;
        this.facebook = facebook;
        this.instagram = instagram;
        this.email = email;
        this.funcionamento = funcionamento;
    }

    public int getIdPontoTuristico() {
        return idPontoTuristico;
    }

    public void setIdPontoTuristico(int idPontoTuristico) {
        this.idPontoTuristico = idPontoTuristico;
    }

    public int getIdTipoPontoTuristico() {
        return idTipoPontoTuristico;
    }

    public void setIdTipoPontoTuristico(int idTipoPontoTuristico) {
        this.idTipoPontoTuristico = idTipoPontoTuristico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getImagemPequena() {
        return imagemPequena;
    }

    public void setImagemPequena(int imagemPequena) {
        this.imagemPequena = imagemPequena;
    }

    public int getImagemGrande() {
        return imagemGrande;
    }

    public void setImagemGrande(int imagemGrande) {
        this.imagemGrande = imagemGrande;
    }

    public int geteUtil() {
        return eUtil;
    }

    public void seteUtil(int eUtil) {
        this.eUtil = eUtil;
    }

    public int geteCnpj() {
        return eCnpj;
    }

    public void seteCnpj(int eCnpj) {
        this.eCnpj = eCnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFuncionamento() {
        return funcionamento;
    }

    public void setFuncionamento(String funcionamento) {
        this.funcionamento = funcionamento;
    }

    /*public List<PontoTuristico> getPontosTuristicosList(){

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
    }*/


}
