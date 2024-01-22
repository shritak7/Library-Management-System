package com.example.librarymanagementsystemsept.controller;

import com.example.librarymanagementsystemsept.dto.responsetDTO.IssueBookResponse;
import com.example.librarymanagementsystemsept.service.impl.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/issue/book-id/{book-id}/student-id/{student-id}")
    public ResponseEntity issueBook(@PathVariable("book-id") int bookId,
                                    @PathVariable("student-id") int studentId){

        try{
            IssueBookResponse response = transactionService.issueBook(bookId,studentId);
            return new ResponseEntity(response,HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    // return book
}
