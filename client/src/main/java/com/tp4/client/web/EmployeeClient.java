package com.tp4.client.web;

import com.tp4.client.domain.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static java.util.Objects.requireNonNull;

@Configuration
public class EmployeeClient {

    private static final Logger log = LoggerFactory.getLogger(EmployeeClient.class);
    private final String SERVER_URL = "https://tp4-springboot-objectify.uc.r.appspot.com/employees";
    private final RestTemplate restTemplate;

    public EmployeeClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void getAll() {
        final List<Employee> responseEntity =
                restTemplate.getForObject(SERVER_URL, List.class);
        assert responseEntity != null;
        log.info(requireNonNull(responseEntity.toString()));
    }

    public void getOne(String uuid) {
        final Employee responseEntity =
                restTemplate.getForObject(String.format("%s/%s",SERVER_URL, uuid), Employee.class);
        assert responseEntity != null;
        log.info(requireNonNull(responseEntity.toString()));
    }
}
