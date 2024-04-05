package androidx.datastore.preferences;

import android.support.p013v4.media.C0072d;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.C2548a0;
import androidx.datastore.preferences.protobuf.C2605l0;
import androidx.datastore.preferences.protobuf.C2624s0;
import androidx.datastore.preferences.protobuf.C2626t0;
import androidx.datastore.preferences.protobuf.C2630v0;
import androidx.datastore.preferences.protobuf.C2631w;
import androidx.datastore.preferences.protobuf.C2636w0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.datastore.preferences.e */
public final class C2501e extends GeneratedMessageLite<C2501e, C2502a> implements C2605l0 {
    /* access modifiers changed from: private */
    public static final C2501e DEFAULT_INSTANCE;
    private static volatile C2624s0<C2501e> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C2631w.C2635d<String> strings_ = C2630v0.f5970e;

    /* renamed from: androidx.datastore.preferences.e$a */
    public static final class C2502a extends GeneratedMessageLite.C2521a<C2501e, C2502a> implements C2605l0 {
        public C2502a() {
            super(C2501e.DEFAULT_INSTANCE);
        }
    }

    static {
        C2501e eVar = new C2501e();
        DEFAULT_INSTANCE = eVar;
        GeneratedMessageLite.m5607q(C2501e.class, eVar);
    }

    /* renamed from: s */
    public static void m5487s(C2501e eVar, Set set) {
        if (!eVar.strings_.mo9603h()) {
            C2631w.C2635d<String> dVar = eVar.strings_;
            int size = dVar.size();
            eVar.strings_ = dVar.mo9612i(size == 0 ? 10 : size * 2);
        }
        C2631w.C2635d<String> dVar2 = eVar.strings_;
        Charset charset = C2631w.f5973a;
        set.getClass();
        if (set instanceof C2548a0) {
            List<?> f = ((C2548a0) set).mo9547f();
            C2548a0 a0Var = (C2548a0) dVar2;
            int size2 = dVar2.size();
            for (Object next : f) {
                if (next == null) {
                    StringBuilder h = C0072d.m201h("Element at index ");
                    h.append(a0Var.size() - size2);
                    h.append(" is null.");
                    String sb = h.toString();
                    int size3 = a0Var.size();
                    while (true) {
                        size3--;
                        if (size3 >= size2) {
                            a0Var.remove(size3);
                        } else {
                            throw new NullPointerException(sb);
                        }
                    }
                } else if (next instanceof ByteString) {
                    a0Var.mo9546c0((ByteString) next);
                } else {
                    a0Var.add((String) next);
                }
            }
        } else if (set instanceof C2626t0) {
            dVar2.addAll(set);
        } else {
            if (dVar2 instanceof ArrayList) {
                ((ArrayList) dVar2).ensureCapacity(set.size() + dVar2.size());
            }
            int size4 = dVar2.size();
            for (Object next2 : set) {
                if (next2 == null) {
                    StringBuilder h2 = C0072d.m201h("Element at index ");
                    h2.append(dVar2.size() - size4);
                    h2.append(" is null.");
                    String sb2 = h2.toString();
                    int size5 = dVar2.size();
                    while (true) {
                        size5--;
                        if (size5 >= size4) {
                            dVar2.remove(size5);
                        } else {
                            throw new NullPointerException(sb2);
                        }
                    }
                } else {
                    dVar2.add(next2);
                }
            }
        }
    }

    /* renamed from: t */
    public static C2501e m5488t() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: v */
    public static C2502a m5489v() {
        C2501e eVar = DEFAULT_INSTANCE;
        eVar.getClass();
        return (C2502a) ((GeneratedMessageLite.C2521a) eVar.mo9344m(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    /* renamed from: m */
    public final Object mo9344m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C2491c.f5760a[methodToInvoke.ordinal()]) {
            case 1:
                return new C2501e();
            case 2:
                return new C2502a();
            case 3:
                return new C2636w0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C2624s0<C2501e> s0Var = PARSER;
                if (s0Var == null) {
                    synchronized (C2501e.class) {
                        s0Var = PARSER;
                        if (s0Var == null) {
                            s0Var = new GeneratedMessageLite.C2522b<>(DEFAULT_INSTANCE);
                            PARSER = s0Var;
                        }
                    }
                }
                return s0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: u */
    public final C2631w.C2635d mo9364u() {
        return this.strings_;
    }
}
