package com.geekster.ecommerceAPI.service;

import com.geekster.ecommerceAPI.model.Address;
import com.geekster.ecommerceAPI.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;

    public String createAddress(Address address) {
        addressRepo.save(address);
        return "Address Added successfully!!!";
    }
}
