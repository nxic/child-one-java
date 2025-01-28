package mn.nxic.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class WorldOneService {
    public String sayHello() {
        return "hello world from world 1";
    }
}
