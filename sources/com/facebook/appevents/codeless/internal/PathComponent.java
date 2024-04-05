package com.facebook.appevents.codeless.internal;

import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import org.json.JSONObject;

public final class PathComponent {

    /* renamed from: a */
    public final String f27272a;

    /* renamed from: b */
    public final int f27273b;

    /* renamed from: c */
    public final int f27274c;

    /* renamed from: d */
    public final String f27275d;

    /* renamed from: e */
    public final String f27276e;

    /* renamed from: f */
    public final String f27277f;

    /* renamed from: g */
    public final String f27278g;

    /* renamed from: h */
    public final int f27279h;

    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        
        private final int value;

        private MatchBitmaskType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public PathComponent(JSONObject jSONObject) {
        String string = jSONObject.getString("class_name");
        C19383o.m32796f(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f27272a = string;
        this.f27273b = jSONObject.optInt("index", -1);
        this.f27274c = jSONObject.optInt("id");
        String optString = jSONObject.optString("text");
        C19383o.m32796f(optString, "component.optString(PATH_TEXT_KEY)");
        this.f27275d = optString;
        String optString2 = jSONObject.optString("tag");
        C19383o.m32796f(optString2, "component.optString(PATH_TAG_KEY)");
        this.f27276e = optString2;
        String optString3 = jSONObject.optString("description");
        C19383o.m32796f(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f27277f = optString3;
        String optString4 = jSONObject.optString(ResponseConstants.HINT);
        C19383o.m32796f(optString4, "component.optString(PATH_HINT_KEY)");
        this.f27278g = optString4;
        this.f27279h = jSONObject.optInt("match_bitmask");
    }
}
