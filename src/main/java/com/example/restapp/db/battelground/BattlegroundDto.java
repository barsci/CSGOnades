package com.example.restapp.db.battelground;


import com.example.restapp.db.CounterTerroristOrTerrorist;
import com.example.restapp.db.GrenadeDestination;
import com.example.restapp.db.ListOfAvailableMaps;
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
public class BattlegroundDto {
    private Long id;
    private ListOfAvailableMaps listOfAvailableMaps;
    private CounterTerroristOrTerrorist ctOrT;
    private GrenadeDestination grenadeDestination;
    private String description;
    private List<Pictures> picture;
}
