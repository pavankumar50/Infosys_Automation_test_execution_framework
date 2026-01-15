package com.example.framework.controller;
import com.example.framework.model.TestCase;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/api/tests")
public class TestCaseController {
 private final List<TestCase> tests = new ArrayList<>();
 @PostMapping
 public TestCase add(@RequestBody TestCase t){ tests.add(t); return t; }
 @GetMapping
 public List<TestCase> all(){ return tests; }
}