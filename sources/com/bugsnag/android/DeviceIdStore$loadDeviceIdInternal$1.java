package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.C5806m0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.FunctionReference;
import kotlin.reflect.C19401d;
import p753kq.C19857l;

public final /* synthetic */ class DeviceIdStore$loadDeviceIdInternal$1 extends FunctionReference implements C19857l<JsonReader, C5806m0> {
    public DeviceIdStore$loadDeviceIdInternal$1(C5806m0.C5807a aVar) {
        super(1, aVar);
    }

    public final String getName() {
        return "fromReader";
    }

    public final C19401d getOwner() {
        return C19386q.m32807a(C5806m0.C5807a.class);
    }

    public final String getSignature() {
        return "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/DeviceId;";
    }

    public final C5806m0 invoke(JsonReader jsonReader) {
        C19383o.m32798h(jsonReader, "p1");
        ((C5806m0.C5807a) this.receiver).getClass();
        jsonReader.beginObject();
        return new C5806m0((!jsonReader.hasNext() || !C19383o.m32792b("id", jsonReader.nextName())) ? null : jsonReader.nextString());
    }
}
