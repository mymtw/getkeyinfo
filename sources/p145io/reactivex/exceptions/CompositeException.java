package p145io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: io.reactivex.exceptions.CompositeException */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;
    private Throwable cause;
    private final List<Throwable> exceptions;
    private final String message;

    /* renamed from: io.reactivex.exceptions.CompositeException$CompositeExceptionCausalChain */
    public static final class CompositeExceptionCausalChain extends RuntimeException {
        public static final String MESSAGE = "Chain of Causes for CompositeException In Order Received =>";
        private static final long serialVersionUID = 3875212506787802066L;

        public String getMessage() {
            return MESSAGE;
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$a */
    public static abstract class C7093a {
        /* renamed from: a */
        public abstract void mo19417a(String str);
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$b */
    public static final class C7094b extends C7093a {

        /* renamed from: a */
        public final PrintStream f15782a;

        public C7094b(PrintStream printStream) {
            this.f15782a = printStream;
        }

        /* renamed from: a */
        public final void mo19417a(String str) {
            this.f15782a.println(str);
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$c */
    public static final class C7095c extends C7093a {

        /* renamed from: a */
        public final PrintWriter f15783a;

        public C7095c(PrintWriter printWriter) {
            this.f15783a = printWriter;
        }

        /* renamed from: a */
        public final void mo19417a(String str) {
            this.f15783a.println(str);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CompositeException(Throwable... thArr) {
        this((Iterable<? extends Throwable>) thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: a */
    public static void m13752a(StringBuilder sb, Throwable th, String str) {
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement append : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(append);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m13752a(sb, th.getCause(), "");
        }
    }

    /* renamed from: b */
    public final void mo19407b(C7093a aVar) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement append : getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append(10);
        }
        int i = 1;
        for (Throwable a : this.exceptions) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m13752a(sb, a, "\t");
            i++;
        }
        aVar.mo19417a(sb.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|(1:(1:13)(1:(2:14|(1:41)(1:(2:42|17)(1:18)))))(0)|19|(4:22|(2:24|44)(2:25|45)|43|20)|26|27|28|29|40) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.cause     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0074
            io.reactivex.exceptions.CompositeException$CompositeExceptionCausalChain r0 = new io.reactivex.exceptions.CompositeException$CompositeExceptionCausalChain     // Catch:{ all -> 0x0078 }
            r0.<init>()     // Catch:{ all -> 0x0078 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0078 }
            r1.<init>()     // Catch:{ all -> 0x0078 }
            java.util.List<java.lang.Throwable> r2 = r8.exceptions     // Catch:{ all -> 0x0078 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0078 }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0078 }
            if (r4 == 0) goto L_0x0072
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0078 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0078 }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x0078 }
            if (r5 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            r1.add(r4)     // Catch:{ all -> 0x0078 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0078 }
            r5.<init>()     // Catch:{ all -> 0x0078 }
            java.lang.Throwable r6 = r4.getCause()     // Catch:{ all -> 0x0078 }
            if (r6 == 0) goto L_0x0048
            if (r6 != r4) goto L_0x003a
            goto L_0x0048
        L_0x003a:
            r5.add(r6)     // Catch:{ all -> 0x0078 }
            java.lang.Throwable r7 = r6.getCause()     // Catch:{ all -> 0x0078 }
            if (r7 == 0) goto L_0x0048
            if (r7 != r6) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r6 = r7
            goto L_0x003a
        L_0x0048:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0078 }
        L_0x004c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0078 }
            if (r6 == 0) goto L_0x006a
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0078 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0078 }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x0078 }
            if (r7 == 0) goto L_0x0066
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0078 }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x0078 }
            goto L_0x004c
        L_0x0066:
            r1.add(r6)     // Catch:{ all -> 0x0078 }
            goto L_0x004c
        L_0x006a:
            r3.initCause(r4)     // Catch:{ all -> 0x006d }
        L_0x006d:
            java.lang.Throwable r3 = r8.getRootCause(r3)     // Catch:{ all -> 0x0078 }
            goto L_0x0016
        L_0x0072:
            r8.cause = r0     // Catch:{ all -> 0x0078 }
        L_0x0074:
            java.lang.Throwable r0 = r8.cause     // Catch:{ all -> 0x0078 }
            monitor-exit(r8)
            return r0
        L_0x0078:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p145io.reactivex.exceptions.CompositeException.getCause():java.lang.Throwable");
    }

    public List<Throwable> getExceptions() {
        return this.exceptions;
    }

    public String getMessage() {
        return this.message;
    }

    public Throwable getRootCause(Throwable th) {
        Throwable cause2 = th.getCause();
        if (cause2 == null || th == cause2) {
            return th;
        }
        while (true) {
            Throwable cause3 = cause2.getCause();
            if (cause3 == null || cause3 == cause2) {
                return cause2;
            }
            cause2 = cause3;
        }
        return cause2;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public int size() {
        return this.exceptions.size();
    }

    public void printStackTrace(PrintStream printStream) {
        mo19407b(new C7094b(printStream));
    }

    public void printStackTrace(PrintWriter printWriter) {
        mo19407b(new C7095c(printWriter));
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            List<Throwable> unmodifiableList = Collections.unmodifiableList(arrayList);
            this.exceptions = unmodifiableList;
            this.message = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
}
