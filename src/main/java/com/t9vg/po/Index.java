package com.t9vg.po;

/**
 * @author tianfusheng
 * @e-mail linuxmorebetter@gmail.com
 * @date 2019/6/14
 */
public class Index {

    private Integer id;
    private String title;
    private  String description;
    private String questionnaireLinkUrl;
    private String createDate;
    private String deleteFlag;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuestionnaireLinkUrl() {
        return questionnaireLinkUrl;
    }

    public void setQuestionnaireLinkUrl(String questionnaireLinkUrl) {
        this.questionnaireLinkUrl = questionnaireLinkUrl;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
