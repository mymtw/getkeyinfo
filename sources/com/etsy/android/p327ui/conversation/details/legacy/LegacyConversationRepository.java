package com.etsy.android.p327ui.conversation.details.legacy;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.Listing;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.C8730f;
import com.etsy.android.p327ui.cart.saved.C9342c;
import com.etsy.android.p327ui.conversation.details.C9477c;
import com.etsy.android.p327ui.conversation.details.ccm.C9492a;
import com.squareup.moshi.C17402n;
import com.squareup.moshi.C17403o;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import okhttp3.C20002r;
import okhttp3.C20004s;
import okhttp3.C20013v;
import okhttp3.C20016y;
import p145io.reactivex.internal.functions.Functions;
import p145io.reactivex.internal.operators.completable.C19095g;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.C19211l;
import p248tp.C8048a;
import p248tp.C8071s;
import p409o9.C13127g;
import p568fn.C17782b;
import retrofit2.C20145v;

/* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationRepository */
public final class LegacyConversationRepository {

    /* renamed from: a */
    public final C9548h f21146a;

    /* renamed from: b */
    public final C9549i f21147b;

    /* renamed from: c */
    public final C9492a f21148c;

    /* renamed from: d */
    public final C9477c f21149d;

    /* renamed from: e */
    public final C8730f f21150e;

    @C17403o(generateAdapter = true)
    /* renamed from: com.etsy.android.ui.conversation.details.legacy.LegacyConversationRepository$MessageSendError */
    public static final class MessageSendError {

        /* renamed from: a */
        public final String f21151a;

        public MessageSendError(@C17402n(name = "error") String str) {
            this.f21151a = str;
        }

        public final MessageSendError copy(@C17402n(name = "error") String str) {
            return new MessageSendError(str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MessageSendError) && C19383o.m32792b(this.f21151a, ((MessageSendError) obj).f21151a);
        }

        public final int hashCode() {
            String str = this.f21151a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("MessageSendError(errorMessage="), this.f21151a, ')');
        }
    }

    public LegacyConversationRepository(C9548h hVar, C9549i iVar, C9492a aVar, C9477c cVar, C8730f fVar) {
        C19383o.m32797g(cVar, "conversationDao");
        C19383o.m32797g(fVar, "moshiMultipartRetrofit");
        this.f21146a = hVar;
        this.f21147b = iVar;
        this.f21148c = aVar;
        this.f21149d = cVar;
        this.f21150e = fVar;
    }

    /* renamed from: a */
    public final C19211l mo32129a(LegacyDraftMessage legacyDraftMessage) {
        C19383o.m32797g(legacyDraftMessage, Listing.DRAFT_STATE);
        List<? extends File> list = legacyDraftMessage.f21160i;
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                File file = (File) next;
                C20016y.C20017a aVar = C20016y.f44360a;
                C20002r.f44260f.getClass();
                C20002r b = C20002r.C20003a.m34244b("image/jpeg");
                aVar.getClass();
                C19383o.m32797g(file, ResponseConstants.FILE);
                C20013v a = C20016y.C20017a.m34280a(file, b);
                StringBuilder h = C0072d.m201h(ResponseConstants.IMAGE);
                h.append(i == 0 ? "" : String.valueOf(i2));
                String sb = h.toString();
                C20004s.C20007c.f44276c.getClass();
                arrayList.add(C20004s.C20007c.C20008a.m34255c(sb, sb, a));
                i = i2;
            } else {
                C17782b.m29877o0();
                throw null;
            }
        }
        C9549i iVar = this.f21147b;
        long j = legacyDraftMessage.f21152a;
        C20016y.C20017a aVar2 = C20016y.f44360a;
        C20002r.f44260f.getClass();
        C20002r b2 = C20002r.C20003a.m34244b("text/plain");
        String str = legacyDraftMessage.f21153b;
        aVar2.getClass();
        C19383o.m32797g(str, ResponseConstants.CONTENT);
        C8071s<C20145v<Void>> a2 = iVar.mo32150a(j, C20016y.C20017a.m34281b(str, b2), arrayList);
        C13127g gVar = new C13127g(this, 2);
        a2.getClass();
        return new C19211l(new C19208j(a2, gVar), new C9342c(2));
    }

    /* renamed from: b */
    public final C19095g mo32130b(C9551k kVar) {
        C9548h hVar = this.f21146a;
        C20004s.C20005a aVar = new C20004s.C20005a(0);
        aVar.mo72990c(C20004s.f44265g);
        aVar.mo72988a("conversation_ids", kVar.f21170b.getId());
        aVar.mo72988a(kVar.f21171c, kVar.f21169a);
        C8048a c = hVar.mo32148c(aVar.mo72989b());
        C9550j jVar = new C9550j(kVar, this);
        Functions.C12959d dVar = Functions.f28540d;
        c.getClass();
        return new C19095g(c, dVar, jVar);
    }
}
