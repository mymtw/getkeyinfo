package com.google.common.hash;

import java.io.Serializable;

public interface Funnel<T> extends Serializable {
    void funnel(T t, C16276j jVar);
}
