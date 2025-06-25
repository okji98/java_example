package com.example.guestBook.service;

import com.example.guestBook.domain.GuestBook;
import com.example.guestBook.dto.AddGuestBookRequest;
import com.example.guestBook.dto.UpdateGuestBookRequest;
import com.example.guestBook.repository.GuestBookRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GuestBookService {
    private final GuestBookRepository guestBookRepository;

    public GuestBook save(AddGuestBookRequest request){
        return guestBookRepository.save(request.toEntity());
    }
    public List<GuestBook> findAll(){
        return guestBookRepository.findAll();
    }

    public GuestBook findById(long id){
        return guestBookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found" + id));
    }

    public void delete(long id){
        guestBookRepository.deleteById(id);
    }

    public GuestBook update(long id, UpdateGuestBookRequest request){
        GuestBook guestBook = guestBookRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found" + id));
        guestBook.update(request.getAuthor(), request.getContent(), request.getCreatedAt(), request.getUpdatedAt());
        return guestBook;
    }
}
