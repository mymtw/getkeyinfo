package com.facebook.appevents.codeless.internal;

import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.appevents.codeless.internal.a */
public final class C12222a {

    /* renamed from: a */
    public final String f27281a;

    /* renamed from: b */
    public final String f27282b;

    /* renamed from: c */
    public final ArrayList f27283c;

    /* renamed from: d */
    public final String f27284d;

    public C12222a(JSONObject jSONObject) {
        String string = jSONObject.getString("name");
        C19383o.m32796f(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f27281a = string;
        String optString = jSONObject.optString("value");
        C19383o.m32796f(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f27282b = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        C19383o.m32796f(optString2, "component.optString(Cons…tants.PATH_TYPE_ABSOLUTE)");
        this.f27284d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(ResponseConstants.PATH);
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                C19383o.m32796f(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new PathComponent(jSONObject2));
            }
        }
        this.f27283c = arrayList;
    }
}
