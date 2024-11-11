package io.github.bentomai.controller;

import io.github.bentomai.dto.Swagger2PostDTO;
import io.github.bentomai.dto.Swagger3PostDTO;
import io.github.bentomai.vo.Swagger3PostVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/swagger3/test")
@Tag(name = "swagger3注解测试")
public class Swagger3Controller {

    @ApiResponses({
            @ApiResponse(responseCode = "200",description = "查询成功")
    })
    @GetMapping("/get")
    @Operation(summary = "测试Get请求", description = "Swagger3测试Get请求")
    public String get(){
        return "swagger3";
    }

    @ApiResponses({
            @ApiResponse(responseCode = "200",description = "新增成功",content = @Content(mediaType = "application/json"))
    })
    @PostMapping("/post")
    @Operation(summary = "测试Post请求", description = "Swagger3测试Get请求")
    public Swagger3PostVO post(@RequestBody Swagger3PostDTO dto){
        return new Swagger3PostVO(dto.getId());
    }

    @ApiResponses({
            @ApiResponse(responseCode = "200",description = "删除成功")
    })
    @DeleteMapping("/delete/{id}")
    @Operation(summary = "测试Delete请求", description = "Swagger3测试Delete请求")
    public Long delete(@Parameter(name = "主键") @PathVariable("id")Long id){
        return id;
    }

    @ApiResponses({
            @ApiResponse(responseCode = "200",description = "更新成功")
    })
    @PutMapping("/put")
    @Operation(summary = "测试Put请求", description = "Swagger3测试Put请求")
    public Swagger3PostVO put(@RequestBody Swagger2PostDTO dto){
        return new Swagger3PostVO(dto.getId());
    }

}
