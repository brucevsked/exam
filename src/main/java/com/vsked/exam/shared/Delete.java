package com.vsked.exam.shared;

public interface Delete<T> extends Input<T>{
    void delete(T object);
}
