/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operation.service;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author orkhan.mirzayev
 */
@XmlRootElement
public class PictureInfo {

    private String name;
    protected DataHandler imageData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlMimeType("application/octet-stream")
    public DataHandler getImageData() {
        return imageData;
    }

    public void setImageData(DataHandler imageData) {
        this.imageData = imageData;
    }
}
