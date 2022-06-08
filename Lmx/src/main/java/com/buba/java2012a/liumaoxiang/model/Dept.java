package com.buba.java2012a.liumaoxiang.model;

/**
 * ClassName：Dept
 * autho："祥"
 * Package： com.buba.java2012a.liumaoxiang.model
 * data：2022/6/1
 */
/*
    部门表
 */
public class Dept {
    private int id;
    private String bumenbianhao;
    private String bumenmingcheng;
    private String suoshushengfen;
    private int bumenrenshu;
    private String miaoshu;

    public Dept() {
    }

    public Dept(int id, String bumenbianhao, String bumenmingcheng,
                String suoshushengfen, int bumenrenshu, String miaoshu) {
        this.id = id;
        this.bumenbianhao = bumenbianhao;
        this.bumenmingcheng = bumenmingcheng;
        this.suoshushengfen = suoshushengfen;
        this.bumenrenshu = bumenrenshu;
        this.miaoshu = miaoshu;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", bumenbianhao='" + bumenbianhao + '\'' +
                ", bumenmingcheng='" + bumenmingcheng + '\'' +
                ", suoshushengfen='" + suoshushengfen + '\'' +
                ", bumenrenshu=" + bumenrenshu +
                ", miaoshu='" + miaoshu + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBumenbianhao() {
        return bumenbianhao;
    }

    public void setBumenbianhao(String bumenbianhao) {
        this.bumenbianhao = bumenbianhao;
    }

    public String getBumenmingcheng() {
        return bumenmingcheng;
    }

    public void setBumenmingcheng(String bumenmingcheng) {
        this.bumenmingcheng = bumenmingcheng;
    }

    public String getSuoshushengfen() {
        return suoshushengfen;
    }

    public void setSuoshushengfen(String suoshushengfen) {
        this.suoshushengfen = suoshushengfen;
    }

    public int getBumenrenshu() {
        return bumenrenshu;
    }

    public void setBumenrenshu(int bumenrenshu) {
        this.bumenrenshu = bumenrenshu;
    }

    public String getMiaoshu() {
        return miaoshu;
    }

    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu;
    }
}
