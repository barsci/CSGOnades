package com.example.restapp.controller;

public class BattlegroundNotFoundException extends RuntimeException {

    public BattlegroundNotFoundException(String message) {
        super(message);
    }
}
