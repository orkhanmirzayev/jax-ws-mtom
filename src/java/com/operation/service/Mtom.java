/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operation.service;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import javax.activation.DataHandler;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.imageio.ImageIO;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.soap.AddressingFeature;
import javax.xml.ws.soap.MTOM;

/**
 *
 * @author orkhan.mirzayev
 */
@WebService
@MTOM(enabled = true)
public class Mtom {

    /**
     * This is a sample web service operation
     *
     * @param txt
     * @return
     */
    private int counter = 0;

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "sumNumbers")
    public int sum(@WebParam(name = "one") int one, @WebParam(name = "second") int second) {
        return one + second;
    }

    @WebMethod(operationName = "uploadFileWithDataHandler")
    public int uploadDataHandler(@WebParam(name = "image") PictureInfo pictureInfo) throws IOException {
        DataHandler dh = pictureInfo.getImageData();
        try {
            File F = new File("C:\\Users\\orkhan.mirzayev\\Desktop\\" + pictureInfo.getName() + ".jpg");
            FileOutputStream fs = new FileOutputStream(F);
            dh.writeTo(fs);
            fs.flush();
            fs.close();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;

    }
    @WebMethod(operationName = "uploadFileWithImage")
    public int uploadImage(@WebParam(name = "image") Image image, @WebParam(name = "text") String text) throws IOException {
        BufferedImage bufferedImage = (BufferedImage) image;
        ImageIO.write(bufferedImage, "jpg", new File("C:\\Users\\orkhan.mirzayev\\Desktop\\"+text+".jpg"));
        return 0;

    }
}
