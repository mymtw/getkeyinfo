package p427qb;

import android.content.Context;
import android.view.View;
import com.google.android.exoplayer2.audio.C14189a;
import com.google.android.exoplayer2.drm.C14216b;
import com.google.firebase.perf.config.C16612s;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import p513bj.C14049b0;
import p520cj.C14164p;
import p619mh.C18223d;
import p706wm.C18749a;
import p706wm.C18750b;

/* renamed from: qb.a */
public final /* synthetic */ class C13281a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f29186b;

    /* renamed from: c */
    public final /* synthetic */ Object f29187c;

    /* renamed from: d */
    public final /* synthetic */ Object f29188d;

    public /* synthetic */ C13281a(int i, Object obj, Object obj2) {
        this.f29186b = i;
        this.f29187c = obj;
        this.f29188d = obj2;
    }

    public final void run() {
        switch (this.f29186b) {
            case 0:
                View view = (View) this.f29187c;
                CharSequence charSequence = (CharSequence) this.f29188d;
                C19383o.m32797g(view, "$this_makeAccessibilityAnnouncement");
                C19383o.m32797g(charSequence, "$text");
                view.announceForAccessibility(charSequence);
                return;
            case 1:
                C14189a aVar = ((C14189a.C14190a) this.f29187c).f31403b;
                int i = C14049b0.f30913a;
                aVar.mo47239b((String) this.f29188d);
                return;
            case 2:
                C14216b.C14217a aVar2 = (C14216b.C14217a) this.f29187c;
                ((C14216b) this.f29188d).mo47326c(aVar2.f31564a, aVar2.f31565b);
                return;
            case 3:
                C14164p pVar = ((C14164p.C14165a) this.f29187c).f31267b;
                int i2 = C14049b0.f30913a;
                pVar.mo47107q((C18223d) this.f29188d);
                return;
            case 4:
                ((C18750b) ((Map.Entry) this.f29187c).getKey()).mo47005a((C18749a) this.f29188d);
                return;
            default:
                C16612s sVar = (C16612s) this.f29187c;
                Context context = (Context) this.f29188d;
                if (sVar.f36851a == null && context != null) {
                    sVar.f36851a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                    return;
                }
                return;
        }
    }
}
