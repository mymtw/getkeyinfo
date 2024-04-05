package p354gc;

import com.etsy.android.lib.models.Conversation3;
import com.etsy.android.lib.models.ConversationUser;
import com.etsy.android.lib.models.Status;
import com.etsy.android.lib.models.conversation.CustomOrder;
import com.etsy.android.lib.models.conversation.context.ConversationContextAdapterFactory;
import com.etsy.android.lib.models.conversation.context.CustomOrderContext;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p001a0.C0005b;
import p354gc.C12776j;

/* renamed from: gc.c */
public final class C12764c {

    /* renamed from: gc.c$a */
    public /* synthetic */ class C12765a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28215a;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.ACTIVE.ordinal()] = 1;
            f28215a = iArr;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        r0 = r0.getAvatarUrl();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p348fc.C12715a m20410a(com.etsy.android.lib.models.conversation.ccm.ConversationMetadata r19) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r19
            kotlin.jvm.internal.C19383o.m32797g(r1, r0)
            long r2 = r19.getConversationId()
            int r4 = r19.getMessageCount()
            boolean r5 = r19.getRead()
            boolean r6 = r19.getHasAttachments()
            java.lang.String r8 = r19.getLastMessage()
            com.etsy.android.lib.models.ConversationUser r0 = r19.getOtherUser()
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = r0.getAvatarUrl()
            if (r0 != 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r15 = r0
            goto L_0x002d
        L_0x002c:
            r15 = r7
        L_0x002d:
            com.etsy.android.lib.models.ConversationUser r0 = r19.getOtherUser()
            if (r0 == 0) goto L_0x003e
            com.etsy.android.lib.models.datatypes.EtsyId r0 = r0.getUserId()
            if (r0 == 0) goto L_0x003e
            long r9 = r0.getIdAsLongDeprecated()
            goto L_0x0040
        L_0x003e:
            r9 = 0
        L_0x0040:
            r11 = r9
            com.etsy.android.lib.models.ConversationUser r0 = r19.getOtherUser()
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.isGuest()
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            r16 = r0
            com.etsy.android.lib.models.ConversationUser r0 = r19.getOtherUser()
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = r0.getDisplayName()
            if (r0 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r14 = r0
            goto L_0x005f
        L_0x005e:
            r14 = r7
        L_0x005f:
            com.etsy.android.lib.models.ConversationUser r0 = r19.getOtherUser()
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = r0.getUsername()
            if (r0 != 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r13 = r0
            goto L_0x006f
        L_0x006e:
            r13 = r7
        L_0x006f:
            long r9 = r19.getLastUpdateDateInMillis()
            fc.a r0 = new fc.a
            r1 = r0
            r7 = 0
            r17 = 0
            r18 = 1
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p354gc.C12764c.m20410a(com.etsy.android.lib.models.conversation.ccm.ConversationMetadata):fc.a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002f, code lost:
        r1 = r1.getAvatarUrl();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p348fc.C12715a m20411b(com.etsy.android.p327ui.conversation.details.models.ConversationResponse r20) {
        /*
            r0 = r20
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            com.etsy.android.lib.models.conversation.ccm.ConversationMetadata r1 = r0.f21172a
            long r3 = r1.getConversationId()
            com.etsy.android.lib.models.conversation.ccm.ConversationMetadata r1 = r0.f21172a
            int r5 = r1.getMessageCount()
            com.etsy.android.lib.models.conversation.ccm.ConversationMetadata r1 = r0.f21172a
            boolean r6 = r1.getRead()
            com.etsy.android.lib.models.conversation.ccm.ConversationMetadata r1 = r0.f21172a
            boolean r7 = r1.getHasAttachments()
            com.etsy.android.lib.models.conversation.ccm.ConversationMetadata r1 = r0.f21172a
            java.lang.String r9 = r1.getLastMessage()
            com.etsy.android.lib.models.conversation.ccm.ConversationMetadata r1 = r0.f21172a
            com.etsy.android.lib.models.ConversationUser r1 = r1.getOtherUser()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0039
            java.lang.String r1 = r1.getAvatarUrl()
            if (r1 != 0) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            r16 = r1
            goto L_0x003b
        L_0x0039:
            r16 = r2
        L_0x003b:
            com.etsy.android.lib.models.conversation.ccm.ConversationMetadata r1 = r0.f21172a
            com.etsy.android.lib.models.ConversationUser r1 = r1.getOtherUser()
            if (r1 == 0) goto L_0x004e
            com.etsy.android.lib.models.datatypes.EtsyId r1 = r1.getUserId()
            if (r1 == 0) goto L_0x004e
            long r10 = r1.getIdAsLongDeprecated()
            goto L_0x0050
        L_0x004e:
            r10 = 0
        L_0x0050:
            r12 = r10
            com.etsy.android.lib.models.conversation.ccm.ConversationMetadata r1 = r0.f21172a
            com.etsy.android.lib.models.ConversationUser r1 = r1.getOtherUser()
            if (r1 == 0) goto L_0x005e
            boolean r1 = r1.isGuest()
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            r17 = r1
            com.etsy.android.lib.models.conversation.ccm.ConversationMetadata r1 = r0.f21172a
            com.etsy.android.lib.models.ConversationUser r1 = r1.getOtherUser()
            if (r1 == 0) goto L_0x0072
            java.lang.String r1 = r1.getDisplayName()
            if (r1 != 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r15 = r1
            goto L_0x0073
        L_0x0072:
            r15 = r2
        L_0x0073:
            com.etsy.android.lib.models.conversation.ccm.ConversationMetadata r1 = r0.f21172a
            com.etsy.android.lib.models.ConversationUser r1 = r1.getOtherUser()
            if (r1 == 0) goto L_0x0084
            java.lang.String r1 = r1.getUsername()
            if (r1 != 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r14 = r1
            goto L_0x0085
        L_0x0084:
            r14 = r2
        L_0x0085:
            com.etsy.android.lib.models.conversation.ccm.ConversationMetadata r0 = r0.f21172a
            long r10 = r0.getLastUpdateDateInMillis()
            fc.a r0 = new fc.a
            r2 = r0
            r8 = 0
            r18 = 0
            r19 = 1
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p354gc.C12764c.m20411b(com.etsy.android.ui.conversation.details.models.ConversationResponse):fc.a");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004d, code lost:
        r17 = r17.getAmount();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p348fc.C12716b m20412c(com.etsy.android.p327ui.conversation.details.models.Message r28) {
        /*
            r0 = r28
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            long r3 = r0.f21195b
            long r5 = r0.f21194a
            long r7 = r0.f21196c
            long r9 = r0.f21197d
            java.lang.String r11 = r0.f21198e
            long r14 = r0.f21199f
            java.util.List<com.etsy.android.lib.models.ListingPartial> r2 = r0.f21205l
            java.util.ArrayList r13 = new java.util.ArrayList
            int r12 = kotlin.collections.C19322o.m32624F0(r2)
            r13.<init>(r12)
            java.util.Iterator r2 = r2.iterator()
        L_0x0022:
            boolean r12 = r2.hasNext()
            r16 = 0
            if (r12 == 0) goto L_0x007b
            java.lang.Object r12 = r2.next()
            com.etsy.android.lib.models.ListingPartial r12 = (com.etsy.android.lib.models.ListingPartial) r12
            kotlin.jvm.internal.C19383o.m32797g(r12, r1)
            r27 = r2
            com.etsy.android.ui.conversation.details.models.ListingPartialDatabaseModel r2 = new com.etsy.android.ui.conversation.details.models.ListingPartialDatabaseModel
            long r18 = r12.getListingId()
            java.lang.String r20 = r12.getTitle()
            java.lang.String r21 = r12.getUrl()
            java.lang.String r22 = r12.getImageUrl170()
            com.etsy.android.lib.currency.EtsyMoney r17 = r12.getPrice()
            if (r17 == 0) goto L_0x005a
            java.math.BigDecimal r17 = r17.getAmount()
            if (r17 == 0) goto L_0x005a
            java.lang.String r17 = r17.toString()
            r23 = r17
            goto L_0x005c
        L_0x005a:
            r23 = r16
        L_0x005c:
            com.etsy.android.lib.currency.EtsyMoney r17 = r12.getPrice()
            if (r17 == 0) goto L_0x0066
            java.lang.String r16 = r17.getCurrencyCode()
        L_0x0066:
            r24 = r16
            java.lang.Integer r25 = r12.getStatus()
            java.lang.String r26 = r12.getStatusValue()
            r17 = r2
            r17.<init>(r18, r20, r21, r22, r23, r24, r25, r26)
            r13.add(r2)
            r2 = r27
            goto L_0x0022
        L_0x007b:
            java.util.List<com.etsy.android.lib.models.ImageInfo> r2 = r0.f21206m
            java.util.ArrayList r12 = new java.util.ArrayList
            r17 = r13
            int r13 = kotlin.collections.C19322o.m32624F0(r2)
            r12.<init>(r13)
            java.util.Iterator r2 = r2.iterator()
        L_0x008c:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x00fb
            java.lang.Object r13 = r2.next()
            com.etsy.android.lib.models.ImageInfo r13 = (com.etsy.android.lib.models.ImageInfo) r13
            kotlin.jvm.internal.C19383o.m32797g(r13, r1)
            com.etsy.android.lib.models.apiv3.Image2 r13 = r13.getImageData()
            if (r13 == 0) goto L_0x00e4
            java.util.List r13 = r13.getSources()
            if (r13 == 0) goto L_0x00e4
            r18 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r19 = r2
            int r2 = kotlin.collections.C19322o.m32624F0(r13)
            r1.<init>(r2)
            java.util.Iterator r2 = r13.iterator()
        L_0x00b8:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L_0x00e1
            java.lang.Object r13 = r2.next()
            com.etsy.android.lib.models.apiv3.Image2$Source r13 = (com.etsy.android.lib.models.apiv3.Image2.Source) r13
            r20 = r2
            com.etsy.android.ui.conversation.details.models.ImageSourceDatabaseModel r2 = new com.etsy.android.ui.conversation.details.models.ImageSourceDatabaseModel
            r21 = r14
            int r14 = r13.getHeight()
            int r15 = r13.getWidth()
            java.lang.String r13 = r13.getUrl()
            r2.<init>(r14, r15, r13)
            r1.add(r2)
            r2 = r20
            r14 = r21
            goto L_0x00b8
        L_0x00e1:
            r21 = r14
            goto L_0x00ec
        L_0x00e4:
            r18 = r1
            r19 = r2
            r21 = r14
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
        L_0x00ec:
            com.etsy.android.ui.conversation.details.models.ImageDatabaseModel r2 = new com.etsy.android.ui.conversation.details.models.ImageDatabaseModel
            r2.<init>(r1)
            r12.add(r2)
            r1 = r18
            r2 = r19
            r14 = r21
            goto L_0x008c
        L_0x00fb:
            r21 = r14
            java.lang.String r1 = r0.f21207n
            java.lang.String r14 = r0.f21208o
            java.util.List<com.etsy.android.ui.conversation.details.models.Receipt> r2 = r0.f21209p
            if (r2 == 0) goto L_0x0112
            java.lang.Object r2 = kotlin.collections.C19327t.m32640V0(r2)
            com.etsy.android.ui.conversation.details.models.Receipt r2 = (com.etsy.android.p327ui.conversation.details.models.Receipt) r2
            if (r2 == 0) goto L_0x0112
            java.lang.String r2 = r2.f21216d
            r23 = r2
            goto L_0x0114
        L_0x0112:
            r23 = r16
        L_0x0114:
            int r0 = r0.f21204k
            r19 = r0
            fc.b r0 = new fc.b
            r2 = r0
            r13 = 0
            r18 = r12
            r12 = r13
            r13 = 0
            r16 = r17
            r20 = r14
            r14 = r21
            r17 = r18
            r18 = r1
            r21 = r23
            r2.<init>(r3, r5, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p354gc.C12764c.m20412c(com.etsy.android.ui.conversation.details.models.Message):fc.b");
    }

    /* renamed from: d */
    public static final C12763b m20413d(Conversation3 conversation3) {
        C12776j.C12777a aVar;
        C19383o.m32797g(conversation3, "<this>");
        long conversationId = conversation3.getConversationId();
        ConversationUser otherUser = conversation3.getOtherUser();
        C12784m e = otherUser != null ? m20414e(otherUser) : new C12784m((String) null, (String) null, 0, false, 31);
        long lastUpdateDateInMillis = conversation3.getLastUpdateDateInMillis();
        CharSequence g0 = C0005b.m39g0(conversation3.getLastUpdateDateInMillis());
        String a1 = C19457k.m33023a1(conversation3.getLastMessage(), "\n\n", "\n", false);
        boolean read = conversation3.getRead();
        ConversationContextAdapterFactory conversationContextAdapterFactory = conversation3.getConversationContextAdapterFactory();
        C12775i iVar = null;
        if (conversationContextAdapterFactory == null || !(conversationContextAdapterFactory instanceof CustomOrderContext)) {
            aVar = null;
        } else {
            CustomOrder customOrder = ((CustomOrderContext) conversationContextAdapterFactory).getCustomOrder();
            if (customOrder != null) {
                String title = customOrder.getTitle();
                String str = title == null ? "" : title;
                String subtitle = customOrder.getSubtitle();
                String str2 = subtitle == null ? "" : subtitle;
                String imageUrl = customOrder.getImageUrl();
                String str3 = imageUrl == null ? "" : imageUrl;
                String url = customOrder.getUrl();
                iVar = new C12775i((Long) null, str, str2, str3, url == null ? "" : url, 1);
            }
            aVar = new C12776j.C12777a(iVar);
        }
        return new C12763b(conversationId, e, lastUpdateDateInMillis, g0, a1, read, conversation3.getAlert(), (C12776j) aVar);
    }

    /* renamed from: e */
    public static final C12784m m20414e(ConversationUser conversationUser) {
        String displayName = conversationUser.getDisplayName();
        String avatarUrl = conversationUser.getAvatarUrl();
        String str = avatarUrl == null ? "" : avatarUrl;
        String username = conversationUser.getUsername();
        return new C12784m(displayName, str, username == null ? "" : username, conversationUser.getUserIdJson(), conversationUser.isGuest());
    }
}
