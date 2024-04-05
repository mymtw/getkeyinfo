package com.etsy.android.p327ui.conversation.list.ccm;

import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.compose.foundation.layout.C0761x;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.lib.models.conversation.ccm.ConversationMetadataListResult;
import com.etsy.android.p327ui.conversation.details.C9531k;
import com.etsy.android.p327ui.conversation.details.C9532l;
import com.etsy.android.p327ui.conversation.list.ccm.C9587h;
import com.etsy.android.shophome.C8998i;
import com.etsy.android.util.C12059p;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.EmptyList;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19665q1;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8071s;
import p354gc.C12760a;
import p456ua.C13461f;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;
import p765pr.C20064d;

/* renamed from: com.etsy.android.ui.conversation.list.ccm.ConversationListViewModel */
public final class ConversationListViewModel extends C2866i0 {

    /* renamed from: b */
    public final C9582f f21234b;

    /* renamed from: c */
    public final C13461f f21235c;

    /* renamed from: d */
    public final C2895z<C9587h> f21236d;

    /* renamed from: e */
    public final C2895z f21237e;

    /* renamed from: f */
    public final C2895z<C12059p<Integer>> f21238f;

    /* renamed from: g */
    public final C2895z f21239g;

    /* renamed from: h */
    public final int f21240h = 20;

    /* renamed from: i */
    public Integer f21241i;

    /* renamed from: j */
    public int f21242j;

    /* renamed from: k */
    public List<? extends C12760a> f21243k = EmptyList.INSTANCE;

    /* renamed from: l */
    public final C7091a f21244l;

    @C19060c(mo70540c = "com.etsy.android.ui.conversation.list.ccm.ConversationListViewModel$3", mo70541f = "ConversationListViewModel.kt", mo70542l = {50}, mo70543m = "invokeSuspend")
    /* renamed from: com.etsy.android.ui.conversation.list.ccm.ConversationListViewModel$3 */
    public static final class C95753 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;
        public final /* synthetic */ ConversationListViewModel this$0;

        /* renamed from: com.etsy.android.ui.conversation.list.ccm.ConversationListViewModel$3$a */
        public static final class C9576a implements C19600e<C9583g> {

            /* renamed from: b */
            public final /* synthetic */ ConversationListViewModel f21245b;

            public C9576a(ConversationListViewModel conversationListViewModel) {
                this.f21245b = conversationListViewModel;
            }

            public final Object emit(Object obj, C19340c cVar) {
                ConversationListViewModel.m17952b(this.f21245b, (C9583g) obj);
                return C19394m.f43287a;
            }
        }

        {
            this.this$0 = r1;
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C95753(this.this$0, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C95753) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C19665q1 j = this.this$0.f21234b.f21249a.mo31978j();
                C9576a aVar = new C9576a(this.this$0);
                this.label = 1;
                Object collect = j.collect(new ConversationListRepository$streamConversations$$inlined$map$1$2(aVar), this);
                if (collect != coroutineSingletons) {
                    collect = C19394m.f43287a;
                }
                if (collect == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                C0761x.m1684O0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C19394m.f43287a;
        }
    }

