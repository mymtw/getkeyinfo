package com.etsy.android.p327ui.conversation.details.ccm;

import android.view.View;
import androidx.compose.animation.C0391c;
import androidx.lifecycle.C2895z;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.conversation.details.models.DraftMessage;
import com.etsy.android.p327ui.conversation.details.models.Message;
import com.etsy.android.p327ui.util.C11786n;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import okhttp3.C20002r;
import okhttp3.C20004s;
import okhttp3.C20013v;
import okhttp3.C20016y;
import p003a2.C0015b;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19202e;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p354gc.C12763b;
import p354gc.C12766d;
import p409o9.C13130j;
import p456ua.C13461f;
import p568fn.C17782b;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.ccm.ConversationDetailsFragment$onViewCreated$3 */
public final class ConversationDetailsFragment$onViewCreated$3 extends Lambda implements C19857l<View, C19394m> {
    public final /* synthetic */ ConversationDetailsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationDetailsFragment$onViewCreated$3(ConversationDetailsFragment conversationDetailsFragment) {
        super(1);
        this.this$0 = conversationDetailsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C19394m.f43287a;
    }

    public final void invoke(View view) {
        C12763b bVar;
        ConversationDetailsViewModel access$getViewModel = this.this$0.getViewModel();
        DraftMessage draftMessage = access$getViewModel.f21016I;
        DraftMessage.Status status = draftMessage.f21179e;
        DraftMessage.Status status2 = DraftMessage.Status.SENDING;
        int i = 0;
        if (!(status == status2)) {
            draftMessage.getClass();
            C19383o.m32797g(status2, "<set-?>");
            draftMessage.f21179e = status2;
            access$getViewModel.mo32011g();
            ArrayList d = access$getViewModel.mo32008d();
            if (!d.isEmpty()) {
                C2895z<String> zVar = access$getViewModel.f21038u;
                C11786n nVar = access$getViewModel.f21022e;
                int size = d.size();
                nVar.getClass();
                String quantityString = nVar.f26257a.getResources().getQuantityString(R.plurals.conversation_uploading_image, size);
                C19383o.m32796f(quantityString, "{\n            applicatio…ceId, quantity)\n        }");
                zVar.setValue(quantityString);
            }
            C12766d dVar = access$getViewModel.f21017J;
            if (!(dVar == null || (bVar = dVar.f28216a) == null)) {
                access$getViewModel.f21016I.f21176b = bVar.f28207a;
            }
            DraftMessage draftMessage2 = access$getViewModel.f21016I;
            draftMessage2.f21177c = access$getViewModel.f21011D;
            draftMessage2.f21181g = d;
            draftMessage2.f21180f = System.currentTimeMillis();
            C9510o oVar = access$getViewModel.f21023f;
            long j = access$getViewModel.f21011D;
            String str = access$getViewModel.f21016I.f21178d;
            oVar.getClass();
            C19383o.m32797g(str, "message");
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(d));
            Iterator it = d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C20004s.C20007c.C20008a aVar = C20004s.C20007c.f44276c;
                    String g = C0015b.m88g(ResponseConstants.IMAGE, i2);
                    String g2 = C0015b.m88g(ResponseConstants.IMAGE, i2);
                    C20016y.C20017a aVar2 = C20016y.f44360a;
                    C20002r.f44260f.getClass();
                    C20002r b = C20002r.C20003a.m34244b("image/jpeg");
                    aVar2.getClass();
                    C20013v a = C20016y.C20017a.m34280a((File) next, b);
                    aVar.getClass();
                    arrayList.add(C20004s.C20007c.C20008a.m34255c(g, g2, a));
                    i = i2;
                } else {
                    C17782b.m29877o0();
                    throw null;
                }
            }
            C9492a aVar3 = oVar.f21086a;
            C20016y.C20017a aVar4 = C20016y.f44360a;
            C20002r.f44260f.getClass();
            C20002r b2 = C20002r.C20003a.m34244b("text/plain");
            aVar4.getClass();
            C8071s<Message> a2 = aVar3.mo32028a(j, C20016y.C20017a.m34281b(str, b2), arrayList);
            C13130j jVar = new C13130j(2, arrayList, oVar);
            a2.getClass();
            C19202e eVar = new C19202e(a2, jVar);
            access$getViewModel.f21019b.getClass();
            ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(access$getViewModel.f21019b, eVar.mo20660i(C13461f.m21235b())), new ConversationDetailsViewModel$sendMessage$2(access$getViewModel), new ConversationDetailsViewModel$sendMessage$3(access$getViewModel, d));
            C7091a aVar5 = access$getViewModel.f21014G;
            C19383o.m32798h(aVar5, "compositeDisposable");
            aVar5.mo19403b(e);
        }
    }
}
