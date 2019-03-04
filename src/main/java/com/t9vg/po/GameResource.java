package com.t9vg.po;

public class GameResource {

    private String id;

    private String gameName;

    private String version;

    private String language;

    private String downloadLink;

    private String downloadPagePass;

    private String unboxPass;

    private String createDatetime;

    private Integer downloadTimes;

    private String remark;

    private Integer type;

    private String extraInfo;

    private Integer deleteFlag;

    private String deleteTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink == null ? null : downloadLink.trim();
    }

    public String getDownloadPagePass() {
        return downloadPagePass;
    }

    public void setDownloadPagePass(String downloadPagePass) {
        this.downloadPagePass = downloadPagePass == null ? null : downloadPagePass.trim();
    }

    public String getUnboxPass() {
        return unboxPass;
    }

    public void setUnboxPass(String unboxPass) {
        this.unboxPass = unboxPass == null ? null : unboxPass.trim();
    }

    public String getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime == null ? null : createDatetime.trim();
    }

    public Integer getDownloadTimes() {
        return downloadTimes;
    }

    public void setDownloadTimes(Integer downloadTimes) {
        this.downloadTimes = downloadTimes;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo == null ? null : extraInfo.trim();
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime == null ? null : deleteTime.trim();
    }

    @Override
    public String toString() {
        return "GameResource{" +
                "id=" + id +
                ", gameName='" + gameName + '\'' +
                ", version='" + version + '\'' +
                ", language='" + language + '\'' +
                ", downloadLink='" + downloadLink + '\'' +
                ", downloadPagePass='" + downloadPagePass + '\'' +
                ", unboxPass='" + unboxPass + '\'' +
                ", createDatetime='" + createDatetime + '\'' +
                ", downloadTimes=" + downloadTimes +
                ", remark='" + remark + '\'' +
                ", type=" + type +
                ", extraInfo='" + extraInfo + '\'' +
                ", deleteFlag=" + deleteFlag +
                ", deleteTime='" + deleteTime + '\'' +
                '}';
    }
}