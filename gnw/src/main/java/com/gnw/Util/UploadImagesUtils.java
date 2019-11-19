package com.gnw.Util;


import com.gnw.exception.UploadImagesException;

import java.io.IOException;
import java.util.UUID;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.web.multipart.MultipartFile;

public class UploadImagesUtils {
    /**
     * 获得图片名
     * @param file
     * @return
     */
    public static String getFileName(MultipartFile file){
        String filename = file.getOriginalFilename();
        filename = UUID.randomUUID()+filename.substring(filename.lastIndexOf("."));
        return  filename;
    }

    public static String getImagesURL(MultipartFile file) throws UploadImagesException {
        String baseURL="http://39.108.234.130:8080/images/";
        String fileName=getFileName(file);
        String pictureURL=baseURL+fileName;
        Client client=new Client();
        WebResource resource = client.resource(pictureURL);
        try {
            resource.put(String.class,file.getBytes());
            return pictureURL;
        } catch (IOException e) {
             throw new UploadImagesException("图片是上传错误");

        }

    }
}
