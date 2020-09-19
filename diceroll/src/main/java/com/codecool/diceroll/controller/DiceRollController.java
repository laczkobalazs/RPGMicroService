package com.codecool.diceroll.controller;

import com.codecool.diceroll.service.DiceRollService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/roll")
public class DiceRollController {

    @Autowired
    private DiceRollService service;

    public class Roll {
        private int result;
        private String dice;
        private String port;
    }

}
