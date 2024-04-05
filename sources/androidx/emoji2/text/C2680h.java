package androidx.emoji2.text;

import androidx.emoji2.text.flatbuffer.C2676a;
import androidx.emoji2.text.flatbuffer.C2677b;
import java.nio.ByteBuffer;

/* renamed from: androidx.emoji2.text.h */
public final class C2680h {

    /* renamed from: d */
    public static final ThreadLocal<C2676a> f6033d = new ThreadLocal<>();

    /* renamed from: a */
    public final int f6034a;

    /* renamed from: b */
    public final C2689l f6035b;

    /* renamed from: c */
    public volatile int f6036c = 0;

    public C2680h(C2689l lVar, int i) {
        this.f6035b = lVar;
        this.f6034a = i;
    }

    /* renamed from: a */
    public final int mo10074a(int i) {
        C2676a d = mo10077d();
        int a = d.mo10072a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = d.f6028b;
        int i2 = a + d.f6027a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* renamed from: b */
    public final int mo10075b() {
        C2676a d = mo10077d();
        int a = d.mo10072a(16);
        if (a == 0) {
            return 0;
        }
        int i = a + d.f6027a;
        return d.f6028b.getInt(d.f6028b.getInt(i) + i);
    }

    /* renamed from: c */
    public final int mo10076c() {
        C2676a d = mo10077d();
        int a = d.mo10072a(4);
        if (a != 0) {
            return d.f6028b.getInt(a + d.f6027a);
        }
        return 0;
    }

    /* renamed from: d */
    public final C2676a mo10077d() {
        ThreadLocal<C2676a> threadLocal = f6033d;
        C2676a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new C2676a();
            threadLocal.set(aVar);
        }
        C2677b bVar = this.f6035b.f6058a;
        int i = this.f6034a;
        int a = bVar.mo10072a(6);
        if (a != 0) {
            int i2 = a + bVar.f6027a;
            int i3 = (i * 4) + bVar.f6028b.getInt(i2) + i2 + 4;
            aVar.mo10073b(bVar.f6028b, bVar.f6028b.getInt(i3) + i3);
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(mo10076c()));
        sb.append(", codepoints:");
        int b = mo10075b();
        for (int i = 0; i < b; i++) {
            sb.append(Integer.toHexString(mo10074a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
