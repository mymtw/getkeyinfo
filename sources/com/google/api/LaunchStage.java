package com.google.api;

import com.google.protobuf.C16935v;

public enum LaunchStage implements C16935v.C16936a {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);
    
    public static final int ALPHA_VALUE = 2;
    public static final int BETA_VALUE = 3;
    public static final int DEPRECATED_VALUE = 5;
    public static final int EARLY_ACCESS_VALUE = 1;
    public static final int GA_VALUE = 4;
    public static final int LAUNCH_STAGE_UNSPECIFIED_VALUE = 0;
    private static final C16935v.C16937b<LaunchStage> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.api.LaunchStage$a */
    public class C15748a implements C16935v.C16937b<LaunchStage> {
    }

    /* renamed from: com.google.api.LaunchStage$b */
    public static final class C15749b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C15749b f35535a = null;

        static {
            f35535a = new C15749b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return LaunchStage.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C15748a();
    }

    private LaunchStage(int i) {
        this.value = i;
    }

    public static LaunchStage forNumber(int i) {
        if (i == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i == 1) {
            return EARLY_ACCESS;
        }
        if (i == 2) {
            return ALPHA;
        }
        if (i == 3) {
            return BETA;
        }
        if (i == 4) {
            return GA;
        }
        if (i != 5) {
            return null;
        }
        return DEPRECATED;
    }

    public static C16935v.C16937b<LaunchStage> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C15749b.f35535a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LaunchStage valueOf(int i) {
        return forNumber(i);
    }
}
