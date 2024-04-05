package p078d2;

import androidx.slice.Slice;
import androidx.slice.SliceSpec;
import kotlinx.coroutines.C19543e0;
import p022b2.C3469a;

/* renamed from: d2.d */
public abstract class C6627d {

    /* renamed from: a */
    public Slice.C3273a f14624a;

    /* renamed from: b */
    public final SliceSpec f14625b;

    /* renamed from: c */
    public C3469a f14626c;

    public C6627d(Slice.C3273a aVar, SliceSpec sliceSpec) {
        this(aVar, sliceSpec, new C19543e0());
    }

    /* renamed from: e */
    public abstract void mo18812e(Slice.C3273a aVar);

    /* renamed from: f */
    public Slice mo18813f() {
        Slice.C3273a aVar = this.f14624a;
        aVar.f7606d = this.f14625b;
        mo18812e(aVar);
        return this.f14624a.mo12108h();
    }

    public C6627d(Slice.C3273a aVar, SliceSpec sliceSpec, C3469a aVar2) {
        this.f14624a = aVar;
        this.f14625b = sliceSpec;
        this.f14626c = aVar2;
    }
}
