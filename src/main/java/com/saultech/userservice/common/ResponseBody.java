package com.saultech.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseBody <O>{
    private O data;
}
