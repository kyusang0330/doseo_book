package com.example.doseo_book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponseDTO {
    private Long bookId;
    @CreationTimestamp
    private Date creationDate;
    private String name;
    private String writer;
    private String registrant;
}
