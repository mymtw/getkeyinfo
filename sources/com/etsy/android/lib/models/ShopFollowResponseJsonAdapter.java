package com.etsy.android.lib.models;

import com.etsy.android.lib.models.apiv3.Alert;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class ShopFollowResponseJsonAdapter extends JsonAdapter<ShopFollowResponse> {
    public static final int $stable = 8;
    private volatile Constructor<ShopFollowResponse> constructorRef;
    private final JsonAdapter<Alert> nullableAlertAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("social_invites_flag", "alert");

    public ShopFollowResponseJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, "socialInvitesFlag");
        this.nullableAlertAdapter = yVar.mo68558c(Alert.class, emptySet, "alert");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ShopFollowResponse)";
    }

    public ShopFollowResponse fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Boolean bool = null;
        Alert alert = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                alert = this.nullableAlertAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.mo68413e();
        if (i == -4) {
            return new ShopFollowResponse(bool, alert);
        }
        Constructor<ShopFollowResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ShopFollowResponse.class.getDeclaredConstructor(new Class[]{Boolean.class, Alert.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ShopFollowResponse::clas…his.constructorRef = it }");
        }
        ShopFollowResponse newInstance = constructor.newInstance(new Object[]{bool, alert, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ShopFollowResponse shopFollowResponse) {
        C19383o.m32797g(wVar, "writer");
        if (shopFollowResponse != null) {
            wVar.mo68522b();
            wVar.mo68529h("social_invites_flag");
            this.nullableBooleanAdapter.toJson(wVar, shopFollowResponse.getSocialInvitesFlag());
            wVar.mo68529h("alert");
            this.nullableAlertAdapter.toJson(wVar, shopFollowResponse.getAlert());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
