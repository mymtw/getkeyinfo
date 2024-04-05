package androidx.compose.foundation.layout;

import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1 */
final class C0669x76e50d25 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ WindowInsetsNestedScrollConnection $connection;

    /* renamed from: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$a */
    public static final class C0670a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ WindowInsetsNestedScrollConnection f1442a;

        public C0670a(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection) {
            this.f1442a = windowInsetsNestedScrollConnection;
        }

        public final void dispose() {
            this.f1442a.mo4015g();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0669x76e50d25(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection) {
        super(1);
        this.$connection = windowInsetsNestedScrollConnection;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        return new C0670a(this.$connection);
    }
}
