package io.github.bentomai.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Swagger2PostVO", description = "Post视图类")
public class Swagger2PostVO {

    @ApiModelProperty(value = "主键", dataType = "Long")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Swagger2PostVO() {
    }

    public Swagger2PostVO(Long id) {
        this.id = id;
    }
}
