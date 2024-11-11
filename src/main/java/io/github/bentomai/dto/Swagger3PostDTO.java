package io.github.bentomai.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Swagger3Post传输类")
public class Swagger3PostDTO {

    @Schema(title = "主键", example = "3")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
