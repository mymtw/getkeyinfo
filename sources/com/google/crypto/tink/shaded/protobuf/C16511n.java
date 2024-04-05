package com.google.crypto.tink.shaded.protobuf;

import androidx.core.internal.view.SupportMenu;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.n */
public final class C16511n {

    /* renamed from: b */
    public static volatile C16511n f36673b;

    /* renamed from: c */
    public static final C16511n f36674c = new C16511n(0);

    /* renamed from: a */
    public final Map<C16512a, GeneratedMessageLite.C16435e<?, ?>> f36675a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.n$a */
    public static final class C16512a {

        /* renamed from: a */
        public final Object f36676a;

        /* renamed from: b */
        public final int f36677b;

        public C16512a(Object obj, int i) {
            this.f36676a = obj;
            this.f36677b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C16512a)) {
                return false;
            }
            C16512a aVar = (C16512a) obj;
            return this.f36676a == aVar.f36676a && this.f36677b == aVar.f36677b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f36676a) * SupportMenu.USER_MASK) + this.f36677b;
        }
    }

    public C16511n() {
        this.f36675a = new HashMap();
    }

    /* renamed from: a */
    public static C16511n m27170a() {
        C16511n nVar = f36673b;
        if (nVar == null) {
            synchronized (C16511n.class) {
                nVar = f36673b;
                if (nVar == null) {
                    Class<?> cls = C16509m.f36653a;
                    C16511n nVar2 = null;
                    if (cls != null) {
                        try {
                            nVar2 = (C16511n) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (nVar2 == null) {
                        nVar2 = f36674c;
                    }
                    f36673b = nVar2;
                    nVar = nVar2;
                }
            }
        }
        return nVar;
    }

    public C16511n(int i) {
        this.f36675a = Collections.emptyMap();
    }
}
