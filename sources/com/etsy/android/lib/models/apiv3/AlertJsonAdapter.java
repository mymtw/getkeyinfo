package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.navigation.keys.bottomsheetkeys.DetailsBottomSheetNavigationKey;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;
import p618lp.C18215a;

public final class AlertJsonAdapter extends JsonAdapter<Alert> {
    public static final int $stable = 8;
    private final JsonAdapter<AlertType> alertTypeAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Alert> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("type", "title", DetailsBottomSheetNavigationKey.PARAM_BODY, ResponseConstants.ICON, ResponseConstants.DEEP_LINK, "deep_link_title", "show_disclosure_indicator", ResponseConstants.ANALYTICS_NAME);

    public AlertJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.alertTypeAdapter = yVar.mo68558c(AlertType.class, emptySet, "type");
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, "title");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, "showDisclosureIndicator");
    }

    public String toString() {
        return "GeneratedJsonAdapter(Alert)";
    }

    public Alert fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        int i = -1;
        AlertType alertType = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    alertType = this.alertTypeAdapter.fromJson(jsonReader2);
                    if (alertType != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("type", "type", jsonReader2);
                    }
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
                    str5 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -33;
                    break;
                case 6:
                    bool = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool != null) {
                        i &= -65;
                        break;
                    } else {
                        throw C18215a.m30734m("showDisclosureIndicator", "show_disclosure_indicator", jsonReader2);
                    }
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader2);
                    i &= -129;
                    break;
            }
        }
        jsonReader.mo68413e();
        if (i != -255) {
            Constructor<Alert> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = Alert.class.getDeclaredConstructor(new Class[]{AlertType.class, cls, cls, cls, cls, cls, Boolean.TYPE, cls, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "Alert::class.java.getDec…his.constructorRef = it }");
            }
            Object[] objArr = new Object[10];
            if (alertType != null) {
                objArr[0] = alertType;
                objArr[1] = str;
                objArr[2] = str2;
                objArr[3] = str3;
                objArr[4] = str4;
                objArr[5] = str5;
                objArr[6] = bool;
                objArr[7] = str6;
                objArr[8] = Integer.valueOf(i);
                objArr[9] = null;
                Alert newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g("type", "type", jsonReader2);
        } else if (alertType != null) {
            return new Alert(alertType, str, str2, str3, str4, str5, bool.booleanValue(), str6);
        } else {
            throw C18215a.m30728g("type", "type", jsonReader2);
        }
    }

    public void toJson(C17412w wVar, Alert alert) {
        C19383o.m32797g(wVar, "writer");
        if (alert != null) {
            wVar.mo68522b();
            wVar.mo68529h("type");
            this.alertTypeAdapter.toJson(wVar, alert.getType());
            wVar.mo68529h("title");
            this.nullableStringAdapter.toJson(wVar, alert.getTitle());
            wVar.mo68529h(DetailsBottomSheetNavigationKey.PARAM_BODY);
            this.nullableStringAdapter.toJson(wVar, alert.getBody());
            wVar.mo68529h(ResponseConstants.ICON);
            this.nullableStringAdapter.toJson(wVar, alert.getIconId());
            wVar.mo68529h(ResponseConstants.DEEP_LINK);
            this.nullableStringAdapter.toJson(wVar, alert.getDeepLink());
            wVar.mo68529h("deep_link_title");
            this.nullableStringAdapter.toJson(wVar, alert.getDeepLinkTitle());
            wVar.mo68529h("show_disclosure_indicator");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(alert.getShowDisclosureIndicator()));
            wVar.mo68529h(ResponseConstants.ANALYTICS_NAME);
            this.nullableStringAdapter.toJson(wVar, alert.getAnalyticsName());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
