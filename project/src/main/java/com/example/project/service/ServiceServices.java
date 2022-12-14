package com.example.project.service;

import com.example.project.entity.Services;
import com.example.project.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class ServiceServices implements ServiceRepository{

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public List<Services> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public List<Services> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Services> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Services> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Services entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Services> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Services> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Services> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Services> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Services> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Services> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Services> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Services getOne(Long aLong) {
        return null;
    }

    @Override
    public Services getById(Long aLong) {
        return null;
    }

    @Override
    public Services getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Services> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Services> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Services> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Services> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Services> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Services> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Services, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
