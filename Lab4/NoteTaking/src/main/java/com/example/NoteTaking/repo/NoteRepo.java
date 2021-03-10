package com.example.NoteTaking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.NoteTaking.model.Notes;

public interface NoteRepo extends JpaRepository<Notes, Integer> {

}