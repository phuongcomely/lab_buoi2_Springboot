package vn.techmaster.lap2_sb.utils;

import java.util.List;

import vn.techmaster.lap2_sb.model.Book;

public interface IFileReader { //trường hợp nhiều đối tượng sử dụng list<E>.

     List<Book> readFile(String filePath);
}
