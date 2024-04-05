package com.etsy.android.p327ui.user.language;

import com.etsy.android.lib.models.language.EtsyLanguage;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.user.language.LanguageSelectViewModel$loadContent$2 */
final class LanguageSelectViewModel$loadContent$2 extends Lambda implements C19857l<List<? extends EtsyLanguage>, C19394m> {
    public final /* synthetic */ String $regionCode;
    public final /* synthetic */ C11605g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LanguageSelectViewModel$loadContent$2(C11605g gVar, String str) {
        super(1);
        this.this$0 = gVar;
        this.$regionCode = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<EtsyLanguage>) (List) obj);
        return C19394m.f43287a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: com.etsy.android.ui.user.language.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: com.etsy.android.ui.user.language.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.etsy.android.ui.user.language.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: com.etsy.android.ui.user.language.i} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a1, code lost:
        if (r0.mo37638b(r3 != null ? r3.f25705b : null) != false) goto L_0x00e3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.util.List<com.etsy.android.lib.models.language.EtsyLanguage> r13) {
        /*
            r12 = this;
            com.etsy.android.ui.user.language.g r0 = r12.this$0
            java.lang.String r1 = "it"
            kotlin.jvm.internal.C19383o.m32796f(r13, r1)
            java.lang.String r1 = r12.$regionCode
            r0.getClass()
            java.lang.String r2 = "regionCode"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x001a:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r13.next()
            com.etsy.android.lib.models.language.EtsyLanguage r2 = (com.etsy.android.lib.models.language.EtsyLanguage) r2
            com.etsy.android.ui.user.language.i r11 = new com.etsy.android.ui.user.language.i
            java.lang.String r3 = r2.getId()
            java.lang.String r4 = r2.getCode()
            java.lang.String r6 = r2.getName()
            com.etsy.android.ui.user.language.h$b r7 = com.etsy.android.p327ui.user.language.C11606h.C11608b.f25703a
            r8 = 1
            r9 = 32
            r2 = r11
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.add(r11)
            goto L_0x001a
        L_0x0042:
            boolean r13 = r10.isEmpty()
            r1 = 0
            if (r13 == 0) goto L_0x0052
            io.reactivex.subjects.a<com.etsy.android.ui.user.language.d> r13 = r0.f25699g
            com.etsy.android.ui.user.language.d$a r0 = com.etsy.android.p327ui.user.language.C11597d.C11598a.f25686a
            r13.onNext(r0)
            goto L_0x0108
        L_0x0052:
            boolean r13 = r0.mo37639c()
            if (r13 != 0) goto L_0x00fc
            android.app.Application r13 = r0.f25694b
            java.lang.String r2 = "context"
            kotlin.jvm.internal.C19383o.m32797g(r13, r2)
            android.content.SharedPreferences r2 = p001a0.C0005b.f9g
            if (r2 == 0) goto L_0x0064
            goto L_0x0071
        L_0x0064:
            java.lang.String r2 = "EtsyUserPrefs"
            android.content.SharedPreferences r2 = r13.getSharedPreferences(r2, r1)
            java.lang.String r13 = "context.getSharedPrefere…ODE_PRIVATE\n            )"
            kotlin.jvm.internal.C19383o.m32796f(r2, r13)
            p001a0.C0005b.f9g = r2
        L_0x0071:
            r13 = 0
            java.lang.String r1 = "preferred_language_id"
            java.lang.String r1 = r2.getString(r1, r13)
            java.util.Iterator r2 = r10.iterator()
        L_0x007c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0092
            java.lang.Object r3 = r2.next()
            r4 = r3
            com.etsy.android.ui.user.language.i r4 = (com.etsy.android.p327ui.user.language.C11609i) r4
            java.lang.String r4 = r4.f25704a
            boolean r4 = kotlin.jvm.internal.C19383o.m32792b(r4, r1)
            if (r4 == 0) goto L_0x007c
            goto L_0x0093
        L_0x0092:
            r3 = r13
        L_0x0093:
            com.etsy.android.ui.user.language.i r3 = (com.etsy.android.p327ui.user.language.C11609i) r3
            if (r1 == 0) goto L_0x00a4
            if (r3 == 0) goto L_0x009c
            java.lang.String r2 = r3.f25705b
            goto L_0x009d
        L_0x009c:
            r2 = r13
        L_0x009d:
            boolean r2 = r0.mo37638b(r2)
            if (r2 == 0) goto L_0x00a4
            goto L_0x00e3
        L_0x00a4:
            java.util.Iterator r1 = r10.iterator()
        L_0x00a8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00be
            java.lang.Object r2 = r1.next()
            r3 = r2
            com.etsy.android.ui.user.language.i r3 = (com.etsy.android.p327ui.user.language.C11609i) r3
            java.lang.String r3 = r3.f25705b
            boolean r3 = r0.mo37638b(r3)
            if (r3 == 0) goto L_0x00a8
            r13 = r2
        L_0x00be:
            com.etsy.android.ui.user.language.i r13 = (com.etsy.android.p327ui.user.language.C11609i) r13
            if (r13 == 0) goto L_0x00c7
            java.lang.String r1 = r13.f25704a
            if (r1 == 0) goto L_0x00c7
            goto L_0x00e3
        L_0x00c7:
            y9.d r13 = r0.f25696d
            java.util.Locale r1 = r13.mo46718b()
            y9.f r13 = r13.f30556b
            r13.getClass()
            java.util.Locale r13 = p486y9.C13890f.m21415b(r1)
            java.util.Locale r1 = java.util.Locale.UK
            boolean r13 = kotlin.jvm.internal.C19383o.m32792b(r13, r1)
            if (r13 == 0) goto L_0x00e1
            java.lang.String r1 = "2"
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r1 = "0"
        L_0x00e3:
            java.util.Iterator r13 = r10.iterator()
        L_0x00e7:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x00fc
            java.lang.Object r2 = r13.next()
            com.etsy.android.ui.user.language.i r2 = (com.etsy.android.p327ui.user.language.C11609i) r2
            java.lang.String r3 = r2.f25704a
            boolean r3 = kotlin.jvm.internal.C19383o.m32792b(r3, r1)
            r2.f25709f = r3
            goto L_0x00e7
        L_0x00fc:
            r0.f25701i = r10
            io.reactivex.subjects.a<com.etsy.android.ui.user.language.d> r13 = r0.f25699g
            com.etsy.android.ui.user.language.d$e r0 = new com.etsy.android.ui.user.language.d$e
            r0.<init>(r10)
            r13.onNext(r0)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.language.LanguageSelectViewModel$loadContent$2.invoke(java.util.List):void");
    }
}
