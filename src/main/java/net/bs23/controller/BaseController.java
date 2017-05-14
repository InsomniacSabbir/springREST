package net.bs23.controller;

import net.bs23.model.BaseModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author Sabbir.
 * @since 5/14/17
 */
@RestController
//@Controller
@RequestMapping(value = "/")
public class BaseController {

    @RequestMapping(value = "/{name}")
    public @ResponseBody BaseModel test(@PathVariable String name) {
        String url = "http://api.aerisapi.com/places/comilla,bd?client_id=BO3Cu9jsUDSTBg85GYDLr&client_secret=PopFj1wIEbkrLtv9ADKpGwMs5uA01bq8Qt0z7qw6";
        RestTemplate template = new RestTemplate();

        BaseModel model = template.getForObject(url, BaseModel.class);

        return model;
    }
}
