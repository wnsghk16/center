package com.midproject.web.mappers;

import com.midproject.web.domains.KteamDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KteamMapper {
    public List<KteamDTO> selectAll();
}
