package vn.techmaster.lap2_sb.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import vn.techmaster.lap2_sb.utils.CSVFileReader;


public class InitData implements CommandLineRunner { //chạy duy nhất 1 lần khi ứng dụng được chạy 

       @Autowired
    private CSVFileReader csvFileReader;
    
    @Override
    public void run(String... args) throws Exception {
        BookDB.bookList = csvFileReader.readFile("src\\main\\resources\\Book.csv");
        System.out.println("Book size : " + BookDB.bookList.size());
    }
    
}
