package p402n9;

import androidx.lifecycle.C2895z;
import com.braze.C5416d;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.network.Connectivity$networkCallback$1;
import com.etsy.android.p327ui.conversation.compose.ConversationComposeFragment;
import com.etsy.android.p327ui.listing.fetch.C10139c;
import com.etsy.android.p327ui.search.filters.SearchFiltersV2Fragment;
import com.etsy.android.p327ui.user.SettingsFragment;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.subjects.C19254a;
import p425q9.C13265p;
import p463v9.C13537b;
import p499zd.C13950a;
import p499zd.C13957e;

/* renamed from: n9.j */
public final /* synthetic */ class C13090j implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f28776b;

    /* renamed from: c */
    public final /* synthetic */ Object f28777c;

    public /* synthetic */ C13090j(Object obj, int i) {
        this.f28776b = i;
        this.f28777c = obj;
    }

    public final void accept(Object obj) {
        switch (this.f28776b) {
            case 0:
                ((C19254a) this.f28777c).onNext((C5416d) obj);
                return;
            case 1:
                C13265p pVar = (C13265p) this.f28777c;
                pVar.getClass();
                if (((Boolean) obj).booleanValue()) {
                    pVar.f29145k.mo21312f("Run Post Manager - Network Connected");
                    C13537b bVar = pVar.f29142h;
                    if (bVar != null) {
                        bVar.mo46196e();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Connectivity$networkCallback$1.m34867onLost$lambda3$lambda2((Connectivity) this.f28777c, (Long) obj);
                return;
            case 3:
                ((ConversationComposeFragment) this.f28777c).handleConversationError((Throwable) obj);
                return;
            case 4:
                C10139c cVar = (C10139c) this.f28777c;
                Disposable disposable = (Disposable) obj;
                C19383o.m32797g(cVar, "this$0");
                cVar.f22305g.mo21369a();
                return;
            case 5:
                C13957e eVar = (C13957e) this.f28777c;
                Throwable th = (Throwable) obj;
                C19383o.m32797g(eVar, "this$0");
                C2895z<C13950a> zVar = eVar.f30689n;
                C19383o.m32796f(th, "it");
                zVar.postValue(new C13950a.C13951a(eVar.mo46777b(th)));
                LogCatKt.m17045a().mo21309d("Error during sign in.", th);
                return;
            case 6:
                SearchFiltersV2Fragment.m35034initObservers$lambda6((SearchFiltersV2Fragment) this.f28777c, (String) obj);
                return;
            default:
                SettingsFragment.m35054onViewCreated$lambda0((SettingsFragment) this.f28777c, (List) obj);
                return;
        }
    }
}
