package com.paypal.android.platform.authsdk.authcommon.model;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

public final class DeviceInfo {
    private String countryCode;

    /* renamed from: id */
    private final String f37444id;
    private final boolean isSimulator;
    private final String make;
    private final String model;
    private final String name;
    private final String networkCarrier;
    private final String networkType;

    /* renamed from: os */
    private final String f37445os;
    private final String osVersion;
    private final String phoneType;
    private final String type;

    public DeviceInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z) {
        C19383o.m32797g(str, "id");
        C19383o.m32797g(str3, "os");
        C19383o.m32797g(str4, "osVersion");
        C19383o.m32797g(str5, "make");
        C19383o.m32797g(str6, "model");
        C19383o.m32797g(str7, "type");
        C19383o.m32797g(str8, "networkType");
        C19383o.m32797g(str9, "networkCarrier");
        C19383o.m32797g(str10, "name");
        C19383o.m32797g(str11, "phoneType");
        this.f37444id = str;
        this.countryCode = str2;
        this.f37445os = str3;
        this.osVersion = str4;
        this.make = str5;
        this.model = str6;
        this.type = str7;
        this.networkType = str8;
        this.networkCarrier = str9;
        this.name = str10;
        this.phoneType = str11;
        this.isSimulator = z;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getId() {
        return this.f37444id;
    }

    public final String getMake() {
        return this.make;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNetworkCarrier() {
        return this.networkCarrier;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final String getOs() {
        return this.f37445os;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getParameterValue(String str) {
        C19383o.m32797g(str, "appId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_identifier", this.f37444id);
            jSONObject.put("device_os", this.f37445os);
            jSONObject.put("device_os_version", this.osVersion);
            jSONObject.put("device_name", this.name);
            jSONObject.put("device_model", this.model);
            jSONObject.put("device_type", this.type);
            jSONObject.put("device_key_type", this.phoneType);
            jSONObject.put("is_device_simulator", this.isSimulator);
            jSONObject.put("pp_app_id", str);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        C19383o.m32796f(jSONObject2, "data.toString()");
        return jSONObject2;
    }

    public final String getPhoneType() {
        return this.phoneType;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean isSimulator() {
        return this.isSimulator;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeviceInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, z);
    }
}
