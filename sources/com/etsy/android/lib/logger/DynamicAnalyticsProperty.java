package com.etsy.android.lib.logger;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.C0087d;
import com.etsy.android.lib.logger.DefaultAnalyticsProperty;
import com.etsy.android.lib.logger.PlatformAnalyticsProperty;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;

public final class DynamicAnalyticsProperty implements AnalyticsProperty {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DynamicAnalyticsProperty> CREATOR = new Creator();
    private final String propertyName;

    public static final class Creator implements Parcelable.Creator<DynamicAnalyticsProperty> {
        public final DynamicAnalyticsProperty createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new DynamicAnalyticsProperty(parcel.readString());
        }

        public final DynamicAnalyticsProperty[] newArray(int i) {
            return new DynamicAnalyticsProperty[i];
        }
    }

    public DynamicAnalyticsProperty(String str) {
        boolean z;
        boolean z2;
        C19383o.m32797g(str, "propertyName");
        this.propertyName = str;
        PredefinedAnalyticsProperty.Companion.getClass();
        PredefinedAnalyticsProperty[] values = PredefinedAnalyticsProperty.values();
        int length = values.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (C19383o.m32792b(values[i].readPropertyName(), str)) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            C8694h a = LogCatKt.m17045a();
            StringBuilder h = C0072d.m201h("Warning: Attempting to create a DynamicAnalyticsAttribute(");
            h.append(this.propertyName);
            h.append(") but this value already exists as a PredefinedAnalyticsAttribute");
            a.mo21313g(h.toString());
        }
        PlatformAnalyticsProperty.C8665a aVar = PlatformAnalyticsProperty.Companion;
        String str2 = this.propertyName;
        aVar.getClass();
        C19383o.m32797g(str2, "propertyName");
        PlatformAnalyticsProperty[] values2 = PlatformAnalyticsProperty.values();
        int length2 = values2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                z2 = false;
                break;
            } else if (C19383o.m32792b(values2[i2].readPropertyName(), str2)) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        if (z2) {
            C8694h a2 = LogCatKt.m17045a();
            StringBuilder h2 = C0072d.m201h("Error: Attempting to create a DynamicAnalyticsAttribute(");
            h2.append(this.propertyName);
            h2.append(") but this value already exists as a PlatformAnalyticsProperty");
            a2.mo21306a(h2.toString());
        }
        DefaultAnalyticsProperty.C8662a aVar2 = DefaultAnalyticsProperty.Companion;
        String str3 = this.propertyName;
        aVar2.getClass();
        C19383o.m32797g(str3, "propertyName");
        DefaultAnalyticsProperty[] values3 = DefaultAnalyticsProperty.values();
        int length3 = values3.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                break;
            } else if (C19383o.m32792b(values3[i3].readPropertyName(), str3)) {
                z3 = true;
                break;
            } else {
                i3++;
            }
        }
        if (z3) {
            C8694h a3 = LogCatKt.m17045a();
            StringBuilder h3 = C0072d.m201h("Error: Attempting to create a DynamicAnalyticsAttribute(");
            h3.append(this.propertyName);
            h3.append(") but this value already exists as a DefaultAnalyticsProperty");
            a3.mo21306a(h3.toString());
        }
    }

    private final String component1() {
        return this.propertyName;
    }

    public static /* synthetic */ DynamicAnalyticsProperty copy$default(DynamicAnalyticsProperty dynamicAnalyticsProperty, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dynamicAnalyticsProperty.propertyName;
        }
        return dynamicAnalyticsProperty.copy(str);
    }

    public final DynamicAnalyticsProperty copy(String str) {
        C19383o.m32797g(str, "propertyName");
        return new DynamicAnalyticsProperty(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DynamicAnalyticsProperty) && C19383o.m32792b(this.propertyName, ((DynamicAnalyticsProperty) obj).propertyName);
    }

    public int hashCode() {
        return this.propertyName.hashCode();
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
        parcel.writeString(this.propertyName);
    }
}
