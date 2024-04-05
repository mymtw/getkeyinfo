package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C0958l;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.p015ui.layout.C1689j;
import kotlin.jvm.internal.C19383o;
import p288y.C8343c;

/* renamed from: androidx.compose.foundation.text.selection.j */
public final class C1015j implements C0958l {

    /* renamed from: a */
    public final /* synthetic */ SelectionManager f2132a;

    /* renamed from: b */
    public final /* synthetic */ boolean f2133b;

    public C1015j(SelectionManager selectionManager, boolean z) {
        this.f2132a = selectionManager;
        this.f2133b = z;
    }

    /* renamed from: a */
    public final void mo4510a() {
        C1689j c;
        C1011g d = this.f2132a.mo4612d();
        if (d != null) {
            C1010f b = this.f2132a.mo4610b(this.f2133b ? d.f2121a : d.f2122b);
            if (b != null && (c = b.mo4697c()) != null) {
                long a = C1014i.m2103a(b.mo4698d(d, this.f2133b));
                SelectionManager selectionManager = this.f2132a;
                selectionManager.mo4616h(new C8343c(selectionManager.mo4615g().mo6686m(c, a)));
                this.f2132a.mo4617i(this.f2133b ? Handle.SelectionStart : Handle.SelectionEnd);
            }
        }
    }

    /* renamed from: b */
    public final void mo4511b(long j) {
        long j2;
        this.f2132a.mo4613e();
        C1011g d = this.f2132a.mo4612d();
        C19383o.m32794d(d);
        C1010f fVar = (C1010f) this.f2132a.f2065a.f2138c.get(Long.valueOf(d.f2121a.f2126c));
        C1010f fVar2 = (C1010f) this.f2132a.f2065a.f2138c.get(Long.valueOf(d.f2122b.f2126c));
        C1689j jVar = null;
        if (this.f2133b) {
            if (fVar != null) {
                jVar = fVar.mo4697c();
            }
            C19383o.m32794d(jVar);
        } else {
            if (fVar2 != null) {
                jVar = fVar2.mo4697c();
            }
            C19383o.m32794d(jVar);
        }
        if (this.f2133b) {
            C19383o.m32794d(fVar);
            j2 = fVar.mo4698d(d, true);
        } else {
            C19383o.m32794d(fVar2);
            j2 = fVar2.mo4698d(d, false);
        }
        long a = C1014i.m2103a(j2);
        SelectionManager selectionManager = this.f2132a;
        selectionManager.f2075k.setValue(new C8343c(selectionManager.mo4615g().mo6686m(jVar, a)));
        this.f2132a.f2076l.setValue(new C8343c(C8343c.f18295b));
    }

    /* renamed from: c */
    public final void mo4512c() {
        this.f2132a.mo4617i((Handle) null);
        this.f2132a.mo4616h((C8343c) null);
    }

    /* renamed from: d */
    public final void mo4513d(long j) {
        SelectionManager selectionManager = this.f2132a;
        selectionManager.f2076l.setValue(new C8343c(C8343c.m16645f(((C8343c) selectionManager.f2076l.getValue()).f18299a, j)));
        long f = C8343c.m16645f(((C8343c) this.f2132a.f2075k.getValue()).f18299a, ((C8343c) this.f2132a.f2076l.getValue()).f18299a);
        if (this.f2132a.mo4621m(new C8343c(f), new C8343c(((C8343c) this.f2132a.f2075k.getValue()).f18299a), this.f2133b, SelectionAdjustment.Companion.f2057e)) {
            this.f2132a.f2075k.setValue(new C8343c(f));
            this.f2132a.f2076l.setValue(new C8343c(C8343c.f18295b));
        }
    }

    public final void onCancel() {
        this.f2132a.mo4618j();
        this.f2132a.mo4617i((Handle) null);
        this.f2132a.mo4616h((C8343c) null);
    }

    public final void onStop() {
        this.f2132a.mo4618j();
        this.f2132a.mo4617i((Handle) null);
        this.f2132a.mo4616h((C8343c) null);
    }
}
