package androidx.room;

import androidx.compose.foundation.layout.C0761x;
import androidx.room.C3244n;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C19499d;
import kotlinx.coroutines.flow.C19600e;
import p568fn.C17782b;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", mo70541f = "CoroutinesRoom.kt", mo70542l = {110}, mo70543m = "invokeSuspend")
final class CoroutinesRoom$Companion$createFlow$1 extends SuspendLambda implements C19861p<C19600e<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Callable<Object> $callable;
    public final /* synthetic */ RoomDatabase $db;
    public final /* synthetic */ boolean $inTransaction;
    public final /* synthetic */ String[] $tableNames;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", mo70541f = "CoroutinesRoom.kt", mo70542l = {136}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1 */
    public static final class C32061 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        /* renamed from: androidx.room.CoroutinesRoom$Companion$createFlow$1$1$a */
        public static final class C3208a extends C3244n.C3247c {

            /* renamed from: b */
            public final /* synthetic */ C19499d<C19394m> f7453b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3208a(String[] strArr, AbstractChannel abstractChannel) {
                super(strArr);
                this.f7453b = abstractChannel;
            }

            /* renamed from: a */
            public final void mo11954a(Set<String> set) {
                this.f7453b.mo72199l(C19394m.f43287a);
            }
        }

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C32061 r0 = new C32061(z, roomDatabase, eVar, strArr, callable, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C32061) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C19525d0 d0Var = (C19525d0) this.L$0;
                final AbstractChannel l = C17782b.m29872l(-1, (BufferOverflow) null, 6);
                final C3208a aVar = new C3208a(strArr, l);
                Object obj3 = C19394m.f43287a;
                l.mo72199l(obj3);
                C3235h0 h0Var = (C3235h0) d0Var.getCoroutineContext().get(C3235h0.f7516e);
                CoroutineContext coroutineContext = h0Var == null ? null : h0Var.f7518c;
                if (coroutineContext == null) {
                    coroutineContext = z ? C15588c1.m25336m0(roomDatabase) : C15588c1.m25332k0(roomDatabase);
                }
                AbstractChannel l2 = C17782b.m29872l(0, (BufferOverflow) null, 7);
                final RoomDatabase roomDatabase = roomDatabase;
                final Callable<Object> callable = callable;
                final AbstractChannel abstractChannel = l2;
                C19697g.m33468f(d0Var, coroutineContext, (CoroutineStart) null, new C19861p<C19525d0, C19340c<? super C19394m>, Object>((C19340c<? super C32071>) null) {
                    public Object L$0;
                    public int label;

                    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public CoroutinesRoom$Companion$createFlow$1(boolean z, RoomDatabase roomDatabase, String[] strArr, Callable<Object> callable, C19340c<? super CoroutinesRoom$Companion$createFlow$1> cVar) {
                            super(2, cVar);
                            this.$inTransaction = z;
                            this.$db = roomDatabase;
                            this.$tableNames = strArr;
                            this.$callable = callable;
                        }

                        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
                            CoroutinesRoom$Companion$createFlow$1 coroutinesRoom$Companion$createFlow$1 = new CoroutinesRoom$Companion$createFlow$1(this.$inTransaction, this.$db, this.$tableNames, this.$callable, cVar);
                            coroutinesRoom$Companion$createFlow$1.L$0 = obj;
                            return coroutinesRoom$Companion$createFlow$1;
                        }

                        public final Object invoke(C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
                            return ((CoroutinesRoom$Companion$createFlow$1) create(eVar, cVar)).invokeSuspend(C19394m.f43287a);
                        }

                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                C0761x.m1684O0(obj);
                                final C19600e eVar = (C19600e) this.L$0;
                                final boolean z = this.$inTransaction;
                                final RoomDatabase roomDatabase = this.$db;
                                final String[] strArr = this.$tableNames;
                                final Callable<Object> callable = this.$callable;
                                C32061 r3 = new C32061((C19340c<? super C32061>) null);
                                this.label = 1;
                                if (C19697g.m33466d(r3, this) == coroutineSingletons) {
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
