package com.example;

import com.example.model.Band;
import com.example.repositories.BandsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DataLoaderTest {

    @Mock
    BandsRepository bandsRepository;

    @InjectMocks
    DataLoader dataLoader = new DataLoader();

    @Test
    public void verifyBands() {
        List<Band> bands = asList(
                new Band("Metallica", "Los Angeles", 1981),
                new Band("Nirvana", "Seattle", 1987));
        when(bandsRepository.save(bands)).thenReturn(bands);
        dataLoader.load();
        verify(bandsRepository).save(bands);
    }
}