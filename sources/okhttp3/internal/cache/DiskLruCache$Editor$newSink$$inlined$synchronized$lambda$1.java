package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.cache.DiskLruCache;
import p753kq.C19857l;

public final class DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 extends Lambda implements C19857l<IOException, C19394m> {
    public final /* synthetic */ int $index$inlined;
    public final /* synthetic */ DiskLruCache.Editor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1(DiskLruCache.Editor editor, int i) {
        super(1);
        this.this$0 = editor;
        this.$index$inlined = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return C19394m.f43287a;
    }

    public final void invoke(IOException iOException) {
        C19383o.m32797g(iOException, "it");
        synchronized (DiskLruCache.this) {
            this.this$0.mo72896c();
            C19394m mVar = C19394m.f43287a;
        }
    }
}
