package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.C2573e0;
import androidx.datastore.preferences.protobuf.C2592i;
import androidx.datastore.preferences.protobuf.C2602k0;
import androidx.datastore.preferences.protobuf.C2605l0;
import androidx.datastore.preferences.protobuf.C2611o;
import androidx.datastore.preferences.protobuf.C2624s0;
import androidx.datastore.preferences.protobuf.C2636w0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.WireFormat$FieldType;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.d */
public final class C2498d extends GeneratedMessageLite<C2498d, C2499a> implements C2605l0 {
    /* access modifiers changed from: private */
    public static final C2498d DEFAULT_INSTANCE;
    private static volatile C2624s0<C2498d> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private MapFieldLite<String, PreferencesProto$Value> preferences_ = MapFieldLite.emptyMapField();

    /* renamed from: androidx.datastore.preferences.d$a */
    public static final class C2499a extends GeneratedMessageLite.C2521a<C2498d, C2499a> implements C2605l0 {
        public C2499a() {
            super(C2498d.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: androidx.datastore.preferences.d$b */
    public static final class C2500b {

        /* renamed from: a */
        public static final C2573e0<String, PreferencesProto$Value> f5767a = new C2573e0<>(WireFormat$FieldType.STRING, WireFormat$FieldType.MESSAGE, PreferencesProto$Value.m5448A());
    }

    static {
        C2498d dVar = new C2498d();
        DEFAULT_INSTANCE = dVar;
        GeneratedMessageLite.m5607q(C2498d.class, dVar);
    }

    /* renamed from: s */
    public static MapFieldLite m5481s(C2498d dVar) {
        if (!dVar.preferences_.isMutable()) {
            dVar.preferences_ = dVar.preferences_.mutableCopy();
        }
        return dVar.preferences_;
    }

    /* renamed from: u */
    public static C2499a m5482u() {
        C2498d dVar = DEFAULT_INSTANCE;
        dVar.getClass();
        return (C2499a) ((GeneratedMessageLite.C2521a) dVar.mo9344m(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    /* renamed from: v */
    public static C2498d m5483v(FileInputStream fileInputStream) throws IOException {
        GeneratedMessageLite p = GeneratedMessageLite.m5606p(DEFAULT_INSTANCE, new C2592i.C2594b(fileInputStream), C2611o.m6212a());
        if (p.mo9465f()) {
            return (C2498d) p;
        }
        throw new UninitializedMessageException((C2602k0) p).asInvalidProtocolBufferException().setUnfinishedMessage(p);
    }

    /* renamed from: m */
    public final Object mo9344m(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C2491c.f5760a[methodToInvoke.ordinal()]) {
            case 1:
                return new C2498d();
            case 2:
                return new C2499a();
            case 3:
                return new C2636w0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", C2500b.f5767a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C2624s0<C2498d> s0Var = PARSER;
                if (s0Var == null) {
                    synchronized (C2498d.class) {
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

    /* renamed from: t */
    public final Map<String, PreferencesProto$Value> mo9363t() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
