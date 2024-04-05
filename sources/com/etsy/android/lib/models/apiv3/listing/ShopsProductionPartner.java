package com.etsy.android.lib.models.apiv3.listing;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import kotlin.jvm.internal.C19383o;

@C17403o(generateAdapter = true)
public final class ShopsProductionPartner {
    public static final int $stable = 0;
    private final String aboutProductionPartner;
    private final String geoname;
    private final String geonameCountry;
    private final String partnersRole;
    private final Long productionPartnerId;
    private final String publicName;

    public ShopsProductionPartner(@C17402n(name = "production_partner_id") Long l, @C17402n(name = "public_name") String str, @C17402n(name = "about_production_partner") String str2, @C17402n(name = "partners_role") String str3, @C17402n(name = "geoname") String str4, @C17402n(name = "geoname_country") String str5) {
        this.productionPartnerId = l;
        this.publicName = str;
        this.aboutProductionPartner = str2;
        this.partnersRole = str3;
        this.geoname = str4;
        this.geonameCountry = str5;
    }

    public static /* synthetic */ ShopsProductionPartner copy$default(ShopsProductionPartner shopsProductionPartner, Long l, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            l = shopsProductionPartner.productionPartnerId;
        }
        if ((i & 2) != 0) {
            str = shopsProductionPartner.publicName;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = shopsProductionPartner.aboutProductionPartner;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = shopsProductionPartner.partnersRole;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = shopsProductionPartner.geoname;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = shopsProductionPartner.geonameCountry;
        }
        return shopsProductionPartner.copy(l, str6, str7, str8, str9, str5);
    }

    public final Long component1() {
        return this.productionPartnerId;
    }

    public final String component2() {
        return this.publicName;
    }

    public final String component3() {
        return this.aboutProductionPartner;
    }

    public final String component4() {
        return this.partnersRole;
    }

    public final String component5() {
        return this.geoname;
    }

    public final String component6() {
        return this.geonameCountry;
    }

    public final ShopsProductionPartner copy(@C17402n(name = "production_partner_id") Long l, @C17402n(name = "public_name") String str, @C17402n(name = "about_production_partner") String str2, @C17402n(name = "partners_role") String str3, @C17402n(name = "geoname") String str4, @C17402n(name = "geoname_country") String str5) {
        return new ShopsProductionPartner(l, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopsProductionPartner)) {
            return false;
        }
        ShopsProductionPartner shopsProductionPartner = (ShopsProductionPartner) obj;
        return C19383o.m32792b(this.productionPartnerId, shopsProductionPartner.productionPartnerId) && C19383o.m32792b(this.publicName, shopsProductionPartner.publicName) && C19383o.m32792b(this.aboutProductionPartner, shopsProductionPartner.aboutProductionPartner) && C19383o.m32792b(this.partnersRole, shopsProductionPartner.partnersRole) && C19383o.m32792b(this.geoname, shopsProductionPartner.geoname) && C19383o.m32792b(this.geonameCountry, shopsProductionPartner.geonameCountry);
    }

    public final String getAboutProductionPartner() {
        return this.aboutProductionPartner;
    }

    public final String getGeoname() {
        return this.geoname;
    }

    public final String getGeonameCountry() {
        return this.geonameCountry;
    }

    public final String getPartnersRole() {
        return this.partnersRole;
    }

    public final Long getProductionPartnerId() {
        return this.productionPartnerId;
    }

    public final String getPublicName() {
        return this.publicName;
    }

    public int hashCode() {
        Long l = this.productionPartnerId;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.publicName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.aboutProductionPartner;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.partnersRole;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.geoname;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.geonameCountry;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("ShopsProductionPartner(productionPartnerId=");
        h.append(this.productionPartnerId);
        h.append(", publicName=");
        h.append(this.publicName);
        h.append(", aboutProductionPartner=");
        h.append(this.aboutProductionPartner);
        h.append(", partnersRole=");
        h.append(this.partnersRole);
        h.append(", geoname=");
        h.append(this.geoname);
        h.append(", geonameCountry=");
        return C0391c.m1057c(h, this.geonameCountry, ')');
    }
}
