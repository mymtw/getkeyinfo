package p336dc;

import com.etsy.android.lib.session.C8855a;
import kotlin.jvm.internal.C19383o;
import p350fe.C12729e;
import p350fe.C12741o;
import p425q9.C13265p;

/* renamed from: dc.a */
public final class C12643a implements C12729e {

    /* renamed from: a */
    public final C12741o f27885a;

    /* renamed from: b */
    public final C13265p f27886b;

    /* renamed from: c */
    public final C8855a f27887c;

    public C12643a(C12741o oVar, C13265p pVar, C8855a aVar) {
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(pVar, "session");
        C19383o.m32797g(aVar, "customerCentricMessagingEligibility");
        this.f27885a = oVar;
        this.f27886b = pVar;
        this.f27887c = aVar;
    }

    /* JADX WARNING: type inference failed for: r15v5, types: [he.e] */
    /* JADX WARNING: type inference failed for: r15v20, types: [com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationListNavigationKey] */
    /* JADX WARNING: type inference failed for: r1v14, types: [com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey] */
    /* JADX WARNING: type inference failed for: r1v15, types: [com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p350fe.C12731g mo30554a(p350fe.C12730f r15) {
        /*
            r14 = this;
            android.net.Uri r0 = r15.f28049b
            java.lang.String r2 = r15.f28050c
            android.os.Bundle r10 = r15.f28051d
            fe.o r15 = r14.f27885a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CONVERSATION
            java.lang.String r3 = r1.getEntityName()
            boolean r3 = r15.mo45509b(r0, r3)
            if (r3 == 0) goto L_0x0015
            goto L_0x0024
        L_0x0015:
            fe.o r1 = r14.f27885a
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CONVERSATIONS
            java.lang.String r4 = r3.getEntityName()
            boolean r1 = r1.mo45509b(r0, r4)
            if (r1 == 0) goto L_0x0129
            r1 = r3
        L_0x0024:
            java.lang.String r1 = r1.getEntityName()
            java.lang.String r15 = r15.mo45510e(r0, r1)
            fe.o r1 = r14.f27885a
            r1.getClass()
            java.lang.String r1 = "with_id"
            java.lang.String r1 = r0.getQueryParameter(r1)
            fe.o r3 = r14.f27885a
            r3.getClass()
            java.lang.String r3 = "username"
            java.lang.String r5 = r0.getQueryParameter(r3)
            fe.o r3 = r14.f27885a
            r3.getClass()
            java.lang.String r3 = "ccm_user_id"
            java.lang.String r0 = r0.getQueryParameter(r3)
            boolean r3 = p628nj.C18263b.m30839d0(r0)
            if (r3 == 0) goto L_0x009b
            java.lang.Long r4 = kotlin.text.C19456j.m33017U0(r0)
            q9.p r15 = r14.f27886b
            com.etsy.android.lib.models.datatypes.EtsyId r15 = r15.mo45958c()
            long r0 = r15.getIdAsLong()
            if (r4 != 0) goto L_0x0064
            goto L_0x0078
        L_0x0064:
            long r5 = r4.longValue()
            int r15 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r15 != 0) goto L_0x0078
            com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationListNavigationKey r15 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationListNavigationKey
            com.etsy.android.lib.session.a r0 = r14.f27887c
            boolean r0 = r0.mo30407a()
            r15.<init>(r2, r10, r0)
            goto L_0x0094
        L_0x0078:
            com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey r15 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey
            r5 = 0
            r6 = 0
            r7 = 0
            q9.p r0 = r14.f27886b
            boolean r8 = r0.mo45960e()
            com.etsy.android.lib.session.a r0 = r14.f27887c
            boolean r9 = r0.mo30407a()
            r0 = 0
            r11 = 0
            r12 = 824(0x338, float:1.155E-42)
            r13 = 0
            r1 = r15
            r3 = r10
            r10 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0094:
            fe.g$b r0 = new fe.g$b
            r0.<init>(r15)
            goto L_0x0128
        L_0x009b:
            boolean r0 = p628nj.C18263b.m30839d0(r5)
            if (r0 != 0) goto L_0x00e1
            boolean r0 = p628nj.C18263b.m30839d0(r1)
            if (r0 == 0) goto L_0x00a8
            goto L_0x00e1
        L_0x00a8:
            boolean r0 = p628nj.C18263b.m30839d0(r15)
            if (r0 == 0) goto L_0x00d0
            com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey r0 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey
            java.lang.Long r7 = kotlin.text.C19456j.m33017U0(r15)
            com.etsy.android.lib.session.a r15 = r14.f27887c
            boolean r9 = r15.mo30407a()
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r15 = 0
            r11 = 0
            r12 = 860(0x35c, float:1.205E-42)
            r13 = 0
            r1 = r0
            r3 = r10
            r10 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            fe.g$b r15 = new fe.g$b
            r15.<init>(r0)
            r0 = r15
            goto L_0x0128
        L_0x00d0:
            com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationListNavigationKey r15 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationListNavigationKey
            com.etsy.android.lib.session.a r0 = r14.f27887c
            boolean r0 = r0.mo30407a()
            r15.<init>(r2, r10, r0)
            fe.g$b r0 = new fe.g$b
            r0.<init>(r15)
            goto L_0x0128
        L_0x00e1:
            com.etsy.android.lib.session.a r15 = r14.f27887c
            boolean r15 = r15.mo30407a()
            r0 = 0
            if (r15 == 0) goto L_0x0105
            if (r1 == 0) goto L_0x00f2
            java.lang.Long r15 = kotlin.text.C19456j.m33017U0(r1)
            r4 = r15
            goto L_0x00f3
        L_0x00f2:
            r4 = r0
        L_0x00f3:
            com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey r15 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationDetailsNavigationKey
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            r0 = 0
            r11 = 0
            r12 = 880(0x370, float:1.233E-42)
            r13 = 0
            r1 = r15
            r3 = r10
            r10 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0123
        L_0x0105:
            if (r1 == 0) goto L_0x010d
            java.lang.Long r15 = kotlin.text.C19456j.m33017U0(r1)
            r6 = r15
            goto L_0x010e
        L_0x010d:
            r6 = r0
        L_0x010e:
            q9.p r15 = r14.f27886b
            boolean r3 = r15.mo45960e()
            com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey r15 = new com.etsy.android.ui.navigation.keys.fragmentkeys.ConversationComposeNavigationKey
            r0 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 232(0xe8, float:3.25E-43)
            r12 = 0
            r1 = r15
            r4 = r5
            r5 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0123:
            fe.g$b r0 = new fe.g$b
            r0.<init>(r15)
        L_0x0128:
            return r0
        L_0x0129:
            com.etsy.android.ui.navigation.deeplinks.DeepLinkHandlerException r15 = new com.etsy.android.ui.navigation.deeplinks.DeepLinkHandlerException
            java.lang.String r1 = "invalid deep link entity "
            java.lang.String r0 = android.support.p013v4.media.C0073e.m206f(r1, r0)
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p336dc.C12643a.mo30554a(fe.f):fe.g");
    }
}
