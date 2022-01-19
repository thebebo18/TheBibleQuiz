package com.example.thebiblequiz;

public class quiz {
    private int id;
    private String pregunta;
    private String resp1;
    private String resp2;
    private String resp3;
    private int opcion;
    private int score;

    public quiz(int id, String pregunta, String resp1, String resp2, String resp3, int opcion, int score) {
        this.id = id;
        this.pregunta = pregunta;
        this.resp1 = resp1;
        this.resp2 = resp2;
        this.resp3 = resp3;
        this.opcion = opcion;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getResp1() {
        return resp1;
    }

    public void setResp1(String resp1) {
        this.resp1 = resp1;
    }

    public String getResp2() {
        return resp2;
    }

    public void setResp2(String resp2) {
        this.resp2 = resp2;
    }

    public String getResp3() {
        return resp3;
    }

    public void setResp3(String resp3) {
        this.resp3 = resp3;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getScore(){return score;}

    public void setScore(int score){ this.score = opcion;}
}
