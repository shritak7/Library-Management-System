package com.example.librarymanagementsystemsept.repository;

import com.example.librarymanagementsystemsept.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
