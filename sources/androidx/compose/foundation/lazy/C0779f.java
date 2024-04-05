package androidx.compose.foundation.lazy;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import java.util.NoSuchElementException;
import p219r.C7734e;

/* renamed from: androidx.compose.foundation.lazy.f */
public final class C0779f {

    /* renamed from: a */
    public final C7734e<C0780a> f1627a = new C7734e<>(new C0780a[16]);

    /* renamed from: androidx.compose.foundation.lazy.f$a */
    public static final class C0780a {

        /* renamed from: a */
        public final int f1628a;

        /* renamed from: b */
        public final int f1629b;

        public C0780a(int i, int i2) {
            this.f1628a = i;
            this.f1629b = i2;
            boolean z = true;
            if (i >= 0) {
                if (!(i2 < i ? false : z)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0780a)) {
                return false;
            }
            C0780a aVar = (C0780a) obj;
            return this.f1628a == aVar.f1628a && this.f1629b == aVar.f1629b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f1629b) + (Integer.hashCode(this.f1628a) * 31);
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Interval(start=");
            h.append(this.f1628a);
            h.append(", end=");
            return C0073e.m208h(h, this.f1629b, ')');
        }
    }

    /* renamed from: a */
    public final int mo4245a() {
        C7734e<C0780a> eVar = this.f1627a;
        if (!eVar.mo20239m()) {
            int i = 0;
            int i2 = ((C0780a) eVar.f17155b[0]).f1629b;
            C7734e<C0780a> eVar2 = this.f1627a;
            int i3 = eVar2.f17157d;
            if (i3 > 0) {
                T[] tArr = eVar2.f17155b;
                do {
                    int i4 = ((C0780a) tArr[i]).f1629b;
                    if (i4 > i2) {
                        i2 = i4;
                    }
                    i++;
                } while (i < i3);
            }
            return i2;
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    /* renamed from: b */
    public final int mo4246b() {
        C7734e<C0780a> eVar = this.f1627a;
        if (!eVar.mo20239m()) {
            boolean z = false;
            int i = ((C0780a) eVar.f17155b[0]).f1628a;
            C7734e<C0780a> eVar2 = this.f1627a;
            int i2 = eVar2.f17157d;
            if (i2 > 0) {
                T[] tArr = eVar2.f17155b;
                int i3 = 0;
                do {
                    int i4 = ((C0780a) tArr[i3]).f1628a;
                    if (i4 < i) {
                        i = i4;
                    }
                    i3++;
                } while (i3 < i2);
            }
            if (i >= 0) {
                z = true;
            }
            if (z) {
                return i;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }
}
