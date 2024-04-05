package com.google.android.datatransport.runtime;

import android.support.p013v4.media.C0072d;
import com.google.firebase.encoders.proto.C16547a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p085dh.C6678e;
import p674sm.C18536c;
import p674sm.C18537d;
import p674sm.C18538e;

/* renamed from: com.google.android.datatransport.runtime.g */
public final class C6543g implements C18537d<C6678e> {

    /* renamed from: a */
    public static final C6543g f14474a = new C6543g();

    /* renamed from: b */
    public static final C18536c f14475b;

    /* renamed from: c */
    public static final C18536c f14476c;

    static {
        C16547a aVar = new C16547a(1, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f14475b = new C18536c("startMs", C0072d.m202i(hashMap));
        C16547a aVar2 = new C16547a(2, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f14476c = new C18536c("endMs", C0072d.m202i(hashMap2));
    }

    /* renamed from: a */
    public final void mo18639a(Object obj, Object obj2) throws IOException {
        C6678e eVar = (C6678e) obj;
        C18538e eVar2 = (C18538e) obj2;
        eVar2.mo59030c(f14475b, eVar.f14742a);
        eVar2.mo59030c(f14476c, eVar.f14743b);
    }
}
