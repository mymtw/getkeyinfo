package androidx.compose.material;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Result;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19747k;
import kotlinx.coroutines.C19753l;
import kotlinx.coroutines.sync.MutexImpl;
import p514bk.C14088a;

/* renamed from: androidx.compose.material.t1 */
public final class C1254t1 {

    /* renamed from: a */
    public final MutexImpl f2616a = C14088a.m21779d();

    /* renamed from: b */
    public final ParcelableSnapshotMutableState f2617b = C0761x.m1751w0((Object) null, C1351n1.f2948a);

    /* renamed from: androidx.compose.material.t1$a */
    public static final class C1255a implements C1251s1 {

        /* renamed from: a */
        public final String f2618a;

        /* renamed from: b */
        public final String f2619b;

        /* renamed from: c */
        public final SnackbarDuration f2620c;

        /* renamed from: d */
        public final C19747k<SnackbarResult> f2621d;

        public C1255a(String str, String str2, SnackbarDuration snackbarDuration, C19753l lVar) {
            C19383o.m32797g(str, "message");
            C19383o.m32797g(snackbarDuration, "duration");
            this.f2618a = str;
            this.f2619b = str2;
            this.f2620c = snackbarDuration;
            this.f2621d = lVar;
        }

        /* renamed from: a */
        public final String mo5346a() {
            return this.f2619b;
        }

        /* renamed from: b */
        public final void mo5347b() {
            if (this.f2621d.isActive()) {
                this.f2621d.resumeWith(Result.m35480constructorimpl(SnackbarResult.ActionPerformed));
            }
        }

        public final void dismiss() {
            if (this.f2621d.isActive()) {
                this.f2621d.resumeWith(Result.m35480constructorimpl(SnackbarResult.Dismissed));
            }
        }

        public final SnackbarDuration getDuration() {
            return this.f2620c;
        }

        public final String getMessage() {
            return this.f2618a;
        }
    }
}
