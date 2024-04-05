package p040c9;

import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2870k0;
import kotlin.jvm.internal.C19383o;
import p740eq.C19011a;

/* renamed from: c9.mc */
public final class C4632mc implements C2870k0.C2872b {

    /* renamed from: a */
    public final /* synthetic */ C19011a<? extends C2866i0> f10429a;

    public C4632mc(C19011a<? extends C2866i0> aVar) {
        this.f10429a = aVar;
    }

    public final <T extends C2866i0> T create(Class<T> cls) {
        T t = this.f10429a.get();
        C19383o.m32795e(t, "null cannot be cast to non-null type T of com.etsy.android.dagger.ViewModelFactoriesKt.asViewModelFactory.<no name provided>.create");
        return (C2866i0) t;
    }
}
