package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.etsy.android.lib.core.posts.PersistentRequest;
import com.etsy.android.lib.util.CrashUtil;
import com.google.android.exoplayer2.audio.C14189a;
import com.google.android.exoplayer2.drm.C14216b;
import com.paypal.pyplcheckout.animation.base.AnimationUtils;
import java.util.Random;
import p463v9.C13537b;
import p513bj.C14049b0;
import p520cj.C14164p;
import p520cj.C14166q;
import p619mh.C18223d;

/* renamed from: androidx.profileinstaller.i */
public final /* synthetic */ class C3067i implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f6982b;

    /* renamed from: c */
    public final /* synthetic */ Object f6983c;

    /* renamed from: d */
    public final /* synthetic */ Object f6984d;

    public /* synthetic */ C3067i(int i, Object obj, Object obj2) {
        this.f6982b = i;
        this.f6983c = obj;
        this.f6984d = obj2;
    }

    public final void run() {
        switch (this.f6982b) {
            case 0:
                Context context = (Context) this.f6984d;
                ((ProfileInstallerInitializer) this.f6983c).getClass();
                (Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.C3054b.m7220a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new C3068j(context, 0), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
                return;
            case 1:
                ((C13537b) this.f6983c).mo46195d((PersistentRequest) this.f6984d, true, 0);
                return;
            case 2:
                CrashUtil crashUtil = CrashUtil.f19613e;
                ((CrashUtil) this.f6983c).mo30457b((Throwable) this.f6984d);
                return;
            case 3:
                C14189a.C14190a aVar = (C14189a.C14190a) this.f6983c;
                C18223d dVar = (C18223d) this.f6984d;
                aVar.getClass();
                synchronized (dVar) {
                }
                C14189a aVar2 = aVar.f31403b;
                int i = C14049b0.f30913a;
                aVar2.mo47240d(dVar);
                return;
            case 4:
                C14216b.C14217a aVar3 = (C14216b.C14217a) this.f6983c;
                ((C14216b) this.f6984d).mo47325D(aVar3.f31564a, aVar3.f31565b);
                return;
            case 5:
                C14164p pVar = ((C14164p.C14165a) this.f6983c).f31267b;
                int i2 = C14049b0.f30913a;
                pVar.onVideoSizeChanged((C14166q) this.f6984d);
                return;
            default:
                AnimationUtils.m35200expandFavorite$lambda8((View) this.f6983c, (View) this.f6984d);
                return;
        }
    }
}
