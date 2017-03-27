package com.example;

import com.example.model.Band;
import com.example.repositories.BandsRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BandsQueriesTest {

    @Before
    public void setUp() {
        this.repository.save(asList(
                new Band("Metallica", "Los Angeles", 1981),
                new Band("Nirvana", "Seattle", 1987)));
    }

    @Autowired
    private BandsRepository repository;

    @Test
    public void testQueryFromMethod() throws Exception {

        List<Band> bandList = this.repository.findByCity("Seattle");
        assertTrue(bandList.size() == 1);

        Band band = bandList.get(0);
        assertEquals(band.getName(), "Nirvana");
    }

    @Test
    public void testMethodWithNamedQuery() throws Exception {

        List<Band> bandList = this.repository.findBy(1987);
        assertTrue(bandList.size() == 1);

        Band band = bandList.get(0);
        assertEquals(band.getName(), "Metallica");
    }
}
