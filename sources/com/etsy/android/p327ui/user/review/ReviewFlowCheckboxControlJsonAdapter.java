package com.etsy.android.p327ui.user.review;

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

/* renamed from: com.etsy.android.ui.user.review.ReviewFlowCheckboxControlJsonAdapter */
public final class ReviewFlowCheckboxControlJsonAdapter extends JsonAdapter<ReviewFlowCheckboxControl> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ReviewFlowCheckboxControl> constructorRef;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.DISPLAY_TEXT, "disable_ratings", ResponseConstants.ENABLED, "analytics_id");
    private final JsonAdapter<String> stringAdapter;

    public ReviewFlowCheckboxControlJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(cls, emptySet, "displayText");
        this.listOfStringAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "disableRatings");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "isChecked");
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "analyticsId");
    }

    public final Object fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        String str = null;
        String str2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader2.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader2);
            } else if (Q == 1) {
                list = this.listOfStringAdapter.fromJson(jsonReader2);
                if (list != null) {
                    i &= -3;
                } else {
                    throw C18215a.m30734m("disableRatings", "disable_ratings", jsonReader2);
                }
            } else if (Q == 2) {
                bool = this.booleanAdapter.fromJson(jsonReader2);
                if (bool != null) {
                    i &= -5;
                } else {
                    throw C18215a.m30734m("isChecked", ResponseConstants.ENABLED, jsonReader2);
                }
            } else if (Q == 3 && (str = this.stringAdapter.fromJson(jsonReader2)) == null) {
                throw C18215a.m30734m("analyticsId", "analytics_id", jsonReader2);
            }
        }
        jsonReader.mo68413e();
        if (i == -7) {
            C19383o.m32795e(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            boolean booleanValue = bool.booleanValue();
            if (str != null) {
                return new ReviewFlowCheckboxControl(str2, list, booleanValue, str);
            }
            throw C18215a.m30728g("analyticsId", "analytics_id", jsonReader2);
        }
        Constructor<ReviewFlowCheckboxControl> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ReviewFlowCheckboxControl.class.getDeclaredConstructor(new Class[]{cls, List.class, Boolean.TYPE, cls, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "ReviewFlowCheckboxContro…his.constructorRef = it }");
        }
        Object[] objArr = new Object[6];
        objArr[0] = str2;
        objArr[1] = list;
        objArr[2] = bool;
        if (str != null) {
            objArr[3] = str;
            objArr[4] = Integer.valueOf(i);
            objArr[5] = null;
            ReviewFlowCheckboxControl newInstance = constructor.newInstance(objArr);
            C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        throw C18215a.m30728g("analyticsId", "analytics_id", jsonReader2);
    }

    public final void toJson(C17412w wVar, Object obj) {
        ReviewFlowCheckboxControl reviewFlowCheckboxControl = (ReviewFlowCheckboxControl) obj;
        C19383o.m32797g(wVar, "writer");
        if (reviewFlowCheckboxControl != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.DISPLAY_TEXT);
            this.nullableStringAdapter.toJson(wVar, reviewFlowCheckboxControl.f25989a);
            wVar.mo68529h("disable_ratings");
            this.listOfStringAdapter.toJson(wVar, reviewFlowCheckboxControl.f25990b);
            wVar.mo68529h(ResponseConstants.ENABLED);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(reviewFlowCheckboxControl.f25991c));
            wVar.mo68529h("analytics_id");
            this.stringAdapter.toJson(wVar, reviewFlowCheckboxControl.f25992d);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ReviewFlowCheckboxControl)";
    }
}
