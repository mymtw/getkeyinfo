package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2631w;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.b0 */
public abstract class C2551b0 {

    /* renamed from: a */
    public static final C2552a f5816a = new C2552a();

    /* renamed from: b */
    public static final C2553b f5817b = new C2553b();

    /* renamed from: androidx.datastore.preferences.protobuf.b0$a */
    public static final class C2552a extends C2551b0 {

        /* renamed from: c */
        public static final Class<?> f5818c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.datastore.preferences.protobuf.z} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: androidx.datastore.preferences.protobuf.z} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: androidx.datastore.preferences.protobuf.z} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List m5685d(java.lang.Object r3, int r4, long r5) {
            /*
                java.lang.Object r0 = androidx.datastore.preferences.protobuf.C2586h1.m5836o(r5, r3)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002f
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C2548a0
                if (r1 == 0) goto L_0x0016
                androidx.datastore.preferences.protobuf.z r0 = new androidx.datastore.preferences.protobuf.z
                r0.<init>((int) r4)
                goto L_0x002b
            L_0x0016:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C2626t0
                if (r1 == 0) goto L_0x0026
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C2631w.C2635d
                if (r1 == 0) goto L_0x0026
                androidx.datastore.preferences.protobuf.w$d r0 = (androidx.datastore.preferences.protobuf.C2631w.C2635d) r0
                androidx.datastore.preferences.protobuf.w$d r4 = r0.mo9612i(r4)
                r0 = r4
                goto L_0x002b
            L_0x0026:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r4)
            L_0x002b:
                androidx.datastore.preferences.protobuf.C2586h1.m5846y(r5, r3, r0)
                goto L_0x0081
            L_0x002f:
                java.lang.Class<?> r1 = f5818c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004d
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r4
                r1.<init>(r2)
                r1.addAll(r0)
                androidx.datastore.preferences.protobuf.C2586h1.m5846y(r5, r3, r1)
            L_0x004b:
                r0 = r1
                goto L_0x0081
            L_0x004d:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C2581g1
                if (r1 == 0) goto L_0x0064
                androidx.datastore.preferences.protobuf.z r1 = new androidx.datastore.preferences.protobuf.z
                int r2 = r0.size()
                int r2 = r2 + r4
                r1.<init>((int) r2)
                androidx.datastore.preferences.protobuf.g1 r0 = (androidx.datastore.preferences.protobuf.C2581g1) r0
                r1.addAll(r0)
                androidx.datastore.preferences.protobuf.C2586h1.m5846y(r5, r3, r1)
                goto L_0x004b
            L_0x0064:
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C2626t0
                if (r1 == 0) goto L_0x0081
                boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C2631w.C2635d
                if (r1 == 0) goto L_0x0081
                r1 = r0
                androidx.datastore.preferences.protobuf.w$d r1 = (androidx.datastore.preferences.protobuf.C2631w.C2635d) r1
                boolean r2 = r1.mo9603h()
                if (r2 != 0) goto L_0x0081
                int r0 = r0.size()
                int r0 = r0 + r4
                androidx.datastore.preferences.protobuf.w$d r0 = r1.mo9612i(r0)
                androidx.datastore.preferences.protobuf.C2586h1.m5846y(r5, r3, r0)
            L_0x0081:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2551b0.C2552a.m5685d(java.lang.Object, int, long):java.util.List");
        }

        /* renamed from: a */
        public final void mo9552a(long j, Object obj) {
            Object obj2;
            List list = (List) C2586h1.m5836o(j, obj);
            if (list instanceof C2548a0) {
                obj2 = ((C2548a0) list).mo9548j();
            } else if (!f5818c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C2626t0) || !(list instanceof C2631w.C2635d)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C2631w.C2635d dVar = (C2631w.C2635d) list;
                    if (dVar.mo9603h()) {
                        dVar.mo9601d();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C2586h1.m5846y(j, obj, obj2);
        }

        /* renamed from: b */
        public final void mo9553b(long j, Object obj, Object obj2) {
            List list = (List) C2586h1.m5836o(j, obj2);
            List d = m5685d(obj, list.size(), j);
            int size = d.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d.addAll(list);
            }
            if (size > 0) {
                list = d;
            }
            C2586h1.m5846y(j, obj, list);
        }

        /* renamed from: c */
        public final List mo9554c(long j, Object obj) {
            return m5685d(obj, 10, j);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b0$b */
    public static final class C2553b extends C2551b0 {
        /* renamed from: a */
        public final void mo9552a(long j, Object obj) {
            ((C2631w.C2635d) C2586h1.m5836o(j, obj)).mo9601d();
        }

        /* renamed from: b */
        public final void mo9553b(long j, Object obj, Object obj2) {
            C2631w.C2635d dVar = (C2631w.C2635d) C2586h1.m5836o(j, obj);
            C2631w.C2635d dVar2 = (C2631w.C2635d) C2586h1.m5836o(j, obj2);
            int size = dVar.size();
            int size2 = dVar2.size();
            if (size > 0 && size2 > 0) {
                if (!dVar.mo9603h()) {
                    dVar = dVar.mo9612i(size2 + size);
                }
                dVar.addAll(dVar2);
            }
            if (size > 0) {
                dVar2 = dVar;
            }
            C2586h1.m5846y(j, obj, dVar2);
        }

        /* renamed from: c */
        public final List mo9554c(long j, Object obj) {
            C2631w.C2635d dVar = (C2631w.C2635d) C2586h1.m5836o(j, obj);
            if (dVar.mo9603h()) {
                return dVar;
            }
            int size = dVar.size();
            C2631w.C2635d i = dVar.mo9612i(size == 0 ? 10 : size * 2);
            C2586h1.m5846y(j, obj, i);
            return i;
        }
    }

    /* renamed from: a */
    public abstract void mo9552a(long j, Object obj);

    /* renamed from: b */
    public abstract void mo9553b(long j, Object obj, Object obj2);

    /* renamed from: c */
    public abstract List mo9554c(long j, Object obj);
}
