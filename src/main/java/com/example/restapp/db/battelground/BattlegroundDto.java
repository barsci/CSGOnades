package com.example.restapp.db.battelground;


import com.example.restapp.db.PlayingSide;
import com.example.restapp.db.GrenadeDestination;
import com.example.restapp.db.ListOfAvailableMaps;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BattlegroundDto {
    private Long id;
    private ListOfAvailableMaps listOfAvailableMaps;
    private PlayingSide playingSide;
    private GrenadeDestination grenadeDestination;
    private String description;
    private String picture1;
    private String picture2;
    private String picture3;
    private String picture4;
}
