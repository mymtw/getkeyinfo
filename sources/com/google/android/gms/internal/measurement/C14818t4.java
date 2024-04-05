package com.google.android.gms.internal.measurement;

import android.support.p013v4.media.C0070b;
import com.google.android.gms.internal.measurement.C14806s4;
import com.google.android.gms.internal.measurement.C14818t4;
import java.io.IOException;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.t4 */
public abstract class C14818t4<MessageType extends C14818t4<MessageType, BuilderType>, BuilderType extends C14806s4<MessageType, BuilderType>> implements C14796r6 {
    public int zzb = 0;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m23952g(java.lang.Iterable r6, com.google.android.gms.internal.measurement.C14891z5 r7) {
        /*
            java.nio.charset.Charset r0 = com.google.android.gms.internal.measurement.C14575a6.f32740a
            r6.getClass()
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.C14614d6
            java.lang.String r1 = " is null."
            java.lang.String r2 = "Element at index "
            r3 = 37
            if (r0 == 0) goto L_0x0061
            com.google.android.gms.internal.measurement.d6 r6 = (com.google.android.gms.internal.measurement.C14614d6) r6
            java.util.List r6 = r6.zzh()
            r0 = r7
            com.google.android.gms.internal.measurement.d6 r0 = (com.google.android.gms.internal.measurement.C14614d6) r0
            int r7 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0020:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00b9
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x0051
            int r6 = r0.size()
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0069a.m176g(r3, r2)
            int r6 = r6 - r7
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = r2.toString()
            int r1 = r0.size()
        L_0x0043:
            int r1 = r1 + -1
            if (r1 < r7) goto L_0x004b
            r0.remove(r1)
            goto L_0x0043
        L_0x004b:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x0051:
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zzix
            if (r5 == 0) goto L_0x005b
            com.google.android.gms.internal.measurement.zzix r4 = (com.google.android.gms.internal.measurement.zzix) r4
            r0.mo50423Q(r4)
            goto L_0x0020
        L_0x005b:
            java.lang.String r4 = (java.lang.String) r4
            r0.add(r4)
            goto L_0x0020
        L_0x0061:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.C14880y6
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x007c
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x007c
            r0 = r7
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r4 = r7.size()
            int r5 = r6.size()
            int r5 = r5 + r4
            r0.ensureCapacity(r5)
        L_0x007c:
            int r0 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0084:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00b9
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x00b5
            int r6 = r7.size()
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0069a.m176g(r3, r2)
            int r6 = r6 - r0
            r2.append(r6)
            r2.append(r1)
            java.lang.String r6 = r2.toString()
            int r1 = r7.size()
        L_0x00a7:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x00af
            r7.remove(r1)
            goto L_0x00a7
        L_0x00af:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x00b5:
            r7.add(r4)
            goto L_0x0084
        L_0x00b9:
            return
        L_0x00ba:
            r7.addAll(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C14818t4.m23952g(java.lang.Iterable, com.google.android.gms.internal.measurement.z5):void");
    }

    /* renamed from: a */
    public final zzix mo50825a() {
        try {
            C14819t5 t5Var = (C14819t5) this;
            int c = t5Var.mo50826c();
            zzix zzix = zzix.zzb;
            byte[] bArr = new byte[c];
            Logger logger = C14613d5.f32804b;
            C14600c5 c5Var = new C14600c5(bArr, c);
            C14602c7<?> a = C14892z6.f33192c.mo51009a(t5Var.getClass());
            C14626e5 e5Var = c5Var.f32806a;
            if (e5Var == null) {
                e5Var = new C14626e5(c5Var);
            }
            a.mo50441g(t5Var, e5Var);
            if (c - c5Var.f32787f == 0) {
                return new zziv(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(C0070b.m184f(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    /* renamed from: e */
    public int mo50866e() {
        throw null;
    }

    /* renamed from: h */
    public void mo50867h(int i) {
        throw null;
    }

    /* renamed from: i */
    public final byte[] mo50868i() {
        try {
            C14819t5 t5Var = (C14819t5) this;
            int c = t5Var.mo50826c();
            byte[] bArr = new byte[c];
            Logger logger = C14613d5.f32804b;
            C14600c5 c5Var = new C14600c5(bArr, c);
            C14602c7<?> a = C14892z6.f33192c.mo51009a(t5Var.getClass());
            C14626e5 e5Var = c5Var.f32806a;
            if (e5Var == null) {
                e5Var = new C14626e5(c5Var);
            }
            a.mo50441g(t5Var, e5Var);
            if (c - c5Var.f32787f == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException(C0070b.m184f(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
