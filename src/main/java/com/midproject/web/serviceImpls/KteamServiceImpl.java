package com.midproject.web.serviceImpls;

import com.midproject.web.domains.KteamDTO;
import com.midproject.web.mappers.KteamMapper;
import com.midproject.web.services.KteamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KteamServiceImpl implements KteamService {
    @Autowired KteamMapper kteamMapper;
    @Override
    public List<KteamDTO> retriveAll() {
        return kteamMapper.selectAll();
    }
}
