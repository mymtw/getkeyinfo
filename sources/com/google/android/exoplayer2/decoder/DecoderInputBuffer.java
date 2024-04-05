package com.google.android.exoplayer2.decoder;

import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p619mh.C18219a;
import p619mh.C18220b;

public class DecoderInputBuffer extends C18219a {

    /* renamed from: c */
    public final C18220b f31492c = new C18220b();

    /* renamed from: d */
    public ByteBuffer f31493d;

    /* renamed from: e */
    public boolean f31494e;

    /* renamed from: f */
    public long f31495f;

    /* renamed from: g */
    public ByteBuffer f31496g;

    /* renamed from: h */
    public final int f31497h;

    /* renamed from: i */
    public final int f31498i;

    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InsufficientCapacityException(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 44
                r0.<init>(r1)
                java.lang.String r1 = "Buffer too small ("
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " < "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.currentCapacity = r3
                r2.requiredCapacity = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.decoder.DecoderInputBuffer.InsufficientCapacityException.<init>(int, int):void");
        }
    }

    public DecoderInputBuffer(int i) {
        this.f31497h = i;
        this.f31498i = 0;
    }

    /* renamed from: j */
    public void mo46795j() {
        this.f39937b = 0;
        ByteBuffer byteBuffer = this.f31493d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f31496g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f31494e = false;
    }

    /* renamed from: k */
    public final ByteBuffer mo47270k(int i) {
        int i2 = this.f31497h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f31493d;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @EnsuresNonNull({"data"})
    /* renamed from: l */
    public final void mo47271l(int i) {
        int i2 = i + this.f31498i;
        ByteBuffer byteBuffer = this.f31493d;
        if (byteBuffer == null) {
            this.f31493d = mo47270k(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.f31493d = byteBuffer;
            return;
        }
        ByteBuffer k = mo47270k(i3);
        k.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            k.put(byteBuffer);
        }
        this.f31493d = k;
    }

    /* renamed from: m */
    public final void mo47272m() {
        ByteBuffer byteBuffer = this.f31493d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f31496g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
