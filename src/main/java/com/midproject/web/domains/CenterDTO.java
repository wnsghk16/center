package com.midproject.web.domains;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CenterDTO {
    public String centerId,
    businessId,
    placeId,
    applicationDate,
    teamId,
    pupose,
    usersNum,
    startDate,
    endDate,
    performStatus,
    price,
    reservationDate,
    writeDate,
    updateDate,
    offlineStatus;
}
