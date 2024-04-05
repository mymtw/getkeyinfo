package com.etsy.android.p327ui.user.review;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.user.review.ReviewFlowShopInfoJsonAdapter */
public final class ReviewFlowShopInfoJsonAdapter extends JsonAdapter<ReviewFlowShopInfo> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("shop_icon", "shop_has_icon", ResponseConstants.SHOP_URL, "title");

    public ReviewFlowShopInfoJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "shopIcon");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "shopHasIcon");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        Boolean bool = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
            } else if (Q == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        return new ReviewFlowShopInfo(str, bool, str2, str3);
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewFlowShopInfo reviewFlowShopInfo = (ReviewFlowShopInfo) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewFlowShopInfo != null) {
            wVar.mo68522b();
            wVar.mo68529h("shop_icon");
            this.nullableStringAdapter.toJson(wVar, reviewFlowShopInfo.f26018a);
            wVar.mo68529h("shop_has_icon");
            this.nullableBooleanAdapter.toJson(wVar, reviewFlowShopInfo.f26019b);
            wVar.mo68529h(ResponseConstants.SHOP_URL);
            this.nullableStringAdapter.toJson(wVar, reviewFlowShopInfo.f26020c);
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, reviewFlowShopInfo.f26021d);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewFlowShopInfo)";
    }
}
