package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.platforminfo.C16685e;
import com.google.firebase.platforminfo.C16687f;
import java.util.Arrays;
import java.util.List;
import p575gm.C17793c;
import p591im.C17868b;
import p649pm.C18396b;
import p649pm.C18398c;
import p649pm.C18401f;
import p649pm.C18409l;

@Keep
public class FirebaseInstallationsRegistrar implements C18401f {
    /* access modifiers changed from: private */
    public static /* synthetic */ C16563d lambda$getComponents$0(C18398c cVar) {
        return new C16560c((C17793c) cVar.get(C17793c.class), cVar.mo69938d(C16687f.class), cVar.mo69938d(HeartBeatInfo.class));
    }

    public List<C18396b<?>> getComponents() {
        C18396b.C18397a<C16563d> a = C18396b.m31103a(C16563d.class);
        a.mo69934a(new C18409l(1, 0, C17793c.class));
        a.mo69934a(new C18409l(0, 1, HeartBeatInfo.class));
        a.mo69934a(new C18409l(0, 1, C16687f.class));
        a.f40470e = new C17868b(1);
        return Arrays.asList(new C18396b[]{a.mo69935b(), C16685e.m27654a("fire-installations", "17.0.0")});
    }
}
