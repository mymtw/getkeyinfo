package com.google.firebase.perf.p530v1;

import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.C16863a;
import com.google.protobuf.C16878d0;
import com.google.protobuf.C16909k0;
import com.google.protobuf.C16928r0;
import com.google.protobuf.C16934u0;
import com.google.protobuf.C16935v;
import com.google.protobuf.C16943v0;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat$FieldType;
import java.util.List;

/* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric */
public final class NetworkRequestMetric extends GeneratedMessageLite<NetworkRequestMetric, C16642b> implements C16909k0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    /* access modifiers changed from: private */
    public static final NetworkRequestMetric DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile C16928r0<NetworkRequestMetric> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.emptyMapField();
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private C16935v.C16942f<C16672h> perfSessions_ = C16934u0.f37298e;
    private long requestPayloadBytes_;
    private String responseContentType_ = "";
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_ = "";

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod */
    public enum HttpMethod implements C16935v.C16936a {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        
        public static final int CONNECT_VALUE = 9;
        public static final int DELETE_VALUE = 4;
        public static final int GET_VALUE = 1;
        public static final int HEAD_VALUE = 5;
        public static final int HTTP_METHOD_UNKNOWN_VALUE = 0;
        public static final int OPTIONS_VALUE = 7;
        public static final int PATCH_VALUE = 6;
        public static final int POST_VALUE = 3;
        public static final int PUT_VALUE = 2;
        public static final int TRACE_VALUE = 8;
        private static final C16935v.C16937b<HttpMethod> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod$a */
        public class C16637a implements C16935v.C16937b<HttpMethod> {
        }

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod$b */
        public static final class C16638b implements C16935v.C16938c {

            /* renamed from: a */
            public static final C16638b f36866a = null;

            static {
                f36866a = new C16638b();
            }

            /* renamed from: a */
            public final boolean mo55639a(int i) {
                return HttpMethod.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C16637a();
        }

        private HttpMethod(int i) {
            this.value = i;
        }

        public static HttpMethod forNumber(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static C16935v.C16937b<HttpMethod> internalGetValueMap() {
            return internalValueMap;
        }

        public static C16935v.C16938c internalGetVerifier() {
            return C16638b.f36866a;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static HttpMethod valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$NetworkClientErrorReason */
    public enum NetworkClientErrorReason implements C16935v.C16936a {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        
        public static final int GENERIC_CLIENT_ERROR_VALUE = 1;
        public static final int NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE = 0;
        private static final C16935v.C16937b<NetworkClientErrorReason> internalValueMap = null;
        private final int value;

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$NetworkClientErrorReason$a */
        public class C16639a implements C16935v.C16937b<NetworkClientErrorReason> {
        }

        /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$NetworkClientErrorReason$b */
        public static final class C16640b implements C16935v.C16938c {

            /* renamed from: a */
            public static final C16640b f36867a = null;

            static {
                f36867a = new C16640b();
            }

            /* renamed from: a */
            public final boolean mo55639a(int i) {
                return NetworkClientErrorReason.forNumber(i) != null;
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new C16639a();
        }

        private NetworkClientErrorReason(int i) {
            this.value = i;
        }

        public static NetworkClientErrorReason forNumber(int i) {
            if (i == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        public static C16935v.C16937b<NetworkClientErrorReason> internalGetValueMap() {
            return internalValueMap;
        }

        public static C16935v.C16938c internalGetVerifier() {
            return C16640b.f36867a;
        }

        public final int getNumber() {
            return this.value;
        }

        @Deprecated
        public static NetworkClientErrorReason valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$a */
    public static /* synthetic */ class C16641a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36868a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f36868a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f36868a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f36868a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f36868a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f36868a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f36868a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f36868a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.p530v1.NetworkRequestMetric.C16641a.<clinit>():void");
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$b */
    public static final class C16642b extends GeneratedMessageLite.C16838a<NetworkRequestMetric, C16642b> implements C16909k0 {
        public C16642b() {
            super(NetworkRequestMetric.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.google.firebase.perf.v1.NetworkRequestMetric$c */
    public static final class C16643c {

        /* renamed from: a */
        public static final C16878d0<String, String> f36869a;

        static {
            WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.STRING;
            f36869a = new C16878d0<>(wireFormat$FieldType, wireFormat$FieldType, "");
        }
    }

    static {
        NetworkRequestMetric networkRequestMetric = new NetworkRequestMetric();
        DEFAULT_INSTANCE = networkRequestMetric;
        GeneratedMessageLite.m27961x(NetworkRequestMetric.class, networkRequestMetric);
    }

    /* renamed from: A */
    public static void m27500A(NetworkRequestMetric networkRequestMetric, NetworkClientErrorReason networkClientErrorReason) {
        networkRequestMetric.getClass();
        networkRequestMetric.networkClientErrorReason_ = networkClientErrorReason.getNumber();
        networkRequestMetric.bitField0_ |= 16;
    }

    /* renamed from: B */
    public static void m27501B(NetworkRequestMetric networkRequestMetric, int i) {
        networkRequestMetric.bitField0_ |= 32;
        networkRequestMetric.httpResponseCode_ = i;
    }

    /* renamed from: C */
    public static void m27502C(NetworkRequestMetric networkRequestMetric, String str) {
        networkRequestMetric.getClass();
        str.getClass();
        networkRequestMetric.bitField0_ |= 64;
        networkRequestMetric.responseContentType_ = str;
    }

    /* renamed from: D */
    public static void m27503D(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.bitField0_ &= -65;
        networkRequestMetric.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    /* renamed from: E */
    public static void m27504E(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 128;
        networkRequestMetric.clientStartTimeUs_ = j;
    }

    /* renamed from: F */
    public static void m27505F(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 256;
        networkRequestMetric.timeToRequestCompletedUs_ = j;
    }

    /* renamed from: G */
    public static void m27506G(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN;
        networkRequestMetric.timeToResponseInitiatedUs_ = j;
    }

    /* renamed from: H */
    public static void m27507H(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE;
        networkRequestMetric.timeToResponseCompletedUs_ = j;
    }

    /* renamed from: I */
    public static MapFieldLite m27508I(NetworkRequestMetric networkRequestMetric) {
        if (!networkRequestMetric.customAttributes_.isMutable()) {
            networkRequestMetric.customAttributes_ = networkRequestMetric.customAttributes_.mutableCopy();
        }
        return networkRequestMetric.customAttributes_;
    }

    /* renamed from: J */
    public static void m27509J(NetworkRequestMetric networkRequestMetric, List list) {
        C16935v.C16942f<C16672h> fVar = networkRequestMetric.perfSessions_;
        if (!fVar.mo59865h()) {
            networkRequestMetric.perfSessions_ = GeneratedMessageLite.m27960w(fVar);
        }
        C16863a.m28025e(list, networkRequestMetric.perfSessions_);
    }

    /* renamed from: K */
    public static void m27510K(NetworkRequestMetric networkRequestMetric, HttpMethod httpMethod) {
        networkRequestMetric.getClass();
        networkRequestMetric.httpMethod_ = httpMethod.getNumber();
        networkRequestMetric.bitField0_ |= 2;
    }

    /* renamed from: L */
    public static void m27511L(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 4;
        networkRequestMetric.requestPayloadBytes_ = j;
    }

    /* renamed from: M */
    public static void m27512M(NetworkRequestMetric networkRequestMetric, long j) {
        networkRequestMetric.bitField0_ |= 8;
        networkRequestMetric.responsePayloadBytes_ = j;
    }

    /* renamed from: O */
    public static NetworkRequestMetric m27513O() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: g0 */
    public static C16642b m27514g0() {
        return (C16642b) DEFAULT_INSTANCE.mo59755s();
    }

    /* renamed from: z */
    public static void m27516z(NetworkRequestMetric networkRequestMetric, String str) {
        networkRequestMetric.getClass();
        str.getClass();
        networkRequestMetric.bitField0_ |= 1;
        networkRequestMetric.url_ = str;
    }

    /* renamed from: N */
    public final long mo59371N() {
        return this.clientStartTimeUs_;
    }

    /* renamed from: P */
    public final HttpMethod mo59372P() {
        HttpMethod forNumber = HttpMethod.forNumber(this.httpMethod_);
        return forNumber == null ? HttpMethod.HTTP_METHOD_UNKNOWN : forNumber;
    }

    /* renamed from: Q */
    public final int mo59373Q() {
        return this.httpResponseCode_;
    }

    /* renamed from: R */
    public final C16935v.C16942f mo59374R() {
        return this.perfSessions_;
    }

    /* renamed from: S */
    public final long mo59375S() {
        return this.requestPayloadBytes_;
    }

    /* renamed from: T */
    public final long mo59376T() {
        return this.responsePayloadBytes_;
    }

    /* renamed from: U */
    public final long mo59377U() {
        return this.timeToRequestCompletedUs_;
    }

    /* renamed from: V */
    public final long mo59378V() {
        return this.timeToResponseCompletedUs_;
    }

    /* renamed from: W */
    public final long mo59379W() {
        return this.timeToResponseInitiatedUs_;
    }

    /* renamed from: X */
    public final String mo59380X() {
        return this.url_;
    }

    /* renamed from: Y */
    public final boolean mo59381Y() {
        return (this.bitField0_ & 128) != 0;
    }

    /* renamed from: Z */
    public final boolean mo59382Z() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: a0 */
    public final boolean mo59383a0() {
        return (this.bitField0_ & 32) != 0;
    }

    /* renamed from: b0 */
    public final boolean mo59384b0() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: c0 */
    public final boolean mo59385c0() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: d0 */
    public final boolean mo59386d0() {
        return (this.bitField0_ & 256) != 0;
    }

    /* renamed from: e0 */
    public final boolean mo59387e0() {
        return (this.bitField0_ & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0;
    }

    /* renamed from: f0 */
    public final boolean mo59388f0() {
        return (this.bitField0_ & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0;
    }

    /* renamed from: t */
    public final Object mo59389t(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C16641a.f36868a[methodToInvoke.ordinal()]) {
            case 1:
                return new NetworkRequestMetric();
            case 2:
                return new C16642b();
            case 3:
                return new C16943v0(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", HttpMethod.internalGetVerifier(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", NetworkClientErrorReason.internalGetVerifier(), "customAttributes_", C16643c.f36869a, "perfSessions_", C16672h.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C16928r0<NetworkRequestMetric> r0Var = PARSER;
                if (r0Var == null) {
                    synchronized (NetworkRequestMetric.class) {
                        r0Var = PARSER;
                        if (r0Var == null) {
                            r0Var = new GeneratedMessageLite.C16839b<>(DEFAULT_INSTANCE);
                            PARSER = r0Var;
                        }
                    }
                }
                return r0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
