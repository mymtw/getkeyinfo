package p665rl;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: rl.h */
public final class C18490h implements C18492j {

    /* renamed from: a */
    public final /* synthetic */ Set f40728a;

    /* renamed from: b */
    public final /* synthetic */ C18497o f40729b;

    /* renamed from: c */
    public final /* synthetic */ C18495m f40730c;

    public C18490h(C18495m mVar, HashSet hashSet, C18497o oVar) {
        this.f40730c = mVar;
        this.f40728a = hashSet;
        this.f40729b = oVar;
    }

    /* renamed from: a */
    public final void mo70004a(ZipFile zipFile, HashSet hashSet) throws IOException {
        Set set = this.f40728a;
        C18495m mVar = this.f40730c;
        C18497o oVar = this.f40729b;
        HashSet hashSet2 = new HashSet();
        mVar.mo70006c(oVar, hashSet, new C18491i(hashSet2, oVar, zipFile));
        set.addAll(hashSet2);
    }
}
