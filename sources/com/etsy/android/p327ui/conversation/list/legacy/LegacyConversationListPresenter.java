package com.etsy.android.p327ui.conversation.list.legacy;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p327ui.conversation.details.C9532l;
import com.etsy.android.p327ui.conversation.list.C9569a;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p456ua.C13461f;

/* renamed from: com.etsy.android.ui.conversation.list.legacy.LegacyConversationListPresenter */
public final class LegacyConversationListPresenter {

    /* renamed from: a */
    public final C9599g f21265a;

    /* renamed from: b */
    public final C13461f f21266b;

    /* renamed from: c */
    public final C9532l f21267c;

    /* renamed from: d */
    public final C8694h f21268d;

    /* renamed from: e */
    public C9569a f21269e;

    /* renamed from: f */
    public int f21270f = -1;

    /* renamed from: g */
    public final C7091a f21271g = new C7091a();

    /* renamed from: h */
    public C9593a f21272h;

    /* renamed from: i */
    public LambdaObserver f21273i;

    public LegacyConversationListPresenter(C9599g gVar, C13461f fVar, C9532l lVar, C8694h hVar) {
        C19383o.m32797g(gVar, "repository");
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(lVar, "conversationPushNotificationRepository");
        C19383o.m32797g(hVar, "logCat");
        this.f21265a = gVar;
        this.f21266b = fVar;
        this.f21267c = lVar;
        this.f21268d = hVar;
    }

    /* renamed from: a */
    public final C9569a mo32218a() {
        C9569a aVar = this.f21269e;
        if (aVar != null) {
            return aVar;
        }
        C19383o.m32805o("view");
        throw null;
    }

    /* renamed from: b */
    public final void mo32219b() {
        C9593a aVar;
        C9593a aVar2 = this.f21272h;
        int i = (aVar2 != null ? aVar2.f21274a : 0) + (aVar2 != null ? aVar2.f21275b : 0);
        if (aVar2 != null) {
            int i2 = aVar2.f21274a;
            int i3 = aVar2.f21275b;
            aVar = new C9593a(i2 + i3, i3);
        } else {
            aVar = new C9593a(0, 20);
        }
        int i4 = this.f21270f;
        if (i4 == -1 || i4 > i) {
            ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f21266b, C0326j.m860e(this.f21266b, this.f21265a.mo32230a(aVar))), LegacyConversationListPresenter$loadConversations$1.INSTANCE, new LegacyConversationListPresenter$loadConversations$2(this));
            C7091a aVar3 = this.f21271g;
            C19383o.m32798h(aVar3, "compositeDisposable");
            aVar3.mo19403b(e);
            return;
        }
        mo32218a().stopRefreshing();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        if ((r3 != r9.get(2)) != false) goto L_0x003a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32220c(java.util.List<p354gc.C12763b> r8, int r9, com.etsy.android.p327ui.conversation.list.legacy.C9593a r10) {
        /*
            r7 = this;
            r7.f21270f = r9
            int r9 = r10.f21274a
            if (r9 != 0) goto L_0x000c
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0010
        L_0x000c:
            int r9 = r7.f21270f
            if (r9 != 0) goto L_0x0019
        L_0x0010:
            com.etsy.android.ui.conversation.list.a r8 = r7.mo32218a()
            r8.showEmptyView()
            goto L_0x00df
        L_0x0019:
            r7.f21272h = r10
            r9 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0025:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r8.next()
            gc.b r0 = (p354gc.C12763b) r0
            java.lang.String r1 = "currentConversation"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r1 = 2
            r2 = 1
            if (r9 != 0) goto L_0x003c
        L_0x003a:
            r4 = r2
            goto L_0x005f
        L_0x003c:
            long r3 = r0.f28209c
            long r5 = r9.f28209c
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.util.Calendar r9 = java.util.Calendar.getInstance(r9)
            r9.setTimeInMillis(r3)
            int r3 = r9.get(r1)
            r9.setTimeInMillis(r5)
            int r9 = r9.get(r1)
            r4 = 0
            if (r3 == r9) goto L_0x005b
            r9 = r2
            goto L_0x005c
        L_0x005b:
            r9 = r4
        L_0x005c:
            if (r9 == 0) goto L_0x005f
            goto L_0x003a
        L_0x005f:
            if (r4 == 0) goto L_0x00bf
            gc.a$b r9 = new gc.a$b
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.util.Calendar r3 = java.util.Calendar.getInstance(r3)
            long r4 = r0.f28209c
            r3.setTimeInMillis(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r1 = r3.getDisplayName(r1, r1, r5)
            java.lang.String r5 = "calendar.getDisplayName(…ONG, Locale.getDefault())"
            kotlin.jvm.internal.C19383o.m32796f(r1, r5)
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r6 = "getDefault()"
            kotlin.jvm.internal.C19383o.m32796f(r5, r6)
            java.lang.String r1 = r1.toUpperCase(r5)
            java.lang.String r5 = "this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.C19383o.m32796f(r1, r5)
            r4.append(r1)
            int r1 = r3.get(r2)
            long r5 = java.lang.System.currentTimeMillis()
            r3.setTimeInMillis(r5)
            int r2 = r3.get(r2)
            if (r1 == r2) goto L_0x00b0
            java.lang.String r2 = " "
            r4.append(r2)
            r4.append(r1)
        L_0x00b0:
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "displayDate.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r1, r2)
            r9.<init>(r1)
            r10.add(r9)
        L_0x00bf:
            gc.a$a r9 = new gc.a$a
            r9.<init>(r0)
            r10.add(r9)
            r9 = r0
            goto L_0x0025
        L_0x00ca:
            com.etsy.android.ui.conversation.list.a r8 = r7.mo32218a()
            r8.addItemsToAdapter(r10)
            com.etsy.android.ui.conversation.list.a r8 = r7.mo32218a()
            r8.showListView()
            com.etsy.android.ui.conversation.list.a r8 = r7.mo32218a()
            r8.stopRefreshing()
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.conversation.list.legacy.LegacyConversationListPresenter.mo32220c(java.util.List, int, com.etsy.android.ui.conversation.list.legacy.a):void");
    }
}
