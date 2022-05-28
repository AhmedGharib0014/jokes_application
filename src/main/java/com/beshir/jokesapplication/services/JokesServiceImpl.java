package com.beshir.jokesapplication.services;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService{
    private  ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }


    @Override
    public String getJokes() {
        return  chuckNorrisQuotes.getRandomQuote();
    }
}
