package com.facebook.bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;

public final class AggregateException extends Exception {
    public static final C12244a Companion = new C12244a();
    private static final long serialVersionUID = 1;
    private final List<Throwable> innerThrowables;

    /* renamed from: com.facebook.bolts.AggregateException$a */
    public static final class C12244a {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AggregateException(String str, List<? extends Throwable> list) {
        super(str, (list == null || !(list.isEmpty() ^ true)) ? null : (Throwable) list.get(0));
        List<Throwable> unmodifiableList = Collections.unmodifiableList(list == null ? EmptyList.INSTANCE : list);
        C19383o.m32796f(unmodifiableList, "Collections.unmodifiable…hrowables ?: emptyList())");
        this.innerThrowables = unmodifiableList;
    }

    public void printStackTrace(PrintStream printStream) {
        C19383o.m32797g(printStream, "err");
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable next : this.innerThrowables) {
            printStream.append("\n");
            printStream.append("  Inner throwable #");
            i++;
            printStream.append(String.valueOf(i));
            printStream.append(": ");
            if (next != null) {
                next.printStackTrace(printStream);
            }
            printStream.append("\n");
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        C19383o.m32797g(printWriter, "err");
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable next : this.innerThrowables) {
            printWriter.append("\n");
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append(String.valueOf(i));
            printWriter.append(": ");
            if (next != null) {
                next.printStackTrace(printWriter);
            }
            printWriter.append("\n");
        }
    }
}
