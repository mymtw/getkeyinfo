package androidx.emoji2.text;

import android.view.LayoutInflater;
import androidx.emoji2.text.C2665e;
import androidx.emoji2.text.C2684j;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.p327ui.listing.C10097b;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.firebase.perf.p530v1.ApplicationProcessState;
import com.google.firebase.perf.p530v1.C16669g;
import com.google.firebase.perf.p530v1.NetworkRequestMetric;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.C19383o;
import p568fn.C17781a;
import p616ln.C18208f;

/* renamed from: androidx.emoji2.text.f */
public final /* synthetic */ class C2675f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f6022b;

    /* renamed from: c */
    public final /* synthetic */ Object f6023c;

    /* renamed from: d */
    public final /* synthetic */ Object f6024d;

    /* renamed from: e */
    public final /* synthetic */ Object f6025e;

    public /* synthetic */ C2675f(Object obj, int i, Object obj2, Object obj3) {
        this.f6022b = i;
        this.f6023c = obj;
        this.f6024d = obj2;
        this.f6025e = obj3;
    }

    public final void run() {
        switch (this.f6022b) {
            case 0:
                EmojiCompatInitializer.C2655b bVar = (EmojiCompatInitializer.C2655b) this.f6023c;
                C2665e.C2673h hVar = (C2665e.C2673h) this.f6024d;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f6025e;
                bVar.getClass();
                try {
                    C2684j a = C2660c.m6409a(bVar.f5998a);
                    if (a != null) {
                        C2684j.C2686b bVar2 = (C2684j.C2686b) a.f6017a;
                        synchronized (bVar2.f6052d) {
                            bVar2.f6054f = threadPoolExecutor;
                        }
                        a.f6017a.mo10026a(new C2679g(hVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    hVar.mo10062a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                RecyclerView recyclerView = (RecyclerView) this.f6024d;
                C10097b bVar3 = (C10097b) this.f6025e;
                C19383o.m32797g(recyclerView, "$recyclerView");
                C19383o.m32797g(bVar3, "this$0");
                bVar3.f22263n.add(((LayoutInflater) this.f6023c).inflate(R.layout.list_item_listing_card_collage, recyclerView, false));
                return;
            case 2:
                C14216b.C14217a aVar = (C14216b.C14217a) this.f6023c;
                ((C14216b) this.f6024d).mo47327n(aVar.f31564a, aVar.f31565b, (Exception) this.f6025e);
                return;
            default:
                C18208f fVar = (C18208f) this.f6023c;
                C17781a aVar2 = C18208f.f39881s;
                fVar.getClass();
                C16669g.C16671b F = C16669g.m27601F();
                F.mo59761u();
                C16669g.m27600C((C16669g) F.f37158c, (NetworkRequestMetric) this.f6024d);
                fVar.mo69737d(F, (ApplicationProcessState) this.f6025e);
                return;
        }
    }
}
