package com.google.firebase.perf.p530v1;

import com.google.protobuf.C16909k0;
import com.google.protobuf.C16928r0;
import com.google.protobuf.C16943v0;
import com.google.protobuf.GeneratedMessageLite;

/* renamed from: com.google.firebase.perf.v1.e */
public final class C16663e extends GeneratedMessageLite<C16663e, C16665b> implements C16909k0 {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final C16663e DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile C16928r0<C16663e> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    /* renamed from: com.google.firebase.perf.v1.e$a */
    public static /* synthetic */ class C16664a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36878a;

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
                f36878a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36878a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36878a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36878a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36878a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36878a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36878a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p530v1.C16663e.C16664a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.e$b */
    public static final class C16665b extends GeneratedMessageLite.C16838a<C16663e, C16665b> implements C16909k0 {
        public C16665b() {
            super(C16663e.DEFAULT_INSTANCE);
        }
    }

    static {
        C16663e eVar = new C16663e();
        DEFAULT_INSTANCE = eVar;
        GeneratedMessageLite.m27961x(C16663e.class, eVar);
    }

    /* renamed from: A */
    public static void m27576A(C16663e eVar, int i) {
        eVar.bitField0_ |= 16;
        eVar.maxAppJavaHeapMemoryKb_ = i;
    }

    /* renamed from: B */
    public static void m27577B(C16663e eVar, int i) {
        eVar.bitField0_ |= 32;
        eVar.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    /* renamed from: C */
    public static void m27578C(C16663e eVar, int i) {
        eVar.bitField0_ |= 8;
        eVar.deviceRamSizeKb_ = i;
    }

    /* renamed from: D */
    public static C16663e m27579D() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: F */
    public static C16665b m27580F() {
        return (C16665b) DEFAULT_INSTANCE.mo59755s();
    }

    /* renamed from: z */
    public static void m27582z(C16663e eVar, String str) {
        eVar.getClass();
        str.getClass();
        eVar.bitField0_ |= 1;
        eVar.processName_ = str;
    }

    /* renamed from: E */
    public final boolean mo59397E() {
        return (this.bitField0_ & 16) != 0;
    }

    /* renamed from: t */
    public final Object mo59389t(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C16664a.f36878a[methodToInvoke.ordinal()]) {
            case 1:
                return new C16663e();
            case 2:
                return new C16665b();
            case 3:
                return new C16943v0(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C16928r0<C16663e> r0Var = PARSER;
                if (r0Var == null) {
                    synchronized (C16663e.class) {
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
