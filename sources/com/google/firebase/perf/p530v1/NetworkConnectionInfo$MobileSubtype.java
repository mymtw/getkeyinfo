package com.google.firebase.perf.p530v1;

import com.google.protobuf.C16935v;

/* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$MobileSubtype */
public enum NetworkConnectionInfo$MobileSubtype implements C16935v.C16936a {
    UNKNOWN_MOBILE_SUBTYPE(0),
    GPRS(1),
    EDGE(2),
    UMTS(3),
    CDMA(4),
    EVDO_0(5),
    EVDO_A(6),
    RTT(7),
    HSDPA(8),
    HSUPA(9),
    HSPA(10),
    IDEN(11),
    EVDO_B(12),
    LTE(13),
    EHRPD(14),
    HSPAP(15),
    GSM(16),
    TD_SCDMA(17),
    IWLAN(18),
    LTE_CA(19),
    COMBINED(100);
    
    public static final int CDMA_VALUE = 4;
    public static final int COMBINED_VALUE = 100;
    public static final int EDGE_VALUE = 2;
    public static final int EHRPD_VALUE = 14;
    public static final int EVDO_0_VALUE = 5;
    public static final int EVDO_A_VALUE = 6;
    public static final int EVDO_B_VALUE = 12;
    public static final int GPRS_VALUE = 1;
    public static final int GSM_VALUE = 16;
    public static final int HSDPA_VALUE = 8;
    public static final int HSPAP_VALUE = 15;
    public static final int HSPA_VALUE = 10;
    public static final int HSUPA_VALUE = 9;
    public static final int IDEN_VALUE = 11;
    public static final int IWLAN_VALUE = 18;
    public static final int LTE_CA_VALUE = 19;
    public static final int LTE_VALUE = 13;
    public static final int RTT_VALUE = 7;
    public static final int TD_SCDMA_VALUE = 17;
    public static final int UMTS_VALUE = 3;
    public static final int UNKNOWN_MOBILE_SUBTYPE_VALUE = 0;
    private static final C16935v.C16937b<NetworkConnectionInfo$MobileSubtype> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$MobileSubtype$a */
    public class C16633a implements C16935v.C16937b<NetworkConnectionInfo$MobileSubtype> {
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$MobileSubtype$b */
    public static final class C16634b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16634b f36864a = null;

        static {
            f36864a = new C16634b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return NetworkConnectionInfo$MobileSubtype.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16633a();
    }

    private NetworkConnectionInfo$MobileSubtype(int i) {
        this.value = i;
    }

    public static NetworkConnectionInfo$MobileSubtype forNumber(int i) {
        if (i == 100) {
            return COMBINED;
        }
        switch (i) {
            case 0:
                return UNKNOWN_MOBILE_SUBTYPE;
            case 1:
                return GPRS;
            case 2:
                return EDGE;
            case 3:
                return UMTS;
            case 4:
                return CDMA;
            case 5:
                return EVDO_0;
            case 6:
                return EVDO_A;
            case 7:
                return RTT;
            case 8:
                return HSDPA;
            case 9:
                return HSUPA;
            case 10:
                return HSPA;
            case 11:
                return IDEN;
            case 12:
                return EVDO_B;
            case 13:
                return LTE;
            case 14:
                return EHRPD;
            case 15:
                return HSPAP;
            case 16:
                return GSM;
            case 17:
                return TD_SCDMA;
            case 18:
                return IWLAN;
            case 19:
                return LTE_CA;
            default:
                return null;
        }
    }

    public static C16935v.C16937b<NetworkConnectionInfo$MobileSubtype> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16634b.f36864a;
    }

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static NetworkConnectionInfo$MobileSubtype valueOf(int i) {
        return forNumber(i);
    }
}
