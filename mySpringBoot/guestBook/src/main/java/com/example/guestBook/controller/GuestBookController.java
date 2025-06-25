package com.example.guestBook.controller;

import com.example.guestBook.domain.GuestBook;
import com.example.guestBook.dto.AddGuestBookRequest;
import com.example.guestBook.dto.GuestBookResponse;
import com.example.guestBook.dto.UpdateGuestBookRequest;
import com.example.guestBook.service.GuestBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class GuestBookController {
    private final GuestBookService guestBookService;

    @PostMapping("/api/guestbook")
    public ResponseEntity<GuestBook> addGuestBook(@RequestBody AddGuestBookRequest request){
        GuestBook savedGuestBook = guestBookService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedGuestBook);
    }

    @GetMapping("/api/guestbook")
    public ResponseEntity<List<GuestBookResponse>> findAllGuestBooks(){
        List<GuestBookResponse> guestBooks = guestBookService.findAll()
                .stream()
                .map(GuestBookResponse::new)
                .toList();
        return ResponseEntity.ok()
                .body(guestBooks);
    }

    @GetMapping("/api/guestbook/{id}")
    public ResponseEntity<GuestBookResponse> findGuestBook(@PathVariable long id){
        GuestBook guestBook = guestBookService.findById(id);
        return ResponseEntity.ok()
                .body(new GuestBookResponse(guestBook));
    }

    @PutMapping("/api/guestbook/{id}")
    public ResponseEntity<GuestBookResponse> updateGuestBook(@PathVariable long id, @RequestBody UpdateGuestBookRequest request){
        GuestBook guestBookUpdate = guestBookService.update(id, request);
        return ResponseEntity.ok()
                .body(new GuestBookResponse(guestBookUpdate));
    }

    @DeleteMapping("/api/guestbook/{id}")
    public ResponseEntity<Void> deleteGuestBook(@PathVariable Long id){
        guestBookService.delete(id);
        return ResponseEntity.ok().build();
    }
}
