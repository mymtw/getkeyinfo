package com.google.android.play.core.ktx;

import androidx.compose.foundation.layout.C0761x;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.C15582b;
import com.google.android.play.core.assetpacks.C15586c;
import com.google.android.play.core.assetpacks.C15590d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.channels.C19513o;
import kotlinx.coroutines.channels.ProduceKt;
import p689ul.C18604b;
import p689ul.C18605c;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

@C19060c(mo70540c = "com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1", mo70541f = "AssetPackManagerKtx.kt", mo70542l = {67}, mo70543m = "invokeSuspend")
final class AssetPackManagerKtxKt$requestProgressFlow$1 extends SuspendLambda implements C19861p<C19513o<? super AssetPackState>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ List $packs;
    public final /* synthetic */ C15582b $this_requestProgressFlow;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* renamed from: p$ */
    private C19513o f35499p$;

    /* renamed from: com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1$a */
    public static final class C15720a<ResultT> implements C18605c<C15590d> {

        /* renamed from: b */
        public final /* synthetic */ AssetPackManagerKtxKt$requestProgressFlow$1 f35500b;

        /* renamed from: c */
        public final /* synthetic */ C19513o f35501c;

        /* renamed from: d */
        public final /* synthetic */ Set f35502d;

        public C15720a(AssetPackManagerKtxKt$requestProgressFlow$1 assetPackManagerKtxKt$requestProgressFlow$1, C19513o oVar, LinkedHashSet linkedHashSet) {
            this.f35500b = assetPackManagerKtxKt$requestProgressFlow$1;
            this.f35501c = oVar;
            this.f35502d = linkedHashSet;
        }

        public final void onSuccess(Object obj) {
            C15590d dVar = (C15590d) obj;
            C19383o.m32798h(dVar, "states");
            List list = this.f35500b.$packs;
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (!this.f35502d.contains((String) next)) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C19513o oVar = this.f35501c;
                Map<String, AssetPackState> a = dVar.mo55389a();
                C19383o.m32793c(a, "packStates()");
                AssetPackState assetPackState = a.get((String) it.next());
                if (assetPackState != null) {
                    C19421p.m32942j0(oVar, assetPackState);
                } else {
                    C19383o.m32803m();
                    throw null;
                }
            }
        }
    }

    /* renamed from: com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1$b */
    public static final class C15721b implements C18604b {

        /* renamed from: b */
        public final /* synthetic */ C19513o f35503b;

        public C15721b(C19513o oVar) {
            this.f35503b = oVar;
        }

        /* renamed from: a */
        public final void mo46667a(Exception exc) {
            this.f35503b.mo72187C(exc);
        }
    }

    /* renamed from: com.google.android.play.core.ktx.AssetPackManagerKtxKt$requestProgressFlow$1$c */
    public static final class C15722c implements C15586c {

        /* renamed from: a */
        public final /* synthetic */ C19513o f35504a;

        /* renamed from: b */
        public final /* synthetic */ Set f35505b;

        public C15722c(C19513o oVar, LinkedHashSet linkedHashSet) {
            this.f35504a = oVar;
            this.f35505b = linkedHashSet;
        }

        /* renamed from: a */
        public final void mo31232a(Object obj) {
            AssetPackState assetPackState = (AssetPackState) obj;
            C19383o.m32798h(assetPackState, "state");
            Set set = this.f35505b;
            String c = assetPackState.mo55359c();
            C19383o.m32793c(c, "name()");
            set.add(c);
            C19421p.m32942j0(this.f35504a, assetPackState);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AssetPackManagerKtxKt$requestProgressFlow$1(C15582b bVar, List list, C19340c cVar) {
        super(2, cVar);
        this.$this_requestProgressFlow = bVar;
        this.$packs = list;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        C19383o.m32798h(cVar, "completion");
        AssetPackManagerKtxKt$requestProgressFlow$1 assetPackManagerKtxKt$requestProgressFlow$1 = new AssetPackManagerKtxKt$requestProgressFlow$1(this.$this_requestProgressFlow, this.$packs, cVar);
        assetPackManagerKtxKt$requestProgressFlow$1.f35499p$ = (C19513o) obj;
        return assetPackManagerKtxKt$requestProgressFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((AssetPackManagerKtxKt$requestProgressFlow$1) create(obj, (C19340c) obj2)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19513o oVar = this.f35499p$;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            final C15722c cVar = new C15722c(oVar, linkedHashSet);
            this.$this_requestProgressFlow.mo55374b(cVar);
            this.$this_requestProgressFlow.mo55375c(this.$packs).mo70117d(new C15720a(this, oVar, linkedHashSet)).mo70115b(new C15721b(oVar));
            C157193 r4 = new C19846a<C19394m>(this) {
                public final /* synthetic */ AssetPackManagerKtxKt$requestProgressFlow$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    this.this$0.$this_requestProgressFlow.mo55373a(cVar);
                }
            };
            this.L$0 = oVar;
            this.L$1 = linkedHashSet;
            this.L$2 = cVar;
            this.label = 1;
            if (ProduceKt.m33138a(oVar, r4, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C15586c cVar2 = (C15586c) this.L$2;
            Set set = (Set) this.L$1;
            C19513o oVar2 = (C19513o) this.L$0;
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
