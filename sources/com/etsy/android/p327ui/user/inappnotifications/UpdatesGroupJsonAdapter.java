package com.etsy.android.p327ui.user.inappnotifications;

import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification;
import com.etsy.android.lib.models.finds.FindsModule;
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

/* renamed from: com.etsy.android.ui.user.inappnotifications.UpdatesGroupJsonAdapter */
public final class UpdatesGroupJsonAdapter extends JsonAdapter<UpdatesGroup> {
    public static final int $stable = 8;
    private volatile Constructor<UpdatesGroup> constructorRef;
    private final JsonAdapter<List<InAppNotification>> listOfInAppNotificationAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(FindsModule.HEADING_TYPE, "notifications");

    public UpdatesGroupJsonAdapter(C17414y yVar) {
        C19383o.m32797g(yVar, "moshi");
        EmptySet emptySet = EmptySet.INSTANCE;
        this.nullableStringAdapter = yVar.mo68558c(String.class, emptySet, FindsModule.HEADING_TYPE);
        this.listOfInAppNotificationAdapter = yVar.mo68558c(C17387a0.m29126d(List.class, InAppNotification.class), emptySet, "notifications");
    }

    public final Object fromJson(JsonReader jsonReader) {
        C19383o.m32797g(jsonReader, "reader");
        jsonReader.mo68410b();
        int i = -1;
        List list = null;
        String str = null;
        while (jsonReader.mo68414f()) {
            int Q = jsonReader.mo68406Q(this.options);
            if (Q == -1) {
                jsonReader.mo68408S();
                jsonReader.mo68411c0();
            } else if (Q == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (Q == 1 && (list = this.listOfInAppNotificationAdapter.fromJson(jsonReader)) == null) {
                throw C18215a.m30734m("notifications", "notifications", jsonReader);
            }
        }
        jsonReader.mo68413e();
        if (i != -2) {
            Constructor<UpdatesGroup> constructor = this.constructorRef;
            if (constructor == null) {
                constructor = UpdatesGroup.class.getDeclaredConstructor(new Class[]{String.class, List.class, Integer.TYPE, C18215a.f39928c});
                this.constructorRef = constructor;
                C19383o.m32796f(constructor, "UpdatesGroup::class.java…his.constructorRef = it }");
            }
            Object[] objArr = new Object[4];
            objArr[0] = str;
            if (list != null) {
                objArr[1] = list;
                objArr[2] = Integer.valueOf(i);
                objArr[3] = null;
                UpdatesGroup newInstance = constructor.newInstance(objArr);
                C19383o.m32796f(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            throw C18215a.m30728g("notifications", "notifications", jsonReader);
        } else if (list != null) {
            return new UpdatesGroup(str, list);
        } else {
            throw C18215a.m30728g("notifications", "notifications", jsonReader);
        }
    }

    public final void toJson(C17412w wVar, Object obj) {
        UpdatesGroup updatesGroup = (UpdatesGroup) obj;
        C19383o.m32797g(wVar, "writer");
        if (updatesGroup != null) {
            wVar.mo68522b();
            wVar.mo68529h(FindsModule.HEADING_TYPE);
            this.nullableStringAdapter.toJson(wVar, updatesGroup.f25527a);
            wVar.mo68529h("notifications");
            this.listOfInAppNotificationAdapter.toJson(wVar, updatesGroup.f25528b);
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(UpdatesGroup)";
    }
}
