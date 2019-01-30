package com.example.restapp.service;

import com.example.restapp.controller.BattlegroundNotFoundException;
import com.example.restapp.db.battelground.Battleground;
import com.example.restapp.db.battelground.BattlegroundDto;
import com.example.restapp.db.battelground.battlegroundao.BattlegroundDao;
import com.example.restapp.mapper.BattlegroundMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BattlegroundService {


    private BattlegroundDao battlegroundDao;

    public BattlegroundService(BattlegroundDao battlegroundDao) {
        this.battlegroundDao = battlegroundDao;
    }

    public List<BattlegroundDto> getAllMirageSmokes() {
        return BattlegroundMapper.mapToBattlegroundDtoList(battlegroundDao.findAll());
    }

    public BattlegroundDto getMirageSmokeById(final Long id) throws BattlegroundNotFoundException {
        return BattlegroundMapper.mapToBattlegroundDto(battlegroundDao.findById(id).orElseThrow(() -> new BattlegroundNotFoundException("XDDDDDDD")));
    }

    public Battleground saveSmoke(BattlegroundDto battleground) {
        return battlegroundDao.save(BattlegroundMapper.mapToBattleground(battleground));
    }

    /*public Optional<Battleground> getMirageSmokeByCTorT(CounterTerroristOrTerrorist cTorT) {
        return mapDao.findByCtOrT(cTorT);
    }*/
}
