package FileHandle.service;
import java.io.FileNotFoundException;
import java.util.List;

import FileHandle.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
public interface ProductService {

    Product saveAttachment(MultipartFile file) throws Exception;
    void saveFiles(MultipartFile[] files) throws Exception;
    List<Product> getAllFiles();
    Product getFile(String Id) throws FileNotFoundException;
}