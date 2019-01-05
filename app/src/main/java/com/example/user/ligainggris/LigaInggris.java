package com.example.user.ligainggris;

import org.json.JSONObject;

public class LigaInggris {
    private String idTeam = "idTeam";
    private String namaTeam = "strTeam";
    private String gambarTeam = "strTeamBadge";
    private String intFormedYear = "intFormedYear";
    private String namaPelatih = "strManager";
    private String namaStadion = "strStadium";
    private String gambarStadion = "strStadiumThumb";
    private String deskripsiStadion = "strStadiumDescription";
    private String lokasiStadion = "strStadiumLocation";
    private String kapsitasStadion = "intStadiumCapacity";
    private String webTeam = "strWebsite";
    private String fbTeam = "strFacebook";
    private String twTeam = "strTwitter";
    private String igTeam = "strInstagram";
    private String youtubeTeam = "strYoutube";
    private String negara = "strCountry";
    private String deskripsiTeam = "strDescriptionEN";
    private String jerseyTeam = "strTeamJersey";
    private String logoTeam = "strTeamLogo";



    LigaInggris(JSONObject obj){
        try {
            String idTeam = obj.getString("idTeam");
            String namaTeam = obj.getString("strTeam");
            String gambarTeam = obj.getString("strTeamBadge");
            String intFormedYear = obj.getString("intFormedYear");
            String namaPelatih = obj.getString("strManager");
            String namaStadion = obj.getString("strStadiom");
            String gambarStadion = obj.getString("strStadiumThumb");
            String desdripsiStadion = obj.getString("strStadiumDescription");
            String lokasiStadion = obj.getString("strStadiumLocation");
            String kapasitasStadion = obj.getString("intStadiumCapacity");
            String webTeam = obj.getString("strWebsite");
            String fbTeam = obj.getString("strFacebook");
            String twTeam = obj.getString("strTwitter");
            String igTeam = obj.getString("strInstagram");
            String youtubeTeam = obj.getString("strYoutube");
            String negara = obj.getString("strCountry");
            String desktipsiTeam = obj.getString("strDescriptionEN");
            String jerseyTeam = obj.getString("strTeamJersey");
            String logoTeam = obj.getString("strTeamLogo");

            this.idTeam = idTeam;
            this.namaTeam = namaTeam;
            this.gambarTeam = gambarTeam;
            this.intFormedYear = intFormedYear;
            this.namaPelatih = namaPelatih;
            this.namaStadion = namaStadion;
            this.gambarStadion = gambarStadion;
            this.deskripsiStadion = desdripsiStadion;
            this.lokasiStadion = lokasiStadion;
            this.kapsitasStadion = kapasitasStadion;
            this.webTeam = webTeam;
            this.fbTeam = fbTeam;
            this.twTeam = twTeam;
            this.igTeam = igTeam;
            this.youtubeTeam = youtubeTeam;
            this.negara = negara;
            this.deskripsiTeam = desktipsiTeam;
            this.jerseyTeam = jerseyTeam;
            this.logoTeam = logoTeam;
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public String getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
    }

    public String getNamaTeam() {
        return namaTeam;
    }

    public void setNamaTeam(String namaTeam) {
        this.namaTeam = namaTeam;
    }

    public String getGambarTeam() {
        return gambarTeam;
    }

    public void setGambarTeam(String gambarTeam) {
        this.gambarTeam = gambarTeam;
    }

    public String getIntFormedYear() {
        return intFormedYear;
    }

    public void setIntFormedYear(String intFormedYear) {
        this.intFormedYear = intFormedYear;
    }

    public String getNamaPelatih() {
        return namaPelatih;
    }

    public void setNamaPelatih(String namaPelatih) {
        this.namaPelatih = namaPelatih;
    }

    public String getNamaStadion() {
        return namaStadion;
    }

    public void setNamaStadion(String namaStadion) {
        this.namaStadion = namaStadion;
    }

    public String getGambarStadion() {
        return gambarStadion;
    }

    public void setGambarStadion(String gambarStadion) {
        this.gambarStadion = gambarStadion;
    }

    public String getDeskripsiStadion() {
        return deskripsiStadion;
    }

    public void setDeskripsiStadion(String deskripsiStadion) {
        this.deskripsiStadion = deskripsiStadion;
    }

    public String getLokasiStadion() {
        return lokasiStadion;
    }

    public void setLokasiStadion(String lokasiStadion) {
        this.lokasiStadion = lokasiStadion;
    }

    public String getKapsitasStadion() {
        return kapsitasStadion;
    }

    public void setKapsitasStadion(String kapsitasStadion) {
        this.kapsitasStadion = kapsitasStadion;
    }

    public String getWebTeam() {
        return webTeam;
    }

    public void setWebTeam(String webTeam) {
        this.webTeam = webTeam;
    }

    public String getFbTeam() {
        return fbTeam;
    }

    public void setFbTeam(String fbTeam) {
        this.fbTeam = fbTeam;
    }

    public String getTwTeam() {
        return twTeam;
    }

    public void setTwTeam(String twTeam) {
        this.twTeam = twTeam;
    }

    public String getIgTeam() {
        return igTeam;
    }

    public void setIgTeam(String igTeam) {
        this.igTeam = igTeam;
    }

    public String getYoutubeTeam() {
        return youtubeTeam;
    }

    public void setYoutubeTeam(String youtubeTeam) {
        this.youtubeTeam = youtubeTeam;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getDeskripsiTeam() {
        return deskripsiTeam;
    }

    public void setDeskripsiTeam(String deskripsiTeam) {
        this.deskripsiTeam = deskripsiTeam;
    }

    public String getJerseyTeam() {
        return jerseyTeam;
    }

    public void setJerseyTeam(String jerseyTeam) {
        this.jerseyTeam = jerseyTeam;
    }

    public String getLogoTeam() {
        return logoTeam;
    }

    public void setLogoTeam(String logoTeam) {
        this.logoTeam = logoTeam;
    }
}