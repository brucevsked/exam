package com.vsked.exam.shared;

public interface DeleteById<T> extends Input<T>{
    void deleteById(T object);
}
