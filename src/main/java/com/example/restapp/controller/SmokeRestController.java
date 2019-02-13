package com.example.restapp.controller;

import com.example.restapp.db.PlayingSide;
import com.example.restapp.db.ListOfAvailableMaps;
import com.example.restapp.db.battelground.BattlegroundDto;
import com.example.restapp.service.BattlegroundService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/smoke")
public class SmokeRestController {

    private BattlegroundService battlegroundService;

    public SmokeRestController(BattlegroundService battlegroundService) {
        this.battlegroundService = battlegroundService;
    }

    @GetMapping("/all")
    public List<BattlegroundDto> getAllMirageSmokes() {
        return battlegroundService.getAllMirageSmokes();
    }

    @GetMapping("/getSmokeById/{mirageId}")
    public BattlegroundDto getMirageSmoke(@RequestParam Long mirageId) {
        return battlegroundService.getMirageSmokeById(mirageId);
    }

   /* @RequestMapping(method = RequestMethod.PUT, value = "updateMirageSmoke")
    public BattlegroundDto updateTask(BattlegroundDto task){
        return new BattlegroundDto(2L,"title2","content2");
    }*/

    @PostMapping("/createSmoke")
    public void createSmoke(@RequestBody BattlegroundDto battlegroundDto) {
        battlegroundService.saveSmoke(battlegroundDto);
    }

    @GetMapping("/getSelectedMapAndSideNades")
    public List<BattlegroundDto> getSelectedMapAndSideNades(@RequestParam PlayingSide ctOrT, ListOfAvailableMaps csMap){
        return battlegroundService.getAllMapAndSideSelectedSmokes(ctOrT, csMap);
    }
}
