package com.kyjtheyj.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 컨트롤러를 JSON 형태로 반환하는 컨트롤러로 만들어준다 (스프링에서 @ResponseBody)
public class HelloController {

    @GetMapping("/hello") // GET 요청 받는 API를 만들어준다. (스프링에서 @RequestMapping(method = RequestMethod.GET))
    public String hello() {
        return "hello";
    }
}
