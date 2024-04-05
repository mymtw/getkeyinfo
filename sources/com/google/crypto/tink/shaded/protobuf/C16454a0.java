package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C16531v;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a0 */
public abstract class C16454a0 {

    /* renamed from: a */
    public static final C16455a f36556a = new C16455a();

    /* renamed from: b */
    public static final C16456b f36557b = new C16456b();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$a */
    public static final class C16455a extends C16454a0 {

        /* renamed from: c */
        public static final Class<?> f36558c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.crypto.tink.shaded.protobuf.y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.crypto.tink.shaded.protobuf.y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.crypto.tink.shaded.protobuf.y} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List m26702d(java.lang.Object r3, int r4, long r5) {
            /*
                java.lang.Object r0 = com.google.crypto.tink.shaded.protobuf.C16488g1.m26849o(r5, r3)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002f
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.C16545z
                if (r1 == 0) goto L_0x0016
                com.google.crypto.tink.shaded.protobuf.y r0 = new com.google.crypto.tink.shaded.protobuf.y
                r0.<init>((int) r4)
                goto L_0x002b
            L_0x0016:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.C16526s0
                if (r1 == 0) goto L_0x0026
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.C16531v.C16535d
                if (r1 == 0) goto L_0x0026
                com.google.crypto.tink.shaded.protobuf.v$d r0 = (com.google.crypto.tink.shaded.protobuf.C16531v.C16535d) r0
                com.google.crypto.tink.shaded.protobuf.v$d r4 = r0.mo58661i(r4)
                r0 = r4
                goto L_0x002b
            L_0x0026:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r4)
            L_0x002b:
                com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r5, r3, r0)
                goto L_0x0081
            L_0x002f:
                java.lang.Class<?> r1 = f36558c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004d
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r4
                r1.<init>(r2)
                r1.addAll(r0)
                com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r5, r3, r1)
            L_0x004b:
                r0 = r1
                goto L_0x0081
            L_0x004d:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.C16483f1
                if (r1 == 0) goto L_0x0064
                com.google.crypto.tink.shaded.protobuf.y r1 = new com.google.crypto.tink.shaded.protobuf.y
                int r2 = r0.size()
                int r2 = r2 + r4
                r1.<init>((int) r2)
                com.google.crypto.tink.shaded.protobuf.f1 r0 = (com.google.crypto.tink.shaded.protobuf.C16483f1) r0
                r1.addAll(r0)
                com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r5, r3, r1)
                goto L_0x004b
            L_0x0064:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.C16526s0
                if (r1 == 0) goto L_0x0081
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.C16531v.C16535d
                if (r1 == 0) goto L_0x0081
                r1 = r0
                com.google.crypto.tink.shaded.protobuf.v$d r1 = (com.google.crypto.tink.shaded.protobuf.C16531v.C16535d) r1
                boolean r2 = r1.mo58674h()
                if (r2 != 0) goto L_0x0081
                int r0 = r0.size()
                int r0 = r0 + r4
                com.google.crypto.tink.shaded.protobuf.v$d r0 = r1.mo58661i(r0)
                com.google.crypto.tink.shaded.protobuf.C16488g1.m26859y(r5, r3, r0)
            L_0x0081:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C16454a0.C16455a.m26702d(java.lang.Object, int, long):java.util.List");
        }

        /* renamed from: a */
        public final void mo58607a(long j, Object obj) {
            Object obj2;
            List list = (List) C16488g1.m26849o(j, obj);
            if (list instanceof C16545z) {
                obj2 = ((C16545z) list).mo58722j();
            } else if (!f36558c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C16526s0) || !(list instanceof C16531v.C16535d)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C16531v.C16535d dVar = (C16531v.C16535d) list;
                    if (dVar.mo58674h()) {
                        dVar.mo58673d();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C16488g1.m26859y(j, obj, obj2);
        }

        /* renamed from: b */
        public final void mo58608b(long j, Object obj, Object obj2) {
            List list = (List) C16488g1.m26849o(j, obj2);
            List d = m26702d(obj, list.size(), j);
            int size = d.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d.addAll(list);
            }
            if (size > 0) {
                list = d;
            }
            C16488g1.m26859y(j, obj, list);
        }

        /* renamed from: c */
        public final List mo58609c(long j, Object obj) {
            return m26702d(obj, 10, j);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a0$b */
    public static final class C16456b extends C16454a0 {
        /* renamed from: a */
        public final void mo58607a(long j, Object obj) {
            ((C16531v.C16535d) C16488g1.m26849o(j, obj)).mo58673d();
        }

        /* renamed from: b */
        public final void mo58608b(long j, Object obj, Object obj2) {
            C16531v.C16535d dVar = (C16531v.C16535d) C16488g1.m26849o(j, obj);
            C16531v.C16535d dVar2 = (C16531v.C16535d) C16488g1.m26849o(j, obj2);
            int size = dVar.size();
            int size2 = dVar2.size();
            if (size > 0 && size2 > 0) {
                if (!dVar.mo58674h()) {
                    dVar = dVar.mo58661i(size2 + size);
                }
                dVar.addAll(dVar2);
            }
            if (size > 0) {
                dVar2 = dVar;
            }
            C16488g1.m26859y(j, obj, dVar2);
        }

        /* renamed from: c */
        public final List mo58609c(long j, Object obj) {
            C16531v.C16535d dVar = (C16531v.C16535d) C16488g1.m26849o(j, obj);
            if (dVar.mo58674h()) {
                return dVar;
            }
            int size = dVar.size();
            C16531v.C16535d i = dVar.mo58661i(size == 0 ? 10 : size * 2);
            C16488g1.m26859y(j, obj, i);
            return i;
        }
    }

    /* renamed from: a */
    public abstract void mo58607a(long j, Object obj);

    /* renamed from: b */
    public abstract void mo58608b(long j, Object obj, Object obj2);

    /* renamed from: c */
    public abstract List mo58609c(long j, Object obj);
}
