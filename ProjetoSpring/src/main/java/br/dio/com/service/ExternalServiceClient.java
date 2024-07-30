package br.dio.com.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "externalServiceClient", url = "https://jsonplaceholder.typicode.com")
public interface ExternalServiceClient {

    @GetMapping("/posts")
    String getPosts();
}
