package com.marcusvmleite.controller;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.ListTablesResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/general")
public class GeneralController {

    @Autowired
    private AmazonDynamoDB amazonDynamoDB;

    @GetMapping("list-tables")
    public ListTablesResult listTables() {
        return amazonDynamoDB.listTables();
    }

}
