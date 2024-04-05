package com.google.type;

import com.google.protobuf.C16935v;

public enum CalendarPeriod implements C16935v.C16936a {
    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);
    
    public static final int CALENDAR_PERIOD_UNSPECIFIED_VALUE = 0;
    public static final int DAY_VALUE = 1;
    public static final int FORTNIGHT_VALUE = 3;
    public static final int HALF_VALUE = 6;
    public static final int MONTH_VALUE = 4;
    public static final int QUARTER_VALUE = 5;
    public static final int WEEK_VALUE = 2;
    public static final int YEAR_VALUE = 7;
    private static final C16935v.C16937b<CalendarPeriod> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.type.CalendarPeriod$a */
    public class C16964a implements C16935v.C16937b<CalendarPeriod> {
    }

    /* renamed from: com.google.type.CalendarPeriod$b */
    public static final class C16965b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16965b f37342a = null;

        static {
            f37342a = new C16965b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return CalendarPeriod.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16964a();
    }

    private CalendarPeriod(int i) {
        this.value = i;
    }

    public static CalendarPeriod forNumber(int i) {
        switch (i) {
            case 0:
                return CALENDAR_PERIOD_UNSPECIFIED;
            case 1:
                return DAY;
            case 2:
                return WEEK;
            case 3:
                return FORTNIGHT;
            case 4:
                return MONTH;
            case 5:
                return QUARTER;
            case 6:
                return HALF;
            case 7:
                return YEAR;
            default:
                return null;
        }
    }

    public static C16935v.C16937b<CalendarPeriod> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16965b.f37342a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static CalendarPeriod valueOf(int i) {
        return forNumber(i);
    }
}
