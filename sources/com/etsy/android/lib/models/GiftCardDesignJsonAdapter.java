package com.etsy.android.lib.models;

import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class GiftCardDesignJsonAdapter extends JsonAdapter<GiftCardDesign> {
    public static final int $stable = 8;
    private volatile Constructor<GiftCardDesign> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("design_id", "url_69x69", "url_150x119", "url_280x166", "url_560x332", "url_banner", "fullHeight", "fullWidth");
    private final JsonAdapter<String> stringAdapter;

    public GiftCardDesignJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.intAdapter = yVar.mo68558c(cls, emptySet, "id");
        this.stringAdapter = yVar.mo68558c(String.class, emptySet, "url69x69");
    }

    public String toString() {
        return "GeneratedJsonAdapter(GiftCardDesign)";
    }

    public GiftCardDesign fromJson(JsonReader jsonReader) {
        GiftCardDesign giftCardDesign;
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        Integer num = 0;
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Integer num2 = null;
        Integer num3 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    num = this.intAdapter.fromJson(jsonReader2);
                    if (num != null) {
                        i &= -2;
                        break;
                    } else {
                        throw C18215a.m30734m("id", "design_id", jsonReader2);
                    }
                case 1:
                    str = this.stringAdapter.fromJson(jsonReader2);
                    if (str != null) {
                        i &= -3;
                        break;
                    } else {
                        throw C18215a.m30734m("url69x69", "url_69x69", jsonReader2);
                    }
                case 2:
                    str2 = this.stringAdapter.fromJson(jsonReader2);
                    if (str2 != null) {
                        i &= -5;
                        break;
                    } else {
                        throw C18215a.m30734m("url150x119", "url_150x119", jsonReader2);
                    }
                case 3:
                    str3 = this.stringAdapter.fromJson(jsonReader2);
                    if (str3 != null) {
                        i &= -9;
                        break;
                    } else {
                        throw C18215a.m30734m("url280x166", "url_280x166", jsonReader2);
                    }
                case 4:
                    str4 = this.stringAdapter.fromJson(jsonReader2);
                    if (str4 != null) {
                        i &= -17;
                        break;
                    } else {
                        throw C18215a.m30734m("url560x332", "url_560x332", jsonReader2);
                    }
                case 5:
                    str5 = this.stringAdapter.fromJson(jsonReader2);
                    if (str5 != null) {
                        i &= -33;
                        break;
                    } else {
                        throw C18215a.m30734m("urlBanner", "url_banner", jsonReader2);
                    }
                case 6:
                    num2 = this.intAdapter.fromJson(jsonReader2);
                    if (num2 != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("fullHeight", "fullHeight", jsonReader2);
                    }
                case 7:
                    num3 = this.intAdapter.fromJson(jsonReader2);
                    if (num3 != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("fullWidth", "fullWidth", jsonReader2);
                    }
            }
        }
        jsonReader.mo68413e();
        if (i == -64) {
            int intValue = num.intValue();
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str3, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str4, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str5, "null cannot be cast to non-null type kotlin.String");
            giftCardDesign = new GiftCardDesign(intValue, str, str2, str3, str4, str5);
        } else {
            Constructor<GiftCardDesign> constructor = this.constructorRef;
            if (constructor == null) {
                Class cls2 = Integer.TYPE;
                constructor = GiftCardDesign.class.getDeclaredConstructor(new Class[]{cls2, cls, cls, cls, cls, cls, cls2, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "GiftCardDesign::class.ja…his.constructorRef = it }");
            }
            GiftCardDesign newInstance = constructor.newInstance(new Object[]{num, str, str2, str3, str4, str5, Integer.valueOf(i), null});
            C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            giftCardDesign = newInstance;
        }
        giftCardDesign.setFullHeight(num2 != null ? num2.intValue() : giftCardDesign.getFullHeight());
        giftCardDesign.setFullWidth(num3 != null ? num3.intValue() : giftCardDesign.getFullWidth());
        return giftCardDesign;
    }

    public void toJson(C17412w wVar, GiftCardDesign giftCardDesign) {
        C19383o.m32797g(wVar, "writer");
        if (giftCardDesign != null) {
            wVar.mo68522b();
            wVar.mo68529h("design_id");
            this.intAdapter.toJson(wVar, Integer.valueOf(giftCardDesign.getId()));
            wVar.mo68529h("url_69x69");
            this.stringAdapter.toJson(wVar, giftCardDesign.getUrl69x69());
            wVar.mo68529h("url_150x119");
            this.stringAdapter.toJson(wVar, giftCardDesign.getUrl150x119());
            wVar.mo68529h("url_280x166");
            this.stringAdapter.toJson(wVar, giftCardDesign.getUrl280x166());
            wVar.mo68529h("url_560x332");
            this.stringAdapter.toJson(wVar, giftCardDesign.getUrl560x332());
            wVar.mo68529h("url_banner");
            this.stringAdapter.toJson(wVar, giftCardDesign.getUrlBanner());
            wVar.mo68529h("fullHeight");
            this.intAdapter.toJson(wVar, Integer.valueOf(giftCardDesign.getFullHeight()));
            wVar.mo68529h("fullWidth");
            this.intAdapter.toJson(wVar, Integer.valueOf(giftCardDesign.getFullWidth()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
