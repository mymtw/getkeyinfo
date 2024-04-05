package com.etsy.android.lib.selfuser;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class SelfUserListingImageJsonAdapter extends JsonAdapter<SelfUserListingImage> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.URL_FULLxFULL, ResponseConstants.HUE, ResponseConstants.SATURATION, ResponseConstants.BRIGHTNESS);

    public SelfUserListingImageJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "url");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, ResponseConstants.HUE);
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                num = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                num2 = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                num3 = this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new SelfUserListingImage(str, num, num2, num3);
    }

    public final void toJson(C17412w wVar, Object obj) {
        SelfUserListingImage selfUserListingImage = (SelfUserListingImage) obj;
        C19383o.m32797g(wVar, "writer");
        if (selfUserListingImage != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.URL_FULLxFULL);
            this.nullableStringAdapter.toJson(wVar, selfUserListingImage.f19494a);
            wVar.mo68529h(ResponseConstants.HUE);
            this.nullableIntAdapter.toJson(wVar, selfUserListingImage.f19495b);
            wVar.mo68529h(ResponseConstants.SATURATION);
            this.nullableIntAdapter.toJson(wVar, selfUserListingImage.f19496c);
            wVar.mo68529h(ResponseConstants.BRIGHTNESS);
            this.nullableIntAdapter.toJson(wVar, selfUserListingImage.f19497d);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SelfUserListingImage)";
    }
}
