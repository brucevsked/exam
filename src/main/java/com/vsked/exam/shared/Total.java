package com.vsked.exam.shared;

public interface Total<T> extends Statistics<T> {
    T total(T object);
}
