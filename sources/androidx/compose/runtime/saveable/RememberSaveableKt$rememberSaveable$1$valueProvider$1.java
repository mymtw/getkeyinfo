package androidx.compose.runtime.saveable;

import androidx.compose.runtime.C1342k1;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class RememberSaveableKt$rememberSaveable$1$valueProvider$1 extends Lambda implements C19846a<Object> {
    public final /* synthetic */ C1369e $registry;
    public final /* synthetic */ C1342k1<C1373g<Object, Object>> $saverState;
    public final /* synthetic */ C1342k1<Object> $valueState;

    /* renamed from: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$valueProvider$1$a */
    public static final class C1363a implements C1375i {

        /* renamed from: a */
        public final /* synthetic */ C1369e f2959a;

        public C1363a(C1369e eVar) {
            this.f2959a = eVar;
        }

        /* renamed from: a */
        public final boolean mo5915a(Object obj) {
            return this.f2959a.mo5923a(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$rememberSaveable$1$valueProvider$1(C1342k1<? extends C1373g<Object, Object>> k1Var, C1342k1<Object> k1Var2, C1369e eVar) {
        super(0);
        this.$saverState = k1Var;
        this.$valueState = k1Var2;
        this.$registry = eVar;
    }

    public final Object invoke() {
        return this.$saverState.getValue().mo5928a(new C1363a(this.$registry), this.$valueState.getValue());
    }
}
