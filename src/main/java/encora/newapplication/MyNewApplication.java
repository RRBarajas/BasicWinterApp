package encora.newapplication;

import java.io.IOException;

import encora.winterframework.annotation.WinterBootApplication;
import encora.winterframework.server.WinterServer;

@WinterBootApplication(packages = {"encora.newapplication"})
public class MyNewApplication {

    public static void main(String[] args) throws IOException {
        WinterServer.run(MyNewApplication.class, args);
    }
}
