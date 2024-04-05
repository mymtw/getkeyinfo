package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class AppsInventoryAddToCartContextJsonAdapter extends JsonAdapter<AppsInventoryAddToCartContext> {
    public static final int $stable = 8;
    private volatile Constructor<AppsInventoryAddToCartContext> constructorRef;
    private final JsonAdapter<AppsInventoryAddToCartUi> nullableAppsInventoryAddToCartUiAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<InventoryProductOffering> nullableInventoryProductOfferingAdapter;
    private final JsonAdapter<Money> nullableMoneyAdapter;
    private final JsonAdapter<Nudge> nullableNudgeAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.MAX_PRICE, ResponseConstants.MAX_QUANTITY, ResponseConstants.MIN_PRICE, ResponseConstants.MIN_QUANTITY, ResponseConstants.OFFERING, ResponseConstants.f19137UI, ResponseConstants.NUDGE);

    public AppsInventoryAddToCartContextJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableMoneyAdapter = yVar.mo68558c(Money.class, emptySet, "maxPrice");
        this.nullableIntAdapter = yVar.mo68558c(Integer.class, emptySet, "maxQuantity");
        this.nullableInventoryProductOfferingAdapter = yVar.mo68558c(InventoryProductOffering.class, emptySet, ResponseConstants.OFFERING);
        this.nullableAppsInventoryAddToCartUiAdapter = yVar.mo68558c(AppsInventoryAddToCartUi.class, emptySet, ResponseConstants.f19137UI);
        this.nullableNudgeAdapter = yVar.mo68558c(Nudge.class, emptySet, ResponseConstants.NUDGE);
    }

    public String toString() {
        return "GeneratedJsonAdapter(AppsInventoryAddToCartContext)";
    }

    public AppsInventoryAddToCartContext fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Integer> cls = Integer.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        Money money = null;
        Integer num = null;
        Money money2 = null;
        Integer num2 = null;
        InventoryProductOffering inventoryProductOffering = null;
        AppsInventoryAddToCartUi appsInventoryAddToCartUi = null;
        Nudge nudge = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    money = this.nullableMoneyAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    money2 = this.nullableMoneyAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    inventoryProductOffering = this.nullableInventoryProductOfferingAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    appsInventoryAddToCartUi = this.nullableAppsInventoryAddToCartUiAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    nudge = this.nullableNudgeAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -128) {
            return new AppsInventoryAddToCartContext(money, num, money2, num2, inventoryProductOffering, appsInventoryAddToCartUi, nudge);
        }
        Constructor<AppsInventoryAddToCartContext> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AppsInventoryAddToCartContext.class.getDeclaredConstructor(new Class[]{Money.class, cls, Money.class, cls, InventoryProductOffering.class, AppsInventoryAddToCartUi.class, Nudge.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "AppsInventoryAddToCartCo…his.constructorRef = it }");
        }
        AppsInventoryAddToCartContext newInstance = constructor.newInstance(new Object[]{money, num, money2, num2, inventoryProductOffering, appsInventoryAddToCartUi, nudge, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, AppsInventoryAddToCartContext appsInventoryAddToCartContext) {
        C19383o.m32797g(wVar, "writer");
        if (appsInventoryAddToCartContext != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.MAX_PRICE);
            this.nullableMoneyAdapter.toJson(wVar, appsInventoryAddToCartContext.getMaxPrice());
            wVar.mo68529h(ResponseConstants.MAX_QUANTITY);
            this.nullableIntAdapter.toJson(wVar, appsInventoryAddToCartContext.getMaxQuantity());
            wVar.mo68529h(ResponseConstants.MIN_PRICE);
            this.nullableMoneyAdapter.toJson(wVar, appsInventoryAddToCartContext.getMinPrice());
            wVar.mo68529h(ResponseConstants.MIN_QUANTITY);
            this.nullableIntAdapter.toJson(wVar, appsInventoryAddToCartContext.getMinQuantity());
            wVar.mo68529h(ResponseConstants.OFFERING);
            this.nullableInventoryProductOfferingAdapter.toJson(wVar, appsInventoryAddToCartContext.getOffering());
            wVar.mo68529h(ResponseConstants.f19137UI);
            this.nullableAppsInventoryAddToCartUiAdapter.toJson(wVar, appsInventoryAddToCartContext.getUi());
            wVar.mo68529h(ResponseConstants.NUDGE);
            this.nullableNudgeAdapter.toJson(wVar, appsInventoryAddToCartContext.getNudge());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
