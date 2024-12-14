package com.alibaba.craftsman.dto;

import com.alibaba.craftsman.dto.clientobject.UserProfileCO;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class UserProfileUpdateCmd extends CommonCommand {

    @NotNull
    private UserProfileCO userProfileCO;
}
