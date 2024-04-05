package androidx.work;

import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p079d3.C6646p;
import p090e3.C6712a;

public final class WorkerParameters {

    /* renamed from: a */
    public UUID f7862a;

    /* renamed from: b */
    public C3380e f7863b;

    /* renamed from: c */
    public int f7864c;

    /* renamed from: d */
    public Executor f7865d;

    /* renamed from: e */
    public C6712a f7866e;

    /* renamed from: f */
    public C3442u f7867f;

    /* renamed from: g */
    public C3383g f7868g;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C3371a {

        /* renamed from: a */
        public List<String> f7869a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f7870b = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, C3380e eVar, List list, int i, ExecutorService executorService, C6712a aVar, C3441t tVar, C6646p pVar) {
        this.f7862a = uuid;
        this.f7863b = eVar;
        new HashSet(list);
        this.f7864c = i;
        this.f7865d = executorService;
        this.f7866e = aVar;
        this.f7867f = tVar;
        this.f7868g = pVar;
    }
}
