package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p649pm.C18411n;
import p722ym.C18895a;

/* renamed from: com.google.firebase.heartbeatinfo.c */
public final class C16552c implements HeartBeatInfo {

    /* renamed from: c */
    public static final C16550a f36734c = new C16550a();

    /* renamed from: a */
    public C18895a<C16554e> f36735a;

    /* renamed from: b */
    public final Set<C16553d> f36736b;

    public C16552c(Context context, Set<C16553d> set) {
        C18411n nVar = new C18411n(new C16551b(context));
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f36734c);
        this.f36735a = nVar;
        this.f36736b = set;
    }

    /* renamed from: a */
    public final HeartBeatInfo.HeartBeat mo59048a(String str) {
        boolean a;
        long currentTimeMillis = System.currentTimeMillis();
        boolean a2 = this.f36735a.get().mo59052a(currentTimeMillis, str);
        C16554e eVar = this.f36735a.get();
        synchronized (eVar) {
            a = eVar.mo59052a(currentTimeMillis, "fire-global");
        }
        return (!a2 || !a) ? a ? HeartBeatInfo.HeartBeat.GLOBAL : a2 ? HeartBeatInfo.HeartBeat.SDK : HeartBeatInfo.HeartBeat.NONE : HeartBeatInfo.HeartBeat.COMBINED;
    }
}
