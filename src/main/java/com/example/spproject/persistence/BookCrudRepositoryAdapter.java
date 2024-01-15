package com.example.spproject.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.spproject.Entity.Book;

import java.util.List;
import java.util.Optional;
@Repository
public class BookCrudRepositoryAdapter implements CrudRepository<Book, Long>{

    @Autowired
    private JpaRepository<Book, Long> jpaRepository;

    @Override
    public Book save(Book book) {
        return jpaRepository.save(book);
    }


    @Override
    public <S extends Book> Iterable<S> saveAll(Iterable<S> books) {
        return jpaRepository.saveAll(books);
    }

    @Override
    public Optional<Book> findById(Long id) {
        return jpaRepository.findById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return jpaRepository.existsById(id);
    }

    @Override
    public List<Book> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public long count() {
        return jpaRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }

    @Override
    public void delete(Book book) {
        jpaRepository.delete(book);
    }

    @Override
    public void deleteAll(Iterable<? extends Book> books) {
        jpaRepository.deleteAll(books);
    }

    @Override
    public void deleteAll() {
        jpaRepository.deleteAll();
    }


}