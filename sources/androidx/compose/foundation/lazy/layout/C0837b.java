package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.C0826i;
import p003a2.C0015b;

/* renamed from: androidx.compose.foundation.lazy.layout.b */
public interface C0837b<T> {

    /* renamed from: androidx.compose.foundation.lazy.layout.b$a */
    public static final class C0838a<T> {

        /* renamed from: a */
        public final int f1793a;

        /* renamed from: b */
        public final int f1794b;

        /* renamed from: c */
        public final T f1795c;

        public C0838a(int i, int i2, C0826i iVar) {
            this.f1793a = i;
            this.f1794b = i2;
            this.f1795c = iVar;
            boolean z = true;
            if (i >= 0) {
                if (!(i2 <= 0 ? false : z)) {
                    throw new IllegalArgumentException(C0015b.m88g("size should be >0, but was ", i2).toString());
                }
                return;
            }
            throw new IllegalArgumentException(C0015b.m88g("startIndex should be >= 0, but was ", i).toString());
        }
    }

    /* renamed from: a */
    int mo4382a();

    C0838a<T> get(int i);
}
