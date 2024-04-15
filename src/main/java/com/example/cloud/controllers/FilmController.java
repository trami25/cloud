package com.example.cloud.controllers;

import com.example.cloud.entities.Film;
import com.example.cloud.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {
    @Autowired
    private FilmRepository filmRepository;

    @GetMapping
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @PostMapping
    public Film createFilm(@RequestBody Film film) {
        return filmRepository.save(film);
    }
}
