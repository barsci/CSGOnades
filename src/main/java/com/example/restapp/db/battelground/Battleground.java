package com.example.restapp.db.battelground;

import com.example.restapp.db.PlayingSide;
import com.example.restapp.db.ListOfAvailableMaps;
import com.example.restapp.db.GrenadeDestination;
import lombok.*;

import javax.persistence.*;

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

    @Column(name ="battleground")
    @Enumerated(EnumType.STRING)
    private ListOfAvailableMaps listOfAvailableMaps;

    @Column(name = "PlayingSide")
    @Enumerated(EnumType.STRING)
    private PlayingSide playingSide;

    @Column(name = "grenadeDestination")
    @Enumerated(EnumType.STRING)
    private GrenadeDestination grenadeDestination;

    @Column(name = "description")
    private String description;

    @Column(name = "picture1")
    private String picture1;

    @Column(name = "picture2")
    private String picture2;

    @Column(name = "picture3")
    private String picture3;

    @Column(name = "picture4")
    private String picture4;
}