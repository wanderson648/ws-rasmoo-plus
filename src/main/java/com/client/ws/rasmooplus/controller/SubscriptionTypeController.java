package com.client.ws.rasmooplus.controller;

import com.client.ws.rasmooplus.model.SubscriptionType;
import com.client.ws.rasmooplus.repository.SubscriptionTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subscription-type")
@RequiredArgsConstructor
public class SubscriptionTypeController {

    private final SubscriptionTypeRepository subscriptionTypeRepository;

    @GetMapping
    public ResponseEntity<List<SubscriptionType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeRepository.findAll());
    }
}
