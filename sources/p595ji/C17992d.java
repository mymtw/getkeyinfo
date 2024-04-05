package p595ji;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p505aj.C14002i;

/* renamed from: ji.d */
public final class C17992d {

    /* renamed from: b */
    public static final AtomicLong f39337b = new AtomicLong();

    /* renamed from: a */
    public final Map<String, List<String>> f39338a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17992d(long j, C14002i iVar, long j2) {
        this(Collections.emptyMap(), 0);
        Uri uri = iVar.f30774a;
    }

    public C17992d(Map map, long j) {
        this.f39338a = map;
    }
}
