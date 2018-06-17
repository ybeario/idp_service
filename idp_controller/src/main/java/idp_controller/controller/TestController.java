package idp_controller.controller;


import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import client.api.si.TestService;
/** 
 * 测试用的 Controller 类； 
 */  
@Controller  
public class TestController {  
    @Autowired  
    TestService testService;  
    /** 
     * 测试 JSON 接口； 
     * @param name 名字； 
     * @return 
     */  
    @ResponseBody  
    @RequestMapping("/test/{name}")  
    public JSONObject testJson(@PathVariable("name") String name) {  
        JSONObject jsonObject = new JSONObject();  
        String testStr = testService.sayHello(name);  
        jsonObject.put("str", testStr);  
        return jsonObject;  
    }  
}  