package androidx.compose.p015ui.node;

import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p098f0.C6763a;
import p098f0.C6764b;
import p098f0.C6765c;
import p098f0.C6766d;
import p098f0.C6767e;
import p219r.C7734e;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.node.ModifierLocalConsumerEntity */
public final class ModifierLocalConsumerEntity implements C19846a<C19394m>, C1752q, C6766d {

    /* renamed from: f */
    public static final C19857l<ModifierLocalConsumerEntity, C19394m> f3868f = ModifierLocalConsumerEntity$Companion$onReadValuesChanged$1.INSTANCE;

    /* renamed from: g */
    public static final C1730a f3869g = new C1730a();

    /* renamed from: b */
    public C1746l f3870b;

    /* renamed from: c */
    public final C6764b f3871c;

    /* renamed from: d */
    public final C7734e<C6763a<?>> f3872d = new C7734e<>(new C6763a[16]);

    /* renamed from: e */
    public boolean f3873e;

    /* renamed from: androidx.compose.ui.node.ModifierLocalConsumerEntity$a */
    public static final class C1730a implements C6766d {
        /* renamed from: a */
        public final Object mo6818a(C6767e eVar) {
            C19383o.m32797g(eVar, "<this>");
            return eVar.f14903a.invoke();
        }
    }

    public ModifierLocalConsumerEntity(C1746l lVar, C6764b bVar) {
        C19383o.m32797g(lVar, "provider");
        C19383o.m32797g(bVar, "modifier");
        this.f3870b = lVar;
        this.f3871c = bVar;
    }

    /* renamed from: a */
    public final Object mo6818a(C6767e eVar) {
        C19383o.m32797g(eVar, "<this>");
        this.f3872d.mo20232c(eVar);
        C6765c b = this.f3870b.mo6932b(eVar);
        return b == null ? eVar.f14903a.invoke() : b.getValue();
    }

    /* renamed from: b */
    public final void mo6819b() {
        if (this.f3873e) {
            this.f3872d.mo20235g();
            C15588c1.m25291L0(this.f3870b.f3937b).getSnapshotObserver().mo6824b(this, f3868f, new ModifierLocalConsumerEntity$notifyConsumerOfChanges$1(this));
        }
    }

    public final Object invoke() {
        mo6819b();
        return C19394m.f43287a;
    }

    public final boolean isValid() {
        return this.f3873e;
    }
}
