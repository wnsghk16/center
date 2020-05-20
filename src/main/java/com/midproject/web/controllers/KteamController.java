package com.midproject.web.controllers;

import com.midproject.web.domains.KteamDTO;
import com.midproject.web.services.KteamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kteams")
public class KteamController {
    @Autowired  KteamService kteamService;

    @GetMapping("")
    public List<KteamDTO> getAll(){
        return kteamService.retriveAll();
    }
}
