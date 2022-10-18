package com.example.javspring.model.requestDTO;

import com.example.javspring.model.ToDo;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
public class TodoRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String phone;

    @NotBlank
    private String address;

    @NotBlank
    private String code;

    public static ToDo fromDto(TodoRequest todoRequest) {
        return null;
    }
}
