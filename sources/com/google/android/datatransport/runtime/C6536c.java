package com.google.android.datatransport.runtime;

import android.support.p013v4.media.C0072d;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.proto.C16547a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p674sm.C18536c;
import p674sm.C18537d;
import p674sm.C18538e;

/* renamed from: com.google.android.datatransport.runtime.c */
public final class C6536c implements C18537d<LogEventDropped> {

    /* renamed from: a */
    public static final C6536c f14457a = new C6536c();

    /* renamed from: b */
    public static final C18536c f14458b;

    /* renamed from: c */
    public static final C18536c f14459c;

    static {
        C16547a aVar = new C16547a(1, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f14458b = new C18536c("eventsDroppedCount", C0072d.m202i(hashMap));
        C16547a aVar2 = new C16547a(3, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f14459c = new C18536c("reason", C0072d.m202i(hashMap2));
    }

    /* renamed from: a */
    public final void mo18639a(Object obj, Object obj2) throws IOException {
        LogEventDropped logEventDropped = (LogEventDropped) obj;
        C18538e eVar = (C18538e) obj2;
        eVar.mo59030c(f14458b, logEventDropped.f14472a);
        eVar.mo59028a(f14459c, logEventDropped.f14473b);
    }
}
