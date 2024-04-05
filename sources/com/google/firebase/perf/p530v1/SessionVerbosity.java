package com.google.firebase.perf.p530v1;

import com.google.protobuf.C16935v;

/* renamed from: com.google.firebase.perf.v1.SessionVerbosity */
public enum SessionVerbosity implements C16935v.C16936a {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    
    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final C16935v.C16937b<SessionVerbosity> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.firebase.perf.v1.SessionVerbosity$a */
    public class C16644a implements C16935v.C16937b<SessionVerbosity> {
    }

    /* renamed from: com.google.firebase.perf.v1.SessionVerbosity$b */
    public static final class C16645b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16645b f36870a = null;

        static {
            f36870a = new C16645b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return SessionVerbosity.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16644a();
    }

    private SessionVerbosity(int i) {
        this.value = i;
    }

    public static SessionVerbosity forNumber(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static C16935v.C16937b<SessionVerbosity> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16645b.f36870a;
    }

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static SessionVerbosity valueOf(int i) {
        return forNumber(i);
    }
}
