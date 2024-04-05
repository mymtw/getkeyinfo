package com.google.firebase.perf.p530v1;

import com.google.protobuf.C16878d0;
import com.google.protobuf.C16909k0;
import com.google.protobuf.C16928r0;
import com.google.protobuf.C16943v0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat$FieldType;

/* renamed from: com.google.firebase.perf.v1.c */
public final class C16656c extends GeneratedMessageLite<C16656c, C16658b> implements C16909k0 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    /* access modifiers changed from: private */
    public static final C16656c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile C16928r0<C16656c> PARSER;
    private C16650a androidAppInfo_;
    private String appInstanceId_ = "";
    private int applicationProcessState_;
    private int bitField0_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private String googleAppId_ = "";

    /* renamed from: com.google.firebase.perf.v1.c$a */
    public static /* synthetic */ class C16657a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36875a;

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
                f36875a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36875a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36875a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36875a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36875a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36875a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36875a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p530v1.C16656c.C16657a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.c$b */
    public static final class C16658b extends GeneratedMessageLite.C16838a<C16656c, C16658b> implements C16909k0 {
        public C16658b() {
            super(C16656c.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.c$c */
    public static final class C16659c {

        /* renamed from: a */
        public static final C16878d0<String, String> f36876a;

        static {
            WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.STRING;
            f36876a = new C16878d0<>(wireFormat$FieldType, wireFormat$FieldType, "");
        }
    }

    static {
        C16656c cVar = new C16656c();
        DEFAULT_INSTANCE = cVar;
        GeneratedMessageLite.m27961x(C16656c.class, cVar);
    }

    /* renamed from: A */
    public static void m27556A(C16656c cVar, ApplicationProcessState applicationProcessState) {
        cVar.getClass();
        cVar.applicationProcessState_ = applicationProcessState.getNumber();
        cVar.bitField0_ |= 8;
    }

    /* renamed from: B */
    public static MapFieldLite m27557B(C16656c cVar) {
        if (!cVar.customAttributes_.isMutable()) {
            cVar.customAttributes_ = cVar.customAttributes_.mutableCopy();
        }
        return cVar.customAttributes_;
    }

    /* renamed from: C */
    public static void m27558C(C16656c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.bitField0_ |= 2;
        cVar.appInstanceId_ = str;
    }

    /* renamed from: D */
    public static void m27559D(C16656c cVar, C16650a aVar) {
        cVar.getClass();
        cVar.androidAppInfo_ = aVar;
        cVar.bitField0_ |= 4;
    }

    /* renamed from: F */
    public static C16656c m27560F() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: K */
    public static C16658b m27561K() {
        return (C16658b) DEFAULT_INSTANCE.mo59755s();
    }

    /* renamed from: z */
    public static void m27563z(C16656c cVar, String str) {
        cVar.getClass();
        str.getClass();
        cVar.bitField0_ |= 1;
        cVar.googleAppId_ = str;
    }

    /* renamed from: E */
    public final C16650a mo59392E() {
        C16650a aVar = this.androidAppInfo_;
        return aVar == null ? C16650a.m27544C() : aVar;
    }

    /* renamed from: G */
    public final boolean mo59393G() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: H */
    public final boolean mo59394H() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: I */
    public final boolean mo59395I() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: J */
    public final boolean mo59396J() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: t */
    public final Object mo59389t(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C16657a.f36875a[methodToInvoke.ordinal()]) {
            case 1:
                return new C16656c();
            case 2:
                return new C16658b();
            case 3:
                return new C16943v0(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", ApplicationProcessState.internalGetVerifier(), "customAttributes_", C16659c.f36876a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C16928r0<C16656c> r0Var = PARSER;
                if (r0Var == null) {
                    synchronized (C16656c.class) {
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
