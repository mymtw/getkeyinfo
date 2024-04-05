package kotlin.p752io;

import com.google.android.gms.common.api.Api;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C19286a;
import kotlin.jvm.internal.C19383o;
import kotlin.sequences.C19431g;

/* renamed from: kotlin.io.a */
public final class C19357a implements C19431g<File> {

    /* renamed from: a */
    public final File f43206a;

    /* renamed from: b */
    public final FileWalkDirection f43207b;

    /* renamed from: c */
    public final int f43208c = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: kotlin.io.a$a */
    public static abstract class C19358a extends C19364c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19358a(File file) {
            super(file);
            C19383o.m32797g(file, "rootDir");
        }
    }

    /* renamed from: kotlin.io.a$b */
    public final class C19359b extends C19286a<File> {

        /* renamed from: d */
        public final ArrayDeque<C19364c> f43209d;

        /* renamed from: kotlin.io.a$b$a */
        public final class C19360a extends C19358a {

            /* renamed from: b */
            public boolean f43211b;

            /* renamed from: c */
            public File[] f43212c;

            /* renamed from: d */
            public int f43213d;

            /* renamed from: e */
            public boolean f43214e;

            /* renamed from: f */
            public final /* synthetic */ C19359b f43215f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19360a(C19359b bVar, File file) {
                super(file);
                C19383o.m32797g(file, "rootDir");
                this.f43215f = bVar;
            }

            /* renamed from: a */
            public final File mo71841a() {
                if (!this.f43214e && this.f43212c == null) {
                    C19357a.this.getClass();
                    File[] listFiles = this.f43222a.listFiles();
                    this.f43212c = listFiles;
                    if (listFiles == null) {
                        C19357a.this.getClass();
                        this.f43214e = true;
                    }
                }
                File[] fileArr = this.f43212c;
                if (fileArr != null) {
                    int i = this.f43213d;
                    C19383o.m32794d(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f43212c;
                        C19383o.m32794d(fileArr2);
                        int i2 = this.f43213d;
                        this.f43213d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f43211b) {
                    this.f43211b = true;
                    return this.f43222a;
                }
                C19357a.this.getClass();
                return null;
            }
        }

        /* renamed from: kotlin.io.a$b$b */
        public final class C19361b extends C19364c {

            /* renamed from: b */
            public boolean f43216b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19361b(File file) {
                super(file);
                C19383o.m32797g(file, "rootFile");
            }

            /* renamed from: a */
            public final File mo71841a() {
                if (this.f43216b) {
                    return null;
                }
                this.f43216b = true;
                return this.f43222a;
            }
        }

        /* renamed from: kotlin.io.a$b$c */
        public final class C19362c extends C19358a {

            /* renamed from: b */
            public boolean f43217b;

            /* renamed from: c */
            public File[] f43218c;

            /* renamed from: d */
            public int f43219d;

            /* renamed from: e */
            public final /* synthetic */ C19359b f43220e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19362c(C19359b bVar, File file) {
                super(file);
                C19383o.m32797g(file, "rootDir");
                this.f43220e = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
                if (r0.length == 0) goto L_0x0046;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.io.File mo71841a() {
                /*
                    r3 = this;
                    boolean r0 = r3.f43217b
                    if (r0 != 0) goto L_0x0011
                    kotlin.io.a$b r0 = r3.f43220e
                    kotlin.io.a r0 = kotlin.p752io.C19357a.this
                    r0.getClass()
                    r0 = 1
                    r3.f43217b = r0
                    java.io.File r0 = r3.f43222a
                    return r0
                L_0x0011:
                    java.io.File[] r0 = r3.f43218c
                    r1 = 0
                    if (r0 == 0) goto L_0x0027
                    int r2 = r3.f43219d
                    kotlin.jvm.internal.C19383o.m32794d(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x001f
                    goto L_0x0027
                L_0x001f:
                    kotlin.io.a$b r0 = r3.f43220e
                    kotlin.io.a r0 = kotlin.p752io.C19357a.this
                    r0.getClass()
                    return r1
                L_0x0027:
                    java.io.File[] r0 = r3.f43218c
                    if (r0 != 0) goto L_0x004e
                    java.io.File r0 = r3.f43222a
                    java.io.File[] r0 = r0.listFiles()
                    r3.f43218c = r0
                    if (r0 != 0) goto L_0x003c
                    kotlin.io.a$b r0 = r3.f43220e
                    kotlin.io.a r0 = kotlin.p752io.C19357a.this
                    r0.getClass()
                L_0x003c:
                    java.io.File[] r0 = r3.f43218c
                    if (r0 == 0) goto L_0x0046
                    kotlin.jvm.internal.C19383o.m32794d(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x004e
                L_0x0046:
                    kotlin.io.a$b r0 = r3.f43220e
                    kotlin.io.a r0 = kotlin.p752io.C19357a.this
                    r0.getClass()
                    return r1
                L_0x004e:
                    java.io.File[] r0 = r3.f43218c
                    kotlin.jvm.internal.C19383o.m32794d(r0)
                    int r1 = r3.f43219d
                    int r2 = r1 + 1
                    r3.f43219d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.p752io.C19357a.C19359b.C19362c.mo71841a():java.io.File");
            }
        }

        /* renamed from: kotlin.io.a$b$d */
        public /* synthetic */ class C19363d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f43221a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                f43221a = iArr;
            }
        }

        public C19359b() {
            ArrayDeque<C19364c> arrayDeque = new ArrayDeque<>();
            this.f43209d = arrayDeque;
            if (C19357a.this.f43206a.isDirectory()) {
                arrayDeque.push(mo71840d(C19357a.this.f43206a));
            } else if (C19357a.this.f43206a.isFile()) {
                arrayDeque.push(new C19361b(C19357a.this.f43206a));
            } else {
                mo71571b();
            }
        }

        /* renamed from: a */
        public final void mo71570a() {
            File file;
            File a;
            while (true) {
                C19364c peek = this.f43209d.peek();
                if (peek == null) {
                    file = null;
                    break;
                }
                a = peek.mo71841a();
                if (a == null) {
                    this.f43209d.pop();
                } else if (C19383o.m32792b(a, peek.f43222a) || !a.isDirectory() || this.f43209d.size() >= C19357a.this.f43208c) {
                    file = a;
                } else {
                    this.f43209d.push(mo71840d(a));
                }
            }
            file = a;
            if (file != null) {
                mo71572c(file);
            } else {
                mo71571b();
            }
        }

        /* renamed from: d */
        public final C19358a mo71840d(File file) {
            int i = C19363d.f43221a[C19357a.this.f43207b.ordinal()];
            if (i == 1) {
                return new C19362c(this, file);
            }
            if (i == 2) {
                return new C19360a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: kotlin.io.a$c */
    public static abstract class C19364c {

        /* renamed from: a */
        public final File f43222a;

        public C19364c(File file) {
            C19383o.m32797g(file, "root");
            this.f43222a = file;
        }

        /* renamed from: a */
        public abstract File mo71841a();
    }

    public C19357a(File file, FileWalkDirection fileWalkDirection) {
        this.f43206a = file;
        this.f43207b = fileWalkDirection;
    }

    public final Iterator<File> iterator() {
        return new C19359b();
    }
}
