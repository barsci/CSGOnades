package com.example.restapp.db.battelground.battlegroundao;

import com.example.restapp.db.ListOfAvailableMaps;
import com.example.restapp.db.PlayingSide;
import com.example.restapp.db.battelground.Battleground;
import com.example.restapp.db.battelground.BattlegroundDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface BattlegroundDao extends JpaRepository<Battleground, Long> {

    List<Battleground> findAll();
    Optional<Battleground> findById(Long id);
    List<Battleground> findByPlayingSideAndListOfAvailableMaps(PlayingSide ctOrT, ListOfAvailableMaps csMap);

    //Optional<Battleground> findByCtOrT(PlayingSide cTorT);
}
