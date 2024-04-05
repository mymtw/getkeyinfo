package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p735br.C18980c;
import p753kq.C19857l;

final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends Lambda implements C19857l<IOException, C19394m> {
    public final /* synthetic */ DiskLruCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((IOException) obj);
        return C19394m.f43287a;
    }

    public final void invoke(IOException iOException) {
        C19383o.m32797g(iOException, "it");
        DiskLruCache diskLruCache = this.this$0;
        byte[] bArr = C18980c.f42301a;
        diskLruCache.f44076j = true;
    }
}
