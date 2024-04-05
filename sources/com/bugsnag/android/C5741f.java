package com.bugsnag.android;

/* renamed from: com.bugsnag.android.f */
public final /* synthetic */ class C5741f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f12232a;

    static {
        int[] iArr = new int[TaskType.values().length];
        f12232a = iArr;
        iArr[TaskType.ERROR_REQUEST.ordinal()] = 1;
        iArr[TaskType.SESSION_REQUEST.ordinal()] = 2;
        iArr[TaskType.IO.ordinal()] = 3;
        iArr[TaskType.INTERNAL_REPORT.ordinal()] = 4;
        iArr[TaskType.DEFAULT.ordinal()] = 5;
    }
}
