package ch.es.pl.quotes.repositories;

import ch.es.pl.quotes.Entities.QuoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuoteRepository extends JpaRepository<QuoteEntity, Integer> {
    QuoteEntity findById(int id);
    List<QuoteEntity> findByAuthorLike(String author);
    @Query("select q from quote q where q.author like ?1")
    List<QuoteEntity> findByAuthorLikeWithQuery(String author);
}