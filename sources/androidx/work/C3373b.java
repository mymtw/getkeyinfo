package androidx.work;

import androidx.compose.p015ui.platform.C1830f0;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: androidx.work.b */
public final class C3373b {

    /* renamed from: a */
    public final ExecutorService f7873a = m8116a(false);

    /* renamed from: b */
    public final ExecutorService f7874b = m8116a(true);

    /* renamed from: c */
    public final C3441t f7875c;

    /* renamed from: d */
    public final C3385i f7876d;

    /* renamed from: e */
    public final C1830f0 f7877e;

    /* renamed from: f */
    public final int f7878f;

    /* renamed from: g */
    public final int f7879g;

    /* renamed from: h */
    public final int f7880h;

    /* renamed from: androidx.work.b$a */
    public static final class C3374a {
    }

    /* renamed from: androidx.work.b$b */
    public interface C3375b {
        /* renamed from: a */
        C3373b mo12836a();
    }

    public C3373b(C3374a aVar) {
        String str = C3442u.f8046a;
        this.f7875c = new C3441t();
        this.f7876d = new C3385i();
        this.f7877e = new C1830f0(1, 0);
        this.f7878f = 4;
        this.f7879g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f7880h = 20;
    }

    /* renamed from: a */
    public static ExecutorService m8116a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new C3372a(z));
    }
}
