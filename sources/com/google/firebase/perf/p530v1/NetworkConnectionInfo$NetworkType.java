package com.google.firebase.perf.p530v1;

import com.google.protobuf.C16935v;

/* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$NetworkType */
public enum NetworkConnectionInfo$NetworkType implements C16935v.C16936a {
    NONE(-1),
    MOBILE(0),
    WIFI(1),
    MOBILE_MMS(2),
    MOBILE_SUPL(3),
    MOBILE_DUN(4),
    MOBILE_HIPRI(5),
    WIMAX(6),
    BLUETOOTH(7),
    DUMMY(8),
    ETHERNET(9),
    MOBILE_FOTA(10),
    MOBILE_IMS(11),
    MOBILE_CBS(12),
    WIFI_P2P(13),
    MOBILE_IA(14),
    MOBILE_EMERGENCY(15),
    PROXY(16),
    VPN(17);
    
    public static final int BLUETOOTH_VALUE = 7;
    public static final int DUMMY_VALUE = 8;
    public static final int ETHERNET_VALUE = 9;
    public static final int MOBILE_CBS_VALUE = 12;
    public static final int MOBILE_DUN_VALUE = 4;
    public static final int MOBILE_EMERGENCY_VALUE = 15;
    public static final int MOBILE_FOTA_VALUE = 10;
    public static final int MOBILE_HIPRI_VALUE = 5;
    public static final int MOBILE_IA_VALUE = 14;
    public static final int MOBILE_IMS_VALUE = 11;
    public static final int MOBILE_MMS_VALUE = 2;
    public static final int MOBILE_SUPL_VALUE = 3;
    public static final int MOBILE_VALUE = 0;
    public static final int NONE_VALUE = -1;
    public static final int PROXY_VALUE = 16;
    public static final int VPN_VALUE = 17;
    public static final int WIFI_P2P_VALUE = 13;
    public static final int WIFI_VALUE = 1;
    public static final int WIMAX_VALUE = 6;
    private static final C16935v.C16937b<NetworkConnectionInfo$NetworkType> internalValueMap = null;
    private final int value;

    /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$NetworkType$a */
    public class C16635a implements C16935v.C16937b<NetworkConnectionInfo$NetworkType> {
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkConnectionInfo$NetworkType$b */
    public static final class C16636b implements C16935v.C16938c {

        /* renamed from: a */
        public static final C16636b f36865a = null;

        static {
            f36865a = new C16636b();
        }

        /* renamed from: a */
        public final boolean mo55639a(int i) {
            return NetworkConnectionInfo$NetworkType.forNumber(i) != null;
        }
    }

    /* access modifiers changed from: public */
    static {
        internalValueMap = new C16635a();
    }

    private NetworkConnectionInfo$NetworkType(int i) {
        this.value = i;
    }

    public static NetworkConnectionInfo$NetworkType forNumber(int i) {
        switch (i) {
            case -1:
                return NONE;
            case 0:
                return MOBILE;
            case 1:
                return WIFI;
            case 2:
                return MOBILE_MMS;
            case 3:
                return MOBILE_SUPL;
            case 4:
                return MOBILE_DUN;
            case 5:
                return MOBILE_HIPRI;
            case 6:
                return WIMAX;
            case 7:
                return BLUETOOTH;
            case 8:
                return DUMMY;
            case 9:
                return ETHERNET;
            case 10:
                return MOBILE_FOTA;
            case 11:
                return MOBILE_IMS;
            case 12:
                return MOBILE_CBS;
            case 13:
                return WIFI_P2P;
            case 14:
                return MOBILE_IA;
            case 15:
                return MOBILE_EMERGENCY;
            case 16:
                return PROXY;
            case 17:
                return VPN;
            default:
                return null;
        }
    }

    public static C16935v.C16937b<NetworkConnectionInfo$NetworkType> internalGetValueMap() {
        return internalValueMap;
    }

    public static C16935v.C16938c internalGetVerifier() {
        return C16636b.f36865a;
    }

    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static NetworkConnectionInfo$NetworkType valueOf(int i) {
        return forNumber(i);
    }
}
