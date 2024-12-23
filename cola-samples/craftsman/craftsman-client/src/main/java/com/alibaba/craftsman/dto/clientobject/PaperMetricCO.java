package com.alibaba.craftsman.dto.clientobject;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * PaperMetricCO
 *
 * @author Frank Zhang
 * @date 2019-03-03 11:16 AM
 */
@Data
public class PaperMetricCO extends AbstractMetricCO{
    @NotEmpty
    private String paperName;
    private String paperDesc;
    private String magazine;
    private String paperLink;
}
