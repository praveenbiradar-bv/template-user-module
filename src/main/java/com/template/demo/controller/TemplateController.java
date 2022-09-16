package com.template.demo.controller;

import com.template.demo.model.TemplateModel;
import com.template.demo.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TemplateController {

    @Autowired
    private TemplateRepository templateRepository;

    @GetMapping("/saveTemplate")
    public TemplateModel saveTemplate(@RequestBody TemplateModel model) {
        return templateRepository.save(model);
    }

}
