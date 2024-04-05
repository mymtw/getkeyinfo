package com.etsy.android.p327ui.you;

import androidx.appcompat.widget.C0326j;
import androidx.lifecycle.C2866i0;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.GiftCardBalance;
import com.etsy.android.p327ui.user.UserBadgeCountManager;
import com.etsy.android.p327ui.you.C11800a;
import com.etsy.android.p327ui.you.C11806c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.C19254a;
import p425q9.C13265p;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.you.YouViewModel */
public final class YouViewModel extends C2866i0 {

    /* renamed from: b */
    public final C13265p f26267b;

    /* renamed from: c */
    public final C8630b f26268c;

    /* renamed from: d */
    public final C8629a f26269d;

    /* renamed from: e */
    public final C19254a<List<C11806c>> f26270e = new C19254a<>();

    /* renamed from: f */
    public final C19254a<List<C11806c>> f26271f = new C19254a<>();

    /* renamed from: g */
    public final C7091a f26272g;

    /* renamed from: h */
    public final C11806c.C11808b f26273h;

    /* renamed from: i */
    public final C11806c.C11809c f26274i;

    /* renamed from: j */
    public final C11806c.C11812f f26275j;

    /* renamed from: k */
    public final List<C11806c> f26276k;

    /* renamed from: l */
    public final List<C11806c> f26277l;

