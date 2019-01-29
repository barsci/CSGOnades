package com.example.restapp.db.pictures.picturesdao;

import com.example.restapp.db.pictures.Pictures;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface PicturesDao extends CrudRepository<Pictures, Integer> {
}
