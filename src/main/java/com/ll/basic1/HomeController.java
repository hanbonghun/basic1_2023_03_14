package com.ll.basic1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 개발자가 spring boot에게 말한다.
public class HomeController {
    private int increase=0;
    // /home/main 요청이 오면 아래 메서드를 실행해줘
    @GetMapping("/home/main")
    //아래 메서드를 실행 후 그 리턴값을 응답으로 삼아
    @ResponseBody
    public String showMain(){
        return "반갑!";
    }

    @GetMapping("/home/main2")
    @ResponseBody
    public String showMain2(){return "반가웠습니다.";}
    @GetMapping("/home/main3")
    @ResponseBody
    public String showMain3(){return "즐거웠습니다.";}

    @GetMapping("/home/increase")
    @ResponseBody
    public String showIncrease(){
        increase++;
        return "응답 : " + increase;
    }
}
