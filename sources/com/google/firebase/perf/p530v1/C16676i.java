package com.google.firebase.perf.p530v1;

import com.google.protobuf.C16863a;
import com.google.protobuf.C16878d0;
import com.google.protobuf.C16909k0;
import com.google.protobuf.C16928r0;
import com.google.protobuf.C16934u0;
import com.google.protobuf.C16935v;
import com.google.protobuf.C16943v0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat$FieldType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.perf.v1.i */
public final class C16676i extends GeneratedMessageLite<C16676i, C16678b> implements C16909k0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    /* access modifiers changed from: private */
    public static final C16676i DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile C16928r0<C16676i> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite<String, Long> counters_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private long durationUs_;
    private boolean isAuto_;
    private String name_ = "";
    private C16935v.C16942f<C16672h> perfSessions_;
    private C16935v.C16942f<C16676i> subtraces_;

    /* renamed from: com.google.firebase.perf.v1.i$a */
    public static /* synthetic */ class C16677a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36882a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36882a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36882a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36882a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36882a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36882a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36882a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36882a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p530v1.C16676i.C16677a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.i$b */
    public static final class C16678b extends GeneratedMessageLite.C16838a<C16676i, C16678b> implements C16909k0 {
        public C16678b() {
            super(C16676i.DEFAULT_INSTANCE);
        }

        /* renamed from: w */
        public final void mo59422w(long j) {
            mo59761u();
            C16676i.m27633G((C16676i) this.f37158c, j);
        }

        /* renamed from: x */
        public final void mo59423x(long j) {
            mo59761u();
            C16676i.m27634H((C16676i) this.f37158c, j);
        }

        /* renamed from: y */
        public final void mo59424y(String str) {
            mo59761u();
            C16676i.m27638z((C16676i) this.f37158c, str);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.i$c */
    public static final class C16679c {

        /* renamed from: a */
        public static final C16878d0<String, Long> f36883a = new C16878d0<>(WireFormat$FieldType.STRING, WireFormat$FieldType.INT64, 0L);
    }

    /* renamed from: com.google.firebase.perf.v1.i$d */
    public static final class C16680d {

        /* renamed from: a */
        public static final C16878d0<String, String> f36884a;

        static {
            WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.STRING;
            f36884a = new C16878d0<>(wireFormat$FieldType, wireFormat$FieldType, "");
        }
    }

    static {
        C16676i iVar = new C16676i();
        DEFAULT_INSTANCE = iVar;
        GeneratedMessageLite.m27961x(C16676i.class, iVar);
    }

    public C16676i() {
        C16934u0<Object> u0Var = C16934u0.f37298e;
        this.subtraces_ = u0Var;
        this.perfSessions_ = u0Var;
    }

    /* renamed from: A */
    public static MapFieldLite m27627A(C16676i iVar) {
        if (!iVar.counters_.isMutable()) {
            iVar.counters_ = iVar.counters_.mutableCopy();
        }
        return iVar.counters_;
    }

    /* renamed from: B */
    public static void m27628B(C16676i iVar, C16676i iVar2) {
        iVar.getClass();
        iVar2.getClass();
        C16935v.C16942f<C16676i> fVar = iVar.subtraces_;
        if (!fVar.mo59865h()) {
            iVar.subtraces_ = GeneratedMessageLite.m27960w(fVar);
        }
        iVar.subtraces_.add(iVar2);
    }

    /* renamed from: C */
    public static void m27629C(C16676i iVar, ArrayList arrayList) {
        C16935v.C16942f<C16676i> fVar = iVar.subtraces_;
        if (!fVar.mo59865h()) {
            iVar.subtraces_ = GeneratedMessageLite.m27960w(fVar);
        }
        C16863a.m28025e(arrayList, iVar.subtraces_);
    }

    /* renamed from: D */
    public static MapFieldLite m27630D(C16676i iVar) {
        if (!iVar.customAttributes_.isMutable()) {
            iVar.customAttributes_ = iVar.customAttributes_.mutableCopy();
        }
        return iVar.customAttributes_;
    }

    /* renamed from: E */
    public static void m27631E(C16676i iVar, C16672h hVar) {
        iVar.getClass();
        hVar.getClass();
        C16935v.C16942f<C16672h> fVar = iVar.perfSessions_;
        if (!fVar.mo59865h()) {
            iVar.perfSessions_ = GeneratedMessageLite.m27960w(fVar);
        }
        iVar.perfSessions_.add(hVar);
    }

    /* renamed from: F */
    public static void m27632F(C16676i iVar, List list) {
        C16935v.C16942f<C16672h> fVar = iVar.perfSessions_;
        if (!fVar.mo59865h()) {
            iVar.perfSessions_ = GeneratedMessageLite.m27960w(fVar);
        }
        C16863a.m28025e(list, iVar.perfSessions_);
    }

    /* renamed from: G */
    public static void m27633G(C16676i iVar, long j) {
        iVar.bitField0_ |= 4;
        iVar.clientStartTimeUs_ = j;
    }

    /* renamed from: H */
    public static void m27634H(C16676i iVar, long j) {
        iVar.bitField0_ |= 8;
        iVar.durationUs_ = j;
    }

    /* renamed from: L */
    public static C16676i m27635L() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: R */
    public static C16678b m27636R() {
        return (C16678b) DEFAULT_INSTANCE.mo59755s();
    }

    /* renamed from: z */
    public static void m27638z(C16676i iVar, String str) {
        iVar.getClass();
        str.getClass();
        iVar.bitField0_ |= 1;
        iVar.name_ = str;
    }

    /* renamed from: I */
    public final int mo59414I() {
        return this.counters_.size();
    }

    /* renamed from: J */
    public final Map<String, Long> mo59415J() {
        return Collections.unmodifiableMap(this.counters_);
    }

    /* renamed from: K */
    public final Map<String, String> mo59416K() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    /* renamed from: M */
    public final long mo59417M() {
        return this.durationUs_;
    }

    /* renamed from: N */
    public final String mo59418N() {
        return this.name_;
    }

    /* renamed from: O */
    public final C16935v.C16942f mo59419O() {
        return this.perfSessions_;
    }

    /* renamed from: P */
    public final C16935v.C16942f mo59420P() {
        return this.subtraces_;
    }

    /* renamed from: Q */
    public final boolean mo59421Q() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: t */
    public final Object mo59389t(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        Class<C16676i> cls = C16676i.class;
        switch (C16677a.f36882a[methodToInvoke.ordinal()]) {
            case 1:
                return new C16676i();
            case 2:
                return new C16678b();
            case 3:
                return new C16943v0(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", C16679c.f36883a, "subtraces_", cls, "customAttributes_", C16680d.f36884a, "perfSessions_", C16672h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C16928r0<C16676i> r0Var = PARSER;
                if (r0Var == null) {
                    synchronized (cls) {
                        r0Var = PARSER;
                        if (r0Var == null) {
                            r0Var = new GeneratedMessageLite.C16839b<>(DEFAULT_INSTANCE);
                            PARSER = r0Var;
                        }
                    }
                }
                return r0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
