package com.example.restapp.db.pictures;

import com.example.restapp.db.maps.Battleground;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PicturesDto {
    private int id;
    private String url;
    private Battleground battleground;
}
