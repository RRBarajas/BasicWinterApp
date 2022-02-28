package encora.newapplication.controller;

import encora.winterframework.annotation.RandomAnnotation;
import encora.winterframework.annotation.RequestMapping;

@RandomAnnotation
public class OtherController {

    @RequestMapping(method = "GET")
    public String getSomething() {
        return "";
    }
}
