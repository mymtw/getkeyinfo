package com.etsy.android.p327ui.conversation.details.legacy;

import android.content.Intent;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.models.ConversationUserModel;
import com.etsy.android.lib.models.conversation.ConversationThread;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.util.C8886e;
import com.etsy.android.p327ui.conversation.details.C9526h;
import com.etsy.android.p327ui.conversation.details.C9532l;
import com.etsy.android.p327ui.conversation.details.C9559o;
import com.etsy.android.p327ui.conversation.details.legacy.C9551k;
import com.etsy.android.p327ui.conversation.details.legacy.LegacyDraftMessage;
import com.etsy.android.p327ui.navigation.bottom.BottomNavStateRepo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$IntRef;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.completable.C19095g;
import p145io.reactivex.internal.operators.completable.CompletableObserveOn;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p145io.reactivex.internal.subscribers.LambdaSubscriber;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p354gc.C12763b;
import p354gc.C12766d;
import p425q9.C13265p;
import p456ua.C13461f;
import p487ya.C13895a;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter */
public final class LegacyConversationDetailsPresenter {

    /* renamed from: a */
    public final LegacyConversationRepository f21119a;

    /* renamed from: b */
    public final C9526h f21120b;

    /* renamed from: c */
    public final C13461f f21121c;

    /* renamed from: d */
    public final ConversationUserModel f21122d;

    /* renamed from: e */
    public final C13895a f21123e;

    /* renamed from: f */
    public final C9532l f21124f;

    /* renamed from: g */
    public final C8886e f21125g;

    /* renamed from: h */
    public final C8630b f21126h;

    /* renamed from: i */
    public final BottomNavStateRepo f21127i;

    /* renamed from: j */
    public final Connectivity f21128j;

    /* renamed from: k */
    public final C13265p f21129k;

    /* renamed from: l */
    public EtsyId f21130l = new EtsyId(0);

    /* renamed from: m */
    public EtsyId f21131m = new EtsyId(0);

    /* renamed from: n */
    public final C7091a f21132n = new C7091a();

    /* renamed from: o */
    public LambdaSubscriber f21133o;

    /* renamed from: p */
    public final C9559o[] f21134p;

    /* renamed from: q */
    public ConversationThread.InteractionState f21135q;

    /* renamed from: r */
    public LegacyDraftMessage f21136r;

    /* renamed from: s */
    public C12766d f21137s;

    /* renamed from: t */
    public ArrayList<LegacyDraftMessage> f21138t;

    /* renamed from: u */
    public LambdaObserver f21139u;

    /* renamed from: v */
    public final C9547g f21140v;

    /* renamed from: w */
    public final LegacyConversationDetailsPresenter$linkCardBoundListener$1 f21141w;

    /* renamed from: x */
    public final C9546f f21142x;

    /* renamed from: y */
    public final LegacyConversationDetailsPresenter$translateClickedListener$1 f21143y;

    public LegacyConversationDetailsPresenter(LegacyConversationRepository legacyConversationRepository, LegacyConversationDetailsFragment legacyConversationDetailsFragment, C13461f fVar, ConversationUserModel conversationUserModel, C13895a aVar, C9532l lVar, C8886e eVar, C8630b bVar, BottomNavStateRepo bottomNavStateRepo, Connectivity connectivity, C13265p pVar) {
        C13895a aVar2 = aVar;
        C8886e eVar2 = eVar;
        C8630b bVar2 = bVar;
        BottomNavStateRepo bottomNavStateRepo2 = bottomNavStateRepo;
        Connectivity connectivity2 = connectivity;
        C13265p pVar2 = pVar;
        C19383o.m32797g(aVar2, "fileSupport");
        C19383o.m32797g(eVar2, "cameraHelper");
        C19383o.m32797g(bVar2, "etsyMoneyFactory");
        C19383o.m32797g(bottomNavStateRepo2, "bottomNavStateRepo");
        C19383o.m32797g(connectivity2, "connectivity");
        C19383o.m32797g(pVar2, "session");
        this.f21119a = legacyConversationRepository;
        this.f21120b = legacyConversationDetailsFragment;
        this.f21121c = fVar;
        this.f21122d = conversationUserModel;
        this.f21123e = aVar2;
        this.f21124f = lVar;
        this.f21125g = eVar2;
        this.f21126h = bVar2;
        this.f21127i = bottomNavStateRepo2;
        this.f21128j = connectivity2;
        this.f21129k = pVar2;
        C9559o[] oVarArr = new C9559o[3];
        for (int i = 0; i < 3; i++) {
            oVarArr[i] = C9559o.C9562c.f21220a;
        }
        this.f21134p = oVarArr;
        this.f21135q = new ConversationThread.InteractionState();
        this.f21136r = new LegacyDraftMessage(this.f21130l.getIdAsLongDeprecated(), "", this.f21122d.getUsername(), false, 0, 0, LegacyDraftMessage.Status.IN_DRAFT, 0, new ArrayList(3));
        this.f21138t = new ArrayList<>();
        this.f21140v = new C9547g(this);
        this.f21141w = new LegacyConversationDetailsPresenter$linkCardBoundListener$1(this);
        this.f21142x = new C9546f(this);
        this.f21143y = new LegacyConversationDetailsPresenter$translateClickedListener$1(this);
    }

    /* renamed from: a */
    public final void mo32104a() {
        boolean z = false;
        if (((this.f21136r.f21153b.length() > 0) || (!mo32106c().isEmpty())) && !this.f21135q.isSending()) {
            z = true;
        }
        this.f21120b.enableSend(z);
    }

