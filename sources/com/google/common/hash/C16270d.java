package com.google.common.hash;

import com.google.common.base.C15794l;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@CanIgnoreReturnValue
/* renamed from: com.google.common.hash.d */
public abstract class C16270d extends C16269c {

    /* renamed from: a */
    public final ByteBuffer f36376a;

    /* renamed from: b */
    public final int f36377b;

    /* renamed from: c */
    public final int f36378c;

    public C16270d(int i) {
        C15794l.m25613g(i % i == 0);
        this.f36376a = ByteBuffer.allocate(i + 7).order(ByteOrder.LITTLE_ENDIAN);
        this.f36377b = i;
        this.f36378c = i;
    }

    /* renamed from: e */
    public final C16272f mo57873e(int i, int i2, byte[] bArr) {
        mo57898p(ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN));
        return this;
    }

    /* renamed from: f */
    public final HashCode mo57800f() {
        mo57896l();
        this.f36376a.flip();
        if (this.f36376a.remaining() > 0) {
            mo57860o(this.f36376a);
            ByteBuffer byteBuffer = this.f36376a;
            byteBuffer.position(byteBuffer.limit());
        }
        return mo57858k();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public final C16272f mo57874g(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            mo57898p(byteBuffer);
            byteBuffer.order(order);
            return this;
        } catch (Throwable th) {
            byteBuffer.order(order);
            throw th;
        }
    }

    /* renamed from: j */
    public final C16272f mo57876j(char c) {
        this.f36376a.putChar(c);
        mo57897m();
        return this;
    }

    /* renamed from: k */
    public abstract HashCode mo57858k();

    /* renamed from: l */
    public final void mo57896l() {
        this.f36376a.flip();
        while (this.f36376a.remaining() >= this.f36378c) {
            mo57859n(this.f36376a);
        }
        this.f36376a.compact();
    }

    /* renamed from: m */
    public final void mo57897m() {
        if (this.f36376a.remaining() < 8) {
            mo57896l();
        }
    }

    /* renamed from: n */
    public abstract void mo57859n(ByteBuffer byteBuffer);

    /* renamed from: o */
    public abstract void mo57860o(ByteBuffer byteBuffer);

    /* renamed from: p */
    public final void mo57898p(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.f36376a.remaining()) {
            this.f36376a.put(byteBuffer);
            mo57897m();
            return;
        }
        int position = this.f36377b - this.f36376a.position();
        for (int i = 0; i < position; i++) {
            this.f36376a.put(byteBuffer.get());
        }
        mo57896l();
        while (byteBuffer.remaining() >= this.f36378c) {
            mo57859n(byteBuffer);
        }
        this.f36376a.put(byteBuffer);
    }

    /* renamed from: a */
    public final C16272f mo57870a(int i) {
        this.f36376a.putInt(i);
        mo57897m();
        return this;
    }

    /* renamed from: b */
    public final C16272f mo57871b(long j) {
        this.f36376a.putLong(j);
        mo57897m();
        return this;
    }
}
