package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.room.C3217a;
import com.google.android.datatransport.C6493a;
import com.google.android.datatransport.C6518e;
import com.google.android.datatransport.runtime.C6545i;
import com.google.android.datatransport.runtime.C6556p;
import com.google.android.datatransport.runtime.C6558q;
import com.google.android.datatransport.runtime.C6611t;
import com.google.firebase.platforminfo.C16685e;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p029bh.C3507a;
import p649pm.C18396b;
import p649pm.C18398c;
import p649pm.C18401f;
import p649pm.C18409l;

@Keep
public class TransportRegistrar implements C18401f {
    /* access modifiers changed from: private */
    public static C6518e lambda$getComponents$0(C18398c cVar) {
        Set<T> set;
        C6611t.m12980b((Context) cVar.get(Context.class));
        C6611t a = C6611t.m12979a();
        C3507a aVar = C3507a.f8123e;
        a.getClass();
        if (aVar instanceof C6545i) {
            aVar.getClass();
            set = Collections.unmodifiableSet(C3507a.f8122d);
        } else {
            set = Collections.singleton(new C6493a("proto"));
        }
        C6556p.C6557a builder = C6556p.builder();
        aVar.getClass();
        return new C6558q(set, builder.setBackendName("cct").setExtras(aVar.mo13002b()).build(), a);
    }

    public List<C18396b<?>> getComponents() {
        C18396b.C18397a<C6518e> a = C18396b.m31103a(C6518e.class);
        a.mo69934a(new C18409l(1, 0, Context.class));
        a.f40470e = new C3217a(0);
        return Arrays.asList(new C18396b[]{a.mo69935b(), C16685e.m27654a("fire-transport", "18.1.1")});
    }
}
