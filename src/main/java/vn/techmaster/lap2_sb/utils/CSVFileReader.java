package vn.techmaster.lap2_sb.utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import vn.techmaster.lap2_sb.model.Book;

public class CSVFileReader implements IFileReader {

    @Override
    public List<Book> readFile(String filePath) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            // Read the CSV file using java.nio.file.Path
            Path csvFilePath = Path.of(filePath);
            byte[] csvData = Files.readAllBytes(csvFilePath);

            // Convert CSV to List of Book objects
            return objectMapper.readValue(csvData, new TypeReference<List<Book>>() {});

        } catch (Exception e) {
            e.printStackTrace(); // In đầy đủ thông tin về lỗi
        }
        return null;
    }
}

