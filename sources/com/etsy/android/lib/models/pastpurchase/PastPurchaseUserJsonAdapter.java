package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.Scopes;
import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class PastPurchaseUserJsonAdapter extends JsonAdapter<PastPurchaseUser> {
    public static final int $stable = 8;
    private volatile Constructor<PastPurchaseUser> constructorRef;
    private final JsonAdapter<List<PastPurchaseShop>> nullableListOfPastPurchaseShopAdapter;
    private final JsonAdapter<PastPurchaseUserProfile> nullablePastPurchaseUserProfileAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("login_name", ResponseConstants.Includes.PROFILE, ResponseConstants.Includes.SHOPS);

    public PastPurchaseUserJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "loginName");
        this.nullablePastPurchaseUserProfileAdapter = yVar.mo68558c(PastPurchaseUserProfile.class, emptySet, Scopes.PROFILE);
        this.nullableListOfPastPurchaseShopAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, PastPurchaseShop.class), emptySet, "shops");
    }

    public String toString() {
        return "GeneratedJsonAdapter(PastPurchaseUser)";
    }

    public PastPurchaseUser fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        PastPurchaseUserProfile pastPurchaseUserProfile = null;
        List list = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                pastPurchaseUserProfile = this.nullablePastPurchaseUserProfileAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (Q == 2) {
                list = this.nullableListOfPastPurchaseShopAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.mo68413e();
        if (i == -8) {
            return new PastPurchaseUser(str, pastPurchaseUserProfile, list);
        }
        Constructor<PastPurchaseUser> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PastPurchaseUser.class.getDeclaredConstructor(new Class[]{String.class, PastPurchaseUserProfile.class, List.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "PastPurchaseUser::class.…his.constructorRef = it }");
        }
        PastPurchaseUser newInstance = constructor.newInstance(new Object[]{str, pastPurchaseUserProfile, list, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, PastPurchaseUser pastPurchaseUser) {
        C19383o.m32797g(wVar, "writer");
        if (pastPurchaseUser != null) {
            wVar.mo68522b();
            wVar.mo68529h("login_name");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseUser.getLoginName());
            wVar.mo68529h(ResponseConstants.Includes.PROFILE);
            this.nullablePastPurchaseUserProfileAdapter.toJson(wVar, pastPurchaseUser.getProfile());
            wVar.mo68529h(ResponseConstants.Includes.SHOPS);
            this.nullableListOfPastPurchaseShopAdapter.toJson(wVar, pastPurchaseUser.getShops());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
