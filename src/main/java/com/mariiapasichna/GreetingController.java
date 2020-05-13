package com.mariiapasichna;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping
    public String text(
            @RequestParam(name = "title", required = false, defaultValue = "Title") String title,
            @RequestParam(name = "text", required = false, defaultValue = "Empty body") String text,
            Map<String, Object> model
    ) {
        model.put("title", title);
        model.put("text", text);
        return "text";
    }
}