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

public final class NudgeJsonAdapter extends JsonAdapter<Nudge> {
    public static final int $stable = 8;
    private volatile Constructor<Nudge> constructorRef;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("type", ResponseConstants.QUANTITY, ResponseConstants.TOTAL_CARTS, ResponseConstants.DISPLAY_TEXT, "display_title", "display_body", ResponseConstants.ICON_URL, "eligible_nudges", "eligible_nudge_types", "fixed_sale_ends_today", "fixed_sale_ends_tomorrow", "fixed_sale_ends_soon", "show_singular_message");

    public NudgeJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<String> cls = String.class;
        C19383o.m32797g(yVar2, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar2.mo68558c(cls, emptySet, "type");
        this.nullableIntAdapter = yVar2.mo68558c(Integer.class, emptySet, ResponseConstants.QUANTITY);
        this.nullableListOfStringAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "eligibleNudges");
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "fixedSaleEndsToday");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Nudge)";
    }

    public Nudge fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<Integer> cls = Integer.class;
        Class<Boolean> cls2 = Boolean.class;
        Class<String> cls3 = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
        List list2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -2;
                    break;
                case 1:
                    num = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -3;
                    break;
                case 2:
                    num2 = this.nullableIntAdapter.fromJson(jsonReader2);
                    i &= -5;
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -9;
                    break;
                case 4:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -17;
                    break;
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -65;
                    break;
                case 7:
                    list = this.nullableListOfStringAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
                case 8:
                    list2 = this.nullableListOfStringAdapter.fromJson(jsonReader2);
                    i &= -257;
                    break;
                case 9:
                    bool = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -513;
                    break;
                case 10:
                    bool2 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -1025;
                    break;
                case 11:
                    bool3 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -2049;
                    break;
                case 12:
                    bool4 = this.nullableBooleanAdapter.fromJson(jsonReader2);
                    i &= -4097;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i == -8192) {
            return new Nudge(str, num, num2, str2, str3, str4, str5, list, list2, bool, bool2, bool3, bool4);
        }
        Constructor<Nudge> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Nudge.class.getDeclaredConstructor(new Class[]{cls3, cls, cls, cls3, cls3, cls3, cls3, List.class, List.class, cls2, cls2, cls2, cls2, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "Nudge::class.java.getDec…his.constructorRef = it }");
        }
        Nudge newInstance = constructor.newInstance(new Object[]{str, num, num2, str2, str3, str4, str5, list, list2, bool, bool2, bool3, bool4, Integer.valueOf(i), null});
        C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    public void toJson(C17412w wVar, Nudge nudge) {
        C19383o.m32797g(wVar, "writer");
        if (nudge != null) {
            wVar.mo68522b();
            wVar.mo68529h("type");
            this.nullableStringAdapter.toJson(wVar, nudge.getType());
            wVar.mo68529h(ResponseConstants.QUANTITY);
            this.nullableIntAdapter.toJson(wVar, nudge.getQuantity());
            wVar.mo68529h(ResponseConstants.TOTAL_CARTS);
            this.nullableIntAdapter.toJson(wVar, nudge.getTotalCarts());
            wVar.mo68529h(ResponseConstants.DISPLAY_TEXT);
            this.nullableStringAdapter.toJson(wVar, nudge.getDisplayText());
            wVar.mo68529h("display_title");
            this.nullableStringAdapter.toJson(wVar, nudge.getDisplayTitle());
            wVar.mo68529h("display_body");
            this.nullableStringAdapter.toJson(wVar, nudge.getDisplayBody());
            wVar.mo68529h(ResponseConstants.ICON_URL);
            this.nullableStringAdapter.toJson(wVar, nudge.getIconUrl());
            wVar.mo68529h("eligible_nudges");
            this.nullableListOfStringAdapter.toJson(wVar, nudge.getEligibleNudges());
            wVar.mo68529h("eligible_nudge_types");
            this.nullableListOfStringAdapter.toJson(wVar, nudge.getEligibleNudgeTypes());
            wVar.mo68529h("fixed_sale_ends_today");
            this.nullableBooleanAdapter.toJson(wVar, nudge.getFixedSaleEndsToday());
            wVar.mo68529h("fixed_sale_ends_tomorrow");
            this.nullableBooleanAdapter.toJson(wVar, nudge.getFixedSaleEndsTomorrow());
            wVar.mo68529h("fixed_sale_ends_soon");
            this.nullableBooleanAdapter.toJson(wVar, nudge.getFixedSaleEndsSoon());
            wVar.mo68529h("show_singular_message");
            this.nullableBooleanAdapter.toJson(wVar, nudge.getShowSingularMessage());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
