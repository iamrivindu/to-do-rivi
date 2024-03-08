package com.rivindu.todorivi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse<T> {

    @JsonProperty(value = "Data")
    private T data;
    @JsonProperty(value = "Status")
    private String status;

}
