package com.example.restapp.db.maps;


import com.example.restapp.db.CTorT;
import com.example.restapp.db.MapList;
import com.example.restapp.db.SGDestination;
import com.example.restapp.db.pictures.Pictures;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MapDto {
    private int id;
    private MapList mapList;
    private CTorT ctOrT;
    private SGDestination sgDestination;
    private String description;
    private List<Pictures> picture;
}
