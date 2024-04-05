package com.google.firebase.perf.p530v1;

import com.google.protobuf.C16935v;

/* renamed from: com.google.firebase.perf.v1.ApplicationProcessState */
public enum ApplicationProcessState implements C16935v.C16936a {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    
    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final C16935v.C16937b<ApplicationProcessState> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.firebase.perf.v1.ApplicationProcessState$a */
    public class C16631a implements C16935v.C16937b<ApplicationProcessState> {
    }

    /* renamed from: com.google.firebase.perf.v1.ApplicationProcessState$b */
    public static final class C16632b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16632b f36863a = null;

        static {
            f36863a = new C16632b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return ApplicationProcessState.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16631a();
    }

    private ApplicationProcessState(int i) {
        this.value = i;
    }

    public static ApplicationProcessState forNumber(int i) {
        if (i == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i == 1) {
            return FOREGROUND;
        }
        if (i == 2) {
            return BACKGROUND;
        }
        if (i != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static C16935v.C16937b<ApplicationProcessState> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16632b.f36863a;
    }

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static ApplicationProcessState valueOf(int i) {
        return forNumber(i);
    }
}
