package com.fasterxml.jackson.databind.util;

import android.support.p013v4.media.session.C0087d;

public abstract class PrimitiveArrayBuilder<T> {
    public static final int INITIAL_CHUNK_SIZE = 12;
    public static final int MAX_CHUNK_SIZE = 262144;
    public static final int SMALL_CHUNK_SIZE = 16384;
    public C12591a<T> _bufferHead;
    public C12591a<T> _bufferTail;
    public int _bufferedEntryCount;
    public T _freeBuffer;

    /* renamed from: com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder$a */
    public static final class C12591a<T> {

        /* renamed from: a */
        public final T f27786a;

        /* renamed from: b */
        public final int f27787b;

        /* renamed from: c */
        public C12591a<T> f27788c;

        public C12591a(T t, int i) {
            this.f27786a = t;
            this.f27787b = i;
        }
    }

    public abstract T _constructArray(int i);

    public void _reset() {
        C12591a<T> aVar = this._bufferTail;
        if (aVar != null) {
            this._freeBuffer = aVar.f27786a;
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    public final T appendCompletedChunk(T t, int i) {
        C12591a<T> aVar = new C12591a<>(t, i);
        if (this._bufferHead == null) {
            this._bufferTail = aVar;
            this._bufferHead = aVar;
        } else {
            C12591a<T> aVar2 = this._bufferTail;
            if (aVar2.f27788c == null) {
                aVar2.f27788c = aVar;
                this._bufferTail = aVar;
            } else {
                throw new IllegalStateException();
            }
        }
        this._bufferedEntryCount += i;
        return _constructArray(i < 16384 ? i + i : i + (i >> 2));
    }

    public int bufferedSize() {
        return this._bufferedEntryCount;
    }

    public T completeAndClearBuffer(T t, int i) {
        int i2 = this._bufferedEntryCount + i;
        T _constructArray = _constructArray(i2);
        int i3 = 0;
        for (C12591a<T> aVar = this._bufferHead; aVar != null; aVar = aVar.f27788c) {
            System.arraycopy(aVar.f27786a, 0, _constructArray, i3, aVar.f27787b);
            i3 += aVar.f27787b;
        }
        System.arraycopy(t, 0, _constructArray, i3, i);
        int i4 = i3 + i;
        if (i4 == i2) {
            return _constructArray;
        }
        throw new IllegalStateException(C0087d.m235e("Should have gotten ", i2, " entries, got ", i4));
    }

    public T resetAndStart() {
        _reset();
        T t = this._freeBuffer;
        return t == null ? _constructArray(12) : t;
    }
}
