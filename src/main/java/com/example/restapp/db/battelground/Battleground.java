package com.example.restapp.db.battelground;

import com.example.restapp.db.CounterTerroristOrTerrorist;
import com.example.restapp.db.ListOfAvailableMaps;
import com.example.restapp.db.GrenadeDestination;
import com.example.restapp.db.pictures.Pictures;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Battleground")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Battleground {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name ="battelground")
    @Enumerated(EnumType.STRING)
    private ListOfAvailableMaps listOfAvailableMaps;

    @Column(name = "CounterTerroristOrTerrorist")
    @Enumerated(EnumType.STRING)
    private CounterTerroristOrTerrorist counterTerroristOrTerrorist;

    @Column(name = "grenadeDestination")
    @Enumerated(EnumType.STRING)
    private GrenadeDestination grenadeDestination;

    @Column(name = "description")
    private String description;

    List<Pictures> picture;
}
