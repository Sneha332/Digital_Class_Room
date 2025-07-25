package com.teamgreen.apigateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public class AuthFilter implements GlobalFilter {

    private boolean isAuthTokenValid(ServerHttpRequest request) {
        if (!request.getHeaders().containsKey(HttpHeaders.AUTHORIZATION)) {
            System.out.print("Not key : ===================r : " + request.getURI().getPath());
            return false;
        }
        System.out.print("Contains key : ===================r : " + request.getURI().getPath());

        String token = request.getHeaders().getOrEmpty(HttpHeaders.AUTHORIZATION).get(0);
        System.out.print("Token key : ===================r : " + token);
        return true;
    }



    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.print("Heello world");

       org.springframework.http.server.reactive.ServerHttpRequest request =  exchange.getRequest();
        if (!isAuthTokenValid(request)) {
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }
}
