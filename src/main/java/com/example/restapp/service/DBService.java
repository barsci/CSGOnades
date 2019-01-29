package com.example.restapp.service;

import com.example.restapp.db.battelground.Battleground;
import com.example.restapp.db.battelground.battlegroundao.BattlegroundDao;
import com.example.restapp.db.pictures.Pictures;
import com.example.restapp.db.pictures.picturesdao.PicturesDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DBService {


    private BattlegroundDao battlegroundDao;
    private PicturesDao picturesDao;

    public DBService(BattlegroundDao battlegroundDao, PicturesDao picturesDao) {
        this.battlegroundDao = battlegroundDao;
        this.picturesDao = picturesDao;
    }

    public List<Battleground> getAllMirageSmokes() {
        return battlegroundDao.findAll();
    }

    public Optional<Battleground> getMirageSmokeById(final Integer id) {
        return battlegroundDao.findById(id);
    }

    public Battleground saveSmoke(Battleground mirage) {
        return battlegroundDao.save(mirage);
    }

    public Pictures savePictures(Pictures pic) {
        return picturesDao.save(pic);
    }

    /*public Optional<Battleground> getMirageSmokeByCTorT(CounterTerroristOrTerrorist cTorT) {
        return mapDao.findByCtOrT(cTorT);
    }*/
}
