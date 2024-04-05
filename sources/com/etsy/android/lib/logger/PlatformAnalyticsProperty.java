package com.etsy.android.lib.logger;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.session.C0087d;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;

public enum PlatformAnalyticsProperty implements AnalyticsProperty {
    CONTEXT_NAME("context_name"),
    IS_SURFACED("is_surfaced"),
    IS_RESUME("is_resume"),
    VIEW_NAME("view_name"),
    VIEW_ACTION("view_action"),
    PAGE_GUID("page_guid"),
    PARENT_PAGE_GUID("parent_page_guid"),
    USER_ID("user_id"),
    REGION("region"),
    AB("ab"),
    CONFIG_HASH("config_hash"),
    TIME_TO_FIRST_CONTENT("ttfc"),
    BLOCKING_NETWORK_BYTES("bnb"),
    BLOCKING_NETWORK_COUNT("bnc"),
    BLOCKING_NETWORK_DURATION("bnd"),
    BLOCKING_NETWORK_TIMERS("bnt"),
    NONBLOCKING_NETWORK_BYTES("nbnb"),
    NONBLOCKING_NETWORK_COUNT("nbnc"),
    NONBLOCKING_NETWORK_DURATION("nbnd"),
    NONBLOCKING_NETWORK_TIMERS("nbnt"),
    NATIVE_PERF("native_perf");
    
    public static final Parcelable.Creator<PlatformAnalyticsProperty> CREATOR = null;
    public static final C8665a Companion = null;
    private final String propertyName;

    public static final class Creator implements Parcelable.Creator<PlatformAnalyticsProperty> {
        public final PlatformAnalyticsProperty createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return PlatformAnalyticsProperty.valueOf(parcel.readString());
        }

        public final PlatformAnalyticsProperty[] newArray(int i) {
            return new PlatformAnalyticsProperty[i];
        }
    }

    /* renamed from: com.etsy.android.lib.logger.PlatformAnalyticsProperty$a */
    public static final class C8665a {
    }

    /* access modifiers changed from: public */
    static {
        Companion = new C8665a();
        CREATOR = new Creator();
    }

    private PlatformAnalyticsProperty(String str) {
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
