package io.daocloud.dmp.skywalking.performance.service.c.feign;

import io.daocloud.dmp.skywalking.performance.service.c.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author jian.tan
 */

@FeignClient("service-b") /*调用service-b服务的接口*/
public interface ServiceClient {

    /*调用service-b服务的/service-b/users/{id}接口*/
    @GetMapping("/service-b/users/{id}")
    User findById(@PathVariable Long id);
}
