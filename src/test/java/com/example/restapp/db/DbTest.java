package com.example.restapp.db;

import com.example.restapp.db.battelground.battlegroundao.BattlegroundDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DbTest {

    @Autowired
    BattlegroundDao mirageDao;

    @Test
    public void testAddingToDB(){

 /*       //Given
        Battleground battelground = Battleground.builder().ctOrT(CounterTerroristOrTerrorist.CT).grenadeDestination(GrenadeDestination.A).description("jungle from hagrid").picture("asd.jpg").build();

        //When
        mirageDao.save(battelground);
        int id = battelground.getId();

        //Them
        Assert.assertEquals(1, id);

        //CleanUp

        //mirageDao.deleteById(id);*/
    }
}
