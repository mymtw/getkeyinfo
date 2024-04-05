package androidx.compose.p015ui.text.font;

import androidx.compose.runtime.C1342k1;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.font.z */
public interface C1974z extends C1342k1<Object> {

    /* renamed from: androidx.compose.ui.text.font.z$a */
    public static final class C1975a implements C1974z, C1342k1<Object> {

        /* renamed from: b */
        public final AsyncFontListLoader f4436b;

        public C1975a(AsyncFontListLoader asyncFontListLoader) {
            this.f4436b = asyncFontListLoader;
        }

        /* renamed from: a */
        public final boolean mo7592a() {
            return this.f4436b.f4384h;
        }

        public final Object getValue() {
            return this.f4436b.getValue();
        }
    }

    /* renamed from: androidx.compose.ui.text.font.z$b */
    public static final class C1976b implements C1974z {

        /* renamed from: b */
        public final Object f4437b;

        /* renamed from: c */
        public final boolean f4438c;

        public C1976b(Object obj, boolean z) {
            C19383o.m32797g(obj, "value");
            this.f4437b = obj;
            this.f4438c = z;
        }

        /* renamed from: a */
        public final boolean mo7592a() {
            return this.f4438c;
        }

        public final Object getValue() {
            return this.f4437b;
        }
    }

    /* renamed from: a */
    boolean mo7592a();
}
