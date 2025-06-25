package com.example.guestBook.repository;

import com.example.guestBook.domain.GuestBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@EnableJpaAuditing
public class GuestBookRepositoryTest {
    @Autowired
    private GuestBookRepository guestBookRepository;

    @BeforeEach
    void clearTable(){
        guestBookRepository.deleteAll();
    }
    @Test
    void testCreateGuestBook(){
        // given
        GuestBook guestBook = GuestBook.builder()
                .author("홍길동")
                .content("안녕하세요, 첫 방명록입니다.")
                .build();

        // when
        GuestBook savedGuestBook = guestBookRepository.save(guestBook);
        System.out.println(savedGuestBook);

        // then
        assertThat(savedGuestBook.getId()).isNotNull();
        assertThat(savedGuestBook.getAuthor()).isEqualTo("홍길동");
        assertThat(savedGuestBook.getContent()).isEqualTo("안녕하세요, 첫 방명록입니다.");
        assertThat(savedGuestBook.getCreatedAt()).isNotNull();
        assertThat(savedGuestBook.getUpdatedAt()).isNotNull();
        assertThat(savedGuestBook.getCreatedAt()).isEqualTo(savedGuestBook.getUpdatedAt());
    }

    @Test
    void testCreateeGuestbookWitthInvalidAuthor(){
        // given: author가 null인 경우 (nullable=false 제약 조건 위반)
        GuestBook guestBook = GuestBook.builder()
                .content("내용만 있음")
                .build();

        // when & then: ConstranintViolationException 발생
        assertThrows(Exception.class, () -> {
            guestBookRepository.save(guestBook);
        });
    }

    @Test
    void testCreateGuestbookWithLongAuthor(){
        // given: author가 50자를 초과하는 경우
        String longAuthor = "A".repeat(51);
        GuestBook guestBook = GuestBook.builder()
                .content("내용 있음")
                .build();
    }

    @Test
    void testReadGuestbook(){
        // given
        GuestBook guestBook = GuestBook.builder()
                .author("김철수")
                .content("테스트 방명록입니다.")
                .build();
        GuestBook savedGuestbook = guestBookRepository.save(guestBook);

        // when
        Optional<GuestBook> foundGuestbook = guestBookRepository.findById(savedGuestbook.getId());

        // then
        assertThat(foundGuestbook).isPresent();
        assertThat(foundGuestbook.get().getAuthor()).isEqualTo("김철수");
        assertThat(foundGuestbook.get().getCreatedAt()).isNotNull();
    }

    @Test
    void testDeleteGuestbook(){
        GuestBook guestBook = GuestBook.builder()
                .author("김철수")
                .content("테스트 방명록입니다.")
                .build();
        GuestBook savedGuestbook = guestBookRepository.save(guestBook);

        // when
    }
}
