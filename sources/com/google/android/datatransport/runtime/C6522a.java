package com.google.android.datatransport.runtime;

import android.support.p013v4.media.C0072d;
import com.google.firebase.encoders.proto.C16547a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.util.HashMap;
import p085dh.C6673a;
import p674sm.C18536c;
import p674sm.C18537d;
import p674sm.C18538e;

/* renamed from: com.google.android.datatransport.runtime.a */
public final class C6522a implements C18537d<C6673a> {

    /* renamed from: a */
    public static final C6522a f14436a = new C6522a();

    /* renamed from: b */
    public static final C18536c f14437b;

    /* renamed from: c */
    public static final C18536c f14438c;

    /* renamed from: d */
    public static final C18536c f14439d;

    /* renamed from: e */
    public static final C18536c f14440e;

    static {
        C16547a aVar = new C16547a(1, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f14437b = new C18536c("window", C0072d.m202i(hashMap));
        C16547a aVar2 = new C16547a(2, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f14438c = new C18536c("logSourceMetrics", C0072d.m202i(hashMap2));
        C16547a aVar3 = new C16547a(3, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(aVar3.annotationType(), aVar3);
        f14439d = new C18536c("globalMetrics", C0072d.m202i(hashMap3));
        C16547a aVar4 = new C16547a(4, Protobuf.IntEncoding.DEFAULT);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(aVar4.annotationType(), aVar4);
        f14440e = new C18536c("appNamespace", C0072d.m202i(hashMap4));
    }

    /* renamed from: a */
    public final void mo18639a(Object obj, Object obj2) throws IOException {
        C6673a aVar = (C6673a) obj;
        C18538e eVar = (C18538e) obj2;
        eVar.mo59028a(f14437b, aVar.f14728a);
        eVar.mo59028a(f14438c, aVar.f14729b);
        eVar.mo59028a(f14439d, aVar.f14730c);
        eVar.mo59028a(f14440e, aVar.f14731d);
    }
}
