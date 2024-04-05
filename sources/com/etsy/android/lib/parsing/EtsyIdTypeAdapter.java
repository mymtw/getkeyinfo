package com.etsy.android.lib.parsing;

import com.etsy.android.lib.models.datatypes.EtsyId;
import com.squareup.moshi.C17401m;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17418z;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class EtsyIdTypeAdapter extends JsonAdapter<EtsyId> {

    /* renamed from: com.etsy.android.lib.parsing.EtsyIdTypeAdapter$a */
    public /* synthetic */ class C8817a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19372a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            iArr[JsonReader.Token.STRING.ordinal()] = 1;
            iArr[JsonReader.Token.NUMBER.ordinal()] = 2;
            f19372a = iArr;
        }
    }

    @C17401m
    public EtsyId fromJson(JsonReader jsonReader) {
        EtsyId etsyId;
        C19383o.m32797g(jsonReader, "reader");
        JsonReader.Token u = jsonReader.mo68426u();
        int i = u == null ? -1 : C8817a.f19372a[u.ordinal()];
        if (i == 1) {
            etsyId = new EtsyId(jsonReader.mo68425t());
        } else if (i != 2) {
            return new EtsyId((String) null, 1, (DefaultConstructorMarker) null);
        } else {
            etsyId = new EtsyId(jsonReader.mo68420j());
        }
        return etsyId;
    }

    @C17418z
    public void toJson(C17412w wVar, EtsyId etsyId) {
        C19383o.m32797g(wVar, "writer");
        wVar.mo68535x(etsyId != null ? etsyId.getId() : null);
    }
}
