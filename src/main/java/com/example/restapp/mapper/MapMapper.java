package com.example.restapp.mapper;

import com.example.restapp.db.battelground.Battleground;
import com.example.restapp.db.battelground.BattlegroundDto;

import java.util.List;
import java.util.stream.Collectors;

public class MapMapper {

    private MapMapper() {
        throw new UnsupportedOperationException();
    }


    public static BattlegroundDto mapMirageToMirageDto(Battleground mirage) {
        return new BattlegroundDto(mirage.getId(),
                mirage.getListOfAvailableMaps(),
                mirage.getCounterTerroristOrTerrorist(),
                mirage.getGrenadeDestination(),
                mirage.getDescription(),
                mirage.getPicture());
    }

    public static Battleground mapMirageDtoToMirage(BattlegroundDto mirageDto) {
        return Battleground.builder().
                counterTerroristOrTerrorist(mirageDto.getCtOrT()).
                grenadeDestination(mirageDto.getGrenadeDestination()).
                description(mirageDto.getDescription()).
                listOfAvailableMaps(mirageDto.getListOfAvailableMaps()).
                picture(mirageDto.getPicture()).
                build();
    }

    public static List<BattlegroundDto> mapToMirageDtoList(List<Battleground> list) {
        return list.stream().
                map(m -> new BattlegroundDto(m.getId(),
                        m.getListOfAvailableMaps(),
                        m.getCounterTerroristOrTerrorist(),
                        m.getGrenadeDestination(),
                        m.getDescription(),
                        m.getPicture())).
                collect(Collectors.toList());
    }
}
