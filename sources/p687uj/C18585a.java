package p687uj;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.internal.firebase_messaging.zzr;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import java.io.IOException;
import java.util.HashMap;
import p674sm.C18536c;
import p674sm.C18537d;
import p674sm.C18538e;

/* renamed from: uj.a */
public final class C18585a implements C18537d<MessagingClientEvent> {

    /* renamed from: a */
    public static final C18585a f41038a = new C18585a();

    /* renamed from: b */
    public static final C18536c f41039b;

    /* renamed from: c */
    public static final C18536c f41040c;

    /* renamed from: d */
    public static final C18536c f41041d;

    /* renamed from: e */
    public static final C18536c f41042e;

    /* renamed from: f */
    public static final C18536c f41043f;

    /* renamed from: g */
    public static final C18536c f41044g;

    /* renamed from: h */
    public static final C18536c f41045h;

    /* renamed from: i */
    public static final C18536c f41046i;

    /* renamed from: j */
    public static final C18536c f41047j;

    /* renamed from: k */
    public static final C18536c f41048k;

    /* renamed from: l */
    public static final C18536c f41049l;

    /* renamed from: m */
    public static final C18536c f41050m;

    /* renamed from: n */
    public static final C18536c f41051n;

    /* renamed from: o */
    public static final C18536c f41052o;

    /* renamed from: p */
    public static final C18536c f41053p;

    static {
        C18593i iVar = new C18593i(1, zzr.DEFAULT);
        HashMap hashMap = new HashMap();
        hashMap.put(iVar.annotationType(), iVar);
        f41039b = new C18536c("projectNumber", C0072d.m202i(hashMap));
        C18593i iVar2 = new C18593i(2, zzr.DEFAULT);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(iVar2.annotationType(), iVar2);
        f41040c = new C18536c("messageId", C0072d.m202i(hashMap2));
        C18593i iVar3 = new C18593i(3, zzr.DEFAULT);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(iVar3.annotationType(), iVar3);
        f41041d = new C18536c("instanceId", C0072d.m202i(hashMap3));
        C18593i iVar4 = new C18593i(4, zzr.DEFAULT);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(iVar4.annotationType(), iVar4);
        f41042e = new C18536c("messageType", C0072d.m202i(hashMap4));
        C18593i iVar5 = new C18593i(5, zzr.DEFAULT);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(iVar5.annotationType(), iVar5);
        f41043f = new C18536c("sdkPlatform", C0072d.m202i(hashMap5));
        C18593i iVar6 = new C18593i(6, zzr.DEFAULT);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(iVar6.annotationType(), iVar6);
        f41044g = new C18536c("packageName", C0072d.m202i(hashMap6));
        C18593i iVar7 = new C18593i(7, zzr.DEFAULT);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(iVar7.annotationType(), iVar7);
        f41045h = new C18536c("collapseKey", C0072d.m202i(hashMap7));
        C18593i iVar8 = new C18593i(8, zzr.DEFAULT);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(iVar8.annotationType(), iVar8);
        f41046i = new C18536c("priority", C0072d.m202i(hashMap8));
        C18593i iVar9 = new C18593i(9, zzr.DEFAULT);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(iVar9.annotationType(), iVar9);
        f41047j = new C18536c("ttl", C0072d.m202i(hashMap9));
        C18593i iVar10 = new C18593i(10, zzr.DEFAULT);
        HashMap hashMap10 = new HashMap();
        hashMap10.put(iVar10.annotationType(), iVar10);
        f41048k = new C18536c(ResponseConstants.TOPIC, C0072d.m202i(hashMap10));
        C18593i iVar11 = new C18593i(11, zzr.DEFAULT);
        HashMap hashMap11 = new HashMap();
        hashMap11.put(iVar11.annotationType(), iVar11);
        f41049l = new C18536c("bulkId", C0072d.m202i(hashMap11));
        C18593i iVar12 = new C18593i(12, zzr.DEFAULT);
        HashMap hashMap12 = new HashMap();
        hashMap12.put(iVar12.annotationType(), iVar12);
        f41050m = new C18536c("event", C0072d.m202i(hashMap12));
        C18593i iVar13 = new C18593i(13, zzr.DEFAULT);
        HashMap hashMap13 = new HashMap();
        hashMap13.put(iVar13.annotationType(), iVar13);
        f41051n = new C18536c("analyticsLabel", C0072d.m202i(hashMap13));
        C18593i iVar14 = new C18593i(14, zzr.DEFAULT);
        HashMap hashMap14 = new HashMap();
        hashMap14.put(iVar14.annotationType(), iVar14);
        f41052o = new C18536c("campaignId", C0072d.m202i(hashMap14));
        C18593i iVar15 = new C18593i(15, zzr.DEFAULT);
        HashMap hashMap15 = new HashMap();
        hashMap15.put(iVar15.annotationType(), iVar15);
        f41053p = new C18536c("composerLabel", C0072d.m202i(hashMap15));
    }

    /* renamed from: a */
    public final void mo18639a(Object obj, Object obj2) throws IOException {
        MessagingClientEvent messagingClientEvent = (MessagingClientEvent) obj;
        C18538e eVar = (C18538e) obj2;
        eVar.mo59030c(f41039b, messagingClientEvent.f36810a);
        eVar.mo59028a(f41040c, messagingClientEvent.f36811b);
        eVar.mo59028a(f41041d, messagingClientEvent.f36812c);
        eVar.mo59028a(f41042e, messagingClientEvent.f36813d);
        eVar.mo59028a(f41043f, messagingClientEvent.f36814e);
        eVar.mo59028a(f41044g, messagingClientEvent.f36815f);
        eVar.mo59028a(f41045h, messagingClientEvent.f36816g);
        eVar.mo59031d(f41046i, messagingClientEvent.f36817h);
        eVar.mo59031d(f41047j, messagingClientEvent.f36818i);
        eVar.mo59028a(f41048k, messagingClientEvent.f36819j);
        eVar.mo59030c(f41049l, messagingClientEvent.f36820k);
        eVar.mo59028a(f41050m, messagingClientEvent.f36821l);
        eVar.mo59028a(f41051n, messagingClientEvent.f36822m);
        eVar.mo59030c(f41052o, messagingClientEvent.f36823n);
        eVar.mo59028a(f41053p, messagingClientEvent.f36824o);
    }
}
