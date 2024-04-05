package com.etsy.android.p327ui.conversation.details;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p354gc.C12767e;
import p354gc.C12774h;
import p354gc.C12778k;
import p354gc.C12783l;
import p753kq.C19863r;

/* renamed from: com.etsy.android.ui.conversation.details.ConversationMessageListItemOrganizersKt$buildConversationListItemFactory$1 */
final class C9472xb52b2ff7 extends Lambda implements C19863r<C12783l, C12767e, String, String, C12778k> {
    public static final C9472xb52b2ff7 INSTANCE = new C9472xb52b2ff7();

    public C9472xb52b2ff7() {
        super(4);
    }

    public final C12778k invoke(C12783l lVar, C12767e eVar, String str, String str2) {
        C19383o.m32797g(lVar, "message");
        C19383o.m32797g(eVar, "groupedMessageItem");
        C19383o.m32797g(str, "avatarUrl");
        C19383o.m32797g(str2, "otherUserDisplayName");
        List<C12774h> list = lVar.f28255l;
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (C12774h add : list) {
            arrayList.add(add);
        }
        return new C12778k.C12781c(eVar, arrayList, str, str2);
    }
}
