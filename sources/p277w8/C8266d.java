package p277w8;

import android.graphics.Rect;
import androidx.appcompat.widget.C0326j;
import com.etsy.android.feedback.FeedbackViewModel;
import com.etsy.android.lib.config.BuildTarget;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.session.C8855a;
import com.etsy.android.lib.session.SessionRepository;
import com.etsy.android.lib.session.SessionSettings;
import com.etsy.android.p327ui.C10677n;
import com.etsy.android.p327ui.cart.viewholders.C9392l;
import com.etsy.android.p327ui.conversation.compose.C9452a;
import com.etsy.android.p327ui.conversation.compose.ConversationComposeFragment;
import com.etsy.android.vespa.VespaBaseFragment;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.functions.Consumer;
import p145io.reactivex.internal.observers.LambdaObserver;
import p145io.reactivex.internal.operators.observable.ObservableTimer;
import p145io.reactivex.internal.subscribers.LambdaSubscriber;
import p248tp.C8061n;
import p425q9.C13263n;
import p425q9.C13265p;
import p456ua.C13461f;
import p464va.C13554f;
import p499zd.C13950a;
import p499zd.C13957e;
import p738dq.C18990a;
import p753kq.C19857l;

/* renamed from: w8.d */
public final /* synthetic */ class C8266d implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f18106b;

    /* renamed from: c */
    public final /* synthetic */ Object f18107c;

    public /* synthetic */ C8266d(Object obj, int i) {
        this.f18106b = i;
        this.f18107c = obj;
    }

    public final void accept(Object obj) {
        switch (this.f18106b) {
            case 0:
                C8267e eVar = (C8267e) this.f18107c;
                C19383o.m32797g(eVar, "this$0");
                eVar.f18108a.error((Throwable) obj);
                return;
            case 1:
                FeedbackViewModel feedbackViewModel = (FeedbackViewModel) this.f18107c;
                Throwable th = (Throwable) obj;
                C19383o.m32797g(feedbackViewModel, "this$0");
                feedbackViewModel.f14275m.postValue(FeedbackViewModel.C6440b.C6441a.f14291a);
                return;
            case 2:
                Throwable th2 = (Throwable) obj;
                ((C13265p) this.f18107c).f29146l.mo45474a("sessionsettings.error");
                return;
            case 3:
                C10677n nVar = (C10677n) this.f18107c;
                Integer num = (Integer) obj;
                C19383o.m32797g(nVar, "this$0");
                boolean n = C0326j.m869n(BuildTarget.Companion);
                int i = nVar.f23519i.f30588a.mo46761a().getInt("updates_time_to_delay", 0);
                if (n && i > 0) {
                    num = Integer.valueOf(i);
                }
                C19383o.m32796f(num, "useDelay");
                if (num.intValue() > 0 && nVar.f23517g.mo46729a()) {
                    ObservableTimer j = C8061n.m16235j((long) num.intValue(), TimeUnit.MILLISECONDS, C18990a.f42332a);
                    nVar.f23515e.getClass();
                    LambdaObserver g = j.mo20635e(C13461f.m21236c()).mo20637g(new C13263n(nVar, 1));
                    C7091a aVar = nVar.f23530t;
                    C19383o.m32798h(aVar, "compositeDisposable");
                    aVar.mo19403b(g);
                    return;
                }
                return;
            case 4:
                C9392l lVar = (C9392l) this.f18107c;
                int i2 = C9392l.f20805k;
                C19383o.m32797g(lVar, "this$0");
                lVar.f20813j.getGlobalVisibleRect(new Rect());
                if (lVar.f20813j.getLocalVisibleRect((Rect) obj)) {
                    lVar.f26962b.mo21333d("cart_scrolled_past_checkout_button", (Map<? extends AnalyticsProperty, Object>) null);
                    LambdaSubscriber lambdaSubscriber = lVar.f20812i;
                    if (lambdaSubscriber != null) {
                        lambdaSubscriber.dispose();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ((ConversationComposeFragment) this.f18107c).lambda$fetchRecipient$4((C9452a.C9453a) obj);
                return;
            case 6:
                C13957e eVar2 = (C13957e) this.f18107c;
                SessionSettings sessionSettings = (SessionSettings) obj;
                C19383o.m32797g(eVar2, "this$0");
                SessionRepository sessionRepository = eVar2.f30684i;
                C19383o.m32796f(sessionSettings, "it");
                sessionRepository.getClass();
                sessionRepository.f19536a.mo45910d(sessionSettings.f19542a);
                C8855a aVar2 = sessionRepository.f19540e;
                boolean a = sessionSettings.mo30401a();
                aVar2.f19546c = a;
                aVar2.f19545b.mo46761a().edit().putBoolean("customerCentricMessagingEnrolled", a).apply();
                eVar2.f30689n.postValue(new C13950a.C13953c("Got token and session settings"));
                eVar2.f30681f.onFetchedUser();
                return;
            case 7:
                C19857l lVar2 = (C19857l) this.f18107c;
                C19383o.m32797g(lVar2, "$tmp0");
                lVar2.invoke((Throwable) obj);
                return;
            default:
                ((VespaBaseFragment) this.f18107c).lambda$onLoadContent$2((C13554f) obj);
                return;
        }
    }
}
