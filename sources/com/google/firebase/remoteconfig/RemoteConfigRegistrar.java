package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.installations.C16563d;
import com.google.firebase.platforminfo.C16685e;
import java.util.Arrays;
import java.util.List;
import p575gm.C17793c;
import p583hm.C17829b;
import p591im.C17867a;
import p607km.C18144a;
import p632nn.C18281g;
import p632nn.C18282h;
import p649pm.C18396b;
import p649pm.C18398c;
import p649pm.C18401f;
import p649pm.C18409l;

@Keep
public class RemoteConfigRegistrar implements C18401f {
    /* access modifiers changed from: private */
    public static C18281g lambda$getComponents$0(C18398c cVar) {
        C17829b bVar;
        Context context = (Context) cVar.get(Context.class);
        C17793c cVar2 = (C17793c) cVar.get(C17793c.class);
        C16563d dVar = (C16563d) cVar.get(C16563d.class);
        C17867a aVar = (C17867a) cVar.get(C17867a.class);
        synchronized (aVar) {
            if (!aVar.f38791a.containsKey("frc")) {
                aVar.f38791a.put("frc", new C17829b(aVar.f38792b));
            }
            bVar = (C17829b) aVar.f38791a.get("frc");
        }
        return new C18281g(context, cVar2, dVar, bVar, cVar.mo69938d(C18144a.class));
    }

    public List<C18396b<?>> getComponents() {
        C18396b.C18397a<C18281g> a = C18396b.m31103a(C18281g.class);
        a.mo69934a(new C18409l(1, 0, Context.class));
        a.mo69934a(new C18409l(1, 0, C17793c.class));
        a.mo69934a(new C18409l(1, 0, C16563d.class));
        a.mo69934a(new C18409l(1, 0, C17867a.class));
        a.mo69934a(new C18409l(0, 1, C18144a.class));
        a.f40470e = new C18282h();
        a.mo69936c(2);
        return Arrays.asList(new C18396b[]{a.mo69935b(), C16685e.m27654a("fire-rc", "21.0.1")});
    }
}
