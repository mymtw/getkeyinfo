package com.etsy.android.lib.models.pastpurchase;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class PastPurchaseUserProfileJsonAdapter extends JsonAdapter<PastPurchaseUserProfile> {
    public static final int $stable = 8;
    private volatile Constructor<PastPurchaseUserProfile> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("image_url_75x75", ResponseConstants.FIRST_NAME, "last_name", "login_name");

    public PastPurchaseUserProfileJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        this.nullableStringAdapter = yVar.mo68558c(String.class, EmptySet.INSTANCE, "url75x75");
    }

    public String toString() {
        return "GeneratedJsonAdapter(PastPurchaseUserProfile)";
    }

    public PastPurchaseUserProfile fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -2;
            } else if (Q == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -3;
            } else if (Q == 2) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -5;
            } else if (Q == 3) {
                str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                i &= -9;
            }
        }
        jsonReader.mo68413e();
        if (i == -16) {
            return new PastPurchaseUserProfile(str, str2, str3, str4);
        }
        Constructor<PastPurchaseUserProfile> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PastPurchaseUserProfile.class.getDeclaredConstructor(new Class[]{cls, cls, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "PastPurchaseUserProfile:…his.constructorRef = it }");
        }
        PastPurchaseUserProfile newInstance = constructor.newInstance(new Object[]{str, str2, str3, str4, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, PastPurchaseUserProfile pastPurchaseUserProfile) {
        C19383o.m32797g(wVar, "writer");
        if (pastPurchaseUserProfile != null) {
            wVar.mo68522b();
            wVar.mo68529h("image_url_75x75");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseUserProfile.getUrl75x75());
            wVar.mo68529h(ResponseConstants.FIRST_NAME);
            this.nullableStringAdapter.toJson(wVar, pastPurchaseUserProfile.getFirstName());
            wVar.mo68529h("last_name");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseUserProfile.getLastName());
            wVar.mo68529h("login_name");
            this.nullableStringAdapter.toJson(wVar, pastPurchaseUserProfile.getLoginName());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
