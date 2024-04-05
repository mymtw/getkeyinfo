package com.google.type;

import com.google.protobuf.C16935v;

public enum DayOfWeek implements C16935v.C16936a {
    DAY_OF_WEEK_UNSPECIFIED(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    UNRECOGNIZED(-1);
    
    public static final int DAY_OF_WEEK_UNSPECIFIED_VALUE = 0;
    public static final int FRIDAY_VALUE = 5;
    public static final int MONDAY_VALUE = 1;
    public static final int SATURDAY_VALUE = 6;
    public static final int SUNDAY_VALUE = 7;
    public static final int THURSDAY_VALUE = 4;
    public static final int TUESDAY_VALUE = 2;
    public static final int WEDNESDAY_VALUE = 3;
    private static final C16935v.C16937b<DayOfWeek> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.type.DayOfWeek$a */
    public class C16966a implements C16935v.C16937b<DayOfWeek> {
    }

    /* renamed from: com.google.type.DayOfWeek$b */
    public static final class C16967b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16967b f37343a = null;

        static {
            f37343a = new C16967b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return DayOfWeek.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16966a();
    }

    private DayOfWeek(int i) {
        this.value = i;
    }

    public static DayOfWeek forNumber(int i) {
        switch (i) {
            case 0:
                return DAY_OF_WEEK_UNSPECIFIED;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }
    }

    public static C16935v.C16937b<DayOfWeek> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16967b.f37343a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static DayOfWeek valueOf(int i) {
        return forNumber(i);
    }
}
