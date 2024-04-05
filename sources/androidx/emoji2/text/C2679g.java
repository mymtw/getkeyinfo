package androidx.emoji2.text;

import androidx.emoji2.text.C2665e;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: androidx.emoji2.text.g */
public final class C2679g extends C2665e.C2673h {

    /* renamed from: a */
    public final /* synthetic */ C2665e.C2673h f6031a;

    /* renamed from: b */
    public final /* synthetic */ ThreadPoolExecutor f6032b;

    public C2679g(C2665e.C2673h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f6031a = hVar;
        this.f6032b = threadPoolExecutor;
    }

    /* renamed from: a */
    public final void mo10062a(Throwable th) {
        try {
            this.f6031a.mo10062a(th);
        } finally {
            this.f6032b.shutdown();
        }
    }

    /* renamed from: b */
    public final void mo10063b(C2689l lVar) {
        try {
            this.f6031a.mo10063b(lVar);
        } finally {
            this.f6032b.shutdown();
        }
    }
}