    public ConversationListViewModel(C9582f fVar, C13461f fVar2, C9532l lVar) {
        C19383o.m32797g(fVar, "conversationListRepository");
        C19383o.m32797g(fVar2, "schedulers");
        C19383o.m32797g(lVar, "conversationPushNotificationRepository");
        this.f21234b = fVar;
        this.f21235c = fVar2;
        C2895z<C9587h> zVar = new C2895z<>();
        this.f21236d = zVar;
        this.f21237e = zVar;
        C2895z<C12059p<Integer>> zVar2 = new C2895z<>();
        this.f21238f = zVar2;
        this.f21239g = zVar2;
        C7091a aVar = new C7091a();
        this.f21244l = aVar;
        aVar.mo19403b(SubscribersKt.m32501f(lVar.mo32082a().mo20639i(C13461f.m21235b()).mo20635e(C13461f.m21236c()), C95731.INSTANCE, new C19857l<C9531k, C19394m>(this) {
            public final /* synthetic */ ConversationListViewModel this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C9531k) obj);
                return C19394m.f43287a;
            }

            public final void invoke(C9531k kVar) {
                this.this$0.mo32203c(true);
            }
        }, 2));
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new C95753(this, (C19340c<? super C95753>) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f4 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m17952b(com.etsy.android.p327ui.conversation.list.ccm.ConversationListViewModel r9, com.etsy.android.p327ui.conversation.list.ccm.C9583g r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof com.etsy.android.p327ui.conversation.list.ccm.C9583g.C9586c
            if (r0 == 0) goto L_0x0028
            com.etsy.android.ui.conversation.list.ccm.g$c r10 = (com.etsy.android.p327ui.conversation.list.ccm.C9583g.C9586c) r10
            int r0 = r10.f21255b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.f21241i = r0
            int r10 = r10.f21256c
            r9.f21242j = r10
            if (r0 != 0) goto L_0x0019
            goto L_0x0126
        L_0x0019:
            int r10 = r0.intValue()
            if (r10 != 0) goto L_0x0126
            androidx.lifecycle.z<com.etsy.android.ui.conversation.list.ccm.h> r9 = r9.f21236d
            com.etsy.android.ui.conversation.list.ccm.h$a r10 = com.etsy.android.p327ui.conversation.list.ccm.C9587h.C9588a.f21257a
            r9.setValue(r10)
            goto L_0x0126
        L_0x0028:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.conversation.list.ccm.C9583g.C9585b
            if (r0 == 0) goto L_0x004b
            java.util.List<? extends gc.a> r10 = r9.f21243k
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x003d
            androidx.lifecycle.z<com.etsy.android.ui.conversation.list.ccm.h> r9 = r9.f21236d
            com.etsy.android.ui.conversation.list.ccm.h$b r10 = com.etsy.android.p327ui.conversation.list.ccm.C9587h.C9589b.f21258a
            r9.setValue(r10)
            goto L_0x0126
        L_0x003d:
            androidx.lifecycle.z<com.etsy.android.util.p<java.lang.Integer>> r9 = r9.f21238f
            r10 = 2131951973(0x7f130165, float:1.9540376E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.etsy.android.util.C12060q.m19871b(r9, r10)
            goto L_0x0126
        L_0x004b:
            boolean r0 = r10 instanceof com.etsy.android.p327ui.conversation.list.ccm.C9583g.C9584a
            if (r0 == 0) goto L_0x0126
            com.etsy.android.ui.conversation.list.ccm.g$a r10 = (com.etsy.android.p327ui.conversation.list.ccm.C9583g.C9584a) r10
            java.util.List<gc.b> r10 = r10.f21252a
            boolean r0 = r10.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x010c
            r0 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0065:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x00ff
            java.lang.Object r3 = r10.next()
            gc.b r3 = (p354gc.C12763b) r3
            r4 = 2
            if (r0 != 0) goto L_0x0075
            goto L_0x0091
        L_0x0075:
            long r5 = r3.f28209c
            long r7 = r0.f28209c
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            r0.setTimeInMillis(r5)
            int r5 = r0.get(r4)
            r0.setTimeInMillis(r7)
            int r0 = r0.get(r4)
            if (r5 == r0) goto L_0x0093
        L_0x0091:
            r0 = r1
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            if (r0 == 0) goto L_0x00f4
            gc.a$b r0 = new gc.a$b
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.util.Calendar r5 = java.util.Calendar.getInstance(r5)
            long r6 = r3.f28209c
            r5.setTimeInMillis(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r4 = r5.getDisplayName(r4, r4, r7)
            java.lang.String r7 = "calendar.getDisplayName(…ONG, Locale.getDefault())"
            kotlin.jvm.internal.C19383o.m32796f(r4, r7)
            java.util.Locale r7 = java.util.Locale.getDefault()
            java.lang.String r8 = "getDefault()"
            kotlin.jvm.internal.C19383o.m32796f(r7, r8)
            java.lang.String r4 = r4.toUpperCase(r7)
            java.lang.String r7 = "this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.C19383o.m32796f(r4, r7)
            r6.append(r4)
            int r4 = r5.get(r1)
            long r7 = java.lang.System.currentTimeMillis()
            r5.setTimeInMillis(r7)
            int r5 = r5.get(r1)
            if (r4 == r5) goto L_0x00e5
            java.lang.String r5 = " "
            r6.append(r5)
            r6.append(r4)
        L_0x00e5:
            java.lang.String r4 = r6.toString()
            java.lang.String r5 = "displayDate.toString()"
            kotlin.jvm.internal.C19383o.m32796f(r4, r5)
            r0.<init>(r4)
            r2.add(r0)
        L_0x00f4:
            gc.a$a r0 = new gc.a$a
            r0.<init>(r3)
            r2.add(r0)
            r0 = r3
            goto L_0x0065
        L_0x00ff:
            r9.f21243k = r2
            androidx.lifecycle.z<com.etsy.android.ui.conversation.list.ccm.h> r9 = r9.f21236d
            com.etsy.android.ui.conversation.list.ccm.h$d r10 = new com.etsy.android.ui.conversation.list.ccm.h$d
            r10.<init>(r2)
            r9.setValue(r10)
            goto L_0x0126
        L_0x010c:
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0126
            java.util.List<? extends gc.a> r10 = r9.f21243k
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r1
            if (r10 == 0) goto L_0x0126
            kotlin.collections.EmptyList r10 = kotlin.collections.EmptyList.INSTANCE
            r9.f21243k = r10
            androidx.lifecycle.z<com.etsy.android.ui.conversation.list.ccm.h> r9 = r9.f21236d
            com.etsy.android.ui.conversation.list.ccm.h$a r10 = com.etsy.android.p327ui.conversation.list.ccm.C9587h.C9588a.f21257a
            r9.setValue(r10)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.conversation.list.ccm.ConversationListViewModel.m17952b(com.etsy.android.ui.conversation.list.ccm.ConversationListViewModel, com.etsy.android.ui.conversation.list.ccm.g):void");
    }

    /* renamed from: c */
    public final void mo32203c(boolean z) {
        if (z) {
            this.f21242j = 0;
        }
        Integer num = this.f21241i;
        if (!(num == null || num.intValue() == 0)) {
            int i = this.f21242j;
            Integer num2 = this.f21241i;
            C19383o.m32794d(num2);
            if (i >= num2.intValue()) {
                return;
            }
        }
        if (!z && this.f21243k.isEmpty()) {
            this.f21236d.setValue(new C9587h.C9590c(z));
        }
        C9582f fVar = this.f21234b;
        int i2 = this.f21240h;
        C8071s<C20064d<ConversationMetadataListResult>> a = fVar.f21250b.mo32209a(i2, this.f21242j + 1);
        C8998i iVar = new C8998i(fVar, 2);
        a.getClass();
        ConsumerSingleObserver e = SubscribersKt.m32500e(C0391c.m1056b(this.f21235c, C0326j.m860e(this.f21235c, new C19208j(a, iVar))), new ConversationListViewModel$loadConversations$1(this), new ConversationListViewModel$loadConversations$2(this));
        C7091a aVar = this.f21244l;
        C19383o.m32798h(aVar, "compositeDisposable");
        aVar.mo19403b(e);
    }

    public final void onCleared() {
        super.onCleared();
        this.f21244l.mo19405d();
    }
}
