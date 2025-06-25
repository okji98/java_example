package com.example.guestBook.dto;

import com.example.guestBook.domain.GuestBook;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GuestBookResponse {
    private final Long id;
    private final String author;
    private final String content;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    public GuestBookResponse(GuestBook guestBook) {
        this.id = guestBook.getId();
        this.author = guestBook.getAuthor();
        this.content = guestBook.getContent();
        this.createdAt = guestBook.getCreatedAt();
        this.updatedAt = guestBook.getUpdatedAt();
    }
}
