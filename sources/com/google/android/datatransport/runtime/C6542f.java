package com.google.android.datatransport.runtime;

import android.support.p013v4.media.C0072d;
import com.google.firebase.encoders.proto.C16547a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p085dh.C6677d;
import p674sm.C18536c;
import p674sm.C18537d;
import p674sm.C18538e;

/* renamed from: com.google.android.datatransport.runtime.f */
public final class C6542f implements C18537d<C6677d> {

    /* renamed from: a */
    public static final C6542f f14469a = new C6542f();

    /* renamed from: b */
    public static final C18536c f14470b;

    /* renamed from: c */
    public static final C18536c f14471c;

    static {
        C16547a aVar = new C16547a(1, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f14470b = new C18536c("currentCacheSizeBytes", C0072d.m202i(hashMap));
        C16547a aVar2 = new C16547a(2, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f14471c = new C18536c("maxCacheSizeBytes", C0072d.m202i(hashMap2));
    }

    /* renamed from: a */
    public final void mo18639a(Object obj, Object obj2) throws IOException {
        C6677d dVar = (C6677d) obj;
        C18538e eVar = (C18538e) obj2;
        eVar.mo59030c(f14470b, dVar.f14740a);
        eVar.mo59030c(f14471c, dVar.f14741b);
    }
}
