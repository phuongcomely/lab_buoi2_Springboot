package vn.techmaster.lap2_sb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.techmaster.lap2_sb.database.BookDB;
import vn.techmaster.lap2_sb.model.Book;

@Repository
public class BookDAO {
    
    public List<Book> findAll() { // select * from book
        return BookDB.bookList;
    }

    public Book findById(int id) { // select * from book where id = ?
        for (Book book : BookDB.bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}
