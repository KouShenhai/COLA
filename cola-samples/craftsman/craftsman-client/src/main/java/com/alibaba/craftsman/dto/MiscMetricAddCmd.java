package com.alibaba.craftsman.dto;

import com.alibaba.craftsman.dto.clientobject.MiscMetricCO;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


/**
 * MiscMetricAddCmd
 *
 * @author Frank Zhang
 * @date 2019-03-04 11:04 AM
 */
@Data
public class MiscMetricAddCmd extends CommonCommand{
    @NotNull
    private MiscMetricCO miscMetricCO;
}
