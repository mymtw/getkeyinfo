package com.braze.support;

import android.content.Context;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.braze.support.BrazeLogger;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonPointer;
import com.paypal.pyplcheckout.userprofile.model.UserStateKt;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.C19421p;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import org.apache.commons.lang3.ClassUtils;
import p568fn.C17782b;
import p753kq.C19846a;

public final class WebContentUtils {

    /* renamed from: a */
    public static final WebContentUtils f11994a = new WebContentUtils();

    /* renamed from: com.braze.support.WebContentUtils$a */
    public static final class C5609a extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5609a f11995b = new C5609a();

        public C5609a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Remote zip url is empty. No local URL will be created.";
        }
    }

    /* renamed from: com.braze.support.WebContentUtils$b */
    public static final class C5610b extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11996b;

        /* renamed from: c */
        public final /* synthetic */ String f11997c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5610b(String str, String str2) {
            super(0);
            this.f11996b = str;
            this.f11997c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Starting download of url: ");
            h.append(this.f11996b);
            h.append(" to ");
            h.append(this.f11997c);
            return h.toString();
        }
    }

    /* renamed from: com.braze.support.WebContentUtils$c */
    public static final class C5611c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f11998b;

        /* renamed from: c */
        public final /* synthetic */ String f11999c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5611c(String str, String str2) {
            super(0);
            this.f11998b = str;
            this.f11999c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Html content zip downloaded. ");
            h.append(this.f11998b);
            h.append(" to ");
            h.append(this.f11999c);
            return h.toString();
        }
    }

    /* renamed from: com.braze.support.WebContentUtils$d */
    public static final class C5612d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5612d f12000b = new C5612d();

        public C5612d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Error during the zip unpack.";
        }
    }

    /* renamed from: com.braze.support.WebContentUtils$e */
    public static final class C5613e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f12001b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5613e(String str) {
            super(0);
            this.f12001b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0391c.m1057c(C0072d.m201h("Html content zip unpacked to to "), this.f12001b, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: com.braze.support.WebContentUtils$f */
    public static final class C5614f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f12002b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5614f(String str) {
            super(0);
            this.f12002b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f12002b, "Could not download zip file to local storage. ");
        }
    }

    /* renamed from: com.braze.support.WebContentUtils$g */
    public static final class C5615g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Ref$ObjectRef<String> f12003b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5615g(Ref$ObjectRef<String> ref$ObjectRef) {
            super(0);
            this.f12003b = ref$ObjectRef;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f12003b.element, "Cannot find local asset file at path: ");
        }
    }

    /* renamed from: com.braze.support.WebContentUtils$h */
    public static final class C5616h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f12004b;

        /* renamed from: c */
        public final /* synthetic */ Ref$ObjectRef<String> f12005c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5616h(String str, Ref$ObjectRef<String> ref$ObjectRef) {
            super(0);
            this.f12004b = str;
            this.f12005c = ref$ObjectRef;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Replacing remote url \"");
            h.append(this.f12004b);
            h.append("\" with local uri \"");
            return C0391c.m1057c(h, (String) this.f12005c.element, JsonFactory.DEFAULT_QUOTE_CHAR);
        }
    }

    /* renamed from: com.braze.support.WebContentUtils$i */
    final class C5617i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public static final C5617i f12006b = new C5617i();

        public C5617i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unpack directory is blank. Zip file not unpacked.";
        }
    }

    /* renamed from: com.braze.support.WebContentUtils$j */
    final class C5618j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Ref$ObjectRef<String> f12007b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5618j(Ref$ObjectRef<String> ref$ObjectRef) {
            super(0);
            this.f12007b = ref$ObjectRef;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f12007b.element, "Error creating parent directory ");
        }
    }

    /* renamed from: com.braze.support.WebContentUtils$k */
    final class C5619k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Ref$ObjectRef<String> f12008b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5619k(Ref$ObjectRef<String> ref$ObjectRef) {
            super(0);
            this.f12008b = ref$ObjectRef;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f12008b.element, "Error unpacking zipEntry ");
        }
    }

    /* renamed from: com.braze.support.WebContentUtils$l */
    final class C5620l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ File f12009b;

        /* renamed from: c */
        public final /* synthetic */ String f12010c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5620l(File file, String str) {
            super(0);
            this.f12009b = file;
            this.f12010c = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Error during unpack of zip file ");
            h.append(this.f12009b.getAbsolutePath());
            h.append(" to ");
            return C0391c.m1057c(h, this.f12010c, ClassUtils.PACKAGE_SEPARATOR_CHAR);
        }
    }

    /* renamed from: a */
    public static final File m11363a(Context context) {
        return new File(context.getCacheDir().getPath() + JsonPointer.SEPARATOR + "appboy-html-inapp-messages");
    }

    /* renamed from: b */
    public static final String m11364b(File file, String str) {
        Throwable th;
        String str2 = str;
        C19383o.m32797g(file, "localDirectory");
        C19383o.m32797g(str2, "remoteZipUrl");
        if (C19457k.m33020X0(str)) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11994a, BrazeLogger.Priority.W, (Throwable) null, C5609a.f11995b, 6);
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        String valueOf = String.valueOf(IntentUtils.m11307b());
        String str3 = absolutePath + JsonPointer.SEPARATOR + valueOf;
        BrazeLogger brazeLogger = BrazeLogger.f11932a;
        WebContentUtils webContentUtils = f11994a;
        BrazeLogger.m11282d(brazeLogger, webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, new C5610b(str2, str3), 7);
        try {
            File b = BrazeFileUtils.m11238b(str3, str2, valueOf, ".zip");
            BrazeLogger.m11282d(brazeLogger, webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, new C5611c(str2, str3), 7);
            boolean z = false;
            if (C19457k.m33020X0(str3)) {
                BrazeLogger.m11282d(brazeLogger, webContentUtils, BrazeLogger.Priority.I, (Throwable) null, C5617i.f12006b, 6);
            } else {
                new File(str3).mkdirs();
                try {
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(b));
                    try {
                        for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                            T name = nextEntry.getName();
                            C19383o.m32796f(name, "zipEntry.name");
                            ref$ObjectRef.element = name;
                            Locale locale = Locale.US;
                            C19383o.m32796f(locale, UserStateKt.US_COUNTRY);
                            String lowerCase = name.toLowerCase(locale);
                            C19383o.m32796f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                            if (!C19457k.m33025c1(lowerCase, "__macosx", false)) {
                                try {
                                    String d = m11366d(str3, str3 + JsonPointer.SEPARATOR + ((String) ref$ObjectRef.element));
                                    if (nextEntry.isDirectory()) {
                                        new File(d).mkdirs();
                                    } else {
                                        try {
                                            File parentFile = new File(d).getParentFile();
                                            if (parentFile != null) {
                                                parentFile.mkdirs();
                                            }
                                        } catch (Exception e) {
                                            BrazeLogger.m11282d(BrazeLogger.f11932a, f11994a, BrazeLogger.Priority.E, e, new C5618j(ref$ObjectRef), 4);
                                        }
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(d));
                                        try {
                                            C17782b.m29848N(zipInputStream, bufferedOutputStream, 8192);
                                            C19421p.m32917E(bufferedOutputStream, (Throwable) null);
                                        } catch (Throwable th2) {
                                            Throwable th3 = th2;
                                            C19421p.m32917E(bufferedOutputStream, th);
                                            throw th3;
                                        }
                                    }
                                } catch (Exception e2) {
                                    BrazeLogger.m11282d(BrazeLogger.f11932a, f11994a, BrazeLogger.Priority.E, e2, new C5619k(ref$ObjectRef), 4);
                                }
                            }
                            zipInputStream.closeEntry();
                        }
                        C19394m mVar = C19394m.f43287a;
                        C19421p.m32917E(zipInputStream, (Throwable) null);
                        z = true;
                    } finally {
                        Exception exc = e2;
                        try {
                        } catch (Throwable th4) {
                            Throwable th5 = th4;
                            C19421p.m32917E(zipInputStream, exc);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, f11994a, BrazeLogger.Priority.E, th6, new C5620l(b, str3), 4);
                }
            }
            if (!z) {
                BrazeLogger.m11282d(brazeLogger, webContentUtils, BrazeLogger.Priority.W, (Throwable) null, C5612d.f12000b, 6);
                BrazeFileUtils.m11237a(new File(str3));
                return null;
            }
            BrazeLogger.m11282d(brazeLogger, webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, new C5613e(str3), 7);
            return str3;
        } catch (Exception e3) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, f11994a, BrazeLogger.Priority.E, e3, new C5614f(str2), 4);
            BrazeFileUtils.m11237a(new File(str3));
            return null;
        }
    }

    /* renamed from: c */
    public static final String m11365c(String str, Map<String, String> map) {
        C19383o.m32797g(map, "remoteToLocalAssetMap");
        for (Map.Entry next : map.entrySet()) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = next.getValue();
            if (!new File((String) ref$ObjectRef.element).exists()) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, f11994a, BrazeLogger.Priority.W, (Throwable) null, new C5615g(ref$ObjectRef), 6);
            } else {
                WebContentUtils webContentUtils = f11994a;
                ref$ObjectRef.element = C19457k.m33025c1((String) ref$ObjectRef.element, "file://", false) ? (String) ref$ObjectRef.element : C19383o.m32802l(ref$ObjectRef.element, "file://");
                String str2 = (String) next.getKey();
                if (C19459m.m33036e1(str, str2, false)) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, new C5616h(str2, ref$ObjectRef), 7);
                    str = C19457k.m33023a1(str, str2, (String) ref$ObjectRef.element, false);
                }
            }
        }
        return str;
    }

    /* renamed from: d */
    public static final String m11366d(String str, String str2) {
        C19383o.m32797g(str2, "childFilePath");
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalPath2 = new File(str2).getCanonicalPath();
        C19383o.m32796f(canonicalPath2, "childFileCanonicalPath");
        C19383o.m32796f(canonicalPath, "parentCanonicalPath");
        if (C19457k.m33025c1(canonicalPath2, canonicalPath, false)) {
            return canonicalPath2;
        }
        throw new IllegalStateException("Invalid file with original path: " + str2 + " with canonical path: " + canonicalPath2 + " does not exist under intended parent with  path: " + str + " and canonical path: " + canonicalPath);
    }
}
