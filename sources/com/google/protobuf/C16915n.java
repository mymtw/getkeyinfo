package com.google.protobuf;

import androidx.core.internal.view.SupportMenu;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.protobuf.n */
public final class C16915n {

    /* renamed from: b */
    public static volatile C16915n f37269b;

    /* renamed from: c */
    public static final C16915n f37270c = new C16915n(0);

    /* renamed from: a */
    public final Map<C16916a, GeneratedMessageLite.C16842e<?, ?>> f37271a;

    /* renamed from: com.google.protobuf.n$a */
    public static final class C16916a {

        /* renamed from: a */
        public final Object f37272a;

        /* renamed from: b */
        public final int f37273b;

        public C16916a(Object obj, int i) {
            this.f37272a = obj;
            this.f37273b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C16916a)) {
                return false;
            }
            C16916a aVar = (C16916a) obj;
            return this.f37272a == aVar.f37272a && this.f37273b == aVar.f37273b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f37272a) * SupportMenu.USER_MASK) + this.f37273b;
        }
    }

    public C16915n() {
        this.f37271a = new HashMap();
    }

    /* renamed from: a */
    public static C16915n m28337a() {
        C16915n nVar = f37269b;
        if (nVar == null) {
            synchronized (C16915n.class) {
                nVar = f37269b;
                if (nVar == null) {
                    Class<?> cls = C16912m.f37249a;
                    C16915n nVar2 = null;
                    if (cls != null) {
                        try {
                            nVar2 = (C16915n) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (nVar2 == null) {
                        nVar2 = f37270c;
                    }
                    f37269b = nVar2;
                    nVar = nVar2;
                }
            }
        }
        return nVar;
    }

    public C16915n(int i) {
        this.f37271a = Collections.emptyMap();
    }
}
