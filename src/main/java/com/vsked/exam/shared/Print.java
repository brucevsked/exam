package com.vsked.exam.shared;

public interface Print<T> extends Output<T> {
    T print(T object);
}
