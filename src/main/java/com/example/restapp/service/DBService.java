package com.example.restapp.service;

import com.example.restapp.db.maps.Battleground;
import com.example.restapp.db.maps.mapdao.MapDao;
import com.example.restapp.db.pictures.Pictures;
import com.example.restapp.db.pictures.picturesdao.PicturesDao;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DBService {


    private MapDao mapDao;
    private PicturesDao picturesDao;

    public DBService(MapDao mapDao, PicturesDao picturesDao) {
        this.mapDao = mapDao;
        this.picturesDao = picturesDao;
    }

    public List<Battleground> getAllMirageSmokes() {
        return mapDao.findAll();
    }

    public Optional<Battleground> getMirageSmokeById(final Integer id) {
        return mapDao.findById(id);
    }

    public Battleground saveSmoke(Battleground mirage) {
        return mapDao.save(mirage);
    }

    public Pictures savePictures(Pictures pic) {
        return picturesDao.save(pic);
    }

    /*public Optional<Battleground> getMirageSmokeByCTorT(CTorT cTorT) {
        return mapDao.findByCtOrT(cTorT);
    }*/
}
