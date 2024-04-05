package com.google.firebase.perf.p530v1;

import com.google.protobuf.C16909k0;
import com.google.protobuf.C16928r0;
import com.google.protobuf.C16934u0;
import com.google.protobuf.C16935v;
import com.google.protobuf.C16943v0;
import com.google.protobuf.GeneratedMessageLite;

/* renamed from: com.google.firebase.perf.v1.f */
public final class C16666f extends GeneratedMessageLite<C16666f, C16668b> implements C16909k0 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    /* access modifiers changed from: private */
    public static final C16666f DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile C16928r0<C16666f> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private C16935v.C16942f<C16653b> androidMemoryReadings_;
    private int bitField0_;
    private C16935v.C16942f<C16660d> cpuMetricReadings_;
    private C16663e gaugeMetadata_;
    private String sessionId_ = "";

    /* renamed from: com.google.firebase.perf.v1.f$a */
    public static /* synthetic */ class C16667a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36879a;

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
                f36879a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36879a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36879a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36879a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36879a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36879a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36879a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p530v1.C16666f.C16667a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.f$b */
    public static final class C16668b extends GeneratedMessageLite.C16838a<C16666f, C16668b> implements C16909k0 {
        public C16668b() {
            super(C16666f.DEFAULT_INSTANCE);
        }
    }

    static {
        C16666f fVar = new C16666f();
        DEFAULT_INSTANCE = fVar;
        GeneratedMessageLite.m27961x(C16666f.class, fVar);
    }

    public C16666f() {
        C16934u0<Object> u0Var = C16934u0.f37298e;
        this.cpuMetricReadings_ = u0Var;
        this.androidMemoryReadings_ = u0Var;
    }

    /* renamed from: A */
    public static void m27585A(C16666f fVar, C16653b bVar) {
        fVar.getClass();
        bVar.getClass();
        C16935v.C16942f<C16653b> fVar2 = fVar.androidMemoryReadings_;
        if (!fVar2.mo59865h()) {
            fVar.androidMemoryReadings_ = GeneratedMessageLite.m27960w(fVar2);
        }
        fVar.androidMemoryReadings_.add(bVar);
    }

    /* renamed from: B */
    public static void m27586B(C16666f fVar, C16663e eVar) {
        fVar.getClass();
        eVar.getClass();
        fVar.gaugeMetadata_ = eVar;
        fVar.bitField0_ |= 2;
    }

    /* renamed from: C */
    public static void m27587C(C16666f fVar, C16660d dVar) {
        fVar.getClass();
        dVar.getClass();
        C16935v.C16942f<C16660d> fVar2 = fVar.cpuMetricReadings_;
        if (!fVar2.mo59865h()) {
            fVar.cpuMetricReadings_ = GeneratedMessageLite.m27960w(fVar2);
        }
        fVar.cpuMetricReadings_.add(dVar);
    }

    /* renamed from: F */
    public static C16666f m27588F() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public static C16668b m27589J() {
        return (C16668b) DEFAULT_INSTANCE.mo59755s();
    }

    /* renamed from: z */
    public static void m27591z(C16666f fVar, String str) {
        fVar.getClass();
        str.getClass();
        fVar.bitField0_ |= 1;
        fVar.sessionId_ = str;
    }

    /* renamed from: D */
    public final int mo59398D() {
        return this.androidMemoryReadings_.size();
    }

    /* renamed from: E */
    public final int mo59399E() {
        return this.cpuMetricReadings_.size();
    }

    /* renamed from: G */
    public final C16663e mo59400G() {
        C16663e eVar = this.gaugeMetadata_;
        return eVar == null ? C16663e.m27579D() : eVar;
    }

    /* renamed from: H */
    public final boolean mo59401H() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: I */
    public final boolean mo59402I() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: t */
    public final Object mo59389t(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C16667a.f36879a[methodToInvoke.ordinal()]) {
            case 1:
                return new C16666f();
            case 2:
                return new C16668b();
            case 3:
                return new C16943v0(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", C16660d.class, "gaugeMetadata_", "androidMemoryReadings_", C16653b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C16928r0<C16666f> r0Var = PARSER;
                if (r0Var == null) {
                    synchronized (C16666f.class) {
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
