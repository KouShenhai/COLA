package com.alibaba.craftsman.dto;

import com.alibaba.craftsman.dto.clientobject.PaperMetricCO;
import com.alibaba.craftsman.dto.clientobject.PatentMetricCO;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


/**
 * PaperMetricAddCmd
 *
 * @author Frank Zhang
 * @date 2019-03-03 11:38 AM
 */
@Data
public class PaperMetricAddCmd extends CommonCommand{
    @NotNull
    private PaperMetricCO paperMetricCO;
}
