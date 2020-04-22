package com.vsked.exam.shared;

public interface Average<T> extends Statistics<T> {
    T average(T object);
}
