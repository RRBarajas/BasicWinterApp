package encora.newapplication.controller;

import encora.newapplication.service.JobService;
import encora.winterframework.annotation.Autowired;
import encora.winterframework.annotation.PathParam;
import encora.winterframework.annotation.RESTController;
import encora.winterframework.annotation.RandomAnnotation;
import encora.winterframework.annotation.RequestMapping;

@RESTController("job")
public class JobController {

    @Autowired
    private JobService service;

    @RequestMapping(method = "GET")
    public String getJob() {
        String randomString = service.getRandomString();
        return "getJob() redirected " + randomString;
    }

    @RequestMapping(method = "POST")
    public String postJob() {
        return "postJob() redirected";
    }

    // It doesn't work since we're not doing anything to map the path param
    @RequestMapping(method = "GET", path = "/{job}/manager")
    public String getJobManager(@PathParam String job) {
        return "getJobManager() redirected";
    }

    @RandomAnnotation
    public String otherMethod() {
        return "I shouldn't be parsed";
    }
}
