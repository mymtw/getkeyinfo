package com.etsy.android.lib.models.apiv3.listing;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ShopsProductionPartnerJsonAdapter extends JsonAdapter<ShopsProductionPartner> {
    public static final int $stable = 8;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("production_partner_id", "public_name", "about_production_partner", "partners_role", "geoname", "geoname_country");

    public ShopsProductionPartnerJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "productionPartnerId");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "publicName");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopsProductionPartner)";
    }

    public ShopsProductionPartner fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Long l = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new ShopsProductionPartner(l, str, str2, str3, str4, str5);
    }

    public void toJson(C17412w wVar, ShopsProductionPartner shopsProductionPartner) {
        C19383o.m32797g(wVar, "writer");
        if (shopsProductionPartner != null) {
            wVar.mo68522b();
            wVar.mo68529h("production_partner_id");
            this.nullableLongAdapter.toJson(wVar, shopsProductionPartner.getProductionPartnerId());
            wVar.mo68529h("public_name");
            this.nullableStringAdapter.toJson(wVar, shopsProductionPartner.getPublicName());
            wVar.mo68529h("about_production_partner");
            this.nullableStringAdapter.toJson(wVar, shopsProductionPartner.getAboutProductionPartner());
            wVar.mo68529h("partners_role");
            this.nullableStringAdapter.toJson(wVar, shopsProductionPartner.getPartnersRole());
            wVar.mo68529h("geoname");
            this.nullableStringAdapter.toJson(wVar, shopsProductionPartner.getGeoname());
            wVar.mo68529h("geoname_country");
            this.nullableStringAdapter.toJson(wVar, shopsProductionPartner.getGeonameCountry());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
