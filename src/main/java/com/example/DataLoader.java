package com.example;

import com.example.model.Band;
import com.example.repositories.BandsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static java.util.Arrays.asList;

@Component
public class DataLoader {
    @Autowired
    BandsRepository bandsRepository;

    @PostConstruct
    public void load() {
        bandsRepository.save(asList(
                new Band("Metallica", "Los Angeles", 1981),
                new Band("Nirvana", "Seattle", 1987)));
    }
}
