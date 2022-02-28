package encora.newapplication.controller;

import encora.winterframework.annotation.RESTController;
import encora.winterframework.annotation.RequestMapping;

@RESTController("person")
public class PersonController {

    @RequestMapping(method = "GET")
    public String getPerson() {
        return "getPerson() redirected";
    }
}
