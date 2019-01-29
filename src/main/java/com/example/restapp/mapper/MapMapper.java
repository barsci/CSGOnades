package com.example.restapp.mapper;

import com.example.restapp.db.maps.Battleground;
import com.example.restapp.db.maps.MapDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MapMapper {

    public static MapDto mapMirageToMirageDto(Battleground mirage){
        return new MapDto(mirage.getId(),
                mirage.getMapList(),
                mirage.getCtOrT(),
                mirage.getSgDestination(),
                mirage.getDescription(),
                mirage.getPicture());
    }

    public static Battleground mapMirageDtoToMirage(MapDto mirageDto){
        return Battleground.builder().
                ctOrT(mirageDto.getCtOrT()).
                sgDestination(mirageDto.getSgDestination()).
                description(mirageDto.getDescription()).
                mapList(mirageDto.getMapList()).
                picture(mirageDto.getPicture()).
                build();
    }

    public static List<MapDto> mapToMirageDtoList(List<Battleground> list){
        return list.stream().
                map(m -> new MapDto(m.getId(),
                        m.getMapList(),
                        m.getCtOrT(),
                        m.getSgDestination(),
                        m.getDescription(),
                        m.getPicture())).
                collect(Collectors.toList());
    }
}
