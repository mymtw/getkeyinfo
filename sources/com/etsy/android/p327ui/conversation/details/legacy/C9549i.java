package com.etsy.android.p327ui.conversation.details.legacy;

import java.util.List;
import okhttp3.C20004s;
import okhttp3.C20016y;
import p248tp.C8071s;
import p771sr.C20189l;
import p771sr.C20192o;
import p771sr.C20194q;
import p771sr.C20196s;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.i */
public interface C9549i {
    @C20189l
    @C20192o("/etsyapps/v3/member/conversations/{conversation_id}/messages")
    /* renamed from: a */
    C8071s<C20145v<Void>> mo32150a(@C20196s("conversation_id") long j, @C20194q("message") C20016y yVar, @C20194q List<C20004s.C20007c> list);
}
