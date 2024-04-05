package p145io.reactivex.internal.operators.flowable;

import p278wp.C8276a;
import p762or.C20024c;

/* renamed from: io.reactivex.internal.operators.flowable.f */
public final class C19110f<K, T> extends C8276a<K, T> {

    /* renamed from: e */
    public static final /* synthetic */ int f42676e = 0;

    /* renamed from: d */
    public final FlowableGroupBy$State<T, K> f42677d;

    public C19110f(K k, FlowableGroupBy$State<T, K> flowableGroupBy$State) {
        super(k);
        this.f42677d = flowableGroupBy$State;
    }

    /* renamed from: d */
    public final void mo20620d(C20024c<? super T> cVar) {
        this.f42677d.subscribe(cVar);
    }
}
