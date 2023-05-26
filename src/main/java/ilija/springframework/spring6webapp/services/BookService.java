package ilija.springframework.spring6webapp.services;

import ilija.springframework.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
