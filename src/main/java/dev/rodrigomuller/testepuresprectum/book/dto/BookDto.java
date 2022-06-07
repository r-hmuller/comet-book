package dev.rodrigomuller.testepuresprectum.book.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class BookDto implements Serializable {
    private final String name;
    private final int year;
    private final String summary;
    private final List<AuthorDto> authors;
    private final PublisherDto publisher;
}
