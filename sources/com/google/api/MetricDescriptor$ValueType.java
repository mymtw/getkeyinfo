package com.google.api;

import com.google.protobuf.C16935v;

public enum MetricDescriptor$ValueType implements C16935v.C16936a {
    VALUE_TYPE_UNSPECIFIED(0),
    BOOL(1),
    INT64(2),
    DOUBLE(3),
    STRING(4),
    DISTRIBUTION(5),
    MONEY(6),
    UNRECOGNIZED(-1);
    
    public static final int BOOL_VALUE = 1;
    public static final int DISTRIBUTION_VALUE = 5;
    public static final int DOUBLE_VALUE = 3;
    public static final int INT64_VALUE = 2;
    public static final int MONEY_VALUE = 6;
    public static final int STRING_VALUE = 4;
    public static final int VALUE_TYPE_UNSPECIFIED_VALUE = 0;
    private static final C16935v.C16937b<MetricDescriptor$ValueType> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.api.MetricDescriptor$ValueType$a */
    public class C15752a implements C16935v.C16937b<MetricDescriptor$ValueType> {
    }

    /* renamed from: com.google.api.MetricDescriptor$ValueType$b */
    public static final class C15753b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C15753b f35537a = null;

        static {
            f35537a = new C15753b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return MetricDescriptor$ValueType.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C15752a();
    }

    private MetricDescriptor$ValueType(int i) {
        this.value = i;
    }

    public static MetricDescriptor$ValueType forNumber(int i) {
        switch (i) {
            case 0:
                return VALUE_TYPE_UNSPECIFIED;
            case 1:
                return BOOL;
            case 2:
                return INT64;
            case 3:
                return DOUBLE;
            case 4:
                return STRING;
            case 5:
                return DISTRIBUTION;
            case 6:
                return MONEY;
            default:
                return null;
        }
    }

    public static C16935v.C16937b<MetricDescriptor$ValueType> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C15753b.f35537a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static MetricDescriptor$ValueType valueOf(int i) {
        return forNumber(i);
    }
}
