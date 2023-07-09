package com.geekster.ecommerceAPI.controller;

import com.geekster.ecommerceAPI.model.Address;
import com.geekster.ecommerceAPI.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("addresses")
    public String createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }
}
