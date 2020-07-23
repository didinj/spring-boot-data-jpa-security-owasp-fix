package com.djamware.mynotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djamware.mynotes.models.Notes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface NotesRepository extends JpaRepository<Notes, Long> {

    @Query("SELECT n FROM Notes n WHERE n.title = :title")
    Notes findByTitle(@Param("title") String title);
}
