package com.midproject.web.serviceImpls;

import com.midproject.web.domains.CenterDTO;
import com.midproject.web.mappers.CenterMapper;
import com.midproject.web.services.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CenterServiceImpl implements CenterService {
    @Autowired CenterMapper centerMapper;
    @Override
    public List<CenterDTO> retriveAll() {
        return centerMapper.selectAll();
    }
}
