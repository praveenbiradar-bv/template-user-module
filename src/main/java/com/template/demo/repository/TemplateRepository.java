package com.template.demo.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.template.demo.model.TemplateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TemplateRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public TemplateModel save(TemplateModel templateModel) {
        dynamoDBMapper.save(templateModel);
        return templateModel;
    }

    public TemplateModel findById(String id) {
        return dynamoDBMapper.load(TemplateModel.class, id);
    }

    public List<TemplateModel> findAll() {
        return dynamoDBMapper.scan(TemplateModel.class, new DynamoDBScanExpression());
    }

    public String delete(String id) {
        dynamoDBMapper.delete(id);
        return "Template deleted successfully";
    }
}
