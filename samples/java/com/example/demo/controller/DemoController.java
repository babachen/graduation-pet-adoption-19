package com.example.demo.controller;
import com.example.common.Result;
import org.springframework.web.bind.annotation.*;
import java.util.*;
/** 示例接口（展示片段） */
@RestController
@RequestMapping("/api/demo")
public class DemoController {
  @GetMapping("/ping")
  public Result<?> ping(){ return Result.success(Map.of("ok", true, "productId", 19)); }
}
