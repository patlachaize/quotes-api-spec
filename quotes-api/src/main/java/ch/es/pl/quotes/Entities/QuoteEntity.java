package ch.es.pl.quotes.Entities;

import javax.persistence.*;

@Entity(name = "quote")
public class QuoteEntity {
    @TableGenerator(name = "Quote_Gen",
            table = "ID_QUOTE",
            pkColumnName = "NAME",
            valueColumnName = "VAL",
            initialValue = 3,
            allocationSize = 100)
    @Id // @GeneratedValue
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Quote_Gen")
    private int id;
    private String author;
    private String citation;

    public QuoteEntity() {}

    public QuoteEntity(int id, String author, String citation) {
        this.id = id;
        this.author = author;
        this.citation = citation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCitation() {
        return citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }
}
