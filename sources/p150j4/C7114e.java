package p150j4;

import android.support.p013v4.media.C0072d;
import java.security.MessageDigest;
import p036c5.C4413b;
import p150j4.C7111d;

/* renamed from: j4.e */
public final class C7114e implements C7109b {

    /* renamed from: b */
    public final C4413b f15820b = new C4413b();

    /* renamed from: b */
    public final void mo12991b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C4413b bVar = this.f15820b;
            if (i < bVar.f16745d) {
                C7111d dVar = (C7111d) bVar.mo19978h(i);
                Object n = this.f15820b.mo19980n(i);
                C7111d.C7113b<T> bVar2 = dVar.f15817b;
                if (dVar.f15819d == null) {
                    dVar.f15819d = dVar.f15818c.getBytes(C7109b.f15813a);
                }
                bVar2.mo17025a(dVar.f15819d, n, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final <T> T mo19443c(C7111d<T> dVar) {
        return this.f15820b.containsKey(dVar) ? this.f15820b.getOrDefault(dVar, null) : dVar.f15816a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7114e) {
            return this.f15820b.equals(((C7114e) obj).f15820b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15820b.hashCode();
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Options{values=");
        h.append(this.f15820b);
        h.append('}');
        return h.toString();
    }
}
