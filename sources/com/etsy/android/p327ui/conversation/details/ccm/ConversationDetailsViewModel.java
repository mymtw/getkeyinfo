package com.etsy.android.p327ui.conversation.details.ccm;

import androidx.compose.animation.C0391c;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.R;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.models.ConversationUser;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.conversation.details.C9531k;
import com.etsy.android.p327ui.conversation.details.C9532l;
import com.etsy.android.p327ui.conversation.details.C9559o;
import com.etsy.android.p327ui.conversation.details.ccm.C9502k;
import com.etsy.android.p327ui.conversation.details.models.ConversationResponse;
import com.etsy.android.p327ui.conversation.details.models.DraftMessage;
import com.etsy.android.p327ui.navigation.bottom.BottomNavStateRepo;
import com.etsy.android.p327ui.util.C11786n;
import com.etsy.android.util.C12059p;
import com.etsy.android.util.C12060q;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.C19179q;
import p145io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import p145io.reactivex.internal.operators.single.C19202e;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p306z8.C8480g;
import p336dc.C12646d;
import p354gc.C12766d;
import p425q9.C13265p;
import p456ua.C13461f;
import p628nj.C18263b;
import p753kq.C19857l;
import retrofit2.HttpException;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsViewModel */
public final class ConversationDetailsViewModel extends C2866i0 {

    /* renamed from: A */
    public final C2895z<C12059p<C19394m>> f21008A;

    /* renamed from: B */
    public final C2895z f21009B;

    /* renamed from: C */
    public EtsyId f21010C = new EtsyId(0);

    /* renamed from: D */
    public long f21011D;

    /* renamed from: E */
    public String f21012E = "";

    /* renamed from: F */
    public String f21013F = "";

    /* renamed from: G */
    public final C7091a f21014G = new C7091a();

    /* renamed from: H */
    public final C9559o[] f21015H;

    /* renamed from: I */
    public DraftMessage f21016I;

    /* renamed from: J */
    public C12766d f21017J;

    /* renamed from: K */
    public Long f21018K;

    /* renamed from: b */
    public final C13461f f21019b;

    /* renamed from: c */
    public final C8630b f21020c;

    /* renamed from: d */
    public final C13265p f21021d;

    /* renamed from: e */
    public final C11786n f21022e;

    /* renamed from: f */
    public final C9510o f21023f;

    /* renamed from: g */
    public final BottomNavStateRepo f21024g;

    /* renamed from: h */
    public final C12646d f21025h;

    /* renamed from: i */
    public final C2895z<C9502k> f21026i;

    /* renamed from: j */
    public final C2895z f21027j;

    /* renamed from: k */
    public final C2895z<Boolean> f21028k;

    /* renamed from: l */
    public final C2895z f21029l;

    /* renamed from: m */
    public final C2895z<C9559o[]> f21030m;

    /* renamed from: n */
    public final C2895z f21031n;

    /* renamed from: o */
    public final C2895z<Boolean> f21032o;

    /* renamed from: p */
    public final C2895z f21033p;

    /* renamed from: q */
    public final C2895z<C12059p<String>> f21034q;

    /* renamed from: r */
    public final C2895z f21035r;

    /* renamed from: s */
    public final C2895z<C12059p<C19394m>> f21036s;

    /* renamed from: t */
    public final C2895z f21037t;

    /* renamed from: u */
    public final C2895z<String> f21038u;

    /* renamed from: v */
    public final C2895z f21039v;

    /* renamed from: w */
    public final C2895z<Alert> f21040w;

    /* renamed from: x */
    public final C2895z f21041x;

    /* renamed from: y */
    public final C2895z<C12059p<Integer>> f21042y;

    /* renamed from: z */
    public final C2895z f21043z;

