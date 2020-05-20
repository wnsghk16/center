package com.midproject.web.services;

import com.midproject.web.domains.CenterDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CenterService {
    public List<CenterDTO> retriveAll();
}
