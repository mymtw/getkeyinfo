package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.Scopes;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class SellerJsonAdapter extends JsonAdapter<Seller> {
    public static final int $stable = 8;
    private final JsonAdapter<FeedbackInfo> nullableFeedbackInfoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<ShopItem>> nullableListOfNullableShopItemAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<Profile> nullableProfileAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("login_name", "user_id", ResponseConstants.CREATION_TSZ, Scopes.PROFILE, "shops", "feedback_info");

    public SellerJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "loginName");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "userId");
        this.nullableLongAdapter = yVar.mo68558c(Long.class, emptySet, "creationTsz");
        this.nullableProfileAdapter = yVar.mo68558c(Profile.class, emptySet, Scopes.PROFILE);
        this.nullableListOfNullableShopItemAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, ShopItem.class), emptySet, "shops");
        this.nullableFeedbackInfoAdapter = yVar.mo68558c(FeedbackInfo.class, emptySet, "feedbackInfo");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Seller)";
    }

    public Seller fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        String str = null;
        Integer num = null;
        Long l = null;
        Profile profile = null;
        List list = null;
        FeedbackInfo feedbackInfo = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    num = this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    l = this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    profile = this.nullableProfileAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    list = this.nullableListOfNullableShopItemAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    feedbackInfo = this.nullableFeedbackInfoAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.mo68413e();
        return new Seller(str, num, l, profile, list, feedbackInfo);
    }

    public void toJson(C17412w wVar, Seller seller) {
        C19383o.m32797g(wVar, "writer");
        if (seller != null) {
            wVar.mo68522b();
            wVar.mo68529h("login_name");
            this.nullableStringAdapter.toJson(wVar, seller.getLoginName());
            wVar.mo68529h("user_id");
            this.nullableIntAdapter.toJson(wVar, seller.getUserId());
            wVar.mo68529h(ResponseConstants.CREATION_TSZ);
            this.nullableLongAdapter.toJson(wVar, seller.getCreationTsz());
            wVar.mo68529h(Scopes.PROFILE);
            this.nullableProfileAdapter.toJson(wVar, seller.getProfile());
            wVar.mo68529h("shops");
            this.nullableListOfNullableShopItemAdapter.toJson(wVar, seller.getShops());
            wVar.mo68529h("feedback_info");
            this.nullableFeedbackInfoAdapter.toJson(wVar, seller.getFeedbackInfo());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
