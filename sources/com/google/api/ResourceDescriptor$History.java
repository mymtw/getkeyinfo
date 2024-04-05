package com.google.api;

import com.google.protobuf.C16935v;

public enum ResourceDescriptor$History implements C16935v.C16936a {
    HISTORY_UNSPECIFIED(0),
    ORIGINALLY_SINGLE_PATTERN(1),
    FUTURE_MULTI_PATTERN(2),
    UNRECOGNIZED(-1);
    
    public static final int FUTURE_MULTI_PATTERN_VALUE = 2;
    public static final int HISTORY_UNSPECIFIED_VALUE = 0;
    public static final int ORIGINALLY_SINGLE_PATTERN_VALUE = 1;
    private static final C16935v.C16937b<ResourceDescriptor$History> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.api.ResourceDescriptor$History$a */
    public class C15756a implements C16935v.C16937b<ResourceDescriptor$History> {
    }

    /* renamed from: com.google.api.ResourceDescriptor$History$b */
    public static final class C15757b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C15757b f35539a = null;

        static {
            f35539a = new C15757b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return ResourceDescriptor$History.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C15756a();
    }

    private ResourceDescriptor$History(int i) {
        this.value = i;
    }

    public static ResourceDescriptor$History forNumber(int i) {
        if (i == 0) {
            return HISTORY_UNSPECIFIED;
        }
        if (i == 1) {
            return ORIGINALLY_SINGLE_PATTERN;
        }
        if (i != 2) {
            return null;
        }
        return FUTURE_MULTI_PATTERN;
    }

    public static C16935v.C16937b<ResourceDescriptor$History> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C15757b.f35539a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static ResourceDescriptor$History valueOf(int i) {
        return forNumber(i);
    }
}
