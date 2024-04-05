package com.usebutton.merchant;

import android.util.Log;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import p623mm.C18248b;

/* renamed from: com.usebutton.merchant.q */
public final class C17502q implements C17499n {

    /* renamed from: h */
    public static final String f38269h = C17499n.class.getSimpleName();

    /* renamed from: i */
    public static C17502q f38270i;

    /* renamed from: a */
    public final C17474b f38271a;

    /* renamed from: b */
    public final C17508v f38272b;

    /* renamed from: c */
    public final C18248b f38273c;

    /* renamed from: d */
    public final C17477c0 f38274d;

    /* renamed from: e */
    public final ExecutorService f38275e;

    /* renamed from: f */
    public boolean f38276f;

    /* renamed from: g */
    public CopyOnWriteArrayList f38277g = new CopyOnWriteArrayList();

    public C17502q(C17476c cVar, C17509w wVar, C18248b bVar, C17479d0 d0Var, ExecutorService executorService) {
        this.f38271a = cVar;
        this.f38272b = wVar;
        this.f38273c = bVar;
        this.f38274d = d0Var;
        this.f38275e = executorService;
    }

    /* renamed from: a */
    public final void mo68676a(String str) {
        ((C17479d0) this.f38274d).f38237a.edit().putString("btn_source_token", str).apply();
    }

    /* renamed from: b */
    public final String mo68677b() {
        return ((C17479d0) this.f38274d).f38237a.getString("btn_source_token", (String) null);
    }

    /* renamed from: c */
    public final void mo68678c(C17509w wVar, C18248b bVar, C17493j jVar) {
        C17474b bVar2 = this.f38271a;
        this.f38275e.submit(new C17512y(bVar2, wVar, bVar, ((C17507u) ((C17476c) bVar2).f38234a).f38286a, jVar));
    }

    /* renamed from: d */
    public final void mo68679d(C17509w wVar, C18248b bVar, Event event) {
        C17511x xVar = new C17511x(this.f38271a, wVar, bVar, Collections.singletonList(event), new C17501p(event));
        if (this.f38276f) {
            this.f38275e.submit(xVar);
            return;
        }
        Log.d(f38269h, "Application ID unavailable! Queueing Task.");
        this.f38277g.add(xVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e A[LOOP:0: B:10:0x0038->B:12:0x003e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68680e(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 1
            r4.f38276f = r0
            com.usebutton.merchant.b r1 = r4.f38271a
            com.usebutton.merchant.c r1 = (com.usebutton.merchant.C17476c) r1
            com.usebutton.merchant.t r1 = r1.f38234a
            com.usebutton.merchant.u r1 = (com.usebutton.merchant.C17507u) r1
            r1.getClass()
            r2 = 0
            if (r5 == 0) goto L_0x001f
            java.util.regex.Pattern r3 = com.usebutton.merchant.C17505s.f38282b
            java.util.regex.Matcher r3 = r3.matcher(r5)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L_0x0021
            r3 = r0
            goto L_0x0022
        L_0x001f:
            java.text.SimpleDateFormat r3 = com.usebutton.merchant.C17505s.f38281a
        L_0x0021:
            r3 = r2
        L_0x0022:
            if (r3 == 0) goto L_0x0032
            r1.f38286a = r5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r5
            java.lang.String r5 = "https://%s.mobileapi.usebutton.com"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            r1.f38287b = r5
        L_0x0032:
            java.util.concurrent.CopyOnWriteArrayList r5 = r4.f38277g
            java.util.Iterator r5 = r5.iterator()
        L_0x0038:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r5.next()
            com.usebutton.merchant.f0 r0 = (com.usebutton.merchant.C17484f0) r0
            java.util.concurrent.ExecutorService r1 = r4.f38275e
            r1.submit(r0)
            goto L_0x0038
        L_0x004a:
            java.util.concurrent.CopyOnWriteArrayList r5 = r4.f38277g
            r5.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.merchant.C17502q.mo68680e(java.lang.String):void");
    }

    /* renamed from: f */
    public final void mo68681f() {
        C17472a aVar = new C17472a(this.f38271a, this.f38272b, this.f38273c, mo68677b(), new C17500o());
        if (this.f38276f) {
            this.f38275e.submit(aVar);
            return;
        }
        Log.d(f38269h, "Application ID unavailable! Queueing Task.");
        this.f38277g.add(aVar);
    }

    /* renamed from: g */
    public final void mo68682g() {
        ((C17479d0) this.f38274d).f38237a.edit().putBoolean("btn_checked_deferred_deep_link", true).apply();
    }
}
