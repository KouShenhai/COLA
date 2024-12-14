package com.alibaba.craftsman.dto;

import com.alibaba.craftsman.dto.clientobject.RefactoringMetricCO;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


/**
 * RefactoringMetricAddCmd
 *
 * @author Frank Zhang
 * @date 2019-03-04 11:04 AM
 */
@Data
public class RefactoringMetricAddCmd extends CommonCommand{
    @NotNull
    private RefactoringMetricCO refactoringMetricCO;
}
