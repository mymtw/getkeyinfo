package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.apiv3.listing.FormattedMoney;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class DetailedFreeShippingJsonAdapter extends JsonAdapter<DetailedFreeShipping> {
    public static final int $stable = 8;
    private volatile Constructor<DetailedFreeShipping> constructorRef;
    private final JsonAdapter<FormattedMoney> nullableFormattedMoneyAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("title", DetailsBottomSheetNavigationKey.PARAM_BODY);

    public DetailedFreeShippingJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "title");
        this.nullableFormattedMoneyAdapter = yVar.mo68558c(FormattedMoney.class, emptySet, DetailsBottomSheetNavigationKey.PARAM_BODY);
    }

    public String toString() {
        return "GeneratedJsonAdapter(DetailedFreeShipping)";
    }

    public DetailedFreeShipping fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        FormattedMoney formattedMoney = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1) {
                formattedMoney = this.nullableFormattedMoneyAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.mo68413e();
        if (i == -4) {
            return new DetailedFreeShipping(str, formattedMoney);
        }
        Constructor<DetailedFreeShipping> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DetailedFreeShipping.class.getDeclaredConstructor(new Class[]{String.class, FormattedMoney.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "DetailedFreeShipping::cl…his.constructorRef = it }");
        }
        DetailedFreeShipping newInstance = constructor.newInstance(new Object[]{str, formattedMoney, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, DetailedFreeShipping detailedFreeShipping) {
        C19383o.m32797g(wVar, "writer");
        if (detailedFreeShipping != null) {
            wVar.mo68522b();
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, detailedFreeShipping.getTitle());
            wVar.mo68529h(DetailsBottomSheetNavigationKey.PARAM_BODY);
            this.nullableFormattedMoneyAdapter.toJson(wVar, detailedFreeShipping.getBody());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
