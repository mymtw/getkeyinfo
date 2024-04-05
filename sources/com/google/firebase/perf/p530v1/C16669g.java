package com.google.firebase.perf.p530v1;

import com.google.protobuf.C16928r0;
import com.google.protobuf.C16943v0;
import com.google.protobuf.GeneratedMessageLite;
import p624mn.C18253a;

/* renamed from: com.google.firebase.perf.v1.g */
public final class C16669g extends GeneratedMessageLite<C16669g, C16671b> implements C18253a {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    /* access modifiers changed from: private */
    public static final C16669g DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile C16928r0<C16669g> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private C16656c applicationInfo_;
    private int bitField0_;
    private C16666f gaugeMetric_;
    private NetworkRequestMetric networkRequestMetric_;
    private C16676i traceMetric_;
    private TransportInfo transportInfo_;

    /* renamed from: com.google.firebase.perf.v1.g$a */
    public static /* synthetic */ class C16670a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36880a;

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
                f36880a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36880a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36880a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36880a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36880a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36880a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36880a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p530v1.C16669g.C16670a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.g$b */
    public static final class C16671b extends GeneratedMessageLite.C16838a<C16669g, C16671b> implements C18253a {
        public C16671b() {
            super(C16669g.DEFAULT_INSTANCE);
        }

        /* renamed from: j */
        public final boolean mo59405j() {
            return ((C16669g) this.f37158c).mo59405j();
        }

        /* renamed from: k */
        public final boolean mo59406k() {
            return ((C16669g) this.f37158c).mo59406k();
        }

        /* renamed from: l */
        public final NetworkRequestMetric mo59407l() {
            return ((C16669g) this.f37158c).mo59407l();
        }

        /* renamed from: o */
        public final boolean mo59408o() {
            return ((C16669g) this.f37158c).mo59408o();
        }

        /* renamed from: p */
        public final C16676i mo59409p() {
            return ((C16669g) this.f37158c).mo59409p();
        }

        /* renamed from: q */
        public final C16666f mo59410q() {
            return ((C16669g) this.f37158c).mo59410q();
        }
    }

    static {
        C16669g gVar = new C16669g();
        DEFAULT_INSTANCE = gVar;
        GeneratedMessageLite.m27961x(C16669g.class, gVar);
    }

    /* renamed from: A */
    public static void m27598A(C16669g gVar, C16666f fVar) {
        gVar.getClass();
        fVar.getClass();
        gVar.gaugeMetric_ = fVar;
        gVar.bitField0_ |= 8;
    }

    /* renamed from: B */
    public static void m27599B(C16669g gVar, C16676i iVar) {
        gVar.getClass();
        iVar.getClass();
        gVar.traceMetric_ = iVar;
        gVar.bitField0_ |= 2;
    }

    /* renamed from: C */
    public static void m27600C(C16669g gVar, NetworkRequestMetric networkRequestMetric) {
        gVar.getClass();
        networkRequestMetric.getClass();
        gVar.networkRequestMetric_ = networkRequestMetric;
        gVar.bitField0_ |= 4;
    }

    /* renamed from: F */
    public static C16671b m27601F() {
        return (C16671b) DEFAULT_INSTANCE.mo59755s();
    }

    /* renamed from: z */
    public static void m27603z(C16669g gVar, C16656c cVar) {
        gVar.getClass();
        gVar.applicationInfo_ = cVar;
        gVar.bitField0_ |= 1;
    }

    /* renamed from: D */
    public final C16656c mo59403D() {
        C16656c cVar = this.applicationInfo_;
        return cVar == null ? C16656c.m27560F() : cVar;
    }

    /* renamed from: E */
    public final boolean mo59404E() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: j */
    public final boolean mo59405j() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: k */
    public final boolean mo59406k() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: l */
    public final NetworkRequestMetric mo59407l() {
        NetworkRequestMetric networkRequestMetric = this.networkRequestMetric_;
        return networkRequestMetric == null ? NetworkRequestMetric.m27513O() : networkRequestMetric;
    }

    /* renamed from: o */
    public final boolean mo59408o() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: p */
    public final C16676i mo59409p() {
        C16676i iVar = this.traceMetric_;
        return iVar == null ? C16676i.m27635L() : iVar;
    }

    /* renamed from: q */
    public final C16666f mo59410q() {
        C16666f fVar = this.gaugeMetric_;
        return fVar == null ? C16666f.m27588F() : fVar;
    }

    /* renamed from: t */
    public final Object mo59389t(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C16670a.f36880a[methodToInvoke.ordinal()]) {
            case 1:
                return new C16669g();
            case 2:
                return new C16671b();
            case 3:
                return new C16943v0(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C16928r0<C16669g> r0Var = PARSER;
                if (r0Var == null) {
                    synchronized (C16669g.class) {
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
