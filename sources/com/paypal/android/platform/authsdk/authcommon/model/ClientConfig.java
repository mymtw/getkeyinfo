package com.paypal.android.platform.authsdk.authcommon.model;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.android.platform.authsdk.authcommon.utils.AppInfoFactory;
import com.paypal.android.platform.authsdk.authcommon.utils.DeviceInfoFactory;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;

@Keep
public final class ClientConfig {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String appId;
    private final AppInfo appInfo;
    private final String baseUrl;
    private final String clientId;
    private final String deviceAppId;
    private final DeviceInfo deviceInfo;
    private final String guid;
    private final String proxyClientId;
    private final String redirectUri;
    private final String riskData;
    private final Tenant tenant;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientConfig build(String str, String str2, String str3, String str4, String str5, String str6, Tenant tenant, String str7, String str8, Context context) {
            C19383o.m32797g(str, "guid");
            String str9 = str2;
            C19383o.m32797g(str9, "baseUrl");
            String str10 = str3;
            C19383o.m32797g(str10, "proxyClientId");
            String str11 = str4;
            C19383o.m32797g(str11, "clientId");
            String str12 = str5;
            C19383o.m32797g(str12, "redirectUri");
            String str13 = str6;
            C19383o.m32797g(str13, "appId");
            Tenant tenant2 = tenant;
            C19383o.m32797g(tenant2, "tenant");
            String str14 = str7;
            C19383o.m32797g(str14, "riskData");
            String str15 = str8;
            C19383o.m32797g(str15, "deviceAppId");
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            DeviceInfoFactory deviceInfoFactory = DeviceInfoFactory.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            C19383o.m32796f(applicationContext, "context.applicationContext");
            DeviceInfo create = deviceInfoFactory.create(applicationContext);
            AppInfoFactory appInfoFactory = AppInfoFactory.INSTANCE;
            Context applicationContext2 = context.getApplicationContext();
            C19383o.m32796f(applicationContext2, "context.applicationContext");
            return new ClientConfig(str, str9, str10, str11, str12, str13, tenant2, str14, str15, create, appInfoFactory.create(applicationContext2));
        }
    }

    public ClientConfig(String str, String str2, String str3, String str4, String str5, String str6, Tenant tenant2, String str7, String str8, DeviceInfo deviceInfo2, AppInfo appInfo2) {
        C19383o.m32797g(str, "guid");
        C19383o.m32797g(str2, "baseUrl");
        C19383o.m32797g(str3, "proxyClientId");
        C19383o.m32797g(str4, "clientId");
        C19383o.m32797g(str5, "redirectUri");
        C19383o.m32797g(str6, "appId");
        C19383o.m32797g(tenant2, "tenant");
        C19383o.m32797g(str7, "riskData");
        C19383o.m32797g(str8, "deviceAppId");
        C19383o.m32797g(deviceInfo2, "deviceInfo");
        C19383o.m32797g(appInfo2, "appInfo");
        this.guid = str;
        this.baseUrl = str2;
        this.proxyClientId = str3;
        this.clientId = str4;
        this.redirectUri = str5;
        this.appId = str6;
        this.tenant = tenant2;
        this.riskData = str7;
        this.deviceAppId = str8;
        this.deviceInfo = deviceInfo2;
        this.appInfo = appInfo2;
    }

    public static /* synthetic */ ClientConfig copy$default(ClientConfig clientConfig, String str, String str2, String str3, String str4, String str5, String str6, Tenant tenant2, String str7, String str8, DeviceInfo deviceInfo2, AppInfo appInfo2, int i, Object obj) {
        ClientConfig clientConfig2 = clientConfig;
        int i2 = i;
        return clientConfig.copy((i2 & 1) != 0 ? clientConfig2.guid : str, (i2 & 2) != 0 ? clientConfig2.baseUrl : str2, (i2 & 4) != 0 ? clientConfig2.proxyClientId : str3, (i2 & 8) != 0 ? clientConfig2.clientId : str4, (i2 & 16) != 0 ? clientConfig2.redirectUri : str5, (i2 & 32) != 0 ? clientConfig2.appId : str6, (i2 & 64) != 0 ? clientConfig2.tenant : tenant2, (i2 & 128) != 0 ? clientConfig2.riskData : str7, (i2 & 256) != 0 ? clientConfig2.deviceAppId : str8, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? clientConfig2.deviceInfo : deviceInfo2, (i2 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? clientConfig2.appInfo : appInfo2);
    }

    public final String component1() {
        return this.guid;
    }

    public final DeviceInfo component10() {
        return this.deviceInfo;
    }

    public final AppInfo component11() {
        return this.appInfo;
    }

    public final String component2() {
        return this.baseUrl;
    }

    public final String component3() {
        return this.proxyClientId;
    }

    public final String component4() {
        return this.clientId;
    }

    public final String component5() {
        return this.redirectUri;
    }

    public final String component6() {
        return this.appId;
    }

    public final Tenant component7() {
        return this.tenant;
    }

    public final String component8() {
        return this.riskData;
    }

    public final String component9() {
        return this.deviceAppId;
    }

    public final ClientConfig copy(String str, String str2, String str3, String str4, String str5, String str6, Tenant tenant2, String str7, String str8, DeviceInfo deviceInfo2, AppInfo appInfo2) {
        C19383o.m32797g(str, "guid");
        C19383o.m32797g(str2, "baseUrl");
        String str9 = str3;
        C19383o.m32797g(str9, "proxyClientId");
        String str10 = str4;
        C19383o.m32797g(str10, "clientId");
        String str11 = str5;
        C19383o.m32797g(str11, "redirectUri");
        String str12 = str6;
        C19383o.m32797g(str12, "appId");
        Tenant tenant3 = tenant2;
        C19383o.m32797g(tenant3, "tenant");
        String str13 = str7;
        C19383o.m32797g(str13, "riskData");
        String str14 = str8;
        C19383o.m32797g(str14, "deviceAppId");
        DeviceInfo deviceInfo3 = deviceInfo2;
        C19383o.m32797g(deviceInfo3, "deviceInfo");
        AppInfo appInfo3 = appInfo2;
        C19383o.m32797g(appInfo3, "appInfo");
        return new ClientConfig(str, str2, str9, str10, str11, str12, tenant3, str13, str14, deviceInfo3, appInfo3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientConfig)) {
            return false;
        }
        ClientConfig clientConfig = (ClientConfig) obj;
        return C19383o.m32792b(this.guid, clientConfig.guid) && C19383o.m32792b(this.baseUrl, clientConfig.baseUrl) && C19383o.m32792b(this.proxyClientId, clientConfig.proxyClientId) && C19383o.m32792b(this.clientId, clientConfig.clientId) && C19383o.m32792b(this.redirectUri, clientConfig.redirectUri) && C19383o.m32792b(this.appId, clientConfig.appId) && this.tenant == clientConfig.tenant && C19383o.m32792b(this.riskData, clientConfig.riskData) && C19383o.m32792b(this.deviceAppId, clientConfig.deviceAppId) && C19383o.m32792b(this.deviceInfo, clientConfig.deviceInfo) && C19383o.m32792b(this.appInfo, clientConfig.appInfo);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final AppInfo getAppInfo() {
        return this.appInfo;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getDeviceAppId() {
        return this.deviceAppId;
    }

    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final String getGuid() {
        return this.guid;
    }

    public final String getProxyClientId() {
        return this.proxyClientId;
    }

    public final String getRedirectUri() {
        return this.redirectUri;
    }

    public final String getRiskData() {
        return this.riskData;
    }

    public final Tenant getTenant() {
        return this.tenant;
    }

    public int hashCode() {
        int e = C0023f.m105e(this.appId, C0023f.m105e(this.redirectUri, C0023f.m105e(this.clientId, C0023f.m105e(this.proxyClientId, C0023f.m105e(this.baseUrl, this.guid.hashCode() * 31, 31), 31), 31), 31), 31);
        int e2 = C0023f.m105e(this.deviceAppId, C0023f.m105e(this.riskData, (this.tenant.hashCode() + e) * 31, 31), 31);
        return this.appInfo.hashCode() + ((this.deviceInfo.hashCode() + e2) * 31);
    }

    public String toString() {
        String str = this.guid;
        String str2 = this.baseUrl;
        String str3 = this.proxyClientId;
        String str4 = this.clientId;
        String str5 = this.redirectUri;
        String str6 = this.appId;
        Tenant tenant2 = this.tenant;
        String str7 = this.riskData;
        String str8 = this.deviceAppId;
        DeviceInfo deviceInfo2 = this.deviceInfo;
        AppInfo appInfo2 = this.appInfo;
        StringBuilder f = C0388a.m1050f("ClientConfig(guid=", str, ", baseUrl=", str2, ", proxyClientId=");
        C0391c.m1061h(f, str3, ", clientId=", str4, ", redirectUri=");
        C0391c.m1061h(f, str5, ", appId=", str6, ", tenant=");
        f.append(tenant2);
        f.append(", riskData=");
        f.append(str7);
        f.append(", deviceAppId=");
        f.append(str8);
        f.append(", deviceInfo=");
        f.append(deviceInfo2);
        f.append(", appInfo=");
        f.append(appInfo2);
        f.append(")");
        return f.toString();
    }
}
