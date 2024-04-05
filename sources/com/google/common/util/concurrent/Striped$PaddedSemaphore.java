package com.google.common.util.concurrent;

import java.util.concurrent.Semaphore;

class Striped$PaddedSemaphore extends Semaphore {
    public long unused1;
    public long unused2;
    public long unused3;

    public Striped$PaddedSemaphore(int i) {
        super(i, false);
    }
}
