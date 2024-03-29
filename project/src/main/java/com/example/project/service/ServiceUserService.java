package com.example.project.service;

import com.example.project.entity.UserServices;
import com.example.project.repository.UserServiceRepository;
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
public class ServiceUserService implements UserServiceRepository{

    @Autowired
    private UserServiceRepository userServiceRepository;

    @Override
    public List<UserServices> findAll() {
        return userServiceRepository.findAll();
    }

    @Override
    public List<UserServices> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<UserServices> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<UserServices> findAllById(Iterable<Long> longs) {
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
    public void delete(UserServices entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserServices> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends UserServices> S save(S entity) {
        return userServiceRepository.save(entity);
    }

    @Override
    public <S extends UserServices> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UserServices> findById(Long aLong) {
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
    public <S extends UserServices> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends UserServices> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<UserServices> entities) {
        UserServiceRepository.super.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<UserServices> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UserServices getOne(Long aLong) {
        return null;
    }

    @Override
    public UserServices getById(Long aLong) {
        return null;
    }

    @Override
    public UserServices getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends UserServices> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UserServices> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends UserServices> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends UserServices> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UserServices> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UserServices> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends UserServices, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public Optional<UserServices> findByServiceIdAndUserId(Long service_id, String user_id) {
        return userServiceRepository.findByServiceIdAndUserId(service_id, user_id);
    }
}
