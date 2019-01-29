package com.example.restapp.db.maps;

import com.example.restapp.db.CTorT;
import com.example.restapp.db.MapList;
import com.example.restapp.db.SGDestination;
import com.example.restapp.db.pictures.Pictures;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
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
    private int id;

    @Column(name ="maps")
    @Enumerated(EnumType.STRING)
    private MapList mapList;

    @Column(name = "CTorT")
    @Enumerated(EnumType.STRING)
    private CTorT ctOrT;

    @Column(name = "sgDestination")
    @Enumerated(EnumType.STRING)
    private SGDestination sgDestination;

    @Column(name = "description")
    private String description;

    @JsonIgnore
    @OneToMany(
            targetEntity = Pictures.class,
            mappedBy = "battleground",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL
    )
    List<Pictures> picture = new ArrayList<>();
}
