package androidx.compose.p015ui.node;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p098f0.C6765c;
import p098f0.C6767e;
import p219r.C7734e;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.node.l */
public final class C1746l implements C19846a<C19394m> {

    /* renamed from: b */
    public final LayoutNode f3937b;

    /* renamed from: c */
    public final C6765c<?> f3938c;

    /* renamed from: d */
    public C1746l f3939d;

    /* renamed from: e */
    public C1746l f3940e;

    /* renamed from: f */
    public boolean f3941f;

    /* renamed from: g */
    public final C7734e<ModifierLocalConsumerEntity> f3942g = new C7734e<>(new ModifierLocalConsumerEntity[16]);

    public C1746l(LayoutNode layoutNode, C6765c<?> cVar) {
        C19383o.m32797g(layoutNode, "layoutNode");
        C19383o.m32797g(cVar, "modifier");
        this.f3937b = layoutNode;
        this.f3938c = cVar;
    }

    /* renamed from: a */
    public final void mo6931a() {
        this.f3941f = false;
        C7734e<ModifierLocalConsumerEntity> eVar = this.f3942g;
        int i = eVar.f17157d;
        if (i > 0) {
            T[] tArr = eVar.f17155b;
            int i2 = 0;
            do {
                ModifierLocalConsumerEntity modifierLocalConsumerEntity = (ModifierLocalConsumerEntity) tArr[i2];
                modifierLocalConsumerEntity.f3871c.mo3622M(ModifierLocalConsumerEntity.f3869g);
                modifierLocalConsumerEntity.f3873e = false;
                i2++;
            } while (i2 < i);
        }
        mo6933c(this.f3938c.getKey(), false);
    }

    /* renamed from: b */
    public final C6765c mo6932b(C6767e eVar) {
        C1746l lVar;
        C6765c b;
        C19383o.m32797g(eVar, ImagesContract.LOCAL);
        if (C19383o.m32792b(this.f3938c.getKey(), eVar)) {
            return this.f3938c;
        }
        C1746l lVar2 = this.f3940e;
        if (lVar2 != null && (b = lVar2.mo6932b(eVar)) != null) {
            return b;
        }
        LayoutNode w = this.f3937b.mo6766w();
        if (w == null || (lVar = w.f3807K) == null) {
            return null;
        }
        return lVar.mo6932b(eVar);
    }

    /* renamed from: c */
    public final void mo6933c(C6767e eVar, boolean z) {
        C19394m mVar;
        C7734e<LayoutNode> y;
        int i;
        C1750p pVar;
        if (!z || !C19383o.m32792b(this.f3938c.getKey(), eVar)) {
            C7734e<ModifierLocalConsumerEntity> eVar2 = this.f3942g;
            int i2 = eVar2.f17157d;
            int i3 = 0;
            if (i2 > 0) {
                T[] tArr = eVar2.f17155b;
                int i4 = 0;
                do {
                    ModifierLocalConsumerEntity modifierLocalConsumerEntity = (ModifierLocalConsumerEntity) tArr[i4];
                    modifierLocalConsumerEntity.getClass();
                    C19383o.m32797g(eVar, ImagesContract.LOCAL);
                    if (modifierLocalConsumerEntity.f3872d.mo20236j(eVar) && (pVar = modifierLocalConsumerEntity.f3870b.f3937b.f3823h) != null) {
                        pVar.registerOnEndApplyChangesListener(modifierLocalConsumerEntity);
                    }
                    i4++;
                } while (i4 < i2);
            }
            C1746l lVar = this.f3939d;
            if (lVar != null) {
                lVar.mo6933c(eVar, true);
                mVar = C19394m.f43287a;
            } else {
                mVar = null;
            }
            if (mVar == null && (i = y.f17157d) > 0) {
                T[] tArr2 = (y = this.f3937b.mo6768y()).f17155b;
                do {
                    ((LayoutNode) tArr2[i3]).f3806J.mo6933c(eVar, true);
                    i3++;
                } while (i3 < i);
            }
        }
    }

    public final Object invoke() {
        if (this.f3941f) {
            mo6933c(this.f3938c.getKey(), false);
        }
        return C19394m.f43287a;
    }
}
