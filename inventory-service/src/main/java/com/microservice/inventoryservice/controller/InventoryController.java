package com.microservice.inventoryservice.controller;

import com.microservice.inventoryservice.service.InventoryService;
import com.microservice.inventoryservice.dto.InventoryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/inventory")
public class InventoryController {
    private final InventoryService inventoryService;

    @GetMapping("/{sku-code}")
    @ResponseStatus(HttpStatus.OK)
    public Boolean isInStock(@PathVariable("sku-code") String skuCode){
        return inventoryService.isInStock(skuCode);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createInventory(@RequestBody InventoryDto inventoryDto){
        inventoryService.createInventory(inventoryDto);
    }
}