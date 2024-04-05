package com.etsy.android.p327ui.conversation.details.legacy;

import com.etsy.android.lib.models.conversation.ConversationThread2;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter$loadContent$2 */
final class LegacyConversationDetailsPresenter$loadContent$2 extends Lambda implements C19857l<ConversationThread2, C19394m> {
    public final /* synthetic */ LegacyConversationDetailsPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyConversationDetailsPresenter$loadContent$2(LegacyConversationDetailsPresenter legacyConversationDetailsPresenter) {
        super(1);
        this.this$0 = legacyConversationDetailsPresenter;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ConversationThread2) obj);
        return C19394m.f43287a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(com.etsy.android.lib.models.conversation.ConversationThread2 r32) {
        /*
            r31 = this;
            r0 = r31
            com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter r1 = r0.this$0
            com.etsy.android.lib.models.datatypes.EtsyId r1 = r1.f21130l
            boolean r1 = r1.isNumeric()
            if (r1 != 0) goto L_0x0020
            com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter r1 = r0.this$0
            com.etsy.android.lib.models.datatypes.EtsyId r2 = new com.etsy.android.lib.models.datatypes.EtsyId
            com.etsy.android.lib.models.Conversation3 r3 = r32.getConversation()
            long r3 = r3.getConversationId()
            r2.<init>((long) r3)
            r1.getClass()
            r1.f21130l = r2
        L_0x0020:
            com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter r1 = r0.this$0
            java.lang.String r2 = "result"
            r3 = r32
            kotlin.jvm.internal.C19383o.m32796f(r3, r2)
            java.lang.String r2 = "<this>"
            gc.d r4 = new gc.d
            com.etsy.android.lib.models.Conversation3 r5 = r32.getConversation()
            gc.b r5 = p354gc.C12764c.m20413d(r5)
            java.util.List r3 = r32.getMessages()
            kotlin.jvm.internal.C19383o.m32797g(r3, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.C19322o.m32624F0(r3)
            r6.<init>(r7)
            java.util.Iterator r3 = r3.iterator()
        L_0x0049:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0146
            java.lang.Object r7 = r3.next()
            com.etsy.android.lib.models.ConversationMessage2 r7 = (com.etsy.android.lib.models.ConversationMessage2) r7
            kotlin.jvm.internal.C19383o.m32797g(r7, r2)
            long r10 = r7.getConversationId()
            java.lang.String r8 = r7.get_message()
            java.lang.String r9 = org.apache.commons.lang3.StringEscapeUtils.unescapeHtml4(r8)
            long r14 = r7.getUserId()
            int r19 = r7.getMessageOrder()
            java.lang.String r8 = r7.getLanguage()
            if (r8 != 0) goto L_0x0074
            java.lang.String r8 = ""
        L_0x0074:
            r20 = r8
            long r21 = r7.getCreationDateInMillis()
            long r17 = r7.getCreationDateInMillis()
            java.lang.String r23 = r7.getTranslatedMessage()
            java.util.List r8 = r7.getImages()
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = kotlin.collections.C19322o.m32624F0(r8)
            r12.<init>(r13)
            java.util.Iterator r8 = r8.iterator()
        L_0x0093:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x0106
            java.lang.Object r13 = r8.next()
            com.etsy.android.lib.models.ImageInfo r13 = (com.etsy.android.lib.models.ImageInfo) r13
            kotlin.jvm.internal.C19383o.m32797g(r13, r2)
            com.etsy.android.lib.models.apiv3.Image2 r13 = r13.getImageData()
            if (r13 == 0) goto L_0x00ed
            java.util.List r13 = r13.getSources()
            if (r13 == 0) goto L_0x00ed
            r30 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r32 = r3
            int r3 = kotlin.collections.C19322o.m32624F0(r13)
            r2.<init>(r3)
            java.util.Iterator r3 = r13.iterator()
        L_0x00bf:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x00ea
            java.lang.Object r13 = r3.next()
            com.etsy.android.lib.models.apiv3.Image2$Source r13 = (com.etsy.android.lib.models.apiv3.Image2.Source) r13
            r16 = r3
            gc.f r3 = new gc.f
            r24 = r8
            int r8 = r13.getHeight()
            int r0 = r13.getWidth()
            java.lang.String r13 = r13.getUrl()
            r3.<init>(r8, r0, r13)
            r2.add(r3)
            r0 = r31
            r3 = r16
            r8 = r24
            goto L_0x00bf
        L_0x00ea:
            r24 = r8
            goto L_0x00f5
        L_0x00ed:
            r30 = r2
            r32 = r3
            r24 = r8
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.INSTANCE
        L_0x00f5:
            gc.h r0 = new gc.h
            r0.<init>(r2)
            r12.add(r0)
            r0 = r31
            r3 = r32
            r8 = r24
            r2 = r30
            goto L_0x0093
        L_0x0106:
            r30 = r2
            r32 = r3
            java.lang.String r0 = r7.getMessage()
            com.etsy.android.ui.conversation.details.j r0 = p628nj.C18263b.m30826U(r0)
            gc.i r0 = p628nj.C18263b.m30822Q(r0)
            if (r0 == 0) goto L_0x011d
            java.util.List r0 = p568fn.C17782b.m29864d0(r0)
            goto L_0x011e
        L_0x011d:
            r0 = 0
        L_0x011e:
            r26 = r0
            gc.l r0 = new gc.l
            r8 = r0
            java.lang.String r2 = "unescapeHtml4(this._message)"
            kotlin.jvm.internal.C19383o.m32796f(r9, r2)
            r2 = 0
            r7 = r12
            r12 = r2
            r16 = 0
            r24 = 0
            r27 = 0
            r28 = 0
            r29 = 25616(0x6410, float:3.5896E-41)
            r25 = r7
            r8.<init>(r9, r10, r12, r14, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29)
            r6.add(r0)
            r0 = r31
            r3 = r32
            r2 = r30
            goto L_0x0049
        L_0x0146:
            r4.<init>(r5, r6)
            r1.mo32109f(r4)
            r0 = r31
            com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter r1 = r0.this$0
            java.util.ArrayList<com.etsy.android.ui.conversation.details.legacy.LegacyDraftMessage> r1 = r1.f21138t
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0161
            com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter r1 = r0.this$0
            java.util.ArrayList<com.etsy.android.ui.conversation.details.legacy.LegacyDraftMessage> r2 = r1.f21138t
            r1.mo32108e(r2)
        L_0x0161:
            com.etsy.android.ui.conversation.details.legacy.LegacyConversationDetailsPresenter r1 = r0.this$0
            com.etsy.android.ui.navigation.bottom.BottomNavStateRepo r1 = r1.f21127i
            r1.mo34416c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.conversation.details.legacy.LegacyConversationDetailsPresenter$loadContent$2.invoke(com.etsy.android.lib.models.conversation.ConversationThread2):void");
    }
}
