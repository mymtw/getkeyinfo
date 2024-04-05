package com.facebook.appevents.codeless.internal;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class EventBinding {

    /* renamed from: e */
    public static final C12221a f27267e = new C12221a();

    /* renamed from: a */
    public final String f27268a;

    /* renamed from: b */
    public final List<PathComponent> f27269b;

    /* renamed from: c */
    public final List<C12222a> f27270c;

    /* renamed from: d */
    public final String f27271d;

    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    public enum MappingMethod {
        MANUAL,
        INFERENCE
    }

    /* renamed from: com.facebook.appevents.codeless.internal.EventBinding$a */
    public static final class C12221a {
        /* renamed from: a */
        public static EventBinding m20050a(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
            String string = jSONObject.getString(ResponseConstants.EVENT_NAME);
            String string2 = jSONObject.getString(ResponseConstants.METHOD);
            C19383o.m32796f(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            C19383o.m32796f(locale, "Locale.ENGLISH");
            String upperCase = string2.toUpperCase(locale);
            C19383o.m32796f(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            MappingMethod valueOf = MappingMethod.valueOf(upperCase);
            String string3 = jSONObject.getString("event_type");
            C19383o.m32796f(string3, "mapping.getString(\"event_type\")");
            String upperCase2 = string3.toUpperCase(locale);
            C19383o.m32796f(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            ActionType valueOf2 = ActionType.valueOf(upperCase2);
            String string4 = jSONObject.getString("app_version");
            JSONArray jSONArray = jSONObject.getJSONArray(ResponseConstants.PATH);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                C19383o.m32796f(jSONObject2, "jsonPath");
                arrayList.add(new PathComponent(jSONObject2));
            }
            String optString = jSONObject.optString("path_type", "absolute");
            JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null) {
                int length2 = optJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                    C19383o.m32796f(jSONObject3, "jsonParameter");
                    arrayList2.add(new C12222a(jSONObject3));
                }
            }
            String optString2 = jSONObject.optString("component_id");
            String optString3 = jSONObject.optString("activity_name");
            C19383o.m32796f(string, "eventName");
            C19383o.m32796f(string4, "appVersion");
            C19383o.m32796f(optString2, "componentId");
            C19383o.m32796f(optString, "pathType");
            C19383o.m32796f(optString3, "activityName");
            return new EventBinding(string, valueOf, valueOf2, string4, arrayList, arrayList2, optString2, optString, optString3);
        }
    }

    public EventBinding(String str, MappingMethod mappingMethod, ActionType actionType, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, String str4, String str5) {
        C19383o.m32797g(mappingMethod, ResponseConstants.METHOD);
        C19383o.m32797g(actionType, "type");
        this.f27268a = str;
        this.f27269b = arrayList;
        this.f27270c = arrayList2;
        this.f27271d = str5;
    }
}
