package com.example.restapp.mapper;

import com.example.restapp.db.pictures.Pictures;
import com.example.restapp.db.pictures.PicturesDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PicturesMapper {

    public static PicturesDto toPicturesDto(Pictures pictures) {
        return new PicturesDto(pictures.getId(),
                pictures.getUrl(),
                pictures.getBattleground());
    }

    public static Pictures toPictures(PicturesDto picturesDto) {
        return Pictures.builder().
                url(picturesDto.getUrl()).
                build();
    }

    public static List<PicturesDto> picturesDtoList(List<Pictures> pics) {
        return pics.stream().
                 map(m -> new PicturesDto(m.getId(),m.getUrl(),m.getBattleground()))
                .collect(Collectors.toList());
    }

    public static List<Pictures> picturesList(List<PicturesDto> pics) {
        return pics.stream().
                map(m -> Pictures.builder().
                        url(m.getUrl()).
                        build())
                .collect(Collectors.toList());
    }
}
