package fr.cora.opale.export.cucumber;

import fr.cora.opale.export.JhipsterSampleApplication2App;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = JhipsterSampleApplication2App.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
