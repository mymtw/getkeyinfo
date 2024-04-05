package com.paypal.pyplcheckout.common.instrumentation.amplitude.models;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p650pn.C18417a;

public final class AmplitudeEvent {
    @C18417a("api_level")
    private final int apiLevel;
    @C18417a("carrier")
    private final String carrier;
    @C18417a("country")
    private final String country;
    @C18417a("device_brand")
    private final String deviceBrand;
    @C18417a("device_id")
    private final String deviceId;
    @C18417a("device_manufacturer")
    private final String deviceManufacturer;
    @C18417a("device_model")
    private final String deviceModel;
    @C18417a("event_properties")
    private final Map<String, Object> eventProperties;
    @C18417a("event_type")
    private final String eventType;
    @C18417a("insert_id")
    private final String insertId;
    @C18417a("language")
    private final String language;
    @C18417a("os_name")
    private final String osName;
    @C18417a("os_version")
    private final String osVersion;
    @C18417a("platform")
    private final String platform;
    @C18417a("session_id")
    private final long sessionId;
    @C18417a("time")
    private final long timestamp;
    @C18417a("user_id")
    private final String userId;
    @C18417a("user_properties")
    private final UserProperties userProperties;
    @C18417a("version_name")
    private final String versionName;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AmplitudeEvent(String str, long j, String str2, String str3, long j2, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Map map, UserProperties userProperties2, String str14, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, str3, j2, str4, str5, str6, i, str7, str8, str9, str10, str11, str12, str13, map, userProperties2, (i2 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? C0069a.m174e("randomUUID().toString()") : str14);
    }

