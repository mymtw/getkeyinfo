package com.google.android.datatransport.runtime;

import android.support.p013v4.media.C0072d;
import com.google.firebase.encoders.proto.C16547a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p085dh.C6676c;
import p674sm.C18536c;
import p674sm.C18537d;
import p674sm.C18538e;

/* renamed from: com.google.android.datatransport.runtime.d */
public final class C6537d implements C18537d<C6676c> {

    /* renamed from: a */
    public static final C6537d f14460a = new C6537d();

    /* renamed from: b */
    public static final C18536c f14461b;

    /* renamed from: c */
    public static final C18536c f14462c;

    static {
        C16547a aVar = new C16547a(1, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f14461b = new C18536c("logSource", C0072d.m202i(hashMap));
        C16547a aVar2 = new C16547a(2, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f14462c = new C18536c("logEventDropped", C0072d.m202i(hashMap2));
    }

    /* renamed from: a */
    public final void mo18639a(Object obj, Object obj2) throws IOException {
        C6676c cVar = (C6676c) obj;
        C18538e eVar = (C18538e) obj2;
        eVar.mo59028a(f14461b, cVar.f14738a);
        eVar.mo59028a(f14462c, cVar.f14739b);
    }
}
