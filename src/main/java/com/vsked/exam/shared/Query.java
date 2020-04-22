package com.vsked.exam.shared;

public interface Query<T> extends Output<T> {
    T query(T object);
}
