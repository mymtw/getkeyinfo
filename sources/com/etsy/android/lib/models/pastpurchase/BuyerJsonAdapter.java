package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.Scopes;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class BuyerJsonAdapter extends JsonAdapter<Buyer> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<FeedbackInfo> nullableFeedbackInfoAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Profile> nullableProfileAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("login_name", "user_id", ResponseConstants.CREATION_TSZ, Scopes.PROFILE, "feedback_info");

    public BuyerJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "loginName");
        this.intAdapter = yVar.mo68558c(Integer.TYPE, emptySet, "userId");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "creationTsz");
        this.nullableProfileAdapter = yVar.mo68558c(Profile.class, emptySet, Scopes.PROFILE);
        this.nullableFeedbackInfoAdapter = yVar.mo68558c(FeedbackInfo.class, emptySet, "feedbackInfo");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Buyer)";
    }

    public Buyer fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        Integer num = null;
        String str = null;
        Integer num2 = null;
        Profile profile = null;
        FeedbackInfo feedbackInfo = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (Q == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw C18215a.m30734m("userId", "user_id", jsonReader);
                }
            } else if (Q == 2) {
                num2 = this.nullableIntAdapter.fromJson(jsonReader);
            } else if (Q == 3) {
                profile = this.nullableProfileAdapter.fromJson(jsonReader);
            } else if (Q == 4) {
                feedbackInfo = this.nullableFeedbackInfoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (num != null) {
            return new Buyer(str, num.intValue(), num2, profile, feedbackInfo);
        }
        throw C18215a.m30728g("userId", "user_id", jsonReader);
    }

    public void toJson(C17412w wVar, Buyer buyer) {
        C19383o.m32797g(wVar, "writer");
        if (buyer != null) {
            wVar.mo68522b();
            wVar.mo68529h("login_name");
            this.nullableStringAdapter.toJson(wVar, buyer.getLoginName());
            wVar.mo68529h("user_id");
            this.intAdapter.toJson(wVar, Integer.valueOf(buyer.getUserId()));
            wVar.mo68529h(ResponseConstants.CREATION_TSZ);
            this.nullableIntAdapter.toJson(wVar, buyer.getCreationTsz());
            wVar.mo68529h(Scopes.PROFILE);
            this.nullableProfileAdapter.toJson(wVar, buyer.getProfile());
            wVar.mo68529h("feedback_info");
            this.nullableFeedbackInfoAdapter.toJson(wVar, buyer.getFeedbackInfo());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
