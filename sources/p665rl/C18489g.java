package p665rl;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* renamed from: rl.g */
public final class C18489g implements C18492j {

    /* renamed from: a */
    public final /* synthetic */ C18497o f40724a;

    /* renamed from: b */
    public final /* synthetic */ Set f40725b;

    /* renamed from: c */
    public final /* synthetic */ AtomicBoolean f40726c;

    /* renamed from: d */
    public final /* synthetic */ C18495m f40727d;

    public C18489g(C18495m mVar, C18497o oVar, HashSet hashSet, AtomicBoolean atomicBoolean) {
        this.f40727d = mVar;
        this.f40724a = oVar;
        this.f40725b = hashSet;
        this.f40726c = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo70004a(ZipFile zipFile, HashSet hashSet) throws IOException {
        this.f40727d.mo70006c(this.f40724a, hashSet, new C18488f(this));
    }
}
