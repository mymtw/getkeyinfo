package com.google.logging.type;

import com.google.protobuf.C16935v;

public enum LogSeverity implements C16935v.C16936a {
    DEFAULT(0),
    DEBUG(100),
    INFO(200),
    NOTICE(NOTICE_VALUE),
    WARNING(WARNING_VALUE),
    ERROR(500),
    CRITICAL(CRITICAL_VALUE),
    ALERT(ALERT_VALUE),
    EMERGENCY(EMERGENCY_VALUE),
    UNRECOGNIZED(-1);
    
    public static final int ALERT_VALUE = 700;
    public static final int CRITICAL_VALUE = 600;
    public static final int DEBUG_VALUE = 100;
    public static final int DEFAULT_VALUE = 0;
    public static final int EMERGENCY_VALUE = 800;
    public static final int ERROR_VALUE = 500;
    public static final int INFO_VALUE = 200;
    public static final int NOTICE_VALUE = 300;
    public static final int WARNING_VALUE = 400;
    private static final C16935v.C16937b<LogSeverity> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.logging.type.LogSeverity$a */
    public class C16809a implements C16935v.C16937b<LogSeverity> {
    }

    /* renamed from: com.google.logging.type.LogSeverity$b */
    public static final class C16810b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16810b f37127a = null;

        static {
            f37127a = new C16810b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return LogSeverity.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16809a();
    }

    private LogSeverity(int i) {
        this.value = i;
    }

    public static LogSeverity forNumber(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 100) {
            return DEBUG;
        }
        if (i == 200) {
            return INFO;
        }
        if (i == 300) {
            return NOTICE;
        }
        if (i == 400) {
            return WARNING;
        }
        if (i == 500) {
            return ERROR;
        }
        if (i == 600) {
            return CRITICAL;
        }
        if (i == 700) {
            return ALERT;
        }
        if (i != 800) {
            return null;
        }
        return EMERGENCY;
    }

    public static C16935v.C16937b<LogSeverity> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16810b.f37127a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static LogSeverity valueOf(int i) {
        return forNumber(i);
    }
}
