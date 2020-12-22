package com.example.mynewapplication.bean;

/**
 * @author 沈宝铧
 * @date 2020/6/3
 */
public class YiQingInfo {


    /**
     * 累计确诊
     * 累计死亡
     * 先有疑似
     * 累计治愈
     * 现有确诊
     * 境外输入
     */
    private String times;
    private String gntotal;
    private String deathtotal;
    private String sustotal;
    private String curetotal;
    private String econNum;
    private String jwsrNuml;
    /**
     * 新增病例
     * 新增死亡
     * 新增治愈
     * 新增疑似
     * 新增境外输入
     */
    private String addcon;
    private String adddeath;
    private String addcure;
    private String addsus;
    private String addjwsr;

    public YiQingInfo(String gntotal, String deathtotal,
                      String sustotal, String curetotal,
                      String econNum, String jwsrNuml,
                      String addcon, String adddeath,
                      String addcure, String addsus,
                      String addjwsr, String times) {
        this.gntotal = gntotal;
        this.deathtotal = deathtotal;
        this.sustotal = sustotal;
        this.curetotal = curetotal;
        this.econNum = econNum;
        this.jwsrNuml = jwsrNuml;
        this.addcon = addcon;
        this.adddeath = adddeath;
        this.addcure = addcure;
        this.addsus = addsus;
        this.addjwsr = addjwsr;
        this.times = times;
    }

    public String getGntotal() {
        return gntotal;
    }

    public void setGntotal(String gntotal) {
        this.gntotal = gntotal;
    }

    public String getDeathtotal() {
        return deathtotal;
    }

    public void setDeathtotal(String deathtotal) {
        this.deathtotal = deathtotal;
    }

    public String getSustotal() {
        return sustotal;
    }

    public void setSustotal(String sustotal) {
        this.sustotal = sustotal;
    }

    public String getCuretotal() {
        return curetotal;
    }

    public void setCuretotal(String curetotal) {
        this.curetotal = curetotal;
    }

    public String getEconNum() {
        return econNum;
    }

    public void setEconNum(String econNum) {
        this.econNum = econNum;
    }

    public String getJwsrNuml() {
        return jwsrNuml;
    }

    public void setJwsrNuml(String jwsrNuml) {
        this.jwsrNuml = jwsrNuml;
    }

    public String getAddcon() {
        return addcon;
    }

    public void setAddcon(String addcon) {
        this.addcon = addcon;
    }

    public String getAdddeath() {
        return adddeath;
    }

    public void setAdddeath(String adddeath) {
        this.adddeath = adddeath;
    }

    public String getAddcure() {
        return addcure;
    }

    public void setAddcure(String addcure) {
        this.addcure = addcure;
    }

    public String getAddsus() {
        return addsus;
    }

    public void setAddsus(String addsus) {
        this.addsus = addsus;
    }

    public String getAddjwsr() {
        return addjwsr;
    }

    public void setAddjwsr(String addjwsr) {
        this.addjwsr = addjwsr;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }
}
