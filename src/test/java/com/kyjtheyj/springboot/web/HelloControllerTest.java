package com.kyjtheyj.springboot.web;

import com.kyjtheyj.springboot.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class) // 테스트 진행 시 JUnit에 내장된 실행자 외 다른 실행자를 실행 (여기선 SpringRunner라는 실행자 사용)
                             // 스프링 부트 테스트와 JUnit 사이에 연결자 역할 수행
@WebMvcTest(controllers = HelloController.class) // 스프링 테스트 어노테이션 중 Web(Spring MVC)에 집중함, [@Controller, @ControllerAdvice 등 사용 가능]
                                                 // @Service, @Component, @Repository 등은 사용 불가
public class HelloControllerTest {
    @Autowired  // 스프링이 관리하는 Bean 받음
    private MockMvc mvc; // 웹 API를 테스트 할 때 사용, 스프링 MVC테스트 시작점
                         // GET, POST 등 API 테스트 진행 가능

    @Test
    public void return_helloTest() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello")) // hello 주소로 GET 요청
                .andExpect(status().isOk())  // perform의 결과를 검증 (status를 검증), 흔히 아는 200, 404, 500 검증 (여기선 isOk니 200인지 검증)
                .andExpect(content().string(hello)); // perform의 본문 내용 검증 (컨트롤러의 리턴이 hello 인지 이 값이 맞는지 검증)
    }
}
