package com.bogusdetector.bogusdetector.steps;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import com.bogusdetector.bogusdetector.BogusDetectorApplication;


@CucumberContextConfiguration
@SpringBootTest(classes = BogusDetectorApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CucumberConfiguration {

}