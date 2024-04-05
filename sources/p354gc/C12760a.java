package p354gc;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: gc.a */
public abstract class C12760a {

    /* renamed from: a */
    public final String f28204a;

    /* renamed from: gc.a$a */
    public static final class C12761a extends C12760a {

        /* renamed from: b */
        public final C12763b f28205b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12761a(C12763b bVar) {
            super(String.valueOf(bVar.f28207a));
            C19383o.m32797g(bVar, "conversation");
            this.f28205b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12761a) && C19383o.m32792b(this.f28205b, ((C12761a) obj).f28205b);
        }

        public final int hashCode() {
            return this.f28205b.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("Conversation(conversation=");
            h.append(this.f28205b);
            h.append(')');
            return h.toString();
        }
    }

    /* renamed from: gc.a$b */
    public static final class C12762b extends C12760a {

        /* renamed from: b */
        public final String f28206b;

        public C12762b(String str) {
            super(str);
            this.f28206b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12762b) && C19383o.m32792b(this.f28206b, ((C12762b) obj).f28206b);
        }

        public final int hashCode() {
            return this.f28206b.hashCode();
        }

        public final String toString() {
            return C0391c.m1057c(C0072d.m201h("DateHeader(title="), this.f28206b, ')');
        }
    }

    public C12760a(String str) {
        this.f28204a = str;
    }
}
