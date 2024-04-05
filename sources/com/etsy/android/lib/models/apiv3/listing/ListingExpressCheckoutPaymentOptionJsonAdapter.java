package com.etsy.android.lib.models.apiv3.listing;

import com.etsy.android.lib.models.ResponseConstants;
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

public final class ListingExpressCheckoutPaymentOptionJsonAdapter extends JsonAdapter<ListingExpressCheckoutPaymentOption> {
    public static final int $stable = 8;
    private volatile Constructor<ListingExpressCheckoutPaymentOption> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<SvgIconData> nullableSvgIconDataAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.ICON_CLASSES, "icon_text", ResponseConstants.INPUT_ID, ResponseConstants.LABEL, "payment_method", ResponseConstants.SELECTED, ResponseConstants.SUBMIT_CLASSES, ResponseConstants.SUBMIT_TEXT, "svg_icon_data", "terms_link", "terms_text");

    public ListingExpressCheckoutPaymentOptionJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, cls);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableListOfStringAdapter = yVar.mo68558c(d, emptySet, "iconClasses");
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "iconText");
        this.nullableBooleanAdapter = yVar.mo68558c(Boolean.class, emptySet, ResponseConstants.SELECTED);
        this.nullableSvgIconDataAdapter = yVar.mo68558c(SvgIconData.class, emptySet, "svgIconData");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ListingExpressCheckoutPaymentOption)";
    }

    public ListingExpressCheckoutPaymentOption fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        String str5 = null;
        String str6 = null;
        SvgIconData svgIconData = null;
        String str7 = null;
        String str8 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    list = this.nullableListOfStringAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    svgIconData = this.nullableSvgIconDataAdapter.fromJson(jsonReader2);
                    i &= -257;
                    break;
                case 9:
                    str7 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -513;
                    break;
                case 10:
                    str8 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -1025;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -2048) {
            return new ListingExpressCheckoutPaymentOption(list, str, str2, str3, str4, bool, str5, str6, svgIconData, str7, str8);
        }
        Constructor<ListingExpressCheckoutPaymentOption> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ListingExpressCheckoutPaymentOption.class.getDeclaredConstructor(new Class[]{List.class, cls, cls, cls, cls, Boolean.class, cls, cls, SvgIconData.class, cls, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ListingExpressCheckoutPa…his.constructorRef = it }");
        }
        ListingExpressCheckoutPaymentOption newInstance = constructor.newInstance(new Object[]{list, str, str2, str3, str4, bool, str5, str6, svgIconData, str7, str8, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, ListingExpressCheckoutPaymentOption listingExpressCheckoutPaymentOption) {
        C19383o.m32797g(wVar, "writer");
        if (listingExpressCheckoutPaymentOption != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.ICON_CLASSES);
            this.nullableListOfStringAdapter.toJson(wVar, listingExpressCheckoutPaymentOption.getIconClasses());
            wVar.mo68529h("icon_text");
            this.nullableStringAdapter.toJson(wVar, listingExpressCheckoutPaymentOption.getIconText());
            wVar.mo68529h(ResponseConstants.INPUT_ID);
            this.nullableStringAdapter.toJson(wVar, listingExpressCheckoutPaymentOption.getInputId());
            wVar.mo68529h(ResponseConstants.LABEL);
            this.nullableStringAdapter.toJson(wVar, listingExpressCheckoutPaymentOption.getLabel());
            wVar.mo68529h("payment_method");
            this.nullableStringAdapter.toJson(wVar, listingExpressCheckoutPaymentOption.getPaymentMethod());
            wVar.mo68529h(ResponseConstants.SELECTED);
            this.nullableBooleanAdapter.toJson(wVar, listingExpressCheckoutPaymentOption.getSelected());
            wVar.mo68529h(ResponseConstants.SUBMIT_CLASSES);
            this.nullableStringAdapter.toJson(wVar, listingExpressCheckoutPaymentOption.getSubmitClasses());
            wVar.mo68529h(ResponseConstants.SUBMIT_TEXT);
            this.nullableStringAdapter.toJson(wVar, listingExpressCheckoutPaymentOption.getSubmitText());
            wVar.mo68529h("svg_icon_data");
            this.nullableSvgIconDataAdapter.toJson(wVar, listingExpressCheckoutPaymentOption.getSvgIconData());
            wVar.mo68529h("terms_link");
            this.nullableStringAdapter.toJson(wVar, listingExpressCheckoutPaymentOption.getTermsLink());
            wVar.mo68529h("terms_text");
            this.nullableStringAdapter.toJson(wVar, listingExpressCheckoutPaymentOption.getTermsText());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
