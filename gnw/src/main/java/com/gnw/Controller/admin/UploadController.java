package com.gnw.Controller.admin;



import com.gnw.Util.UploadImagesUtils;
import com.gnw.exception.UploadImagesException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;



@RestController
@RequestMapping("/upload")
public class UploadController {


    @PostMapping("/native")
    public String nativeUpload(@RequestParam("file") MultipartFile file){
        try {
            return UploadImagesUtils.getImagesURL(file);
        } catch (UploadImagesException e) {
            e.printStackTrace();
            return "";
        }
    }






}
