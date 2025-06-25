package com.example.guestBook.service;

import com.example.guestBook.domain.GuestBook;
import com.example.guestBook.repository.GuestBookRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootTest
@Transactional
@EnableJpaAuditing
public class GuestBookServiceTest {
    @Autowired
    GuestBookService guestBookService;

    @Autowired
    GuestBookRepository guestBookRepository;

    @BeforeEach
    void clearTable(){
        // given
//        GuestBook guestBook =
    }
}
