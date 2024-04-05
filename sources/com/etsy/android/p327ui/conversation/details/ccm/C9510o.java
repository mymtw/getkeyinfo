package com.etsy.android.p327ui.conversation.details.ccm;

import com.etsy.android.C6331b;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.conversation.ccm.ConversationMetadata;
import com.etsy.android.p327ui.conversation.details.C9477c;
import com.etsy.android.p327ui.conversation.details.models.ConversationResponse;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p145io.reactivex.internal.operators.single.C19202e;
import p248tp.C8071s;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.o */
public final class C9510o {

    /* renamed from: a */
    public final C9492a f21086a;

    /* renamed from: b */
    public final C9477c f21087b;

    /* renamed from: com.etsy.android.ui.conversation.details.ccm.o$a */
    public /* synthetic */ class C9511a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21088a;

        static {
            int[] iArr = new int[ConversationAction.values().length];
            iArr[ConversationAction.TOGGLE_READ.ordinal()] = 1;
            iArr[ConversationAction.TOGGLE_ARCHIVED.ordinal()] = 2;
            iArr[ConversationAction.TOGGLE_MUTED.ordinal()] = 3;
            f21088a = iArr;
        }
    }

    public C9510o(C9492a aVar, C9477c cVar) {
        C19383o.m32797g(aVar, "conversationDetailsEndpoint");
        C19383o.m32797g(cVar, "conversationDao");
        this.f21086a = aVar;
        this.f21087b = cVar;
    }

    /* renamed from: a */
    public static C19202e m17879a(C9510o oVar, long j, String str, CursorDirection cursorDirection, long j2, int i) {
        C9510o oVar2 = oVar;
        String str2 = (i & 2) != 0 ? null : str;
        CursorDirection cursorDirection2 = (i & 4) != 0 ? CursorDirection.OLDER : cursorDirection;
        long j3 = (i & 8) != 0 ? 0 : j2;
        oVar.getClass();
        C19383o.m32797g(cursorDirection2, "cursorDirection");
        C8071s<ConversationResponse> d = C18263b.m30839d0(str2) ? oVar2.f21086a.mo32031d(str2, false, j3, cursorDirection2) : oVar2.f21086a.mo32032e(j, false, j3, cursorDirection2);
        C6331b bVar = new C6331b(oVar, 5);
        d.getClass();
        return new C19202e(d, bVar);
    }

    /* renamed from: b */
    public final C19202e mo32039b(long j, ConversationAction conversationAction) {
        C19383o.m32797g(conversationAction, ResponseConstants.ACTION);
        C8071s<ConversationMetadata> f = this.f21086a.mo32033f(j, C19421p.m32931U(new Pair(ResponseConstants.ACTION, conversationAction.name())));
        C9507l lVar = new C9507l(conversationAction, this);
        f.getClass();
        return new C19202e(f, lVar);
    }
}
