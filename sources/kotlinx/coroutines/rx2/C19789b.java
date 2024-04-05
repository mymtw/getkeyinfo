package kotlinx.coroutines.rx2;

import android.view.View;
import android.view.animation.Animation;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.inappmessage.C5483a;
import com.braze.p044ui.inappmessage.listeners.C5672b;
import com.braze.p044ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import p114g4.C6864d;
import p114g4.C6865e;
import p114g4.C6869i;
import p114g4.C6877o;
import p514bk.C14088a;
import p568fn.C17782b;
import p736cq.C18981a;

/* renamed from: kotlinx.coroutines.rx2.b */
public final class C19789b {
    /* renamed from: b */
    public static final void m33749b(Throwable th, CoroutineContext coroutineContext) {
        if (!(th instanceof CancellationException)) {
            try {
                C18981a.m32123b(th);
            } catch (Throwable th2) {
                C17782b.m29886t(th, th2);
                C14088a.m21785m(th, coroutineContext);
            }
        }
    }

    /* renamed from: a */
    public final C6877o mo72606a(View view, C5483a aVar, C5672b bVar, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List list, View view3) {
        List list2 = list;
        View view4 = view3;
        C6869i iVar = new C6869i(view, aVar, (DefaultInAppMessageViewLifecycleListener) bVar, brazeConfigurationProvider, animation, animation2, view2);
        if (view4 != null) {
            view4.setOnClickListener(new C6864d());
        }
        if (list2 != null) {
            iVar.f15206k = list2;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(new C6865e(iVar, 0));
            }
        }
        return iVar;
    }
}
