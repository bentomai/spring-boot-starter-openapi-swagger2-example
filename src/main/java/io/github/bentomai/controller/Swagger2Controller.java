package io.github.bentomai.controller;

import io.github.bentomai.dto.Swagger2PostDTO;
import io.github.bentomai.vo.Swagger2PostVO;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/swagger2/test")
@Api(tags = "swagger2注解测试")
public class Swagger2Controller {

    @ApiResponses({
            @ApiResponse(code = 200,message = "查询成功")
    })
    @GetMapping("/get")
    @ApiOperation(value = "测试Get请求", notes = "Swagger2测试Get请求")
    public String get(){
        return "swagger2";
    }

    @ApiResponses({
            @ApiResponse(code = 200,message = "新增成功")
    })
    @PostMapping("/post")
    @ApiOperation(value = "测试Post请求", notes = "Swagger2测试Get请求")
    public Swagger2PostVO post(@RequestBody Swagger2PostDTO dto){
        return new Swagger2PostVO(dto.getId());
    }

    @ApiResponses({
            @ApiResponse(code = 200,message = "删除成功")
    })
    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "测试Delete请求", notes = "Swagger2测试Delete请求")
    public Long delete(@ApiParam("主键") @PathVariable("id")Long id){
        return id;
    }

    @ApiResponses({
            @ApiResponse(code = 200,message = "更新成功")
    })
    @PutMapping("/put")
    @ApiOperation(value = "测试Put请求", notes = "Swagger2测试Put请求")
    public Swagger2PostVO put(@RequestBody Swagger2PostDTO dto){
        return new Swagger2PostVO(dto.getId());
    }

}
