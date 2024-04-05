package com.google.android.datatransport.runtime;

import android.support.p013v4.media.C0072d;
import com.google.firebase.encoders.proto.C16547a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p085dh.C6675b;
import p674sm.C18536c;
import p674sm.C18537d;
import p674sm.C18538e;

/* renamed from: com.google.android.datatransport.runtime.b */
public final class C6523b implements C18537d<C6675b> {

    /* renamed from: a */
    public static final C6523b f14441a = new C6523b();

    /* renamed from: b */
    public static final C18536c f14442b;

    static {
        C16547a aVar = new C16547a(1, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f14442b = new C18536c("storageMetrics", C0072d.m202i(hashMap));
    }

    /* renamed from: a */
    public final void mo18639a(Object obj, Object obj2) throws IOException {
        ((C18538e) obj2).mo59028a(f14442b, ((C6675b) obj).f14736a);
    }
}
