package androidx.datastore.preferences.protobuf;

import androidx.core.internal.view.SupportMenu;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.o */
public final class C2611o {

    /* renamed from: b */
    public static volatile C2611o f5942b;

    /* renamed from: c */
    public static final C2611o f5943c = new C2611o(0);

    /* renamed from: a */
    public final Map<C2612a, GeneratedMessageLite.C2525e<?, ?>> f5944a;

    /* renamed from: androidx.datastore.preferences.protobuf.o$a */
    public static final class C2612a {

        /* renamed from: a */
        public final Object f5945a;

        /* renamed from: b */
        public final int f5946b;

        public C2612a(Object obj, int i) {
            this.f5945a = obj;
            this.f5946b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C2612a)) {
                return false;
            }
            C2612a aVar = (C2612a) obj;
            return this.f5945a == aVar.f5945a && this.f5946b == aVar.f5946b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f5945a) * SupportMenu.USER_MASK) + this.f5946b;
        }
    }

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
    }

    public C2611o() {
        this.f5944a = new HashMap();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|(3:9|10|11)|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0022 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.datastore.preferences.protobuf.C2611o m6212a() {
        /*
            androidx.datastore.preferences.protobuf.o r0 = f5942b
            if (r0 != 0) goto L_0x002b
            java.lang.Class<androidx.datastore.preferences.protobuf.o> r1 = androidx.datastore.preferences.protobuf.C2611o.class
            monitor-enter(r1)
            androidx.datastore.preferences.protobuf.o r0 = f5942b     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            java.lang.Class<?> r0 = androidx.datastore.preferences.protobuf.C2608n.f5921a     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0022
            java.lang.String r2 = "getEmptyRegistry"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0022 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r4)     // Catch:{ Exception -> 0x0022 }
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0022 }
            r3 = 0
            java.lang.Object r0 = r0.invoke(r3, r2)     // Catch:{ Exception -> 0x0022 }
            androidx.datastore.preferences.protobuf.o r0 = (androidx.datastore.preferences.protobuf.C2611o) r0     // Catch:{ Exception -> 0x0022 }
            goto L_0x0024
        L_0x0022:
            androidx.datastore.preferences.protobuf.o r0 = f5943c     // Catch:{ all -> 0x0028 }
        L_0x0024:
            f5942b = r0     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2611o.m6212a():androidx.datastore.preferences.protobuf.o");
    }

    public C2611o(int i) {
        this.f5944a = Collections.emptyMap();
    }
}
