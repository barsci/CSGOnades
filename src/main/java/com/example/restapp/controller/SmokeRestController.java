package com.example.restapp.controller;

import com.example.restapp.db.battelground.Battleground;
import com.example.restapp.db.battelground.BattlegroundDto;
import com.example.restapp.mapper.MapMapper;
import com.example.restapp.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/smoke")
public class SmokeRestController {

    @Autowired
    DBService dbService;

    @RequestMapping(method = RequestMethod.GET, value = "getSmokes")
    public List<BattlegroundDto> getAllMirageSmokes(){
        return MapMapper.mapToMirageDtoList(dbService.getAllMirageSmokes());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getSmokeById")
    public BattlegroundDto getMirageSmoke(@RequestParam Integer mirageId) throws MapNotFoundException {
        System.out.println("cosaaaa");
        return MapMapper.mapMirageToMirageDto(dbService.getMirageSmokeById(mirageId).orElseThrow(MapNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteMirageSmoke")
    public void deleteMirageSmoke(Long smokeId){
    }

   /* @RequestMapping(method = RequestMethod.PUT, value = "updateMirageSmoke")
    public BattlegroundDto updateTask(BattlegroundDto task){
        return new BattlegroundDto(2L,"title2","content2");
    }*/

    @RequestMapping(method = RequestMethod.POST, value = "createSmokeEntry", consumes = APPLICATION_JSON_VALUE)
    public void createSmoke(@RequestBody BattlegroundDto battlegroundDto) {
        Battleground battleground = MapMapper.mapMirageDtoToMirage(battlegroundDto);
        dbService.saveSmoke(battleground);
        //System.out.println(battleground.getPicture().get(0));
    }
}
