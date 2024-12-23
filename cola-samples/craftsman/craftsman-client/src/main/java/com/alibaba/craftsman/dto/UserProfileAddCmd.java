package com.alibaba.craftsman.dto;

import com.alibaba.craftsman.dto.clientobject.UserProfileCO;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


/**
 * UserProfileAddCmd
 *
 * @author Frank Zhang
 * @date 2019-02-28 6:20 PM
 */
@Data
public class UserProfileAddCmd extends CommonCommand {

    @NotNull
    private UserProfileCO userProfileCO;
}
