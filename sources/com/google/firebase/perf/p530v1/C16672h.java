package com.google.firebase.perf.p530v1;

import com.google.protobuf.C16872c;
import com.google.protobuf.C16909k0;
import com.google.protobuf.C16928r0;
import com.google.protobuf.C16933u;
import com.google.protobuf.C16935v;
import com.google.protobuf.C16943v0;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Arrays;

/* renamed from: com.google.firebase.perf.v1.h */
public final class C16672h extends GeneratedMessageLite<C16672h, C16675c> implements C16909k0 {
    /* access modifiers changed from: private */
    public static final C16672h DEFAULT_INSTANCE;
    private static volatile C16928r0<C16672h> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final C16935v.C16940e.C16941a<Integer, SessionVerbosity> sessionVerbosity_converter_ = new C16673a();
    private int bitField0_;
    private String sessionId_ = "";
    private C16935v.C16939d sessionVerbosity_ = C16933u.f37295e;

    /* renamed from: com.google.firebase.perf.v1.h$a */
    public class C16673a implements C16935v.C16940e.C16941a<Integer, SessionVerbosity> {
    }

    /* renamed from: com.google.firebase.perf.v1.h$b */
    public static /* synthetic */ class C16674b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36881a;

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
                f36881a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36881a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36881a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36881a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36881a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36881a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36881a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p530v1.C16672h.C16674b.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.h$c */
    public static final class C16675c extends GeneratedMessageLite.C16838a<C16672h, C16675c> implements C16909k0 {
        public C16675c() {
            super(C16672h.DEFAULT_INSTANCE);
        }
    }

    static {
        C16672h hVar = new C16672h();
        DEFAULT_INSTANCE = hVar;
        GeneratedMessageLite.m27961x(C16672h.class, hVar);
    }

    /* renamed from: A */
    public static void m27619A(C16672h hVar, SessionVerbosity sessionVerbosity) {
        hVar.getClass();
        sessionVerbosity.getClass();
        C16935v.C16939d dVar = hVar.sessionVerbosity_;
        if (!((C16872c) dVar).f37182b) {
            C16933u uVar = (C16933u) dVar;
            int i = uVar.f37297d;
            int i2 = i == 0 ? 10 : i * 2;
            if (i2 >= i) {
                hVar.sessionVerbosity_ = new C16933u(uVar.f37297d, Arrays.copyOf(uVar.f37296c, i2));
            } else {
                throw new IllegalArgumentException();
            }
        }
        ((C16933u) hVar.sessionVerbosity_).mo60041c(sessionVerbosity.getNumber());
    }

    /* renamed from: E */
    public static C16675c m27620E() {
        return (C16675c) DEFAULT_INSTANCE.mo59755s();
    }

    /* renamed from: z */
    public static void m27622z(C16672h hVar, String str) {
        hVar.getClass();
        str.getClass();
        hVar.bitField0_ |= 1;
        hVar.sessionId_ = str;
    }

    /* renamed from: B */
    public final SessionVerbosity mo59411B() {
        C16935v.C16940e.C16941a<Integer, SessionVerbosity> aVar = sessionVerbosity_converter_;
        Integer valueOf = Integer.valueOf(((C16933u) this.sessionVerbosity_).mo60044g(0));
        ((C16673a) aVar).getClass();
        SessionVerbosity forNumber = SessionVerbosity.forNumber(valueOf.intValue());
        return forNumber == null ? SessionVerbosity.SESSION_VERBOSITY_NONE : forNumber;
    }

    /* renamed from: C */
    public final int mo59412C() {
        return ((C16933u) this.sessionVerbosity_).f37297d;
    }

    /* renamed from: D */
    public final C16935v.C16940e mo59413D() {
        return new C16935v.C16940e(this.sessionVerbosity_, sessionVerbosity_converter_);
    }

    /* renamed from: t */
    public final Object mo59389t(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C16674b.f36881a[methodToInvoke.ordinal()]) {
            case 1:
                return new C16672h();
            case 2:
                return new C16675c();
            case 3:
                return new C16943v0(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", SessionVerbosity.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C16928r0<C16672h> r0Var = PARSER;
                if (r0Var == null) {
                    synchronized (C16672h.class) {
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
