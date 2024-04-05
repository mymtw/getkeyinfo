package com.etsy.android.p327ui.conversation.details.legacy;

import com.etsy.android.lib.models.Conversation;
import com.etsy.android.lib.models.datatypes.EtsyId;
import kotlin.jvm.internal.C19383o;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.k */
public abstract class C9551k {

    /* renamed from: a */
    public final String f21169a;

    /* renamed from: b */
    public final EtsyId f21170b;

    /* renamed from: c */
    public final String f21171c;

    /* renamed from: com.etsy.android.ui.conversation.details.legacy.k$a */
    public static final class C9552a extends C9551k {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9552a(EtsyId etsyId) {
            super(Conversation.TAG_UNREAD, etsyId, "removeTags");
            C19383o.m32797g(etsyId, "id");
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.legacy.k$b */
    public static final class C9553b extends C9551k {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9553b(EtsyId etsyId) {
            super(Conversation.TAG_SPAM, etsyId, "addTags");
            C19383o.m32797g(etsyId, "id");
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.legacy.k$c */
    public static final class C9554c extends C9551k {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9554c(EtsyId etsyId) {
            super(Conversation.TAG_TRASH, etsyId, "addTags");
            C19383o.m32797g(etsyId, "id");
        }
    }

    /* renamed from: com.etsy.android.ui.conversation.details.legacy.k$d */
    public static final class C9555d extends C9551k {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9555d(EtsyId etsyId) {
            super(Conversation.TAG_UNREAD, etsyId, "addTags");
            C19383o.m32797g(etsyId, "id");
        }
    }

    public C9551k(String str, EtsyId etsyId, String str2) {
        this.f21169a = str;
        this.f21170b = etsyId;
        this.f21171c = str2;
    }
}
