package wolox.training.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import wolox.training.models.Book;

@EnableJpaRepositories
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByAuthor(String author);

    List<Book> findByTitle(String title);

    void deleteById(Long id);
}
