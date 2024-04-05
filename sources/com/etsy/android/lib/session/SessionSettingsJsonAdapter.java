package com.etsy.android.lib.session;

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

public final class SessionSettingsJsonAdapter extends JsonAdapter<SessionSettings> {
    public static final int $stable = 8;
    private volatile Constructor<SessionSettings> constructorRef;
    private final JsonAdapter<List<PrivacySetting>> listOfPrivacySettingAdapter;
    private final JsonAdapter<List<Feature>> nullableListOfFeatureAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.PRIVACY, "features");

    public SessionSettingsJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        C18215a.C18217b d = C17387a0.m29126d(List.class, PrivacySetting.class);
        EmptySet emptySet = EmptySet.INSTANCE;
        this.listOfPrivacySettingAdapter = yVar.mo68558c(d, emptySet, "privacySettings");
        this.nullableListOfFeatureAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, Feature.class), emptySet, "features");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        List list2 = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                list = this.listOfPrivacySettingAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw C18215a.m30734m("privacySettings", ResponseConstants.PRIVACY, jsonReader);
                }
            } else if (Q == 1) {
                list2 = this.nullableListOfFeatureAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.mo68413e();
        if (i != -3) {
            Constructor<SessionSettings> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = SessionSettings.class.getDeclaredConstructor(new Class[]{List.class, List.class, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "SessionSettings::class.j…his.constructorRef = it }");
            }
            Object[] objArr = new Object[4];
            if (list != null) {
                objArr[0] = list;
                objArr[1] = list2;
                objArr[2] = Integer.valueOf(i);
                objArr[3] = null;
                SessionSettings newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g("privacySettings", ResponseConstants.PRIVACY, jsonReader);
        } else if (list != null) {
            return new SessionSettings(list, list2);
        } else {
            throw C18215a.m30728g("privacySettings", ResponseConstants.PRIVACY, jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        SessionSettings sessionSettings = (SessionSettings) obj;
        C19383o.m32797g(wVar, "writer");
        if (sessionSettings != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.PRIVACY);
            this.listOfPrivacySettingAdapter.toJson(wVar, sessionSettings.f19542a);
            wVar.mo68529h("features");
            this.nullableListOfFeatureAdapter.toJson(wVar, sessionSettings.f19543b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(SessionSettings)";
    }
}
