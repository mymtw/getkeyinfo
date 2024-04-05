package com.google.protobuf;

import com.google.protobuf.C16935v;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.protobuf.a0 */
public abstract class C16865a0 {

    /* renamed from: a */
    public static final C16866a f37177a = new C16866a();

    /* renamed from: b */
    public static final C16867b f37178b = new C16867b();

    /* renamed from: com.google.protobuf.a0$a */
    public static final class C16866a extends C16865a0 {

        /* renamed from: c */
        public static final Class<?> f37179c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.y} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.y} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List m28034c(java.lang.Object r3, int r4, long r5) {
            /*
                java.lang.Object r0 = com.google.protobuf.C16889f1.m28157o(r5, r3)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002f
                boolean r1 = r0 instanceof com.google.protobuf.C16952z
                if (r1 == 0) goto L_0x0016
                com.google.protobuf.y r0 = new com.google.protobuf.y
                r0.<init>((int) r4)
                goto L_0x002b
            L_0x0016:
                boolean r1 = r0 instanceof com.google.protobuf.C16930s0
                if (r1 == 0) goto L_0x0026
                boolean r1 = r0 instanceof com.google.protobuf.C16935v.C16942f
                if (r1 == 0) goto L_0x0026
                com.google.protobuf.v$f r0 = (com.google.protobuf.C16935v.C16942f) r0
                com.google.protobuf.v$f r4 = r0.mo59843i(r4)
                r0 = r4
                goto L_0x002b
            L_0x0026:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r4)
            L_0x002b:
                com.google.protobuf.C16889f1.m28167y(r5, r3, r0)
                goto L_0x0081
            L_0x002f:
                java.lang.Class<?> r1 = f37179c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004d
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r4
                r1.<init>(r2)
                r1.addAll(r0)
                com.google.protobuf.C16889f1.m28167y(r5, r3, r1)
            L_0x004b:
                r0 = r1
                goto L_0x0081
            L_0x004d:
                boolean r1 = r0 instanceof com.google.protobuf.C16884e1
                if (r1 == 0) goto L_0x0064
                com.google.protobuf.y r1 = new com.google.protobuf.y
                int r2 = r0.size()
                int r2 = r2 + r4
                r1.<init>((int) r2)
                com.google.protobuf.e1 r0 = (com.google.protobuf.C16884e1) r0
                r1.addAll(r0)
                com.google.protobuf.C16889f1.m28167y(r5, r3, r1)
                goto L_0x004b
            L_0x0064:
                boolean r1 = r0 instanceof com.google.protobuf.C16930s0
                if (r1 == 0) goto L_0x0081
                boolean r1 = r0 instanceof com.google.protobuf.C16935v.C16942f
                if (r1 == 0) goto L_0x0081
                r1 = r0
                com.google.protobuf.v$f r1 = (com.google.protobuf.C16935v.C16942f) r1
                boolean r2 = r1.mo59865h()
                if (r2 != 0) goto L_0x0081
                int r0 = r0.size()
                int r0 = r0 + r4
                com.google.protobuf.v$f r0 = r1.mo59843i(r0)
                com.google.protobuf.C16889f1.m28167y(r5, r3, r0)
            L_0x0081:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C16865a0.C16866a.m28034c(java.lang.Object, int, long):java.util.List");
        }

        /* renamed from: a */
        public final void mo59829a(long j, Object obj) {
            Object obj2;
            List list = (List) C16889f1.m28157o(j, obj);
            if (list instanceof C16952z) {
                obj2 = ((C16952z) list).mo59887j();
            } else if (!f37179c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C16930s0) || !(list instanceof C16935v.C16942f)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C16935v.C16942f fVar = (C16935v.C16942f) list;
                    if (fVar.mo59865h()) {
                        fVar.mo59864d();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C16889f1.m28167y(j, obj, obj2);
        }

        /* renamed from: b */
        public final void mo59830b(long j, Object obj, Object obj2) {
            List list = (List) C16889f1.m28157o(j, obj2);
            List c = m28034c(obj, list.size(), j);
            int size = c.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                c.addAll(list);
            }
            if (size > 0) {
                list = c;
            }
            C16889f1.m28167y(j, obj, list);
        }
    }

    /* renamed from: com.google.protobuf.a0$b */
    public static final class C16867b extends C16865a0 {
        /* renamed from: a */
        public final void mo59829a(long j, Object obj) {
            ((C16935v.C16942f) C16889f1.m28157o(j, obj)).mo59864d();
        }

        /* renamed from: b */
        public final void mo59830b(long j, Object obj, Object obj2) {
            C16935v.C16942f fVar = (C16935v.C16942f) C16889f1.m28157o(j, obj);
            C16935v.C16942f fVar2 = (C16935v.C16942f) C16889f1.m28157o(j, obj2);
            int size = fVar.size();
            int size2 = fVar2.size();
            if (size > 0 && size2 > 0) {
                if (!fVar.mo59865h()) {
                    fVar = fVar.mo59843i(size2 + size);
                }
                fVar.addAll(fVar2);
            }
            if (size > 0) {
                fVar2 = fVar;
            }
            C16889f1.m28167y(j, obj, fVar2);
        }
    }

    /* renamed from: a */
    public abstract void mo59829a(long j, Object obj);

    /* renamed from: b */
    public abstract void mo59830b(long j, Object obj, Object obj2);
}
