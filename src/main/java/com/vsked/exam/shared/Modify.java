package com.vsked.exam.shared;

public interface Modify<T> extends Input<T> {
    void modify(T object);
}
