package com.kyjtheyj.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//이 주해로 인해 부트의 자동설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정
//이 주해가 있는 위치부터 설정을 읽어가기 때문에 항상 프로젝트 최상단에 위치해야 한다.
//참고 : 스프링 부트는 항상 내장 WAS 사용을 권장한다. 왜냐하면 항상 동일한 환경에서 스프링 부트를 배포할 수 있기 때문.
@SpringBootApplication
public class Application01 {
    public static void main(String[] args) {
        SpringApplication.run(Application01.class, args);
    }
}
