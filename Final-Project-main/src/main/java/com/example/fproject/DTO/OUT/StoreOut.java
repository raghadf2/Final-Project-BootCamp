package com.example.fproject.DTO.OUT;

import com.example.fproject.Enum.StoreStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreOut {

    private Integer id;

    private String name;

    private String businessType;

    private String commercialRegisterNo;

    private Boolean commercialRegisterVerified;

    private StoreStatus status;

    private Integer storeOwnerId;

    private String storeOwnerName;
}