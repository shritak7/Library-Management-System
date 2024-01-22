package com.example.Practice1.Repository;

import com.example.Practice1.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bookrepo extends JpaRepository <Book,Integer>{

}
