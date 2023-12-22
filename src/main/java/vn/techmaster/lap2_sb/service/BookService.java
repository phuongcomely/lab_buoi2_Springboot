package vn.techmaster.lap2_sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.techmaster.lap2_sb.dao.BookDAO;
import vn.techmaster.lap2_sb.model.Book;

@Service
public class BookService {
     @Autowired
    private BookDAO bookDAO;

    public List<Book> getAllBooks() {
        return bookDAO.findAll();
    }
    public Book getBookById(int id) {
        // Cách 1:
        return bookDAO.findById(id);
    }

}