    public YouViewModel(UserBadgeCountManager userBadgeCountManager, C13265p pVar, C8630b bVar, C8629a aVar) {
        this.f26267b = pVar;
        this.f26268c = bVar;
        this.f26269d = aVar;
        C7091a aVar2 = new C7091a();
        this.f26272g = aVar2;
        C11806c.C11814h hVar = C11806c.C11814h.f26294d;
        C11806c.C11808b bVar2 = new C11806c.C11808b(0);
        this.f26273h = bVar2;
        C11806c.C11809c cVar = new C11806c.C11809c(0);
        this.f26274i = cVar;
        C11806c.C11813g gVar = C11806c.C11813g.f26293d;
        C11806c.C11815i iVar = C11806c.C11815i.f26295d;
        C11806c.C11807a aVar3 = C11806c.C11807a.f26287d;
        C11806c.C11811e eVar = C11806c.C11811e.f26291d;
        C11806c.C11812f fVar = C11806c.C11812f.f26292d;
        this.f26275j = fVar;
        this.f26276k = C17782b.m29865e0(hVar, bVar2, cVar, eVar, fVar, gVar, iVar, aVar3);
        this.f26277l = C17782b.m29865e0(iVar, aVar3, gVar, C11806c.C11810d.f26290d);
        aVar2.mo19403b(SubscribersKt.m32501f(userBadgeCountManager.f25043g, (C19857l) null, new C19857l<Integer, C19394m>(this) {
            public final /* synthetic */ YouViewModel this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Integer) obj);
                return C19394m.f43287a;
            }

            public final void invoke(Integer num) {
                C11800a aVar;
                C11806c.C11808b bVar = this.this$0.f26273h;
                C19383o.m32796f(num, ResponseConstants.COUNT);
                int intValue = num.intValue();
                if (intValue <= 0) {
                    aVar = C11800a.C11804d.f26281a;
                } else {
                    boolean z = false;
                    if (1 <= intValue && intValue < 10) {
                        z = true;
                    }
                    if (z) {
                        aVar = new C11800a.C11801a(intValue);
                    } else {
                        aVar = C11800a.C11803c.f26280a;
                    }
                }
                bVar.getClass();
                C19383o.m32797g(aVar, "<set-?>");
                bVar.f26288d = aVar;
                this.this$0.mo38143c();
            }
        }, 3));
        aVar2.mo19403b(SubscribersKt.m32501f(userBadgeCountManager.f25041e, (C19857l) null, new C19857l<Integer, C19394m>(this) {
            public final /* synthetic */ YouViewModel this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Integer) obj);
                return C19394m.f43287a;
            }

            public final void invoke(Integer num) {
                C11800a aVar;
                C11806c.C11809c cVar = this.this$0.f26274i;
                C19383o.m32796f(num, ResponseConstants.COUNT);
                int intValue = num.intValue();
                if (intValue <= 0) {
                    aVar = C11800a.C11804d.f26281a;
                } else {
                    boolean z = false;
                    if (1 <= intValue && intValue < 10) {
                        z = true;
                    }
                    if (z) {
                        aVar = new C11800a.C11801a(intValue);
                    } else {
                        aVar = C11800a.C11803c.f26280a;
                    }
                }
                cVar.getClass();
                C19383o.m32797g(aVar, "<set-?>");
                cVar.f26289d = aVar;
                this.this$0.mo38143c();
            }
        }, 3));
        aVar2.mo19403b(SubscribersKt.m32501f(userBadgeCountManager.f25042f, (C19857l) null, new C19857l<Integer, C19394m>(this) {
            public final /* synthetic */ YouViewModel this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Integer) obj);
                return C19394m.f43287a;
            }

            public final void invoke(Integer num) {
                this.this$0.mo38143c();
            }
        }, 3));
        aVar2.mo19403b(SubscribersKt.m32501f(userBadgeCountManager.f25044h, (C19857l) null, new C19857l<UserBadgeCountManager.C11355a, C19394m>(this) {
            public final /* synthetic */ YouViewModel this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((UserBadgeCountManager.C11355a) obj);
                return C19394m.f43287a;
            }

            public final void invoke(UserBadgeCountManager.C11355a aVar) {
                T t;
                C19394m mVar;
                YouViewModel youViewModel = this.this$0;
                C19383o.m32796f(aVar, "it");
                youViewModel.getClass();
                if (aVar instanceof UserBadgeCountManager.C11355a.C11356a) {
                    Iterator<T> it = ((UserBadgeCountManager.C11355a.C11356a) aVar).f25046a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (C19383o.m32792b(((GiftCardBalance) t).getCurrencyCode(), youViewModel.f26269d.mo21246a())) {
                            break;
                        }
                    }
                    GiftCardBalance giftCardBalance = (GiftCardBalance) t;
                    if (giftCardBalance != null) {
                        youViewModel.f26275j.f26285b = youViewModel.f26268c.mo21248a(giftCardBalance.getAvailable(), giftCardBalance.getCurrencyCode()).format();
                        mVar = C19394m.f43287a;
                    } else {
                        mVar = null;
                    }
                    if (mVar == null) {
                        youViewModel.f26275j.f26285b = null;
                    }
                } else if (C19383o.m32792b(aVar, UserBadgeCountManager.C11355a.C11357b.f25047a)) {
                    youViewModel.f26275j.f26285b = null;
                }
                youViewModel.mo38143c();
            }
        }, 3));
        mo38142b();
    }

    /* renamed from: b */
    public final void mo38142b() {
        C19254a<List<C11806c>> aVar = this.f26271f;
        List<C11806c> list = this.f26277l;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            C11806c cVar = (C11806c) next;
            boolean z = false;
            if (!(cVar instanceof C11806c.C11815i) ? !(cVar instanceof C11806c.C11807a) ? !(cVar instanceof C11806c.C11813g) || !this.f26267b.mo45960e() : !this.f26267b.mo45960e() && C0326j.m869n(BuildTarget.Companion) : !this.f26267b.mo45960e()) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        aVar.onNext(arrayList);
    }

    /* renamed from: c */
    public final void mo38143c() {
        C19254a<List<C11806c>> aVar = this.f26270e;
        List<C11806c> list = this.f26276k;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            C11806c cVar = (C11806c) next;
            boolean z = true;
            if (cVar instanceof C11806c.C11807a) {
                z = C0326j.m869n(BuildTarget.Companion);
            } else if ((cVar instanceof C11806c.C11812f) && this.f26275j.f26285b == null) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        aVar.onNext(arrayList);
    }

    public final void onCleared() {
        super.onCleared();
        if (!this.f26272g.f15781c) {
            this.f26272g.dispose();
        }
    }
}
