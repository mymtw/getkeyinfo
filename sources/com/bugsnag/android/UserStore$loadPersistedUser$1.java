package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.C5915t2;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.C19401d;
import p753kq.C19857l;

final /* synthetic */ class UserStore$loadPersistedUser$1 extends FunctionReference implements C19857l<JsonReader, C5915t2> {
    public UserStore$loadPersistedUser$1(C5915t2.C5916a aVar) {
        super(1, aVar);
    }

    public final String getName() {
        return "fromReader";
    }

    public final C19401d getOwner() {
        return C19386q.m32807a(C5915t2.C5916a.class);
    }

    public final String getSignature() {
        return "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/User;";
    }

    public final C5915t2 invoke(JsonReader jsonReader) {
        C19383o.m32798h(jsonReader, "p1");
        ((C5915t2.C5916a) this.receiver).getClass();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String nextString = jsonReader.nextString();
            if (nextName != null) {
                int hashCode = nextName.hashCode();
                if (hashCode != 3355) {
                    if (hashCode != 3373707) {
                        if (hashCode == 96619420 && nextName.equals("email")) {
                            str2 = nextString;
                        }
                    } else if (nextName.equals("name")) {
                        str3 = nextString;
                    }
                } else if (nextName.equals("id")) {
                    str = nextString;
                }
            }
        }
        C5915t2 t2Var = new C5915t2(str, str2, str3);
        jsonReader.endObject();
        return t2Var;
    }
}
