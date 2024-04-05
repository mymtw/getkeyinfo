package com.google.firebase.messaging;

import androidx.annotation.Keep;
import androidx.compose.p015ui.text.input.C1993m;
import com.google.android.datatransport.C6518e;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.C16563d;
import com.google.firebase.platforminfo.C16685e;
import com.google.firebase.platforminfo.C16687f;
import java.util.Arrays;
import java.util.List;
import p575gm.C17793c;
import p649pm.C18396b;
import p649pm.C18398c;
import p649pm.C18401f;
import p649pm.C18409l;
import p706wm.C18752d;
import p714xm.C18819a;

@KeepForSdk
@Keep
public class FirebaseMessagingRegistrar implements C18401f {
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(C18398c cVar) {
        return new FirebaseMessaging((C17793c) cVar.get(C17793c.class), (C18819a) cVar.get(C18819a.class), cVar.mo69938d(C16687f.class), cVar.mo69938d(HeartBeatInfo.class), (C16563d) cVar.get(C16563d.class), (C6518e) cVar.get(C6518e.class), (C18752d) cVar.get(C18752d.class));
    }

    @Keep
    public List<C18396b<?>> getComponents() {
        C18396b.C18397a<FirebaseMessaging> a = C18396b.m31103a(FirebaseMessaging.class);
        a.mo69934a(new C18409l(1, 0, C17793c.class));
        a.mo69934a(new C18409l(0, 0, C18819a.class));
        a.mo69934a(new C18409l(0, 1, C16687f.class));
        a.mo69934a(new C18409l(0, 1, HeartBeatInfo.class));
        a.mo69934a(new C18409l(0, 0, C6518e.class));
        a.mo69934a(new C18409l(1, 0, C16563d.class));
        a.mo69934a(new C18409l(1, 0, C18752d.class));
        a.f40470e = C1993m.f4487b;
        a.mo69936c(1);
        return Arrays.asList(new C18396b[]{a.mo69935b(), C16685e.m27654a("fire-fcm", "23.0.0")});
    }
}
