package com.client.ws.rasmooplus.controller;

import com.client.ws.rasmooplus.exception.NotFoundException;
import com.client.ws.rasmooplus.model.SubscriptionType;
import com.client.ws.rasmooplus.service.SubscriptionTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/subscription-type")
@RequiredArgsConstructor
public class SubscriptionTypeController {

    private final SubscriptionTypeService subscriptionTypeService;

    @GetMapping
    public ResponseEntity<List<SubscriptionType>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubscriptionType> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(subscriptionTypeService.findById(id));
    }
}

