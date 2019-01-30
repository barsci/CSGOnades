package com.example.restapp.mapper;

import com.example.restapp.db.battelground.Battleground;
import com.example.restapp.db.battelground.BattlegroundDto;

import java.util.List;
import java.util.stream.Collectors;

public class BattlegroundMapper {

    private BattlegroundMapper() {
        throw new UnsupportedOperationException();
    }


    public static BattlegroundDto mapToBattlegroundDto(Battleground bg) {
        return new BattlegroundDto(bg.getId(),
                bg.getListOfAvailableMaps(),
                bg.getCounterTerroristOrTerrorist(),
                bg.getGrenadeDestination(),
                bg.getDescription(),
                bg.getPicture1(),
                bg.getPicture2(),
                bg.getPicture3(),
                bg.getPicture4());
    }

    public static Battleground mapToBattleground(BattlegroundDto bg) {
        return Battleground.builder().
                counterTerroristOrTerrorist(bg.getCounterTerroristOrTerrorist()).
                grenadeDestination(bg.getGrenadeDestination()).
                description(bg.getDescription()).
                listOfAvailableMaps(bg.getListOfAvailableMaps()).
                picture1(bg.getPicture1()).
                picture2(bg.getPicture2()).
                picture3(bg.getPicture3()).
                picture4(bg.getPicture4()).
                build();
    }

    public static List<BattlegroundDto> mapToBattlegroundDtoList(List<Battleground> list) {
        return list.stream().
                map(m -> new BattlegroundDto(m.getId(),
                        m.getListOfAvailableMaps(),
                        m.getCounterTerroristOrTerrorist(),
                        m.getGrenadeDestination(),
                        m.getDescription(),
                        m.getPicture1(),
                        m.getPicture2(),
                        m.getPicture3(),
                        m.getPicture4())).
                collect(Collectors.toList());
    }
}
