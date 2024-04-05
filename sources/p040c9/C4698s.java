package p040c9;

import androidx.activity.C0114h;
import com.etsy.android.lib.logger.elk.uploading.C8688i;
import com.etsy.android.lib.network.C8730f;
import com.etsy.android.lib.network.C8731g;
import com.etsy.android.lib.persistviewed.C8822d;
import com.etsy.android.lib.persistviewed.PersistViewedRoomDatabase;
import com.etsy.android.p327ui.search.shopresults.C10949h;
import dagger.internal.C17555d;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import p001a0.C0005b;
import p434ra.C13342i;
import p486y9.C13890f;
import p486y9.C13894i;
import p568fn.C17782b;
import p740eq.C19011a;

/* renamed from: c9.s */
public final class C4698s implements C17555d {

    /* renamed from: a */
    public final /* synthetic */ int f10630a;

    /* renamed from: b */
    public final C19011a f10631b;

    /* renamed from: c */
    public final Object f10632c;

    public /* synthetic */ C4698s(Object obj, C19011a aVar, int i) {
        this.f10630a = i;
        this.f10632c = obj;
        this.f10631b = aVar;
    }

    public final Object get() {
        switch (this.f10630a) {
            case 0:
                C13342i iVar = (C13342i) this.f10631b.get();
                ((C4479c) this.f10632c).getClass();
                C17782b.m29841G(iVar);
                return iVar;
            case 1:
                C13894i iVar2 = (C13894i) this.f10631b.get();
                ((C19388s) this.f10632c).getClass();
                C19383o.m32797g(iVar2, "systemProvider");
                return new C13890f(iVar2);
            case 2:
                C8730f fVar = (C8730f) this.f10631b.get();
                ((C0114h) this.f10632c).getClass();
                C19383o.m32797g(fVar, "retrofit");
                C8688i iVar3 = (C8688i) fVar.f19176a.mo74387b(C8688i.class);
                C17782b.m29841G(iVar3);
                return iVar3;
            case 3:
                PersistViewedRoomDatabase persistViewedRoomDatabase = (PersistViewedRoomDatabase) this.f10631b.get();
                ((C19382n) this.f10632c).getClass();
                C19383o.m32797g(persistViewedRoomDatabase, "database");
                C8822d o = persistViewedRoomDatabase.mo30139o();
                C17782b.m29841G(o);
                return o;
            default:
                C8731g gVar = (C8731g) this.f10631b.get();
                ((C0005b) this.f10632c).getClass();
                C19383o.m32797g(gVar, "retrofit");
                Object b = gVar.f19177a.mo74387b(C10949h.class);
                C19383o.m32796f(b, "retrofit.v3moshiRetrofit…hopsEndpoint::class.java)");
                return (C10949h) b;
        }
    }
}
