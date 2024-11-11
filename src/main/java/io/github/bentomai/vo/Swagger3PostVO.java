package io.github.bentomai.vo;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Swagger3Post视图类")
public class Swagger3PostVO {

    @Schema(title = "主键")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Swagger3PostVO() {
    }

    public Swagger3PostVO(Long id) {
        this.id = id;
    }
}
