package com.etsy.android.p327ui.listing;

import androidx.compose.animation.C0472h;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.logger.perf.C8704a;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.network.oauth2.C8766p;
import com.etsy.android.p327ui.listing.ListingViewState;
import com.etsy.android.util.C12059p;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p145io.reactivex.subjects.PublishSubject;
import p400mf.C13074b;
import p400mf.C13079d;
import p456ua.C13461f;
import p466vc.C13572b;
import p466vc.C13573c;
import p466vc.C13574d;
import p466vc.C13595e;
import p634np.C18289a;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ListingViewModel */
public final class ListingViewModel extends C2866i0 {

    /* renamed from: b */
    public final C18289a<C13595e> f22221b;

    /* renamed from: c */
    public final C13573c f22222c;

    /* renamed from: d */
    public final C10101d f22223d;

    /* renamed from: e */
    public final C8704a f22224e;

    /* renamed from: f */
    public final C2895z<ListingViewState> f22225f;

    /* renamed from: g */
    public final C2895z f22226g;

    /* renamed from: h */
    public final C2895z<C12059p<C13574d.C13576b>> f22227h;

    /* renamed from: i */
    public final C2895z f22228i;

    public ListingViewModel(C13461f fVar, C18289a<C13595e> aVar, C8709f fVar2) {
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(aVar, "lazyListingEventRouter");
        C19383o.m32797g(fVar2, "performanceTracker");
        this.f22221b = aVar;
        C13573c cVar = new C13573c();
        this.f22222c = cVar;
        C10101d dVar = new C10101d();
        this.f22223d = dVar;
        this.f22224e = new C8704a(fVar2);
        C2895z<ListingViewState> zVar = new C2895z<>(ListingViewState.C10091c.f22234c);
        this.f22225f = zVar;
        this.f22226g = zVar;
        C2895z<C12059p<C13574d.C13576b>> zVar2 = new C2895z<>();
        this.f22227h = zVar2;
        this.f22228i = zVar2;
        PublishSubject<C13074b> publishSubject = C13079d.f28754a;
        LambdaObserver g = C0472h.m1242c(publishSubject, publishSubject).mo20639i(C13461f.m21235b()).mo20635e(C13461f.m21236c()).mo20637g(new C8766p(this, 4));
        C7091a aVar2 = dVar.f22277a;
        C19383o.m32798h(aVar2, "compositeDisposable");
        aVar2.mo19403b(g);
        PublishSubject<T> publishSubject2 = cVar.f26240a;
        LambdaObserver f = SubscribersKt.m32501f(C0472h.m1242c(publishSubject2, publishSubject2).mo20635e(C13461f.m21236c()), (C19857l) null, new C19857l<C13572b, C19394m>(this) {
            public final /* synthetic */ ListingViewModel this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C13572b) obj);
                return C19394m.f43287a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:73:0x0189  */
            /* JADX WARNING: Removed duplicated region for block: B:74:0x018f  */
            /* JADX WARNING: Removed duplicated region for block: B:77:0x0196  */
            /* JADX WARNING: Removed duplicated region for block: B:78:0x019d  */
            /* JADX WARNING: Removed duplicated region for block: B:81:0x01a5  */
            /* JADX WARNING: Removed duplicated region for block: B:82:0x01aa  */
            /* JADX WARNING: Removed duplicated region for block: B:85:0x01b5  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(p466vc.C13572b r33) {
                /*
                    r32 = this;
                    r0 = r32
                    r1 = r33
                    com.etsy.android.ui.listing.ListingViewModel r2 = r0.this$0
                    androidx.lifecycle.z r2 = r2.f22226g
                    java.lang.Object r2 = r2.getValue()
                    com.etsy.android.ui.listing.ListingViewState r2 = (com.etsy.android.p327ui.listing.ListingViewState) r2
                    if (r2 == 0) goto L_0x0354
                    com.etsy.android.ui.listing.ListingViewModel r3 = r0.this$0
                    np.a<vc.e> r4 = r3.f22221b
                    java.lang.Object r4 = r4.get()
                    vc.e r4 = (p466vc.C13595e) r4
                    java.lang.String r5 = "event"
                    kotlin.jvm.internal.C19383o.m32796f(r1, r5)
                    r4.getClass()
                    boolean r5 = r2 instanceof com.etsy.android.p327ui.listing.ListingViewState.C10092d
                    if (r5 == 0) goto L_0x0034
                    boolean r6 = r1 instanceof p466vc.C13597g
                    if (r6 == 0) goto L_0x0034
                    com.etsy.android.ui.listing.ListingViewState$d r2 = (com.etsy.android.p327ui.listing.ListingViewState.C10092d) r2
                    vc.g r1 = (p466vc.C13597g) r1
                    vc.d r1 = r4.mo46297a(r2, r1)
                    goto L_0x0330
                L_0x0034:
                    boolean r6 = r1 instanceof p466vc.C13558a
                    if (r6 == 0) goto L_0x032e
                    vc.a r1 = (p466vc.C13558a) r1
                    boolean r6 = r1 instanceof p466vc.C13558a.C13560b
                    if (r6 == 0) goto L_0x0047
                    com.etsy.android.ui.listing.ui.toppanel.a r1 = r4.f29772a
                    r1.getClass()
                    vc.d$b$f r1 = p466vc.C13574d.C13576b.C13582f.f29669a
                    goto L_0x0330
                L_0x0047:
                    boolean r6 = r1 instanceof p466vc.C13558a.C13566h
                    if (r6 == 0) goto L_0x0060
                    com.etsy.android.ui.listing.fetch.i r1 = r4.f29796g
                    r1.getClass()
                    vc.d$c r1 = new vc.d$c
                    com.etsy.android.ui.listing.ListingViewState$e r4 = new com.etsy.android.ui.listing.ListingViewState$e
                    com.etsy.android.ui.listing.a r2 = r2.mo33466a()
                    r4.<init>(r2)
                    r1.<init>(r4)
                    goto L_0x0330
                L_0x0060:
                    boolean r6 = r1 instanceof p466vc.C13558a.C13568j
                    if (r6 == 0) goto L_0x0085
                    com.etsy.android.ui.listing.handlers.k r4 = r4.f29800h
                    vc.a$j r1 = (p466vc.C13558a.C13568j) r1
                    r4.getClass()
                    com.etsy.android.ui.listing.a r5 = r2.mo33466a()
                    boolean r9 = r1.f29657a
                    boolean r10 = r1.f29658b
                    r11 = 7
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    com.etsy.android.ui.listing.a r1 = com.etsy.android.p327ui.listing.C10096a.m18256a(r5, r6, r7, r8, r9, r10, r11)
                    r2.mo33469d(r1)
                    vc.d$c r1 = new vc.d$c
                    r1.<init>(r2)
                    goto L_0x0330
                L_0x0085:
                    boolean r6 = r1 instanceof p466vc.C13558a.C13561c
                    r7 = 1
                    r8 = 0
                    if (r6 == 0) goto L_0x00b4
                    com.etsy.android.ui.listing.fetch.c r2 = r4.f29804i
                    vc.a$c r1 = (p466vc.C13558a.C13561c) r1
                    r2.getClass()
                    if (r5 == 0) goto L_0x009f
                    vc.c r1 = r2.f22299a
                    vc.g$u2 r2 = p466vc.C13597g.C13741u2.f30265a
                    r1.mo38043a(r2)
                    vc.d$a r1 = p466vc.C13574d.C13575a.f29662a
                    goto L_0x0330
                L_0x009f:
                    vc.c r4 = r2.f22299a
                    vc.a$h r5 = p466vc.C13558a.C13566h.f29654a
                    r4.mo38043a(r5)
                    com.etsy.android.ui.cart.googlepay.a r4 = r2.f22301c
                    com.etsy.android.ui.listing.fetch.b r5 = new com.etsy.android.ui.listing.fetch.b
                    r5.<init>(r2, r1)
                    com.etsy.android.p327ui.cart.googlepay.C9303a.m17695c(r4, r5)
                    vc.d$a r1 = p466vc.C13574d.C13575a.f29662a
                    goto L_0x0330
                L_0x00b4:
                    boolean r6 = r1 instanceof p466vc.C13558a.C13563e
                    if (r6 == 0) goto L_0x0108
                    com.etsy.android.ui.listing.fetch.e r2 = r4.f29812k
                    vc.a$e r1 = (p466vc.C13558a.C13563e) r1
                    r2.getClass()
                    cc.c$a r4 = r1.f29650b
                    boolean r5 = r4 instanceof p321cc.C8569c.C8570a.C8572b
                    if (r5 == 0) goto L_0x00cf
                    vc.a$f r5 = new vc.a$f
                    long r6 = r1.f29649a
                    cc.c$a$b r4 = (p321cc.C8569c.C8570a.C8572b) r4
                    r5.<init>(r6, r4)
                    goto L_0x00f9
                L_0x00cf:
                    boolean r5 = r4 instanceof p321cc.C8569c.C8570a.C8571a
                    if (r5 == 0) goto L_0x0102
                    cc.c$a$a r4 = (p321cc.C8569c.C8570a.C8571a) r4
                    retrofit2.v<com.etsy.android.lib.models.apiv3.listing.ListingFetch> r5 = r4.f18660a
                    if (r5 == 0) goto L_0x00e2
                    okhttp3.z r6 = r5.f44614a
                    int r6 = r6.f44365f
                    r9 = 404(0x194, float:5.66E-43)
                    if (r6 != r9) goto L_0x00e2
                    goto L_0x00e3
                L_0x00e2:
                    r7 = r8
                L_0x00e3:
                    if (r7 == 0) goto L_0x00ef
                    vc.a$g r1 = new vc.a$g
                    okhttp3.z r4 = r5.f44614a
                    java.lang.String r4 = r4.f44364e
                    r1.<init>(r4)
                    goto L_0x00f8
                L_0x00ef:
                    java.lang.Throwable r4 = r4.f18661b
                    long r5 = r1.f29649a
                    vc.a$d r1 = new vc.a$d
                    r1.<init>(r5, r4)
                L_0x00f8:
                    r5 = r1
                L_0x00f9:
                    vc.c r1 = r2.f22314a
                    r1.mo38043a(r5)
                    vc.d$a r1 = p466vc.C13574d.C13575a.f29662a
                    goto L_0x0330
                L_0x0102:
                    kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
                    r1.<init>()
                    throw r1
                L_0x0108:
                    boolean r6 = r1 instanceof p466vc.C13558a.C13564f
                    if (r6 == 0) goto L_0x0248
                    com.etsy.android.ui.listing.fetch.f r4 = r4.f29816l
                    vc.a$f r1 = (p466vc.C13558a.C13564f) r1
                    r4.getClass()
                    vc.c r5 = r4.f22315a
                    vc.g$u2 r6 = p466vc.C13597g.C13741u2.f30265a
                    r5.mo38043a(r6)
                    vc.c r5 = r4.f22315a
                    vc.g$v0 r6 = new vc.g$v0
                    long r9 = r1.f29651a
                    r11 = 0
                    r6.<init>(r9, r11, r11)
                    r5.mo38043a(r6)
                    vc.c r5 = r4.f22315a
                    vc.g$p3 r6 = p466vc.C13597g.C13707p3.f30220a
                    r5.mo38043a(r6)
                    cc.c$a$b r1 = r1.f29652b
                    com.etsy.android.lib.models.apiv3.listing.ListingFetch r1 = r1.f18662a
                    com.etsy.android.ui.listing.ui.l$a r5 = com.etsy.android.p327ui.listing.p329ui.C10425l.f22892j
                    com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationData r6 = r1.getMachineTranslation()
                    r5.getClass()
                    if (r6 == 0) goto L_0x01c6
                    com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields r5 = r6.getUntranslated()
                    if (r5 == 0) goto L_0x0153
                    java.lang.String r5 = r6.getFromLangCode()
                    java.lang.String r9 = r6.getToLangCode()
                    boolean r5 = kotlin.jvm.internal.C19383o.m32792b(r5, r9)
                    if (r5 != 0) goto L_0x0153
                    r13 = r7
                    goto L_0x0154
                L_0x0153:
                    r13 = r8
                L_0x0154:
                    java.lang.String r19 = r6.getFromLangCode()
                    java.lang.String r20 = r6.getToLangCode()
                    if (r13 == 0) goto L_0x0182
                    com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields r5 = r6.getTranslated()
                    if (r5 == 0) goto L_0x0182
                    if (r19 == 0) goto L_0x016f
                    int r5 = r19.length()
                    if (r5 != 0) goto L_0x016d
                    goto L_0x016f
                L_0x016d:
                    r5 = r8
                    goto L_0x0170
                L_0x016f:
                    r5 = r7
                L_0x0170:
                    if (r5 != 0) goto L_0x0182
                    if (r20 == 0) goto L_0x017d
                    int r5 = r20.length()
                    if (r5 != 0) goto L_0x017b
                    goto L_0x017d
                L_0x017b:
                    r5 = r8
                    goto L_0x017e
                L_0x017d:
                    r5 = r7
                L_0x017e:
                    if (r5 != 0) goto L_0x0182
                    r14 = r7
                    goto L_0x0183
                L_0x0182:
                    r14 = r8
                L_0x0183:
                    com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields r5 = r6.getTranslated()
                    if (r5 == 0) goto L_0x018f
                    java.lang.String r5 = r5.getTitle()
                    r15 = r5
                    goto L_0x0190
                L_0x018f:
                    r15 = r11
                L_0x0190:
                    com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields r5 = r6.getUntranslated()
                    if (r5 == 0) goto L_0x019d
                    java.lang.String r5 = r5.getTitle()
                    r16 = r5
                    goto L_0x019f
                L_0x019d:
                    r16 = r11
                L_0x019f:
                    com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields r5 = r6.getTranslated()
                    if (r5 == 0) goto L_0x01aa
                    java.lang.String r5 = r5.getDescriptionPlaintext()
                    goto L_0x01ab
                L_0x01aa:
                    r5 = r11
                L_0x01ab:
                    java.lang.String r17 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r5)
                    com.etsy.android.lib.models.apiv3.listing.ListingMachineTranslationTranslatedFields r5 = r6.getUntranslated()
                    if (r5 == 0) goto L_0x01b9
                    java.lang.String r11 = r5.getDescriptionPlaintext()
                L_0x01b9:
                    java.lang.String r18 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r11)
                    com.etsy.android.ui.listing.ui.l r5 = new com.etsy.android.ui.listing.ui.l
                    r21 = 256(0x100, float:3.59E-43)
                    r12 = r5
                    r12.<init>((boolean) r13, (boolean) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (int) r21)
                    goto L_0x01df
                L_0x01c6:
                    com.etsy.android.ui.listing.ui.l r5 = new com.etsy.android.ui.listing.ui.l
                    r23 = 0
                    r24 = 0
                    r25 = 0
                    r26 = 0
                    r27 = 0
                    r28 = 0
                    r29 = 0
                    r30 = 0
                    r31 = 511(0x1ff, float:7.16E-43)
                    r22 = r5
                    r22.<init>((boolean) r23, (boolean) r24, (java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (java.lang.String) r28, (java.lang.String) r29, (java.lang.String) r30, (int) r31)
                L_0x01df:
                    r20 = r5
                    vc.d$c r5 = new vc.d$c
                    com.etsy.android.ui.listing.ui.h r12 = r4.f22316b
                    q9.p r6 = r4.f22317c
                    com.etsy.android.lib.models.datatypes.EtsyId r14 = r6.mo45959d()
                    java.lang.String r6 = "session.userIdAndAsyncFetchIfMissing"
                    kotlin.jvm.internal.C19383o.m32796f(r14, r6)
                    com.etsy.android.ui.listing.a r6 = r2.mo33466a()
                    java.lang.Integer r6 = r6.f22249c
                    com.etsy.android.ui.listing.a r7 = r2.mo33466a()
                    boolean r7 = r7.f22250d
                    r13 = r1
                    r15 = r20
                    r16 = r6
                    r17 = r7
                    com.etsy.android.ui.listing.ui.f r16 = r12.mo33973d(r13, r14, r15, r16, r17)
                    com.etsy.android.ui.listing.a r14 = r2.mo33466a()
                    com.etsy.android.ui.listing.ui.ListingSections r2 = r4.f22318d
                    com.etsy.android.ui.listing.h r4 = r2.f22366a
                    com.etsy.android.lib.config.e r4 = r4.f22335a
                    com.etsy.android.lib.config.EtsyConfigKey r6 = com.etsy.android.lib.config.C8592b.C8601i.f18891e
                    boolean r4 = r4.mo21132b(r6)
                    if (r4 == 0) goto L_0x021e
                    com.etsy.android.ui.listing.ui.ListingSections$Order r2 = com.etsy.android.p327ui.listing.p329ui.ListingSections.Order.HEADER_UPDATES
                L_0x021b:
                    r22 = r2
                    goto L_0x0230
                L_0x021e:
                    com.etsy.android.ui.listing.h r2 = r2.f22366a
                    com.etsy.android.lib.config.e r2 = r2.f22335a
                    com.etsy.android.lib.config.EtsyConfigKey r4 = com.etsy.android.lib.config.C8592b.C8601i.f18892f
                    boolean r2 = r2.mo21132b(r4)
                    if (r2 == 0) goto L_0x022d
                    com.etsy.android.ui.listing.ui.ListingSections$Order r2 = com.etsy.android.p327ui.listing.p329ui.ListingSections.Order.REVIEWS_PANEL_UPDATES
                    goto L_0x021b
                L_0x022d:
                    com.etsy.android.ui.listing.ui.ListingSections$Order r2 = com.etsy.android.p327ui.listing.p329ui.ListingSections.Order.DEFAULT
                    goto L_0x021b
                L_0x0230:
                    com.etsy.android.ui.listing.ListingViewState$d r2 = new com.etsy.android.ui.listing.ListingViewState$d
                    r13 = 0
                    r15 = 1
                    r18 = 0
                    com.etsy.android.lib.models.apiv3.listing.AppsInventoryAddToCartContext r19 = r1.getOfferings()
                    r21 = 0
                    r12 = r2
                    r17 = r1
                    r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                    r5.<init>(r2)
                    r1 = r5
                    goto L_0x0330
                L_0x0248:
                    boolean r6 = r1 instanceof p466vc.C13558a.C13565g
                    if (r6 == 0) goto L_0x0266
                    com.etsy.android.ui.listing.fetch.g r4 = r4.f29820m
                    vc.a$g r1 = (p466vc.C13558a.C13565g) r1
                    r4.getClass()
                    vc.d$c r4 = new vc.d$c
                    com.etsy.android.ui.listing.ListingViewState$b r5 = new com.etsy.android.ui.listing.ListingViewState$b
                    java.lang.String r1 = r1.f29653a
                    com.etsy.android.ui.listing.a r2 = r2.mo33466a()
                    r5.<init>(r1, r2)
                    r4.<init>(r5)
                    r1 = r4
                    goto L_0x0330
                L_0x0266:
                    boolean r6 = r1 instanceof p466vc.C13558a.C13562d
                    if (r6 == 0) goto L_0x028f
                    com.etsy.android.ui.listing.fetch.a r4 = r4.f29808j
                    vc.a$d r1 = (p466vc.C13558a.C13562d) r1
                    r4.getClass()
                    vc.c r4 = r4.f22296a
                    java.lang.Throwable r5 = r1.f29648b
                    long r6 = r1.f29647a
                    vc.a$i r1 = new vc.a$i
                    r1.<init>(r6, r5)
                    r4.mo38043a(r1)
                    vc.d$c r1 = new vc.d$c
                    com.etsy.android.ui.listing.ListingViewState$a r4 = new com.etsy.android.ui.listing.ListingViewState$a
                    com.etsy.android.ui.listing.a r2 = r2.mo33466a()
                    r4.<init>(r2)
                    r1.<init>(r4)
                    goto L_0x0330
                L_0x028f:
                    boolean r6 = r1 instanceof p466vc.C13558a.C13567i
                    if (r6 == 0) goto L_0x029d
                    com.etsy.android.ui.listing.fetch.k r2 = r4.f29824n
                    vc.a$i r1 = (p466vc.C13558a.C13567i) r1
                    vc.d$a r1 = r2.mo33535a(r1)
                    goto L_0x0330
                L_0x029d:
                    boolean r6 = r1 instanceof p466vc.C13558a.C13559a
                    if (r6 == 0) goto L_0x02c2
                    com.etsy.android.ui.listing.handlers.c r4 = r4.f29776b
                    vc.a$a r1 = (p466vc.C13558a.C13559a) r1
                    r4.getClass()
                    com.etsy.android.ui.listing.a r5 = r2.mo33466a()
                    java.lang.String r6 = r1.f29644a
                    r7 = 0
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 30
                    com.etsy.android.ui.listing.a r1 = com.etsy.android.p327ui.listing.C10096a.m18256a(r5, r6, r7, r8, r9, r10, r11)
                    r2.mo33469d(r1)
                    vc.d$c r1 = new vc.d$c
                    r1.<init>(r2)
                    goto L_0x0330
                L_0x02c2:
                    boolean r6 = r1 instanceof p466vc.C13558a.C13570l
                    if (r6 == 0) goto L_0x02e6
                    com.etsy.android.ui.listing.handlers.q r4 = r4.f29780c
                    vc.a$l r1 = (p466vc.C13558a.C13570l) r1
                    r4.getClass()
                    com.etsy.android.ui.listing.a r5 = r2.mo33466a()
                    java.lang.String r7 = r1.f29660a
                    r8 = 0
                    r9 = 0
                    r10 = 0
                    r11 = 29
                    r6 = 0
                    com.etsy.android.ui.listing.a r1 = com.etsy.android.p327ui.listing.C10096a.m18256a(r5, r6, r7, r8, r9, r10, r11)
                    r2.mo33469d(r1)
                    vc.d$c r1 = new vc.d$c
                    r1.<init>(r2)
                    goto L_0x0330
                L_0x02e6:
                    boolean r6 = r1 instanceof p466vc.C13558a.C13571m
                    if (r6 == 0) goto L_0x030e
                    com.etsy.android.ui.listing.handlers.s r4 = r4.f29784d
                    vc.a$m r1 = (p466vc.C13558a.C13571m) r1
                    r4.getClass()
                    com.etsy.android.ui.listing.a r5 = r2.mo33466a()
                    int r1 = r1.f29661a
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
                    r9 = 0
                    r10 = 0
                    r11 = 27
                    r6 = 0
                    r7 = 0
                    com.etsy.android.ui.listing.a r1 = com.etsy.android.p327ui.listing.C10096a.m18256a(r5, r6, r7, r8, r9, r10, r11)
                    r2.mo33469d(r1)
                    vc.d$c r1 = new vc.d$c
                    r1.<init>(r2)
                    goto L_0x0330
                L_0x030e:
                    boolean r1 = r1 instanceof p466vc.C13558a.C13569k
                    if (r1 == 0) goto L_0x0328
                    com.etsy.android.ui.listing.handlers.m r1 = r4.f29788e
                    r1.getClass()
                    if (r5 != 0) goto L_0x0325
                    boolean r1 = r2 instanceof com.etsy.android.p327ui.listing.ListingViewState.C10089a
                    if (r1 != 0) goto L_0x0325
                    boolean r1 = r2 instanceof com.etsy.android.p327ui.listing.ListingViewState.C10090b
                    if (r1 == 0) goto L_0x0322
                    goto L_0x0325
                L_0x0322:
                    vc.d$a r1 = p466vc.C13574d.C13575a.f29662a
                    goto L_0x0330
                L_0x0325:
                    vc.d$b$c r1 = p466vc.C13574d.C13576b.C13579c.f29667a
                    goto L_0x0330
                L_0x0328:
                    kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
                    r1.<init>()
                    throw r1
                L_0x032e:
                    vc.d$a r1 = p466vc.C13574d.C13575a.f29662a
                L_0x0330:
                    boolean r2 = r1 instanceof p466vc.C13574d.C13594c
                    if (r2 == 0) goto L_0x033e
                    vc.d$c r1 = (p466vc.C13574d.C13594c) r1
                    com.etsy.android.ui.listing.ListingViewState r1 = r1.f29683a
                    androidx.lifecycle.z<com.etsy.android.ui.listing.ListingViewState> r2 = r3.f22225f
                    r2.setValue(r1)
                    goto L_0x0354
                L_0x033e:
                    vc.d$a r2 = p466vc.C13574d.C13575a.f29662a
                    boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
                    if (r2 != 0) goto L_0x0354
                    boolean r2 = r1 instanceof p466vc.C13574d.C13576b
                    if (r2 == 0) goto L_0x0354
                    androidx.lifecycle.z<com.etsy.android.util.p<vc.d$b>> r2 = r3.f22227h
                    com.etsy.android.util.p r3 = new com.etsy.android.util.p
                    r3.<init>(r1)
                    r2.setValue(r3)
                L_0x0354:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.ListingViewModel.C100882.invoke(vc.b):void");
            }
        }, 3);
        C7091a aVar3 = dVar.f22277a;
        C19383o.m32798h(aVar3, "compositeDisposable");
        aVar3.mo19403b(f);
    }

    /* renamed from: b */
    public final void mo33464b(C13572b bVar) {
        C19383o.m32797g(bVar, "event");
        this.f22222c.mo38043a(bVar);
    }

    public final void onCleared() {
        this.f22223d.f22277a.mo19405d();
    }
}
