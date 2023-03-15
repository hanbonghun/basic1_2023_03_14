package com.ll.basic1.boundedContext.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

public class MemberController {
    int success =0;
    int fail =0;
    @GetMapping("/member/login")
    @ResponseBody
    public Map login(@RequestParam String username, @RequestParam String password){
        Map result = new HashMap();
        if(username.equals("user1") && password.equals("1234")){
            result.put("resultCode","S-"+ (++success));
            result.put("msg", username + " 님 환영합니다.");
        }else{
            if(!username.equals("user1")){
                result.put("resultCode","F-"+ (++fail));
                result.put("msg", username + "(은)는 존재하지 않는 회원입니다.");
            }else{
                result.put("resultCode","F-"+ (++fail));
                result.put("msg", "비밀번호가 일치하지 않습니다.");
            }
        }
        return result;
    }
}