    public ConversationDetailsViewModel(C13461f fVar, C8630b bVar, C13265p pVar, C11786n nVar, C9510o oVar, BottomNavStateRepo bottomNavStateRepo, C12646d dVar, C9532l lVar) {
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(bVar, "etsyMoneyFactory");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(nVar, "resourceProvider");
        C19383o.m32797g(oVar, "conversationRepository");
        C19383o.m32797g(bottomNavStateRepo, "bottomNavigationStateRepository");
        C19383o.m32797g(dVar, "conversationsPushOptInEligibility");
        C19383o.m32797g(lVar, "conversationPushNotificationRepository");
        this.f21019b = fVar;
        this.f21020c = bVar;
        this.f21021d = pVar;
        this.f21022e = nVar;
        this.f21023f = oVar;
        this.f21024g = bottomNavStateRepo;
        this.f21025h = dVar;
        C2895z<C9502k> zVar = new C2895z<>();
        this.f21026i = zVar;
        this.f21027j = zVar;
        C2895z<Boolean> zVar2 = new C2895z<>();
        this.f21028k = zVar2;
        this.f21029l = zVar2;
        C2895z<C9559o[]> zVar3 = new C2895z<>();
        this.f21030m = zVar3;
        this.f21031n = zVar3;
        C2895z<Boolean> zVar4 = new C2895z<>();
        this.f21032o = zVar4;
        this.f21033p = zVar4;
        C2895z<C12059p<String>> zVar5 = new C2895z<>();
        this.f21034q = zVar5;
        this.f21035r = zVar5;
        C2895z<C12059p<C19394m>> zVar6 = new C2895z<>();
        this.f21036s = zVar6;
        this.f21037t = zVar6;
        C2895z<String> zVar7 = new C2895z<>();
        this.f21038u = zVar7;
        this.f21039v = zVar7;
        C2895z<Alert> zVar8 = new C2895z<>();
        this.f21040w = zVar8;
        this.f21041x = zVar8;
        C2895z<C12059p<Integer>> zVar9 = new C2895z<>();
        this.f21042y = zVar9;
        this.f21043z = zVar9;
        C2895z<C12059p<C19394m>> zVar10 = new C2895z<>();
        this.f21008A = zVar10;
        this.f21009B = zVar10;
        C9559o[] oVarArr = new C9559o[3];
        for (int i = 0; i < 3; i++) {
            oVarArr[i] = C9559o.C9562c.f21220a;
        }
        this.f21015H = oVarArr;
        this.f21016I = new DraftMessage((Object) null);
        C19179q a = lVar.mo32082a();
        this.f21019b.getClass();
        ObservableSubscribeOn i2 = a.mo20639i(C13461f.m21235b());
        this.f21019b.getClass();
        LambdaObserver f = SubscribersKt.m32501f(i2.mo20635e(C13461f.m21236c()), (C19857l) null, new C19857l<C9531k, C19394m>(this) {
            public final /* synthetic */ ConversationDetailsViewModel this$0;

            {
                this.this$0 = r1;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
                r0 = (r0 = r0.f28216a).f28208b;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(com.etsy.android.p327ui.conversation.details.C9531k r2) {
                /*
                    r1 = this;
                    java.lang.String r2 = r2.f21114a
                    com.etsy.android.ui.conversation.details.ccm.ConversationDetailsViewModel r0 = r1.this$0
                    gc.d r0 = r0.f21017J
                    if (r0 == 0) goto L_0x0013
                    gc.b r0 = r0.f28216a
                    if (r0 == 0) goto L_0x0013
                    gc.m r0 = r0.f28208b
                    if (r0 == 0) goto L_0x0013
                    java.lang.String r0 = r0.f28259a
                    goto L_0x0014
                L_0x0013:
                    r0 = 0
                L_0x0014:
                    boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r2, r0)
                    if (r2 == 0) goto L_0x001f
                    com.etsy.android.ui.conversation.details.ccm.ConversationDetailsViewModel r2 = r1.this$0
                    r2.mo32009e()
                L_0x001f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.conversation.details.ccm.ConversationDetailsViewModel.C94881.invoke(com.etsy.android.ui.conversation.details.k):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C9531k) obj);
                return C19394m.f43287a;
            }
        }, 3);
        C7091a aVar = this.f21014G;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(f);
    }

    /* renamed from: b */
    public static final void m17867b(ConversationDetailsViewModel conversationDetailsViewModel, Throwable th) {
        conversationDetailsViewModel.getClass();
        HttpException httpException = th instanceof HttpException ? (HttpException) th : null;
        if (httpException != null && httpException.code() == 404) {
            conversationDetailsViewModel.f21026i.setValue(new C9502k.C9503a(conversationDetailsViewModel.f21013F));
            conversationDetailsViewModel.f21024g.mo34416c();
        } else if (conversationDetailsViewModel.f21017J == null) {
            conversationDetailsViewModel.f21026i.setValue(new C9502k.C9504b(conversationDetailsViewModel.f21022e.mo38059c(R.string.conversation_error_state_title, new Object[0]), conversationDetailsViewModel.f21022e.mo38059c(R.string.please_try_again, new Object[0]), conversationDetailsViewModel.f21022e.mo38059c(R.string.try_again, new Object[0]), new ConversationDetailsViewModel$onLoadError$1(conversationDetailsViewModel)));
        } else {
            C12060q.m19871b(conversationDetailsViewModel.f21042y, Integer.valueOf(R.string.conversation_load_error));
        }
    }

    /* renamed from: c */
    public static final void m17868c(ConversationDetailsViewModel conversationDetailsViewModel, ConversationResponse conversationResponse) {
        EtsyId userId;
        String username;
        if (conversationDetailsViewModel.f21011D == 0) {
            ConversationUser otherUser = conversationResponse.f21172a.getOtherUser();
            if (!(otherUser == null || (username = otherUser.getUsername()) == null)) {
                conversationDetailsViewModel.f21012E = username;
            }
            ConversationUser otherUser2 = conversationResponse.f21172a.getOtherUser();
            if (!(otherUser2 == null || (userId = otherUser2.getUserId()) == null)) {
                long idAsLongDeprecated = userId.getIdAsLongDeprecated();
                conversationDetailsViewModel.f21011D = idAsLongDeprecated;
                C19697g.m33468f(C19388s.m32866i0(conversationDetailsViewModel), (CoroutineContext) null, (CoroutineStart) null, new ConversationDetailsViewModel$streamConversation$1(conversationDetailsViewModel, idAsLongDeprecated, (C19340c<? super ConversationDetailsViewModel$streamConversation$1>) null), 3);
            }
        }
        conversationDetailsViewModel.f21040w.setValue(conversationResponse.f21172a.getAlert());
        conversationDetailsViewModel.f21024g.mo34416c();
    }

    /* renamed from: d */
    public final ArrayList mo32008d() {
        C9559o[] oVarArr = this.f21015H;
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

    /* renamed from: e */
    public final void mo32009e() {
        if (C18263b.m30837c0(this.f21012E) || this.f21011D != 0) {
            this.f21026i.setValue(C9502k.C9505c.f21077a);
            C19202e a = C9510o.m17879a(this.f21023f, this.f21011D, this.f21012E, (CursorDirection) null, 0, 28);
            this.f21019b.getClass();
            ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f21019b, a.mo20660i(C13461f.m21235b())), new ConversationDetailsViewModel$getConversation$1(this), new ConversationDetailsViewModel$getConversation$2(this));
            C7091a aVar = this.f21014G;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(e);
        } else if (!C19383o.m32792b(this.f21010C.getId(), "0")) {
            this.f21026i.setValue(C9502k.C9505c.f21077a);
            C9510o oVar = this.f21023f;
            C8071s<ConversationResponse> c = oVar.f21086a.mo32030c(this.f21010C.getIdAsLongDeprecated());
            C8480g gVar = new C8480g(oVar, 3);
            c.getClass();
            C19202e eVar = new C19202e(c, gVar);
            this.f21019b.getClass();
            ConsumerSingleObserver e2 = SubscribersKt.m32500e(C0391c.m1056b(this.f21019b, eVar.mo20660i(C13461f.m21235b())), new ConversationDetailsViewModel$loadFirstPage$1(this), new ConversationDetailsViewModel$loadFirstPage$2(this));
            C7091a aVar2 = this.f21014G;
            C19383o.m32798h(aVar2, "compositeDisposable");
            aVar2.mo19403b(e2);
        }
    }

    /* renamed from: f */
    public final void mo32010f() {
        C2895z<Boolean> zVar = this.f21028k;
        boolean z = false;
        int i = 0;
        for (C9559o oVar : this.f21015H) {
            if (oVar instanceof C9559o.C9562c) {
                i++;
            }
        }
        if (i > 0) {
            z = true;
        }
        zVar.setValue(Boolean.valueOf(z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if ((r5.f21016I.f21179e == com.etsy.android.p327ui.conversation.details.models.DraftMessage.Status.SENDING) == false) goto L_0x002d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32011g() {
        /*
            r5 = this;
            androidx.lifecycle.z<java.lang.Boolean> r0 = r5.f21032o
            com.etsy.android.ui.conversation.details.models.DraftMessage r1 = r5.f21016I
            java.lang.String r1 = r1.f21178d
            int r1 = r1.length()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L_0x0010
            r1 = r2
            goto L_0x0011
        L_0x0010:
            r1 = r3
        L_0x0011:
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = r5.mo32008d()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x002c
        L_0x001e:
            com.etsy.android.ui.conversation.details.models.DraftMessage r1 = r5.f21016I
            com.etsy.android.ui.conversation.details.models.DraftMessage$Status r1 = r1.f21179e
            com.etsy.android.ui.conversation.details.models.DraftMessage$Status r4 = com.etsy.android.p327ui.conversation.details.models.DraftMessage.Status.SENDING
            if (r1 != r4) goto L_0x0028
            r1 = r2
            goto L_0x0029
        L_0x0028:
            r1 = r3
        L_0x0029:
            if (r1 != 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r2 = r3
        L_0x002d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.setValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.conversation.details.ccm.ConversationDetailsViewModel.mo32011g():void");
    }

    public final void onCleared() {
        super.onCleared();
        this.f21014G.mo19405d();
    }
}
