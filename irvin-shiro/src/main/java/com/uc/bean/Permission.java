package com.uc.bean;

import java.io.Serializable;

/**
 * Created by irvin on 2017/7/23.
 */
public class Permission implements Serializable {

    private static final long serialVersionUID = 5457147301834344851L;
    private Integer id;
    private String name;
    private String url;
    private String method;
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", name=" + name +
                ", url=" + url +
                ", method=" + method +
                ", description=" + description +
                '}';
    }
}