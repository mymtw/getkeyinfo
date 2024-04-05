package p597jl;

import android.graphics.RectF;
import com.google.android.material.shape.C15401a;
import p550dl.C17577c;
import p550dl.C17582h;

/* renamed from: jl.t */
public final class C18033t implements C15401a.C15403b {

    /* renamed from: a */
    public final /* synthetic */ RectF f39448a;

    public C18033t(RectF rectF) {
        this.f39448a = rectF;
    }

    /* renamed from: a */
    public final C17577c mo54610a(C17577c cVar) {
        return cVar instanceof C17582h ? cVar : new C17582h(cVar.mo68901a(this.f39448a) / this.f39448a.height());
    }
}
