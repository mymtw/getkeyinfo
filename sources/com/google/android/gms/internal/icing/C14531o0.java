package com.google.android.gms.internal.icing;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.icing.o0 */
public final class C14531o0 extends C14539q0 {

    /* renamed from: c */
    public static final Class<?> f32677c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* renamed from: a */
    public final void mo49856a(long j, C14491e0 e0Var) {
        Object obj;
        List list = (List) C14505h2.m23038l(j, e0Var);
        if (list instanceof C14527n0) {
            obj = ((C14527n0) list).zzi();
        } else if (!f32677c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C14508i1) || !(list instanceof C14511j0)) {
                obj = Collections.unmodifiableList(list);
            } else {
                C14511j0 j0Var = (C14511j0) list;
                if (j0Var.zza()) {
                    j0Var.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        C14505h2.m23039m(j, e0Var, obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.android.gms.internal.icing.m0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: com.google.android.gms.internal.icing.m0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: com.google.android.gms.internal.icing.m0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49857b(long r5, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            java.lang.Object r8 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r8)
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            java.lang.Object r1 = com.google.android.gms.internal.icing.C14505h2.m23038l(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r1 instanceof com.google.android.gms.internal.icing.C14527n0
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.internal.icing.m0 r1 = new com.google.android.gms.internal.icing.m0
            r1.<init>((int) r0)
            goto L_0x0035
        L_0x0020:
            boolean r2 = r1 instanceof com.google.android.gms.internal.icing.C14508i1
            if (r2 == 0) goto L_0x0030
            boolean r2 = r1 instanceof com.google.android.gms.internal.icing.C14511j0
            if (r2 == 0) goto L_0x0030
            com.google.android.gms.internal.icing.j0 r1 = (com.google.android.gms.internal.icing.C14511j0) r1
            com.google.android.gms.internal.icing.j0 r0 = r1.mo49798r(r0)
            r1 = r0
            goto L_0x0035
        L_0x0030:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0035:
            com.google.android.gms.internal.icing.C14505h2.m23039m(r5, r7, r1)
            goto L_0x008f
        L_0x0039:
            java.lang.Class<?> r2 = f32677c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            com.google.android.gms.internal.icing.C14505h2.m23039m(r5, r7, r2)
        L_0x0055:
            r1 = r2
            goto L_0x008f
        L_0x0057:
            boolean r2 = r1 instanceof com.google.android.gms.internal.icing.C14485c2
            if (r2 == 0) goto L_0x0072
            com.google.android.gms.internal.icing.m0 r2 = new com.google.android.gms.internal.icing.m0
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            com.google.android.gms.internal.icing.c2 r1 = (com.google.android.gms.internal.icing.C14485c2) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            com.google.android.gms.internal.icing.C14505h2.m23039m(r5, r7, r2)
            goto L_0x0055
        L_0x0072:
            boolean r2 = r1 instanceof com.google.android.gms.internal.icing.C14508i1
            if (r2 == 0) goto L_0x008f
            boolean r2 = r1 instanceof com.google.android.gms.internal.icing.C14511j0
            if (r2 == 0) goto L_0x008f
            r2 = r1
            com.google.android.gms.internal.icing.j0 r2 = (com.google.android.gms.internal.icing.C14511j0) r2
            boolean r3 = r2.zza()
            if (r3 != 0) goto L_0x008f
            int r1 = r1.size()
            int r1 = r1 + r0
            com.google.android.gms.internal.icing.j0 r1 = r2.mo49798r(r1)
            com.google.android.gms.internal.icing.C14505h2.m23039m(r5, r7, r1)
        L_0x008f:
            int r0 = r1.size()
            int r2 = r8.size()
            if (r0 <= 0) goto L_0x009e
            if (r2 <= 0) goto L_0x009e
            r1.addAll(r8)
        L_0x009e:
            if (r0 > 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r8 = r1
        L_0x00a2:
            com.google.android.gms.internal.icing.C14505h2.m23039m(r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.icing.C14531o0.mo49857b(long, java.lang.Object, java.lang.Object):void");
    }
}
