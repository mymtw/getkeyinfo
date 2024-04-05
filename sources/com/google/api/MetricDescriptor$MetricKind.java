package com.google.api;

import com.google.protobuf.C16935v;

public enum MetricDescriptor$MetricKind implements C16935v.C16936a {
    METRIC_KIND_UNSPECIFIED(0),
    GAUGE(1),
    DELTA(2),
    CUMULATIVE(3),
    UNRECOGNIZED(-1);
    
    public static final int CUMULATIVE_VALUE = 3;
    public static final int DELTA_VALUE = 2;
    public static final int GAUGE_VALUE = 1;
    public static final int METRIC_KIND_UNSPECIFIED_VALUE = 0;
    private static final C16935v.C16937b<MetricDescriptor$MetricKind> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.api.MetricDescriptor$MetricKind$a */
    public class C15750a implements C16935v.C16937b<MetricDescriptor$MetricKind> {
    }

    /* renamed from: com.google.api.MetricDescriptor$MetricKind$b */
    public static final class C15751b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C15751b f35536a = null;

        static {
            f35536a = new C15751b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return MetricDescriptor$MetricKind.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C15750a();
    }

    private MetricDescriptor$MetricKind(int i) {
        this.value = i;
    }

    public static MetricDescriptor$MetricKind forNumber(int i) {
        if (i == 0) {
            return METRIC_KIND_UNSPECIFIED;
        }
        if (i == 1) {
            return GAUGE;
        }
        if (i == 2) {
            return DELTA;
        }
        if (i != 3) {
            return null;
        }
        return CUMULATIVE;
    }

    public static C16935v.C16937b<MetricDescriptor$MetricKind> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C15751b.f35536a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static MetricDescriptor$MetricKind valueOf(int i) {
        return forNumber(i);
    }
}
