package io.daocloud.dmp.skywalking.performance.service.c;

import io.daocloud.dmp.skywalking.performance.service.c.feign.ServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/service-c")
@RestController
public class ServiceCRestController {
    private final static Logger LOGGER = LoggerFactory.getLogger(ServiceCRestController.class);

    @Autowired
    private ServiceClient serviceClient;

/*    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        User user = this.restTemplate.getForObject("http://service-b/service-b/users/{id}", User.class, id);
        LOGGER.debug("request: {}", user.getName());
        return user;
    }*/

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Long id) {
        User user = serviceClient.findById(id);
        return user;
    }
}
