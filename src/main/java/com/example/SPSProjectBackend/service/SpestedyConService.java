package com.example.SPSProjectBackend.service;

import com.example.SPSProjectBackend.model.SpestedyCon;
import com.example.SPSProjectBackend.repository.SpestedyConRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpestedyConService {

    private final SpestedyConRepository repository;

    @Autowired
    public SpestedyConService(SpestedyConRepository repository) {
        this.repository = repository;
    }

    public List<SpestedyCon> getAll() {
        return repository.findAll();
    }

    public List<SpestedyCon> getByDeptId(String deptId) {
        return repository.findByIdDeptId(deptId);
    }

    public List<Object[]> getByAllocatedTo(String allocatedTo) {
        return repository.findWestimateNoAndDescriptionByAllocatedTo(allocatedTo);
    }

    // public List<Object[]> getByReferenceNo(String allocatedTo, String referenceNo) {
    //     return repository.findByReferenceNo(allocatedTo, referenceNo);
    // }
}
