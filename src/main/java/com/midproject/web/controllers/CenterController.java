package com.midproject.web.controllers;

import com.midproject.web.domains.CenterDTO;
import com.midproject.web.services.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/centers")
public class CenterController {
    @Autowired CenterService centerService;

    @GetMapping("")
    public List<CenterDTO> getAll(){
        return centerService.retriveAll();
    }
}
