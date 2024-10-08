package com.sleepy.eschedule.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import com.sleepy.eschedule.entity.DayEventDows;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author generator@ZiyuZhou
 * @since 2024-10-08
 */
@RestController
@RequestMapping("/controller/day-eventws")
public class DayEventDowsController {

    @PostMapping("")
    public void create() {

    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id) {

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

    }

    @GetMapping("/{id}")
    public DayEventDows get(@PathVariable(value = "id") Long id) {
        return null;
    }

}
