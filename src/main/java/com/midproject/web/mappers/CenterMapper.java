package com.midproject.web.mappers;

import com.midproject.web.domains.CenterDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CenterMapper {
    public List<CenterDTO> selectAll();
}
