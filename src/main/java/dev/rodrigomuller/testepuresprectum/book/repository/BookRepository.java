package dev.rodrigomuller.testepuresprectum.book.repository;

import dev.rodrigomuller.testepuresprectum.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
