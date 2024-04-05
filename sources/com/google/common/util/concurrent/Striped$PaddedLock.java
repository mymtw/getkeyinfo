package com.google.common.util.concurrent;

import java.util.concurrent.locks.ReentrantLock;

class Striped$PaddedLock extends ReentrantLock {
    public long unused1;
    public long unused2;
    public long unused3;

    public Striped$PaddedLock() {
        super(false);
    }
}
