package com.alibaba.craftsman.dto.clientobject;

import com.alibaba.cola.dto.ClientObject;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

/**
 * AbstractMetricCO
 *
 * @author Frank Zhang
 * @date 2019-03-04 11:32 AM
 */
@Data
public abstract class AbstractMetricCO extends ClientObject{
    /**
     * The ownerId of this Metric Item
     */
    @NotEmpty
    private String ownerId;
}
