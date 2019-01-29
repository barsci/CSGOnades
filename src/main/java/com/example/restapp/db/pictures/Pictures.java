package com.example.restapp.db.pictures;

import com.example.restapp.db.maps.Battleground;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Pictures")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Pictures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "map_id")
    Battleground battleground;

    @Override
    public String toString() {
        return "Picture id= " + id +
                ", url= " + url +
                ", battleground=" + battleground;
    }
}
