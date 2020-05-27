package com.wst.wstfoodsever.dao;

public class Document {
    private Integer id;

    private String typename;

    private Integer sort;

    private String imageurl;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", typename='" + typename + '\'' +
                ", sort=" + sort +
                ", imageurl='" + imageurl + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}