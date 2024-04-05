package com.etsy.android.lib.models.apiv3;

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

public final class PushNotificationSettingJsonAdapter extends JsonAdapter<PushNotificationSetting> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<PushNotificationSetting> constructorRef;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<NotificationImportance> notificationImportanceAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a("key", "title", "description", ResponseConstants.ENABLED, "notification_types", "importance_level");
    private final JsonAdapter<String> stringAdapter;

    public PushNotificationSettingJsonAdapter(C17414y yVar) {
        Class<String> cls = String.class;
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.stringAdapter = yVar.mo68558c(cls, emptySet, "key");
        this.booleanAdapter = yVar.mo68558c(Boolean.TYPE, emptySet, ResponseConstants.ENABLED);
        this.listOfStringAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "notificationTypes");
        this.notificationImportanceAdapter = yVar.mo68558c(NotificationImportance.class, emptySet, "importance");
    }

    public String toString() {
        return "GeneratedJsonAdapter(PushNotificationSetting)";
    }

    public PushNotificationSetting fromJson(JsonReader jsonReader) {
        JsonReader jsonReader2 = jsonReader;
        Class<String> cls = String.class;
        C19383o.m32797g(jsonReader2, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.mo68410b();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        NotificationImportance notificationImportance = null;
        while (jsonReader.mo68414f()) {
            switch (jsonReader2.mo68406Q(this.options)) {
                case -1:
                    jsonReader.mo68408S();
                    jsonReader.mo68411c0();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader2);
                    if (str != null) {
                        i &= -2;
                        break;
                    } else {
                        throw C18215a.m30734m("key", "key", jsonReader2);
                    }
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader2);
                    if (str2 != null) {
                        i &= -3;
                        break;
                    } else {
                        throw C18215a.m30734m("title", "title", jsonReader2);
                    }
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader2);
                    if (str3 != null) {
                        i &= -5;
                        break;
                    } else {
                        throw C18215a.m30734m("description", "description", jsonReader2);
                    }
                case 3:
                    bool = this.booleanAdapter.fromJson(jsonReader2);
                    if (bool != null) {
                        i &= -9;
                        break;
                    } else {
                        throw C18215a.m30734m(ResponseConstants.ENABLED, ResponseConstants.ENABLED, jsonReader2);
                    }
                case 4:
                    list = this.listOfStringAdapter.fromJson(jsonReader2);
                    if (list != null) {
                        break;
                    } else {
                        throw C18215a.m30734m("notificationTypes", "notification_types", jsonReader2);
                    }
                case 5:
                    notificationImportance = this.notificationImportanceAdapter.fromJson(jsonReader2);
                    if (notificationImportance != null) {
                        i &= -33;
                        break;
                    } else {
                        throw C18215a.m30734m("importance", "importance_level", jsonReader2);
                    }
            }
        }
        jsonReader.mo68413e();
        if (i == -48) {
            C19383o.m32795e(str, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str2, "null cannot be cast to non-null type kotlin.String");
            C19383o.m32795e(str3, "null cannot be cast to non-null type kotlin.String");
            boolean booleanValue = bool.booleanValue();
            if (list != null) {
                C19383o.m32795e(notificationImportance, "null cannot be cast to non-null type com.etsy.android.lib.models.apiv3.NotificationImportance");
                return new PushNotificationSetting(str, str2, str3, booleanValue, list, notificationImportance);
            }
            throw C18215a.m30728g("notificationTypes", "notification_types", jsonReader2);
        }
        Constructor<PushNotificationSetting> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PushNotificationSetting.class.getDeclaredConstructor(new Class[]{cls, cls, cls, Boolean.TYPE, List.class, NotificationImportance.class, Integer.TYPE, C18215a.f39928c});
            this.constructorRef = constructor;
            C19383o.m32796f(constructor, "PushNotificationSetting:…his.constructorRef = it }");
        }
        Object[] objArr = new Object[8];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = str3;
        objArr[3] = bool;
        if (list != null) {
            objArr[4] = list;
            objArr[5] = notificationImportance;
            objArr[6] = Integer.valueOf(i);
            objArr[7] = null;
            PushNotificationSetting newInstance = constructor.newInstance(objArr);
            C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        throw C18215a.m30728g("notificationTypes", "notification_types", jsonReader2);
    }

    public void toJson(C17412w wVar, PushNotificationSetting pushNotificationSetting) {
        C19383o.m32797g(wVar, "writer");
        if (pushNotificationSetting != null) {
            wVar.mo68522b();
            wVar.mo68529h("key");
            this.stringAdapter.toJson(wVar, pushNotificationSetting.getKey());
            wVar.mo68529h("title");
            this.stringAdapter.toJson(wVar, pushNotificationSetting.getTitle());
            wVar.mo68529h("description");
            this.stringAdapter.toJson(wVar, pushNotificationSetting.getDescription());
            wVar.mo68529h(ResponseConstants.ENABLED);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(pushNotificationSetting.getEnabled()));
            wVar.mo68529h("notification_types");
            this.listOfStringAdapter.toJson(wVar, pushNotificationSetting.getNotificationTypes());
            wVar.mo68529h("importance_level");
            this.notificationImportanceAdapter.toJson(wVar, pushNotificationSetting.getImportance());
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
