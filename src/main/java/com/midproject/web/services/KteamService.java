package com.midproject.web.services;

import com.midproject.web.domains.KteamDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface KteamService {
    public List<KteamDTO> retriveAll();
}
