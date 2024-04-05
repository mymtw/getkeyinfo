package kotlin.p752io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C19383o;
import kotlin.sequences.C19431g;
import p755lq.C19875a;

/* renamed from: kotlin.io.c */
public final class C19366c implements C19431g<String> {

    /* renamed from: a */
    public final BufferedReader f43223a;

    /* renamed from: kotlin.io.c$a */
    public static final class C19367a implements Iterator<String>, C19875a {

        /* renamed from: b */
        public String f43224b;

        /* renamed from: c */
        public boolean f43225c;

        /* renamed from: d */
        public final /* synthetic */ C19366c f43226d;

        public C19367a(C19366c cVar) {
            this.f43226d = cVar;
        }

        public final boolean hasNext() {
            if (this.f43224b == null && !this.f43225c) {
                String readLine = this.f43226d.f43223a.readLine();
                this.f43224b = readLine;
                if (readLine == null) {
                    this.f43225c = true;
                }
            }
            return this.f43224b != null;
        }

        public final Object next() {
            if (hasNext()) {
                String str = this.f43224b;
                this.f43224b = null;
                C19383o.m32794d(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C19366c(BufferedReader bufferedReader) {
        this.f43223a = bufferedReader;
    }

    public final Iterator<String> iterator() {
        return new C19367a(this);
    }
}