    /* renamed from: b */
    public final void mo32105b() {
        boolean z = false;
        int i = 0;
        for (C9559o oVar : this.f21134p) {
            if (oVar instanceof C9559o.C9562c) {
                i++;
            }
        }
        if (i > 0) {
            z = true;
        }
        this.f21120b.updateImageAttachmentButton(z);
    }

    /* renamed from: c */
    public final ArrayList mo32106c() {
        C9559o[] oVarArr = this.f21134p;
        ArrayList arrayList = new ArrayList();
        for (C9559o oVar : oVarArr) {
            if (oVar instanceof C9559o.C9560a) {
                arrayList.add(oVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C9559o.C9560a) it.next()).f21218b);
        }
        return arrayList2;
    }

    /* renamed from: d */
    public final void mo32107d(int i, int i2, Intent intent) {
        if (i != 300 && i != 301) {
            this.f21125g.mo30479f(i, i2, intent);
        } else if (this.f21129k.mo45960e()) {
            this.f21122d.setUserId(this.f21129k.mo45958c());
        }
    }

    /* renamed from: e */
    public final void mo32108e(ArrayList<LegacyDraftMessage> arrayList) {
        C19383o.m32797g(arrayList, "unsentList");
        this.f21135q.setSending(true);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = arrayList.size();
        Iterator<LegacyDraftMessage> it = arrayList.iterator();
        while (it.hasNext()) {
            LegacyDraftMessage next = it.next();
            LegacyDraftMessage.Status status = LegacyDraftMessage.Status.SENDING;
            next.getClass();
            C19383o.m32797g(status, "<set-?>");
            next.f21158g = status;
            ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f21121c, C0472h.m1243e(this.f21121c, this.f21119a.mo32129a(next))), new LegacyConversationDetailsPresenter$sendUnsentDrafts$1(ref$IntRef, this), new LegacyConversationDetailsPresenter$sendUnsentDrafts$2(arrayList, next, this, ref$IntRef));
            C7091a aVar = this.f21132n;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r1 == null) goto L_0x0069;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32109f(p354gc.C12766d r8) {
        /*
            r7 = this;
            r7.f21137s = r8
            gc.b r0 = r8.f28216a
            gc.m r0 = r0.f28208b
            long r0 = r0.f28262d
            java.util.List r0 = com.etsy.android.p327ui.conversation.details.C9527i.m17909a(r8, r0)
            gc.d r1 = r7.f21137s
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0018
            boolean r1 = r1.f28218c
            if (r1 != 0) goto L_0x0018
            r1 = r2
            goto L_0x0019
        L_0x0018:
            r1 = r3
        L_0x0019:
            if (r1 == 0) goto L_0x001e
            r7.mo32110g(r3)
        L_0x001e:
            com.etsy.android.ui.conversation.details.h r1 = r7.f21120b
            r1.clearAdapter()
            com.etsy.android.ui.conversation.details.h r1 = r7.f21120b
            r1.addItemsToAdapter(r0)
            com.etsy.android.ui.conversation.details.h r0 = r7.f21120b
            r0.showListView()
            com.etsy.android.ui.conversation.details.h r0 = r7.f21120b
            r0.stopRefreshing()
            com.etsy.android.ui.conversation.details.h r0 = r7.f21120b
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x0069
            gc.d r4 = r7.f21137s
            if (r4 == 0) goto L_0x0066
            gc.b r4 = r4.f28216a
            if (r4 == 0) goto L_0x0066
            gc.m r4 = r4.f28208b
            if (r4 == 0) goto L_0x0066
            boolean r5 = r4.f28263e
            if (r5 == 0) goto L_0x0063
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r4 = r4.f28259a
            r6[r3] = r4
            r3 = 2131952335(0x7f1302cf, float:1.954111E38)
            java.lang.String r1 = r1.getString(r3)
            r6[r2] = r1
            java.lang.String r1 = "%s (%s)"
            java.lang.String r2 = "format(format, *args)"
            java.lang.String r1 = androidx.compose.animation.C0388a.m1049e(r6, r5, r1, r2)
            goto L_0x0067
        L_0x0063:
            java.lang.String r1 = r4.f28259a
            goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            if (r1 != 0) goto L_0x006b
        L_0x0069:
            java.lang.String r1 = ""
        L_0x006b:
            r0.setTitle(r1)
            gc.b r8 = r8.f28216a
            com.etsy.android.lib.models.apiv3.Alert r8 = r8.f28213g
            if (r8 == 0) goto L_0x007a
            com.etsy.android.ui.conversation.details.h r0 = r7.f21120b
            r0.showPersistentAlert(r8)
            goto L_0x007f
        L_0x007a:
            com.etsy.android.ui.conversation.details.h r8 = r7.f21120b
            r8.hidePersistentAlert()
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationDetailsPresenter.mo32109f(gc.d):void");
    }

    /* renamed from: g */
    public final void mo32110g(boolean z) {
        C12763b bVar;
        C12766d dVar = this.f21137s;
        if (dVar != null && (bVar = dVar.f28216a) != null) {
            boolean z2 = bVar.f28212f;
            C19095g b = this.f21119a.mo32130b(z2 ? new C9551k.C9555d(this.f21130l) : new C9551k.C9552a(this.f21130l));
            this.f21121c.getClass();
            CompletableSubscribeOn completableSubscribeOn = new CompletableSubscribeOn(b, C13461f.m21235b());
            this.f21121c.getClass();
            Disposable d = SubscribersKt.m32499d(new CompletableObserveOn(completableSubscribeOn, C13461f.m21236c()), new LegacyConversationDetailsPresenter$toggleReadState$1$1(this), new LegacyConversationDetailsPresenter$toggleReadState$1$2(this, z2, z));
            C7091a aVar = this.f21132n;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(d);
        }
    }
}
