package com.bumptech.glide.load.engine;

import android.support.p013v4.media.C0072d;
import android.util.Log;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p150j4.C7109b;

public final class GlideException extends Exception {

    /* renamed from: b */
    public static final StackTraceElement[] f12842b = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    private Exception exception;
    private C7109b key;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    /* renamed from: a */
    public static void m11861a(Throwable th, ArrayList arrayList) {
        if (th instanceof GlideException) {
            for (Throwable a : ((GlideException) th).getCauses()) {
                m11861a(a, arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    /* renamed from: b */
    public static void m11862b(List list, C5991a aVar) {
        try {
            m11863c(list, aVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static void m11863c(List list, C5991a aVar) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            aVar.append((CharSequence) "Cause (");
            int i2 = i + 1;
            aVar.append((CharSequence) String.valueOf(i2));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                GlideException glideException = (GlideException) th;
                glideException.getClass();
                m11864d(glideException, aVar);
                m11862b(glideException.getCauses(), new C5991a(aVar));
            } else {
                m11864d(th, aVar);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    public static void m11864d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        String str3 = "";
        if (this.dataClass != null) {
            StringBuilder h = C0072d.m201h(", ");
            h.append(this.dataClass);
            str = h.toString();
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.dataSource != null) {
            StringBuilder h2 = C0072d.m201h(", ");
            h2.append(this.dataSource);
            str2 = h2.toString();
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.key != null) {
            StringBuilder h3 = C0072d.m201h(", ");
            h3.append(this.key);
            str3 = h3.toString();
        }
        sb.append(str3);
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            sb.append(" root causes:");
        }
        for (Throwable next : rootCauses) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public Exception getOrigin() {
        return this.exception;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        m11861a(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i = 0;
        while (i < size) {
            StringBuilder h = C0072d.m201h("Root cause (");
            int i2 = i + 1;
            h.append(i2);
            h.append(" of ");
            h.append(size);
            h.append(")");
            Log.i(str, h.toString(), rootCauses.get(i));
            i = i2;
        }
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void setLoggingDetails(C7109b bVar, DataSource dataSource2) {
        setLoggingDetails(bVar, dataSource2, (Class<?>) null);
    }

    public void setOrigin(Exception exc) {
        this.exception = exc;
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public void printStackTrace(PrintStream printStream) {
        m11864d(this, printStream);
        m11862b(getCauses(), new C5991a(printStream));
    }

    public void setLoggingDetails(C7109b bVar, DataSource dataSource2, Class<?> cls) {
        this.key = bVar;
        this.dataSource = dataSource2;
        this.dataClass = cls;
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f12842b);
        this.causes = list;
    }

    public void printStackTrace(PrintWriter printWriter) {
        m11864d(this, printWriter);
        m11862b(getCauses(), new C5991a(printWriter));
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    public static final class C5991a implements Appendable {

        /* renamed from: b */
        public final Appendable f12843b;

        /* renamed from: c */
        public boolean f12844c = true;

        public C5991a(Appendable appendable) {
            this.f12843b = appendable;
        }

        public final Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.f12844c) {
                this.f12844c = false;
                this.f12843b.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f12844c = z;
            this.f12843b.append(c);
            return this;
        }

        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.f12844c) {
                this.f12844c = false;
                this.f12843b.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f12844c = z;
            this.f12843b.append(charSequence, i, i2);
            return this;
        }
    }
}
