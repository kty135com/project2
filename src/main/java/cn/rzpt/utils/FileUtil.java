package cn.rzpt.utils;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

public class FileUtil {

 /*   public static void upload(HttpServletRequest request, MultipartFile file) throws IOException {
        String path = request.getServletContext().getRealPath("/testFiles/");
        String fileName = file.getOriginalFilename();
        File f = new File(path, fileName);
        System.out.println(path + fileName);
        if (!f.exists()) {
            f.mkdirs();
        }
        file.transferTo(f);
        return "success";
    }

    @GetMapping("/down")
    public ResponseEntity<byte[]> down(HttpServletRequest request, String filename) throws IOException {
        String path = request.getServletContext().getRealPath("/testFiles/");
        File file = new File(path, filename);
        HttpHeaders headers = new HttpHeaders();
        String fileName = new String(filename.getBytes("UTF-8"), "iso-8859-1"); //解决中文乱码的问题
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);
    }*/
}
