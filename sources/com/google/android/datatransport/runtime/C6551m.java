package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.HashMap;
import p085dh.C6673a;
import p085dh.C6675b;
import p085dh.C6676c;
import p085dh.C6677d;
import p085dh.C6678e;
import p698vm.C18662d;
import p698vm.C18663e;

/* renamed from: com.google.android.datatransport.runtime.m */
public abstract class C6551m {

    /* renamed from: a */
    public static final C18663e f14485a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C18662d dVar = C18663e.C18664a.f41271a;
        Class<C6551m> cls = C6551m.class;
        hashMap.put(cls, C6541e.f14467a);
        hashMap2.remove(cls);
        Class<C6673a> cls2 = C6673a.class;
        hashMap.put(cls2, C6522a.f14436a);
        hashMap2.remove(cls2);
        Class<C6678e> cls3 = C6678e.class;
        hashMap.put(cls3, C6543g.f14474a);
        hashMap2.remove(cls3);
        Class<C6676c> cls4 = C6676c.class;
        hashMap.put(cls4, C6537d.f14460a);
        hashMap2.remove(cls4);
        Class<LogEventDropped> cls5 = LogEventDropped.class;
        hashMap.put(cls5, C6536c.f14457a);
        hashMap2.remove(cls5);
        Class<C6675b> cls6 = C6675b.class;
        hashMap.put(cls6, C6523b.f14441a);
        hashMap2.remove(cls6);
        Class<C6677d> cls7 = C6677d.class;
        hashMap.put(cls7, C6542f.f14469a);
        hashMap2.remove(cls7);
        f14485a = new C18663e(new HashMap(hashMap), new HashMap(hashMap2), dVar);
    }

    /* renamed from: a */
    public abstract C6673a mo18721a();
}
