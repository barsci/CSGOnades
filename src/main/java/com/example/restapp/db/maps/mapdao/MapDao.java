package com.example.restapp.db.maps.mapdao;

import com.example.restapp.db.maps.Battleground;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface MapDao extends CrudRepository<Battleground, Integer> {

    List<Battleground> findAll();

    Optional<Battleground> findById(Long id);

    //Optional<Battleground> findByCtOrT(CTorT cTorT);
}
