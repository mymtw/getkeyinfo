package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.platforminfo.C16685e;
import java.util.Arrays;
import java.util.List;
import p591im.C17867a;
import p591im.C17868b;
import p607km.C18144a;
import p649pm.C18396b;
import p649pm.C18398c;
import p649pm.C18401f;
import p649pm.C18409l;

@Keep
public class AbtRegistrar implements C18401f {
    /* access modifiers changed from: private */
    public static /* synthetic */ C17867a lambda$getComponents$0(C18398c cVar) {
        return new C17867a((Context) cVar.get(Context.class), cVar.mo69938d(C18144a.class));
    }

    public List<C18396b<?>> getComponents() {
        C18396b.C18397a<C17867a> a = C18396b.m31103a(C17867a.class);
        a.mo69934a(new C18409l(1, 0, Context.class));
        a.mo69934a(new C18409l(0, 1, C18144a.class));
        a.f40470e = new C17868b(0);
        return Arrays.asList(new C18396b[]{a.mo69935b(), C16685e.m27654a("fire-abt", "21.0.0")});
    }
}
