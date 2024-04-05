package com.etsy.android.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.logger.C8697k;
import com.etsy.android.lib.logger.C8699m;
import com.etsy.android.lib.logger.PredefinedAnalyticsProperty;
import com.etsy.android.lib.util.C8885d0;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.C19421p;
import p003a2.C0023f;

@C17403o(generateAdapter = true)
public final class Country implements Comparable<Country>, Parcelable, C8697k {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Country> CREATOR = new Creator();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Set<String> PRIMARY_ISO_CODES = C19382n.m32704D0(UserStateKt.US_COUNTRY, "CA", "AU", "GB", "DE", "FR", "NL", "IT", "ES", "RU", "PT", "GR", "IE", "NZ", "JP", "IN");
    private final int countryId;
    private final String isoCountryCode;
    private final String name;
    private final String slug;
    private transient C8699m trackingData;
    private final String worldBankCode;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getPRIMARY_ISO_CODES$annotations() {
        }

        public final Set<String> getPRIMARY_ISO_CODES() {
            return Country.PRIMARY_ISO_CODES;
        }
    }

    public static final class Creator implements Parcelable.Creator<Country> {
        public final Country createFromParcel(Parcel parcel) {
            C19383o.m32797g(parcel, "parcel");
            return new Country(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Country[] newArray(int i) {
            return new Country[i];
        }
    }

    public Country() {
        this(0, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public Country(@C17402n(name = "country_id") int i, @C17402n(name = "name") String str, @C17402n(name = "iso_country_code") String str2, @C17402n(name = "world_bank_country_code") String str3, @C17402n(name = "slug") String str4) {
        C0391c.m1060g(str, "name", str2, "isoCountryCode", str3, "worldBankCode", str4, "slug");
        this.countryId = i;
        this.name = str;
        this.isoCountryCode = str2;
        this.worldBankCode = str3;
        this.slug = str4;
        this.trackingData = new C8699m(C19421p.m32931U(new Pair(PredefinedAnalyticsProperty.COUNTRY_ID, Integer.valueOf(i))), 14);
    }

    public static /* synthetic */ Country copy$default(Country country, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = country.countryId;
        }
        if ((i2 & 2) != 0) {
            str = country.name;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = country.isoCountryCode;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = country.worldBankCode;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = country.slug;
        }
        return country.copy(i, str5, str6, str7, str4);
    }

    public static final Set<String> getPRIMARY_ISO_CODES() {
        return Companion.getPRIMARY_ISO_CODES();
    }

    @C17402n(ignore = true)
    public static /* synthetic */ void getTrackingData$annotations() {
    }

    public final int component1() {
        return this.countryId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.isoCountryCode;
    }

    public final String component4() {
        return this.worldBankCode;
    }

    public final String component5() {
        return this.slug;
    }

    public final Country copy(@C17402n(name = "country_id") int i, @C17402n(name = "name") String str, @C17402n(name = "iso_country_code") String str2, @C17402n(name = "world_bank_country_code") String str3, @C17402n(name = "slug") String str4) {
        C19383o.m32797g(str, "name");
        C19383o.m32797g(str2, "isoCountryCode");
        C19383o.m32797g(str3, "worldBankCode");
        C19383o.m32797g(str4, "slug");
        return new Country(i, str, str2, str3, str4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Country)) {
            return false;
        }
        Country country = (Country) obj;
        return this.countryId == country.countryId && C19383o.m32792b(this.name, country.name) && C19383o.m32792b(this.isoCountryCode, country.isoCountryCode) && C19383o.m32792b(this.worldBankCode, country.worldBankCode) && C19383o.m32792b(this.slug, country.slug);
    }

    public final int getCountryId() {
        return this.countryId;
    }

    public final String getDisplayCountry() {
        String displayCountry = new Locale("", this.isoCountryCode).getDisplayCountry();
        C19383o.m32796f(displayCountry, "Locale(\"\", isoCountryCode).displayCountry");
        return displayCountry;
    }

    public final String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSlug() {
        return this.slug;
    }

    public C8699m getTrackingData() {
        return this.trackingData;
    }

    public final String getWorldBankCode() {
        return this.worldBankCode;
    }

    public int hashCode() {
        return this.slug.hashCode() + C0023f.m105e(this.worldBankCode, C0023f.m105e(this.isoCountryCode, C0023f.m105e(this.name, Integer.hashCode(this.countryId) * 31, 31), 31), 31);
    }

    public final boolean isPrimary() {
        return PRIMARY_ISO_CODES.contains(this.isoCountryCode);
    }

    public final boolean isUs() {
        return C19383o.m32792b(Locale.US.getISO3Country(), this.worldBankCode);
    }

    public void setTrackingData(C8699m mVar) {
        C19383o.m32797g(mVar, "<set-?>");
        this.trackingData = mVar;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Country(countryId=");
        h.append(this.countryId);
        h.append(", name=");
        h.append(this.name);
        h.append(", isoCountryCode=");
        h.append(this.isoCountryCode);
        h.append(", worldBankCode=");
        h.append(this.worldBankCode);
        h.append(", slug=");
        return C0391c.m1057c(h, this.slug, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19383o.m32797g(parcel, "out");
        parcel.writeInt(this.countryId);
        parcel.writeString(this.name);
        parcel.writeString(this.isoCountryCode);
        parcel.writeString(this.worldBankCode);
        parcel.writeString(this.slug);
    }

    public int compareTo(Country country) {
        C19383o.m32797g(country, "other");
        if (isPrimary()) {
            if (country.isPrimary()) {
                return C8885d0.m17317a(this.name, country.name);
            }
            return -1;
        } else if (country.isPrimary()) {
            return 1;
        } else {
            return C8885d0.m17317a(this.name, country.name);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Country(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0005
            r4 = 0
        L_0x0005:
            r10 = r9 & 2
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x000d
            r10 = r0
            goto L_0x000e
        L_0x000d:
            r10 = r5
        L_0x000e:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r6
        L_0x0015:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r7
        L_0x001c:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = r8
        L_0x0022:
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r2
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.Country.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
