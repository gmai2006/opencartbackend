package com.opencart.dao;

public interface GenericDao {
    <E> E create(E e);
    <E> E update(E e);
}
