package com.paypal.android.platform.authsdk.authcommon.network;

import android.support.p013v4.media.C0071c;
import androidx.annotation.Keep;
import com.paypal.android.platform.authsdk.authinterface.Authentication;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationContext;
import com.paypal.android.platform.authsdk.authinterface.AuthenticationTokensProvider;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import kotlin.C19394m;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20000q;
import okhttp3.C20009t;
import okhttp3.CertificatePinner;
import p735br.C18980c;
import p753kq.C19846a;
import p753kq.C19857l;

public final class PayPalOkHttpClient {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final C20000q[] customInterceptors = new C20000q[0];

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C20009t buildWith(C19857l<? super Configuration, C19394m> lVar) {
            C19383o.m32797g(lVar, "lambda");
            Configuration configuration = new Configuration((C20009t) null, (AuthenticationConfiguration) null, (TimeOutConfiguration) null, (SslPinningConfiguration) null, (RiskConfiguration) null, (List) null, (List) null, (List) null, 255, (DefaultConstructorMarker) null);
            lVar.invoke(configuration);
            return configuration.buildOkHttpClient();
        }
    }

    public enum SslPinningStrategy {
        OKHTTP_CERT_PINNER,
        FROM_PARENT
    }

    public static final class HeadersProvider {
        private C19846a<? extends Map<String, String>> headers;

        public HeadersProvider(C19846a<? extends Map<String, String>> aVar) {
            C19383o.m32797g(aVar, "headers");
            this.headers = aVar;
        }

        public final Map<String, String> getHeaders() {
            return (Map) this.headers.invoke();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ HeadersProvider(C19846a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C170571.INSTANCE : aVar);
        }
    }

    @PayPalOkHttpClientDslMarker
    public static final class AuthenticationConfiguration {
        private Authentication authentication;
        private boolean enabled;

        public AuthenticationConfiguration() {
            this(false, (Authentication) null, 3, (DefaultConstructorMarker) null);
        }

        public AuthenticationConfiguration(boolean z, Authentication authentication2) {
            C19383o.m32797g(authentication2, "authentication");
            this.enabled = z;
            this.authentication = authentication2;
        }

        public final Authentication getAuthentication() {
            return this.authentication;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final void setAuthentication(Authentication authentication2) {
            C19383o.m32797g(authentication2, "<set-?>");
            this.authentication = authentication2;
        }

        public final void setEnabled(boolean z) {
            this.enabled = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AuthenticationConfiguration(boolean z, Authentication authentication2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? new Authentication() {
                public AuthenticationTokensProvider authTokensProvider() {
                    return null;
                }

                public void authenticate(AuthenticationContext authenticationContext, Authentication.Listener listener) {
                    C19383o.m32797g(authenticationContext, "authenticationContext");
                    C19383o.m32797g(listener, "authenticationListener");
                }

                public boolean isAuthenticationNeeded(AuthenticationContext authenticationContext) {
                    C19383o.m32797g(authenticationContext, "authenticationContext");
                    return true;
                }

                public void logout(boolean z) {
                }
            } : authentication2);
        }
    }

    @PayPalOkHttpClientDslMarker
    public static final class RiskConfiguration {
        private boolean enabled;
        private HeadersProvider riskHeaderProvider;

        public RiskConfiguration() {
            this(false, (HeadersProvider) null, 3, (DefaultConstructorMarker) null);
        }

        public RiskConfiguration(boolean z, HeadersProvider headersProvider) {
            C19383o.m32797g(headersProvider, "riskHeaderProvider");
            this.enabled = z;
            this.riskHeaderProvider = headersProvider;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final HeadersProvider getRiskHeaderProvider() {
            return this.riskHeaderProvider;
        }

        public final void setEnabled(boolean z) {
            this.enabled = z;
        }

        public final void setRiskHeaderProvider(HeadersProvider headersProvider) {
            C19383o.m32797g(headersProvider, "<set-?>");
            this.riskHeaderProvider = headersProvider;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RiskConfiguration(boolean z, HeadersProvider headersProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? new HeadersProvider(C170581.INSTANCE) : headersProvider);
        }
    }

    @PayPalOkHttpClientDslMarker
    @Keep
    public static final class TimeOutConfiguration {
        private long connectTimeoutInSeconds;
        private long readTimeoutInSeconds;
        private long writeTimeoutInSeconds;

        public TimeOutConfiguration() {
            this(0, 0, 0, 7, (DefaultConstructorMarker) null);
        }

        public TimeOutConfiguration(long j, long j2, long j3) {
            this.readTimeoutInSeconds = j;
            this.writeTimeoutInSeconds = j2;
            this.connectTimeoutInSeconds = j3;
        }

        public static /* synthetic */ TimeOutConfiguration copy$default(TimeOutConfiguration timeOutConfiguration, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = timeOutConfiguration.readTimeoutInSeconds;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = timeOutConfiguration.writeTimeoutInSeconds;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = timeOutConfiguration.connectTimeoutInSeconds;
            }
            return timeOutConfiguration.copy(j4, j5, j3);
        }

        public final long component1() {
            return this.readTimeoutInSeconds;
        }

        public final long component2() {
            return this.writeTimeoutInSeconds;
        }

        public final long component3() {
            return this.connectTimeoutInSeconds;
        }

        public final TimeOutConfiguration copy(long j, long j2, long j3) {
            return new TimeOutConfiguration(j, j2, j3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimeOutConfiguration)) {
                return false;
            }
            TimeOutConfiguration timeOutConfiguration = (TimeOutConfiguration) obj;
            return this.readTimeoutInSeconds == timeOutConfiguration.readTimeoutInSeconds && this.writeTimeoutInSeconds == timeOutConfiguration.writeTimeoutInSeconds && this.connectTimeoutInSeconds == timeOutConfiguration.connectTimeoutInSeconds;
        }

        public final long getConnectTimeoutInSeconds() {
            return this.connectTimeoutInSeconds;
        }

        public final long getReadTimeoutInSeconds() {
            return this.readTimeoutInSeconds;
        }

        public final long getWriteTimeoutInSeconds() {
            return this.writeTimeoutInSeconds;
        }

        public int hashCode() {
            return Long.hashCode(this.connectTimeoutInSeconds) + C0071c.m190b(this.writeTimeoutInSeconds, Long.hashCode(this.readTimeoutInSeconds) * 31, 31);
        }

        public final void setConnectTimeoutInSeconds(long j) {
            this.connectTimeoutInSeconds = j;
        }

        public final void setReadTimeoutInSeconds(long j) {
            this.readTimeoutInSeconds = j;
        }

        public final void setWriteTimeoutInSeconds(long j) {
            this.writeTimeoutInSeconds = j;
        }

        public String toString() {
            long j = this.readTimeoutInSeconds;
            long j2 = this.writeTimeoutInSeconds;
            long j3 = this.connectTimeoutInSeconds;
            return "TimeOutConfiguration(readTimeoutInSeconds=" + j + ", writeTimeoutInSeconds=" + j2 + ", connectTimeoutInSeconds=" + j3 + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ TimeOutConfiguration(long r7, long r9, long r11, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r6 = this;
                r14 = r13 & 1
                r0 = 20
                if (r14 == 0) goto L_0x0008
                r2 = r0
                goto L_0x0009
            L_0x0008:
                r2 = r7
            L_0x0009:
                r7 = r13 & 2
                if (r7 == 0) goto L_0x000f
                r4 = r0
                goto L_0x0010
            L_0x000f:
                r4 = r9
            L_0x0010:
                r7 = r13 & 4
                if (r7 == 0) goto L_0x0016
                r12 = r0
                goto L_0x0017
            L_0x0016:
                r12 = r11
            L_0x0017:
                r7 = r6
                r8 = r2
                r10 = r4
                r7.<init>(r8, r10, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient.TimeOutConfiguration.<init>(long, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @PayPalOkHttpClientDslMarker
    public static final class SslPinningConfiguration {
        private CertificatePinner certificatePinner;
        private C19857l<? super String, C19394m> certificatePinningFailureListener;
        private boolean permissive;
        private Map<String, ? extends List<String>> publicKeyHashes;
        private SslPinningStrategy sslPinningStrategy;
        private boolean throwExceptionWhenCertificatePinningFails;

        public SslPinningConfiguration() {
            this((SslPinningStrategy) null, (Map) null, false, false, (C19857l) null, (CertificatePinner) null, 63, (DefaultConstructorMarker) null);
        }

        public SslPinningConfiguration(SslPinningStrategy sslPinningStrategy2, Map<String, ? extends List<String>> map, boolean z, boolean z2, C19857l<? super String, C19394m> lVar, CertificatePinner certificatePinner2) {
            C19383o.m32797g(sslPinningStrategy2, "sslPinningStrategy");
            C19383o.m32797g(map, "publicKeyHashes");
            C19383o.m32797g(lVar, "certificatePinningFailureListener");
            C19383o.m32797g(certificatePinner2, "certificatePinner");
            this.sslPinningStrategy = sslPinningStrategy2;
            this.publicKeyHashes = map;
            this.permissive = z;
            this.throwExceptionWhenCertificatePinningFails = z2;
            this.certificatePinningFailureListener = lVar;
            this.certificatePinner = certificatePinner2;
        }

        public static /* synthetic */ void getPermissive$annotations() {
        }

        public final CertificatePinner getCertificatePinner() {
            return this.certificatePinner;
        }

        public final C19857l<String, C19394m> getCertificatePinningFailureListener() {
            return this.certificatePinningFailureListener;
        }

        public final boolean getPermissive() {
            return this.permissive;
        }

        public final Map<String, List<String>> getPublicKeyHashes() {
            return this.publicKeyHashes;
        }

        public final SslPinningStrategy getSslPinningStrategy() {
            return this.sslPinningStrategy;
        }

        public final boolean getThrowExceptionWhenCertificatePinningFails() {
            return this.throwExceptionWhenCertificatePinningFails;
        }

        public final void setCertificatePinner(CertificatePinner certificatePinner2) {
            C19383o.m32797g(certificatePinner2, "<set-?>");
            this.certificatePinner = certificatePinner2;
        }

        public final void setCertificatePinningFailureListener(C19857l<? super String, C19394m> lVar) {
            C19383o.m32797g(lVar, "<set-?>");
            this.certificatePinningFailureListener = lVar;
        }

        public final void setPermissive(boolean z) {
            this.permissive = z;
        }

        public final void setPublicKeyHashes(Map<String, ? extends List<String>> map) {
            C19383o.m32797g(map, "<set-?>");
            this.publicKeyHashes = map;
        }

        public final void setSslPinningStrategy(SslPinningStrategy sslPinningStrategy2) {
            C19383o.m32797g(sslPinningStrategy2, "<set-?>");
            this.sslPinningStrategy = sslPinningStrategy2;
        }

        public final void setThrowExceptionWhenCertificatePinningFails(boolean z) {
            this.throwExceptionWhenCertificatePinningFails = z;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public SslPinningConfiguration(com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient.SslPinningStrategy r8, java.util.Map r9, boolean r10, boolean r11, p753kq.C19857l r12, okhttp3.CertificatePinner r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r7 = this;
                r15 = r14 & 1
                if (r15 == 0) goto L_0x0006
                com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$SslPinningStrategy r8 = com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient.SslPinningStrategy.OKHTTP_CERT_PINNER
            L_0x0006:
                r15 = r14 & 2
                if (r15 == 0) goto L_0x0027
                java.lang.String r9 = "sha256/i7WTqTvh0OioIruIfFR4kMPnBqrS2rdiVPl/s2uC/CY="
                java.lang.String r15 = "sha256/WoiWRyIOVNa9ihaBciRSC7XHjliYS9VwUGOIud4PB18="
                java.lang.String r0 = "sha256/Wd8xe/qfTwq3ylFNd3IpaqLHZbh2ZNCLluVzmeNkcpw="
                java.lang.String r1 = "sha256/JbQbUG5JMJUoI6brnx0x3vZF6jilxsapbXGVfjhN8Fg="
                java.lang.String r2 = "sha256/lnsM2T/O9/J84sJFdnrpsFp3awZJ+ZZbYpCWhGloaHI="
                java.lang.String[] r9 = new java.lang.String[]{r9, r15, r0, r1, r2}
                java.util.List r9 = p568fn.C17782b.m29865e0(r9)
                kotlin.Pair r15 = new kotlin.Pair
                java.lang.String r0 = "**.paypal.com"
                r15.<init>(r0, r9)
                java.util.Map r9 = kotlin.reflect.C19421p.m32931U(r15)
            L_0x0027:
                r15 = r9
                r9 = r14 & 4
                r0 = 0
                if (r9 == 0) goto L_0x002f
                r1 = r0
                goto L_0x0030
            L_0x002f:
                r1 = r10
            L_0x0030:
                r9 = r14 & 8
                if (r9 == 0) goto L_0x0035
                r11 = 1
            L_0x0035:
                r2 = r11
                r9 = r14 & 16
                if (r9 == 0) goto L_0x003c
                com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$SslPinningConfiguration$1 r12 = com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient.SslPinningConfiguration.C170591.INSTANCE
            L_0x003c:
                r3 = r12
                r9 = r14 & 32
                if (r9 == 0) goto L_0x00a8
                okhttp3.CertificatePinner$a r9 = new okhttp3.CertificatePinner$a
                r9.<init>()
                java.util.Set r10 = r15.entrySet()
                java.util.Iterator r10 = r10.iterator()
            L_0x004e:
                boolean r11 = r10.hasNext()
                if (r11 == 0) goto L_0x009c
                java.lang.Object r11 = r10.next()
                java.util.Map$Entry r11 = (java.util.Map.Entry) r11
                java.lang.Object r12 = r11.getKey()
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r11 = r11.getValue()
                java.util.List r11 = (java.util.List) r11
                java.lang.String[] r13 = new java.lang.String[r0]
                java.lang.Object[] r11 = r11.toArray(r13)
                if (r11 == 0) goto L_0x0094
                java.lang.String[] r11 = (java.lang.String[]) r11
                int r13 = r11.length
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r13)
                java.lang.String[] r11 = (java.lang.String[]) r11
                java.lang.String r13 = "pattern"
                kotlin.jvm.internal.C19383o.m32797g(r12, r13)
                java.lang.String r13 = "pins"
                kotlin.jvm.internal.C19383o.m32797g(r11, r13)
                int r13 = r11.length
                r14 = r0
            L_0x0083:
                if (r14 >= r13) goto L_0x004e
                r4 = r11[r14]
                java.util.ArrayList r5 = r9.f43939a
                okhttp3.CertificatePinner$c r6 = new okhttp3.CertificatePinner$c
                r6.<init>(r12, r4)
                r5.add(r6)
                int r14 = r14 + 1
                goto L_0x0083
            L_0x0094:
                java.lang.NullPointerException r8 = new java.lang.NullPointerException
                java.lang.String r9 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
                r8.<init>(r9)
                throw r8
            L_0x009c:
                okhttp3.CertificatePinner r13 = new okhttp3.CertificatePinner
                java.util.ArrayList r9 = r9.f43939a
                java.util.Set r9 = kotlin.collections.C19327t.m32664t1(r9)
                r10 = 0
                r13.<init>(r9, r10)
            L_0x00a8:
                r0 = r13
                r9 = r7
                r10 = r8
                r11 = r15
                r12 = r1
                r13 = r2
                r14 = r3
                r15 = r0
                r9.<init>(r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient.SslPinningConfiguration.<init>(com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$SslPinningStrategy, java.util.Map, boolean, boolean, kq.l, okhttp3.CertificatePinner, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    @PayPalOkHttpClientDslMarker
    public static final class Configuration {
        private List<HeadersProvider> additionalHeaderProviders;
        private List<? extends C20000q> additionalInterceptors;
        private List<? extends C20000q> additionalNetworkInterceptors;
        private AuthenticationConfiguration authenticationConfiguration;
        private C20009t baseOkHttpClient;
        private RiskConfiguration riskConfiguration;
        private SslPinningConfiguration sslPinningConfiguration;
        private TimeOutConfiguration timeoutConfiguration;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SslPinningStrategy.values().length];
                iArr[SslPinningStrategy.OKHTTP_CERT_PINNER.ordinal()] = 1;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Configuration() {
            this((C20009t) null, (AuthenticationConfiguration) null, (TimeOutConfiguration) null, (SslPinningConfiguration) null, (RiskConfiguration) null, (List) null, (List) null, (List) null, 255, (DefaultConstructorMarker) null);
        }

        public Configuration(C20009t tVar, AuthenticationConfiguration authenticationConfiguration2, TimeOutConfiguration timeOutConfiguration, SslPinningConfiguration sslPinningConfiguration2, RiskConfiguration riskConfiguration2, List<HeadersProvider> list, List<? extends C20000q> list2, List<? extends C20000q> list3) {
            C19383o.m32797g(tVar, "baseOkHttpClient");
            C19383o.m32797g(authenticationConfiguration2, "authenticationConfiguration");
            C19383o.m32797g(timeOutConfiguration, "timeoutConfiguration");
            C19383o.m32797g(sslPinningConfiguration2, "sslPinningConfiguration");
            C19383o.m32797g(riskConfiguration2, "riskConfiguration");
            C19383o.m32797g(list, "additionalHeaderProviders");
            C19383o.m32797g(list2, "additionalInterceptors");
            C19383o.m32797g(list3, "additionalNetworkInterceptors");
            this.baseOkHttpClient = tVar;
            this.authenticationConfiguration = authenticationConfiguration2;
            this.timeoutConfiguration = timeOutConfiguration;
            this.sslPinningConfiguration = sslPinningConfiguration2;
            this.riskConfiguration = riskConfiguration2;
            this.additionalHeaderProviders = list;
            this.additionalInterceptors = list2;
            this.additionalNetworkInterceptors = list3;
        }

        private final SSLSocketFactory getSocketFactory(TrustManager[] trustManagerArr) throws NoSuchAlgorithmException, KeyManagementException {
            SSLContext instance = SSLContext.getInstance("TLS");
            C19383o.m32796f(instance, "getInstance(\"TLS\")");
            instance.init(new KeyManager[0], trustManagerArr, new SecureRandom());
            return instance.getSocketFactory();
        }

        private final C20000q makeAuthHeaderInterceptor(Authentication authentication) {
            int i = C20000q.f44257a;
            return new C17060xc9761cf0(authentication);
        }

        private final C20000q makeRequestIdHeaderInterceptor() {
            return new C17064x1dd3379();
        }

        private final C20000q makeUserAgentHeaderInterceptor() {
            return new C17065xd3d61389();
        }

        private final C20000q riskHeaderInterceptor(RiskConfiguration riskConfiguration2) {
            int i = C20000q.f44257a;
            return new C17061xa1f0ac37(riskConfiguration2);
        }

        private final void setupAdditionalHeaderProviders(C20009t.C20010a aVar) {
            aVar.mo72993a(new C17062xce923f84(this));
        }

        private final void setupAdditionalInterceptors(C20009t.C20010a aVar) {
            for (C20000q a : this.additionalInterceptors) {
                aVar.mo72993a(a);
            }
        }

        private final void setupAdditionalNetworkInterceptors(C20009t.C20010a aVar) {
            for (C20000q qVar : this.additionalNetworkInterceptors) {
                aVar.getClass();
                C19383o.m32797g(qVar, "interceptor");
                aVar.f44318d.add(qVar);
            }
        }

        private final void setupAuthentication(C20009t.C20010a aVar) {
            if (this.authenticationConfiguration.getEnabled()) {
                aVar.mo72993a(makeAuthHeaderInterceptor(this.authenticationConfiguration.getAuthentication()));
            }
        }

        private final void setupDefaultUserAgent(C20009t.C20010a aVar) {
            aVar.mo72993a(makeUserAgentHeaderInterceptor());
        }

        private final void setupIdempotencyProtection(C20009t.C20010a aVar) {
            aVar.mo72993a(makeRequestIdHeaderInterceptor());
        }

        private final void setupRisk(C20009t.C20010a aVar) {
            if (this.riskConfiguration.getEnabled()) {
                aVar.mo72993a(riskHeaderInterceptor(this.riskConfiguration));
            }
        }

        private final void setupSslPinning(C20009t.C20010a aVar) {
            if (this.sslPinningConfiguration.getSslPinningStrategy() != SslPinningStrategy.FROM_PARENT) {
                if (!this.sslPinningConfiguration.getPermissive()) {
                    if (WhenMappings.$EnumSwitchMapping$0[this.sslPinningConfiguration.getSslPinningStrategy().ordinal()] == 1) {
                        C20000q sslPinningInterceptor = sslPinningInterceptor(this.sslPinningConfiguration);
                        if (this.sslPinningConfiguration.getPermissive()) {
                            CertificatePinner certificatePinner = this.sslPinningConfiguration.getCertificatePinner();
                            aVar.getClass();
                            C19383o.m32797g(certificatePinner, "certificatePinner");
                            if (true ^ C19383o.m32792b(certificatePinner, aVar.f44336v)) {
                                aVar.f44314D = null;
                            }
                            aVar.f44336v = certificatePinner;
                            aVar.mo72993a(sslPinningInterceptor);
                            return;
                        }
                        aVar.getClass();
                        C19383o.m32797g(sslPinningInterceptor, "interceptor");
                        aVar.f44318d.add(sslPinningInterceptor);
                        return;
                    }
                    return;
                }
                throw new NotImplementedError(C19383o.m32802l("Not yet implemented", "An operation is not implemented: "));
            }
        }

        private final void setupTimeouts(C20009t.C20010a aVar) {
            long readTimeoutInSeconds = this.timeoutConfiguration.getReadTimeoutInSeconds();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar.mo72995c(readTimeoutInSeconds, timeUnit);
            aVar.f44311A = C18980c.m32098b(this.timeoutConfiguration.getWriteTimeoutInSeconds(), timeUnit);
            aVar.mo72994b(this.timeoutConfiguration.getConnectTimeoutInSeconds(), timeUnit);
        }

        private final C20000q sslPinningInterceptor(SslPinningConfiguration sslPinningConfiguration2) {
            int i = C20000q.f44257a;
            return new C17063x95a219f6(sslPinningConfiguration2);
        }

        @PayPalOkHttpClientDslMarker
        public final AuthenticationConfiguration authentication(C19857l<? super AuthenticationConfiguration, C19394m> lVar) {
            C19383o.m32797g(lVar, "lambda");
            AuthenticationConfiguration authenticationConfiguration2 = this.authenticationConfiguration;
            lVar.invoke(authenticationConfiguration2);
            return authenticationConfiguration2;
        }

        public final C20009t buildOkHttpClient() {
            C20009t.C20010a b = this.baseOkHttpClient.mo72991b();
            setupSslPinning(b);
            setupTimeouts(b);
            setupAuthentication(b);
            setupRisk(b);
            setupIdempotencyProtection(b);
            setupDefaultUserAgent(b);
            setupAdditionalHeaderProviders(b);
            setupAdditionalInterceptors(b);
            setupAdditionalNetworkInterceptors(b);
            return new C20009t(b);
        }

        public final List<HeadersProvider> getAdditionalHeaderProviders() {
            return this.additionalHeaderProviders;
        }

        public final List<C20000q> getAdditionalInterceptors() {
            return this.additionalInterceptors;
        }

        public final List<C20000q> getAdditionalNetworkInterceptors() {
            return this.additionalNetworkInterceptors;
        }

        public final AuthenticationConfiguration getAuthenticationConfiguration() {
            return this.authenticationConfiguration;
        }

        public final C20009t getBaseOkHttpClient() {
            return this.baseOkHttpClient;
        }

        public final RiskConfiguration getRiskConfiguration() {
            return this.riskConfiguration;
        }

        public final SslPinningConfiguration getSslPinningConfiguration() {
            return this.sslPinningConfiguration;
        }

        public final TimeOutConfiguration getTimeoutConfiguration() {
            return this.timeoutConfiguration;
        }

        @PayPalOkHttpClientDslMarker
        public final RiskConfiguration risk(C19857l<? super RiskConfiguration, C19394m> lVar) {
            C19383o.m32797g(lVar, "lambda");
            RiskConfiguration riskConfiguration2 = this.riskConfiguration;
            lVar.invoke(riskConfiguration2);
            return riskConfiguration2;
        }

        public final void setAdditionalHeaderProviders(List<HeadersProvider> list) {
            C19383o.m32797g(list, "<set-?>");
            this.additionalHeaderProviders = list;
        }

        public final void setAdditionalInterceptors(List<? extends C20000q> list) {
            C19383o.m32797g(list, "<set-?>");
            this.additionalInterceptors = list;
        }

        public final void setAdditionalNetworkInterceptors(List<? extends C20000q> list) {
            C19383o.m32797g(list, "<set-?>");
            this.additionalNetworkInterceptors = list;
        }

        public final void setAuthenticationConfiguration(AuthenticationConfiguration authenticationConfiguration2) {
            C19383o.m32797g(authenticationConfiguration2, "<set-?>");
            this.authenticationConfiguration = authenticationConfiguration2;
        }

        public final void setBaseOkHttpClient(C20009t tVar) {
            C19383o.m32797g(tVar, "<set-?>");
            this.baseOkHttpClient = tVar;
        }

        public final void setRiskConfiguration(RiskConfiguration riskConfiguration2) {
            C19383o.m32797g(riskConfiguration2, "<set-?>");
            this.riskConfiguration = riskConfiguration2;
        }

        public final void setSslPinningConfiguration(SslPinningConfiguration sslPinningConfiguration2) {
            C19383o.m32797g(sslPinningConfiguration2, "<set-?>");
            this.sslPinningConfiguration = sslPinningConfiguration2;
        }

        public final void setTimeoutConfiguration(TimeOutConfiguration timeOutConfiguration) {
            C19383o.m32797g(timeOutConfiguration, "<set-?>");
            this.timeoutConfiguration = timeOutConfiguration;
        }

        @PayPalOkHttpClientDslMarker
        public final SslPinningConfiguration sslPinning(C19857l<? super SslPinningConfiguration, C19394m> lVar) {
            C19383o.m32797g(lVar, "lambda");
            SslPinningConfiguration sslPinningConfiguration2 = this.sslPinningConfiguration;
            lVar.invoke(sslPinningConfiguration2);
            return sslPinningConfiguration2;
        }

        @PayPalOkHttpClientDslMarker
        public final TimeOutConfiguration timeout(C19857l<? super TimeOutConfiguration, C19394m> lVar) {
            C19383o.m32797g(lVar, "lambda");
            TimeOutConfiguration timeOutConfiguration = this.timeoutConfiguration;
            lVar.invoke(timeOutConfiguration);
            return timeOutConfiguration;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Configuration(okhttp3.C20009t r18, com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient.AuthenticationConfiguration r19, com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient.TimeOutConfiguration r20, com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient.SslPinningConfiguration r21, com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient.RiskConfiguration r22, java.util.List r23, java.util.List r24, java.util.List r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
            /*
                r17 = this;
                r0 = r26
                r1 = r0 & 1
                if (r1 == 0) goto L_0x000c
                okhttp3.t r1 = new okhttp3.t
                r1.<init>()
                goto L_0x000e
            L_0x000c:
                r1 = r18
            L_0x000e:
                r2 = r0 & 2
                r3 = 3
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x001b
                com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$AuthenticationConfiguration r2 = new com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$AuthenticationConfiguration
                r2.<init>(r4, r5, r3, r5)
                goto L_0x001d
            L_0x001b:
                r2 = r19
            L_0x001d:
                r6 = r0 & 4
                if (r6 == 0) goto L_0x0030
                com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$TimeOutConfiguration r6 = new com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$TimeOutConfiguration
                r8 = 0
                r10 = 0
                r12 = 0
                r14 = 7
                r15 = 0
                r7 = r6
                r7.<init>(r8, r10, r12, r14, r15)
                goto L_0x0032
            L_0x0030:
                r6 = r20
            L_0x0032:
                r7 = r0 & 8
                if (r7 == 0) goto L_0x0047
                com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$SslPinningConfiguration r7 = new com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$SslPinningConfiguration
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 63
                r16 = 0
                r8 = r7
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
                goto L_0x0049
            L_0x0047:
                r7 = r21
            L_0x0049:
                r8 = r0 & 16
                if (r8 == 0) goto L_0x0053
                com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$RiskConfiguration r8 = new com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$RiskConfiguration
                r8.<init>(r4, r5, r3, r5)
                goto L_0x0055
            L_0x0053:
                r8 = r22
            L_0x0055:
                r3 = r0 & 32
                if (r3 == 0) goto L_0x005c
                kotlin.collections.EmptyList r3 = kotlin.collections.EmptyList.INSTANCE
                goto L_0x005e
            L_0x005c:
                r3 = r23
            L_0x005e:
                r4 = r0 & 64
                if (r4 == 0) goto L_0x0065
                kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.INSTANCE
                goto L_0x0067
            L_0x0065:
                r4 = r24
            L_0x0067:
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x006e
                kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
                goto L_0x0070
            L_0x006e:
                r0 = r25
            L_0x0070:
                r18 = r17
                r19 = r1
                r20 = r2
                r21 = r6
                r22 = r7
                r23 = r8
                r24 = r3
                r25 = r4
                r26 = r0
                r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient.Configuration.<init>(okhttp3.t, com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$AuthenticationConfiguration, com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$TimeOutConfiguration, com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$SslPinningConfiguration, com.paypal.android.platform.authsdk.authcommon.network.PayPalOkHttpClient$RiskConfiguration, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
