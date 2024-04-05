package p204p1;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.room.C3255u;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.source.C14344i;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p513bj.C14075p;
import p594jh.C17899c1;
import p594jh.C17916h0;
import p594jh.C17931k0;
import p594jh.C17939k1;
import p594jh.C17984x0;

/* renamed from: p1.a */
public final /* synthetic */ class C7649a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f16945b;

    /* renamed from: c */
    public final /* synthetic */ Object f16946c;

    /* renamed from: d */
    public final /* synthetic */ Object f16947d;

    public /* synthetic */ C7649a(int i, Object obj, Object obj2) {
        this.f16945b = i;
        this.f16946c = obj;
        this.f16947d = obj2;
    }

    public final void run() {
        long j;
        boolean z;
        switch (this.f16945b) {
            case 0:
                FragmentStrictMode.C2785b bVar = (FragmentStrictMode.C2785b) this.f16946c;
                C19383o.m32797g(bVar, "$policy");
                C19383o.m32797g((Violation) this.f16947d, "$violation");
                bVar.getClass();
                throw null;
            case 1:
                ((C3255u) this.f16946c).getClass();
                new ArrayList(0);
                throw null;
            case 2:
                C17916h0 h0Var = (C17916h0) this.f16946c;
                C17931k0.C17935d dVar = (C17931k0.C17935d) this.f16947d;
                int i = h0Var.f38929u - dVar.f39083c;
                h0Var.f38929u = i;
                boolean z2 = true;
                if (dVar.f39084d) {
                    h0Var.f38930v = dVar.f39085e;
                    h0Var.f38931w = true;
                }
                if (dVar.f39086f) {
                    h0Var.f38932x = dVar.f39087g;
                }
                if (i == 0) {
                    C17939k1 k1Var = dVar.f39082b.f39304a;
                    if (!h0Var.f38907C.f39304a.mo69481p() && k1Var.mo69481p()) {
                        h0Var.f38908D = -1;
                        h0Var.f38909E = 0;
                    }
                    if (!k1Var.mo69481p()) {
                        List asList = Arrays.asList(((C17899c1) k1Var).f38874j);
                        C14075p.m21694f(asList.size() == h0Var.f38920l.size());
                        for (int i2 = 0; i2 < asList.size(); i2++) {
                            ((C17916h0.C17917a) h0Var.f38920l.get(i2)).f38936b = (C17939k1) asList.get(i2);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (h0Var.f38931w) {
                        if (dVar.f39082b.f39305b.equals(h0Var.f38907C.f39305b) && dVar.f39082b.f39307d == h0Var.f38907C.f39322s) {
                            z2 = false;
                        }
                        if (z2) {
                            if (k1Var.mo69481p() || dVar.f39082b.f39305b.mo69559a()) {
                                j2 = dVar.f39082b.f39307d;
                            } else {
                                C17984x0 x0Var = dVar.f39082b;
                                C14344i.C14345a aVar = x0Var.f39305b;
                                long j3 = x0Var.f39307d;
                                k1Var.mo69297g(aVar.f39346a, h0Var.f38919k);
                                j2 = j3 + h0Var.f38919k.f39102e;
                            }
                        }
                        j = j2;
                        z = z2;
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                    }
                    h0Var.f38931w = false;
                    h0Var.mo69392Y(dVar.f39082b, 1, h0Var.f38932x, false, z, h0Var.f38930v, j, -1);
                    return;
                }
                return;
            case 3:
                DefaultDrmSessionManager.C14210d dVar2 = (DefaultDrmSessionManager.C14210d) this.f16946c;
                Format format = (Format) this.f16947d;
                DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
                if (defaultDrmSessionManager.f31544q != 0 && !dVar2.f31557d) {
                    Looper looper = defaultDrmSessionManager.f31548u;
                    looper.getClass();
                    dVar2.f31556c = defaultDrmSessionManager.mo47291d(looper, dVar2.f31555b, format, false);
                    DefaultDrmSessionManager.this.f31542o.add(dVar2);
                    return;
                }
                return;
            default:
                ((SphericalGLSurfaceView) this.f16946c).lambda$onSurfaceTextureAvailable$1((SurfaceTexture) this.f16947d);
                return;
        }
    }
}
