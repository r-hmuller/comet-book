package dev.rodrigomuller.testepuresprectum.book.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PublisherDto implements Serializable {
    private final Long id;
    private final String name;
    private final String website;
}
