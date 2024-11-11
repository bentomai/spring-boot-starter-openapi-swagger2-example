package io.github.bentomai.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Swagger2PostDTO", description = "Post传输类")
public class Swagger2PostDTO {

    @ApiModelProperty(value = "主键", dataType = "Long", example = "2")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