    public static /* synthetic */ AmplitudeEvent copy$default(AmplitudeEvent amplitudeEvent, String str, long j, String str2, String str3, long j2, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Map map, UserProperties userProperties2, String str14, int i2, Object obj) {
        AmplitudeEvent amplitudeEvent2 = amplitudeEvent;
        int i3 = i2;
        return amplitudeEvent.copy((i3 & 1) != 0 ? amplitudeEvent2.eventType : str, (i3 & 2) != 0 ? amplitudeEvent2.timestamp : j, (i3 & 4) != 0 ? amplitudeEvent2.userId : str2, (i3 & 8) != 0 ? amplitudeEvent2.deviceId : str3, (i3 & 16) != 0 ? amplitudeEvent2.sessionId : j2, (i3 & 32) != 0 ? amplitudeEvent2.versionName : str4, (i3 & 64) != 0 ? amplitudeEvent2.osName : str5, (i3 & 128) != 0 ? amplitudeEvent2.osVersion : str6, (i3 & 256) != 0 ? amplitudeEvent2.apiLevel : i, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? amplitudeEvent2.deviceBrand : str7, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? amplitudeEvent2.deviceManufacturer : str8, (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? amplitudeEvent2.deviceModel : str9, (i3 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? amplitudeEvent2.carrier : str10, (i3 & 8192) != 0 ? amplitudeEvent2.country : str11, (i3 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? amplitudeEvent2.language : str12, (i3 & 32768) != 0 ? amplitudeEvent2.platform : str13, (i3 & 65536) != 0 ? amplitudeEvent2.eventProperties : map, (i3 & 131072) != 0 ? amplitudeEvent2.userProperties : userProperties2, (i3 & PrimitiveArrayBuilder.MAX_CHUNK_SIZE) != 0 ? amplitudeEvent2.insertId : str14);
    }

    public final String component1() {
        return this.eventType;
    }

    public final String component10() {
        return this.deviceBrand;
    }

    public final String component11() {
        return this.deviceManufacturer;
    }

    public final String component12() {
        return this.deviceModel;
    }

    public final String component13() {
        return this.carrier;
    }

    public final String component14() {
        return this.country;
    }

    public final String component15() {
        return this.language;
    }

    public final String component16() {
        return this.platform;
    }

    public final Map<String, Object> component17() {
        return this.eventProperties;
    }

    public final UserProperties component18() {
        return this.userProperties;
    }

    public final String component19() {
        return this.insertId;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.deviceId;
    }

    public final long component5() {
        return this.sessionId;
    }

    public final String component6() {
        return this.versionName;
    }

    public final String component7() {
        return this.osName;
    }

    public final String component8() {
        return this.osVersion;
    }

    public final int component9() {
        return this.apiLevel;
    }

    public final AmplitudeEvent copy(String str, long j, String str2, String str3, long j2, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Map<String, ? extends Object> map, UserProperties userProperties2, String str14) {
        String str15 = str;
        C19383o.m32797g(str15, "eventType");
        C19383o.m32797g(str3, "deviceId");
        C19383o.m32797g(str5, "osName");
        C19383o.m32797g(str13, "platform");
        C19383o.m32797g(map, "eventProperties");
        C19383o.m32797g(str14, "insertId");
        return new AmplitudeEvent(str15, j, str2, str3, j2, str4, str5, str6, i, str7, str8, str9, str10, str11, str12, str13, map, userProperties2, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AmplitudeEvent)) {
            return false;
        }
        AmplitudeEvent amplitudeEvent = (AmplitudeEvent) obj;
        return C19383o.m32792b(this.eventType, amplitudeEvent.eventType) && this.timestamp == amplitudeEvent.timestamp && C19383o.m32792b(this.userId, amplitudeEvent.userId) && C19383o.m32792b(this.deviceId, amplitudeEvent.deviceId) && this.sessionId == amplitudeEvent.sessionId && C19383o.m32792b(this.versionName, amplitudeEvent.versionName) && C19383o.m32792b(this.osName, amplitudeEvent.osName) && C19383o.m32792b(this.osVersion, amplitudeEvent.osVersion) && this.apiLevel == amplitudeEvent.apiLevel && C19383o.m32792b(this.deviceBrand, amplitudeEvent.deviceBrand) && C19383o.m32792b(this.deviceManufacturer, amplitudeEvent.deviceManufacturer) && C19383o.m32792b(this.deviceModel, amplitudeEvent.deviceModel) && C19383o.m32792b(this.carrier, amplitudeEvent.carrier) && C19383o.m32792b(this.country, amplitudeEvent.country) && C19383o.m32792b(this.language, amplitudeEvent.language) && C19383o.m32792b(this.platform, amplitudeEvent.platform) && C19383o.m32792b(this.eventProperties, amplitudeEvent.eventProperties) && C19383o.m32792b(this.userProperties, amplitudeEvent.userProperties) && C19383o.m32792b(this.insertId, amplitudeEvent.insertId);
    }

    public final int getApiLevel() {
        return this.apiLevel;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final Map<String, Object> getEventProperties() {
        return this.eventProperties;
    }

    public final String getEventType() {
        return this.eventType;
    }

    public final String getInsertId() {
        return this.insertId;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getOsName() {
        return this.osName;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final UserProperties getUserProperties() {
        return this.userProperties;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        int b = C0071c.m190b(this.timestamp, this.eventType.hashCode() * 31, 31);
        String str = this.userId;
        int i = 0;
        int b2 = C0071c.m190b(this.sessionId, C0023f.m105e(this.deviceId, (b + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.versionName;
        int e = C0023f.m105e(this.osName, (b2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.osVersion;
        int a = C0069a.m170a(this.apiLevel, (e + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.deviceBrand;
        int hashCode = (a + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceManufacturer;
        int hashCode2 = (hashCode + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deviceModel;
        int hashCode3 = (hashCode2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.carrier;
        int hashCode4 = (hashCode3 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.country;
        int hashCode5 = (hashCode4 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.language;
        int hashCode6 = (this.eventProperties.hashCode() + C0023f.m105e(this.platform, (hashCode5 + (str9 == null ? 0 : str9.hashCode())) * 31, 31)) * 31;
        UserProperties userProperties2 = this.userProperties;
        if (userProperties2 != null) {
            i = userProperties2.hashCode();
        }
        return this.insertId.hashCode() + ((hashCode6 + i) * 31);
    }

    public String toString() {
        String str = this.eventType;
        long j = this.timestamp;
        String str2 = this.userId;
        String str3 = this.deviceId;
        long j2 = this.sessionId;
        String str4 = this.versionName;
        String str5 = this.osName;
        String str6 = this.osVersion;
        int i = this.apiLevel;
        String str7 = this.deviceBrand;
        String str8 = this.deviceManufacturer;
        String str9 = this.deviceModel;
        String str10 = this.carrier;
        String str11 = str9;
        String str12 = this.country;
        String str13 = this.language;
        String str14 = this.platform;
        Map<String, Object> map = this.eventProperties;
        UserProperties userProperties2 = this.userProperties;
        String str15 = this.insertId;
        StringBuilder sb = new StringBuilder();
        sb.append("AmplitudeEvent(eventType=");
        sb.append(str);
        sb.append(", timestamp=");
        sb.append(j);
        C0391c.m1061h(sb, ", userId=", str2, ", deviceId=", str3);
        sb.append(", sessionId=");
        sb.append(j2);
        sb.append(", versionName=");
        C0391c.m1061h(sb, str4, ", osName=", str5, ", osVersion=");
        sb.append(str6);
        sb.append(", apiLevel=");
        sb.append(i);
        sb.append(", deviceBrand=");
        C0391c.m1061h(sb, str7, ", deviceManufacturer=", str8, ", deviceModel=");
        C0391c.m1061h(sb, str11, ", carrier=", str10, ", country=");
        C0391c.m1061h(sb, str12, ", language=", str13, ", platform=");
        sb.append(str14);
        sb.append(", eventProperties=");
        sb.append(map);
        sb.append(", userProperties=");
        sb.append(userProperties2);
        sb.append(", insertId=");
        sb.append(str15);
        sb.append(")");
        return sb.toString();
    }

    public AmplitudeEvent(String str, long j, String str2, String str3, long j2, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Map<String, ? extends Object> map, UserProperties userProperties2, String str14) {
        String str15 = str5;
        String str16 = str13;
        Map<String, ? extends Object> map2 = map;
        String str17 = str14;
        C19383o.m32797g(str, "eventType");
        C19383o.m32797g(str3, "deviceId");
        C19383o.m32797g(str15, "osName");
        C19383o.m32797g(str16, "platform");
        C19383o.m32797g(map2, "eventProperties");
        C19383o.m32797g(str17, "insertId");
        this.eventType = str;
        this.timestamp = j;
        this.userId = str2;
        this.deviceId = str3;
        this.sessionId = j2;
        this.versionName = str4;
        this.osName = str15;
        this.osVersion = str6;
        this.apiLevel = i;
        this.deviceBrand = str7;
        this.deviceManufacturer = str8;
        this.deviceModel = str9;
        this.carrier = str10;
        this.country = str11;
        this.language = str12;
        this.platform = str16;
        this.eventProperties = map2;
        this.userProperties = userProperties2;
        this.insertId = str17;
    }
}
