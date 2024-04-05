package com.google.android.play.core.ktx;

import androidx.compose.foundation.layout.C0761x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import kotlinx.coroutines.channels.C19513o;
import kotlinx.coroutines.channels.ProduceKt;
import p673sl.C18521a;
import p673sl.C18522b;
import p673sl.C18523c;
import p689ul.C18604b;
import p689ul.C18605c;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19861p;

@C19060c(mo70540c = "com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1", mo70541f = "SplitInstallManagerKtx.kt", mo70542l = {78}, mo70543m = "invokeSuspend")
final class SplitInstallManagerKtxKt$requestProgressFlow$1 extends SuspendLambda implements C19861p<C19513o<? super C18522b>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C18521a $this_requestProgressFlow;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* renamed from: p$ */
    private C19513o f35506p$;

    /* renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1$a */
    public static final class C15724a<ResultT> implements C18605c<List<C18522b>> {

        /* renamed from: b */
        public final /* synthetic */ C19513o f35507b;

        /* renamed from: c */
        public final /* synthetic */ Set f35508c;

        public C15724a(C19513o oVar, LinkedHashSet linkedHashSet) {
            this.f35507b = oVar;
            this.f35508c = linkedHashSet;
        }

        public final void onSuccess(Object obj) {
            List list = (List) obj;
            C19383o.m32798h(list, "sessionList");
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (!this.f35508c.contains(Integer.valueOf(((C18522b) next).mo70037d()))) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C19421p.m32942j0(this.f35507b, (C18522b) it.next());
            }
        }
    }

    /* renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1$b */
    public static final class C15725b implements C18604b {

        /* renamed from: b */
        public final /* synthetic */ C19513o f35509b;

        public C15725b(C19513o oVar) {
            this.f35509b = oVar;
        }

        /* renamed from: a */
        public final void mo46667a(Exception exc) {
            this.f35509b.mo72187C(exc);
        }
    }

    /* renamed from: com.google.android.play.core.ktx.SplitInstallManagerKtxKt$requestProgressFlow$1$c */
    public static final class C15726c implements C18523c {

        /* renamed from: a */
        public final /* synthetic */ C19513o f35510a;

        /* renamed from: b */
        public final /* synthetic */ Set f35511b;

        public C15726c(C19513o oVar, LinkedHashSet linkedHashSet) {
            this.f35510a = oVar;
            this.f35511b = linkedHashSet;
        }

        /* renamed from: a */
        public final void mo31232a(Object obj) {
            C18522b bVar = (C18522b) obj;
            C19383o.m32798h(bVar, "state");
            this.f35511b.add(Integer.valueOf(bVar.mo70037d()));
            C19421p.m32942j0(this.f35510a, bVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitInstallManagerKtxKt$requestProgressFlow$1(C18521a aVar, C19340c cVar) {
        super(2, cVar);
        this.$this_requestProgressFlow = aVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        C19383o.m32798h(cVar, "completion");
        SplitInstallManagerKtxKt$requestProgressFlow$1 splitInstallManagerKtxKt$requestProgressFlow$1 = new SplitInstallManagerKtxKt$requestProgressFlow$1(this.$this_requestProgressFlow, cVar);
        splitInstallManagerKtxKt$requestProgressFlow$1.f35506p$ = (C19513o) obj;
        return splitInstallManagerKtxKt$requestProgressFlow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((SplitInstallManagerKtxKt$requestProgressFlow$1) create(obj, (C19340c) obj2)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19513o oVar = this.f35506p$;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            final C15726c cVar = new C15726c(oVar, linkedHashSet);
            this.$this_requestProgressFlow.mo70033c();
            this.$this_requestProgressFlow.mo70031a().mo70117d(new C15724a(oVar, linkedHashSet)).mo70115b(new C15725b(oVar));
            C157233 r4 = new C19846a<C19394m>(this) {
                public final /* synthetic */ SplitInstallManagerKtxKt$requestProgressFlow$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void invoke() {
                    this.this$0.$this_requestProgressFlow.mo70032b();
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
            C18523c cVar2 = (C18523c) this.L$2;
            Set set = (Set) this.L$1;
            C19513o oVar2 = (C19513o) this.L$0;
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
