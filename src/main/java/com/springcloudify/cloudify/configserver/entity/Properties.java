package com.springcloudify.cloudify.configserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: Erasme
 * Date: 2018/5/16
 * Time: 23:52
 * Description:
 */
@Entity
@Table(name = "PROPERTIES")
public class Properties {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", length = 32, updatable = false, unique = true)
    private Long id;

    @Column(name = "KEY", length = 200)
    private String key;
    @Column(name = "VALUE", length = 200)
    private String value;
    @Column(name = "APPLICATION", length = 200)
    private String application;
    @Column(name = "PROFILE", length = 200)
    private String profile;
    @Column(name = "LABEL", length = 200)
    private String label;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
