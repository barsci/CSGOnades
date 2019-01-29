package com.example.restapp.db;

import com.example.restapp.db.maps.mapdao.MapDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DbTest {

    @Autowired
    MapDao mirageDao;

    @Test
    public void testAddingToDB(){

 /*       //Given
        Battleground maps = Battleground.builder().ctOrT(CTorT.CT).sgDestination(SGDestination.A).description("jungle from hagrid").picture("asd.jpg").build();

        //When
        mirageDao.save(maps);
        int id = maps.getId();

        //Them
        Assert.assertEquals(1, id);

        //CleanUp

        //mirageDao.deleteById(id);*/
    }
}
