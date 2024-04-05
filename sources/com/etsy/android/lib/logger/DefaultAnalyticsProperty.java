package com.etsy.android.lib.logger;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.session.C0087d;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;

public enum DefaultAnalyticsProperty implements AnalyticsProperty {
    BROWSER_ID("browser_id"),
    EVENT_TIMESTAMP("event_timestamp"),
    EVENT_LOGGER("event_logger"),
    EVENT_NAME(ResponseConstants.EVENT_NAME),
    EVENT_SOURCE("event_source"),
    GUID("guid"),
    PRIMARY_EVENT("primary_event"),
    ADVERTISING_ID("advertising_id"),
    SERVER_TIMESTAMP_OFFSET("server_timestamp_offset"),
    ORIENTATION("orientation"),
    APP_VERSION("app_version"),
    APP_NAME("app_name"),
    DEVICE_SYSTEM_NAME("device_system_name"),
    DEVICE_SYSTEM_VERSION("device_system_version"),
    HARDWARE_PLATFORM_STRING("hardware_platform_string"),
    HARDWARE_PLATFORM("hardware_platform"),
    HARDWARE_MANUFACTURER("hardware_manufacturer"),
    HARDWARE_MODEL("hardware_model"),
    DEVICE_RESOLUTION("device_resolution"),
    ACCEPT_LANGUAGES("accept-languages"),
    TIME_ZONE("time_zone"),
    APP_INITIAL_START_TIME("app_initial_start_time"),
    APP_START_TIME("app_start_time"),
    APP_FOREGROUND_TIME("app_foreground_time"),
    APP_IN_BACKGROUND("app_in_background"),
    IS_ADMIN("isAdmin"),
    GDPR_THIRD_PARTY_CONSENT("gdpr_tp"),
    GDPR_PERSONALIZATION_CONSENT("gdpr_p");
    
    public static final Parcelable.Creator<DefaultAnalyticsProperty> CREATOR = null;
    public static final C8662a Companion = null;
    private final String propertyName;

    public static final class Creator implements Parcelable.Creator<DefaultAnalyticsProperty> {
        public final DefaultAnalyticsProperty createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return DefaultAnalyticsProperty.valueOf(parcel.readString());
        }

        public final DefaultAnalyticsProperty[] newArray(int i) {
            return new DefaultAnalyticsProperty[i];
        }
    }

    /* renamed from: com.etsy.android.lib.logger.DefaultAnalyticsProperty$a */
    public static final class C8662a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C8662a();
        CREATOR = new Creator();
    }

    private DefaultAnalyticsProperty(String str) {
        this.propertyName = str;
    }

    public int describeContents() {
        return 0;
    }

    public String readPropertyName() {
        String str = this.propertyName;
        Locale locale = Locale.US;
        return C0087d.m237g(locale, UserStateKt.US_COUNTRY, str, locale, "this as java.lang.String).toLowerCase(locale)");
    }

    public String toString() {
        return readPropertyName();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeString(name());
    }
}
