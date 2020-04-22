package com.vsked.exam.shared;

public interface QueryById<T> extends Output<T> {
    T queryById(T object);
}
