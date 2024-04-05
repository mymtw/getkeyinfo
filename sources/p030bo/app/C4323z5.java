package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.WebContentUtils;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.C19457k;
import kotlin.text.C19459m;
import org.apache.commons.lang3.ClassUtils;
import p003a2.C0023f;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: bo.app.z5 */
public final class C4323z5 implements C4102q2 {

    /* renamed from: e */
    public static final C4324a f9539e = new C4324a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f9540a;

    /* renamed from: b */
    private final Map<String, String> f9541b;

    /* renamed from: c */
    private final Map<String, String> f9542c = new LinkedHashMap();

    /* renamed from: d */
    private final File f9543d;

    /* renamed from: bo.app.z5$b */
    public /* synthetic */ class C4337b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9560a;

        static {
            int[] iArr = new int[C3964m4.values().length];
            iArr[C3964m4.ZIP.ordinal()] = 1;
            iArr[C3964m4.IMAGE.ordinal()] = 2;
            iArr[C3964m4.FILE.ordinal()] = 3;
            f9560a = iArr;
        }
    }

    /* renamed from: bo.app.z5$c */
    public static final class C4338c extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9561b;

        /* renamed from: c */
        public final /* synthetic */ String f9562c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4338c(String str, String str2) {
            super(0);
            this.f9561b = str;
            this.f9562c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Storing local triggered action html zip asset at local path ");
            h.append(this.f9561b);
            h.append(" for remote path ");
            h.append(this.f9562c);
            return h.toString();
        }
    }

    /* renamed from: bo.app.z5$d */
    public static final class C4339d extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9563b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4339d(String str) {
            super(0);
            this.f9563b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0023f.m110k(C0072d.m201h("Failed to store html zip asset for remote path "), this.f9563b, ". Not storing local asset");
        }
    }

    /* renamed from: bo.app.z5$e */
    public static final class C4340e extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ Uri f9564b;

        /* renamed from: c */
        public final /* synthetic */ String f9565c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4340e(Uri uri, String str) {
            super(0);
            this.f9564b = uri;
            this.f9565c = str;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Storing local triggered action asset at local path ");
            h.append(this.f9564b.getPath());
            h.append(" for remote path ");
            h.append(this.f9565c);
            return h.toString();
        }
    }

    /* renamed from: bo.app.z5$f */
    public static final class C4341f extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9566b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4341f(String str) {
            super(0);
            this.f9566b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C0023f.m110k(C0072d.m201h("Failed to store asset for remote path "), this.f9566b, ". Not storing local asset");
        }
    }

    /* renamed from: bo.app.z5$g */
    public static final class C4342g extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9567b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4342g(String str) {
            super(0);
            this.f9567b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9567b, "Could not download ");
        }
    }

    /* renamed from: bo.app.z5$h */
    public static final class C4343h extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4275x2 f9568b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4343h(C4275x2 x2Var) {
            super(0);
            this.f9568b = x2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9568b.getId(), "Prefetch is turned off for this triggered action. Not retrieving local asset paths. Action id: ");
        }
    }

    /* renamed from: bo.app.z5$i */
    public static final class C4344i extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9569b;

        /* renamed from: c */
        public final /* synthetic */ String f9570c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4344i(String str, String str2) {
            super(0);
            this.f9569b = str;
            this.f9570c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Found local asset at path ");
            h.append(this.f9569b);
            h.append(" for remote asset at path: ");
            h.append(this.f9570c);
            return h.toString();
        }
    }

    /* renamed from: bo.app.z5$j */
    public static final class C4345j extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9571b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4345j(String str) {
            super(0);
            this.f9571b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9571b, "Could not find local asset for remote path ");
        }
    }

    /* renamed from: bo.app.z5$k */
    public static final class C4346k extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ C4275x2 f9572b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4346k(C4275x2 x2Var) {
            super(0);
            this.f9572b = x2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9572b.getId(), "No local assets found for action id: ");
        }
    }

    /* renamed from: bo.app.z5$l */
    public static final class C4347l extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9573b;

        /* renamed from: c */
        public final /* synthetic */ String f9574c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4347l(String str, String str2) {
            super(0);
            this.f9573b = str;
            this.f9574c = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            StringBuilder h = C0072d.m201h("Adding new local path '");
            h.append(this.f9573b);
            h.append("' for remote path '");
            return C0023f.m110k(h, this.f9574c, "' to cache.");
        }
    }

    /* renamed from: bo.app.z5$m */
    public static final class C4348m extends Lambda implements C19846a<String> {

        /* renamed from: b */
        public final /* synthetic */ String f9575b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4348m(String str) {
            super(0);
            this.f9575b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C19383o.m32802l(this.f9575b, "Failed to add new local path for remote path ");
        }
    }

    public C4323z5(Context context, String str) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        C19383o.m32797g(str, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(C19383o.m32802l(str, "com.appboy.storage.triggers.local_assets."), 0);
        C19383o.m32796f(sharedPreferences, "context.getSharedPrefere…ey, Context.MODE_PRIVATE)");
        this.f9540a = sharedPreferences;
        this.f9541b = f9539e.mo14262a(sharedPreferences);
        this.f9543d = new File(C19383o.m32802l("/ab_triggers", context.getCacheDir().getPath()));
    }

    /* renamed from: a */
    public final Map<String, String> mo14261a() {
        return this.f9541b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080 A[Catch:{ Exception -> 0x0099 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo13390a(java.util.List<? extends p030bo.app.C4275x2> r11) {
        /*
            r10 = this;
            java.lang.String r0 = "triggeredActions"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            bo.app.z5$a r0 = f9539e
            kotlin.Pair r11 = r0.mo14263a((java.util.List<? extends p030bo.app.C4275x2>) r11)
            java.lang.Object r1 = r11.component1()
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r11 = r11.component2()
            java.util.Set r11 = (java.util.Set) r11
            android.content.SharedPreferences r2 = r10.f9540a
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "localAssetEditor"
            kotlin.jvm.internal.C19383o.m32796f(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r3 = r10.f9541b
            java.util.Map<java.lang.String, java.lang.String> r4 = r10.f9542c
            r0.mo14265a(r2, r3, r11, r4)
            java.io.File r11 = r10.f9543d
            java.util.Map<java.lang.String, java.lang.String> r3 = r10.f9541b
            java.util.Map<java.lang.String, java.lang.String> r4 = r10.f9542c
            r0.mo14266a(r11, r3, r4)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r0 = r1.iterator()
        L_0x003b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r0.next()
            r3 = r1
            bo.app.l4 r3 = (p030bo.app.C3929l4) r3
            java.util.Map r4 = r10.mo14261a()
            java.lang.String r3 = r3.mo13668b()
            boolean r3 = r4.containsKey(r3)
            if (r3 != 0) goto L_0x003b
            r11.add(r1)
            goto L_0x003b
        L_0x005a:
            java.util.Iterator r11 = r11.iterator()
        L_0x005e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r0 = r11.next()
            bo.app.l4 r0 = (p030bo.app.C3929l4) r0
            java.lang.String r1 = r0.mo13668b()
            java.lang.String r0 = r10.mo14260a((p030bo.app.C3929l4) r0)     // Catch:{ Exception -> 0x0099 }
            if (r0 == 0) goto L_0x007d
            boolean r3 = kotlin.text.C19457k.m33020X0(r0)     // Catch:{ Exception -> 0x0099 }
            if (r3 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r3 = 0
            goto L_0x007e
        L_0x007d:
            r3 = 1
        L_0x007e:
            if (r3 != 0) goto L_0x005e
            com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x0099 }
            r6 = 0
            r7 = 0
            bo.app.z5$l r8 = new bo.app.z5$l     // Catch:{ Exception -> 0x0099 }
            r8.<init>(r0, r1)     // Catch:{ Exception -> 0x0099 }
            r9 = 7
            r5 = r10
            com.braze.support.BrazeLogger.m11282d(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0099 }
            java.util.Map r3 = r10.mo14261a()     // Catch:{ Exception -> 0x0099 }
            r3.put(r1, r0)     // Catch:{ Exception -> 0x0099 }
            r2.putString(r1, r0)     // Catch:{ Exception -> 0x0099 }
            goto L_0x005e
        L_0x0099:
            r0 = move-exception
            r6 = r0
            com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.f11932a
            com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.E
            bo.app.z5$m r7 = new bo.app.z5$m
            r7.<init>(r1)
            r8 = 4
            r4 = r10
            com.braze.support.BrazeLogger.m11282d(r3, r4, r5, r6, r7, r8)
            goto L_0x005e
        L_0x00aa:
            r2.apply()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4323z5.mo13390a(java.util.List):void");
    }

    /* renamed from: bo.app.z5$a */
    public static final class C4324a {

        /* renamed from: bo.app.z5$a$a */
        public static final class C4325a extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ File[] f9544b;

            /* renamed from: bo.app.z5$a$a$a */
            public static final class C4326a extends Lambda implements C19857l<File, CharSequence> {

                /* renamed from: b */
                public static final C4326a f9545b = new C4326a();

                public C4326a() {
                    super(1);
                }

                /* renamed from: a */
                public final CharSequence invoke(File file) {
                    String name = file.getName();
                    C19383o.m32796f(name, "it.name");
                    return name;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4325a(File[] fileArr) {
                super(0);
                this.f9544b = fileArr;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(C19318k.m32616h1(this.f9544b, " , ", C4326a.f9545b, 30), "Local triggered asset directory contains files: ");
            }
        }

        /* renamed from: bo.app.z5$a$b */
        public static final class C4327b extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ File f9546b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4327b(File file) {
                super(0);
                this.f9546b = file;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Deleting obsolete asset '");
                h.append(this.f9546b.getPath());
                h.append("' from filesystem.");
                return h.toString();
            }
        }

        /* renamed from: bo.app.z5$a$c */
        public static final class C4328c extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public static final C4328c f9547b = new C4328c();

            public C4328c() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Exception while deleting obsolete assets from filesystem.";
            }
        }

        /* renamed from: bo.app.z5$a$d */
        public static final class C4329d extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f9548b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4329d(String str) {
                super(0);
                this.f9548b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Not removing local path for remote path ");
                h.append(this.f9548b);
                h.append(" from cache because it is being preserved until the end of the app run.");
                return h.toString();
            }
        }

        /* renamed from: bo.app.z5$a$e */
        public static final class C4330e extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f9549b;

            /* renamed from: c */
            public final /* synthetic */ String f9550c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4330e(String str, String str2) {
                super(0);
                this.f9549b = str;
                this.f9550c = str2;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Removing obsolete local path ");
                h.append(this.f9549b);
                h.append(" for obsolete remote path ");
                h.append(this.f9550c);
                h.append(" from cache.");
                return h.toString();
            }
        }

        /* renamed from: bo.app.z5$a$f */
        public static final class C4331f extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ File f9551b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4331f(File file) {
                super(0);
                this.f9551b = file;
            }

            /* renamed from: a */
            public final String invoke() {
                return C19383o.m32802l(this.f9551b.getAbsolutePath(), "Deleting triggers directory at: ");
            }
        }

        /* renamed from: bo.app.z5$a$g */
        public static final class C4332g extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ Ref$ObjectRef<String> f9552b;

            /* renamed from: c */
            public final /* synthetic */ String f9553c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4332g(Ref$ObjectRef<String> ref$ObjectRef, String str) {
                super(0);
                this.f9552b = ref$ObjectRef;
                this.f9553c = str;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Using file extension ");
                h.append((String) this.f9552b.element);
                h.append(" for remote asset url: ");
                h.append(this.f9553c);
                return h.toString();
            }
        }

        /* renamed from: bo.app.z5$a$h */
        public static final class C4333h extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f9554b;

            /* renamed from: c */
            public final /* synthetic */ String f9555c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4333h(String str, String str2) {
                super(0);
                this.f9554b = str;
                this.f9555c = str2;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Retrieving trigger local asset path '");
                h.append(this.f9554b);
                h.append("' from local storage for remote path '");
                h.append(this.f9555c);
                h.append('\'');
                return h.toString();
            }
        }

        /* renamed from: bo.app.z5$a$i */
        public static final class C4334i extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ String f9556b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4334i(String str) {
                super(0);
                this.f9556b = str;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Encountered unexpected exception while parsing stored triggered action local assets on remote asset '");
                h.append(this.f9556b);
                h.append('\'');
                return h.toString();
            }
        }

        /* renamed from: bo.app.z5$a$j */
        public static final class C4335j extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ C4275x2 f9557b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4335j(C4275x2 x2Var) {
                super(0);
                this.f9557b = x2Var;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Pre-fetch off for triggered action ");
                h.append(this.f9557b.getId());
                h.append(". Not pre-fetching assets.");
                return h.toString();
            }
        }

        /* renamed from: bo.app.z5$a$k */
        public static final class C4336k extends Lambda implements C19846a<String> {

            /* renamed from: b */
            public final /* synthetic */ C4275x2 f9558b;

            /* renamed from: c */
            public final /* synthetic */ String f9559c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4336k(C4275x2 x2Var, String str) {
                super(0);
                this.f9558b = x2Var;
                this.f9559c = str;
            }

            /* renamed from: a */
            public final String invoke() {
                StringBuilder h = C0072d.m201h("Received new remote path for triggered action ");
                h.append(this.f9558b.getId());
                h.append(" at ");
                return C0391c.m1057c(h, this.f9559c, ClassUtils.PACKAGE_SEPARATOR_CHAR);
            }
        }

        private C4324a() {
        }

        public /* synthetic */ C4324a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo14264a(Context context) {
            C19383o.m32797g(context, ResponseConstants.CONTEXT);
            File file = new File(context.getCacheDir(), "ab_triggers");
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4331f(file), 6);
            BrazeFileUtils.m11237a(file);
        }

        /* renamed from: b */
        public final String mo14268b(String str) {
            int n1;
            C19383o.m32797g(str, "remoteAssetUrl");
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = "";
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String lastPathSegment = parse.getLastPathSegment();
                if (!(lastPathSegment == null || lastPathSegment.length() == 0) && (n1 = C19459m.m33045n1(lastPathSegment, ClassUtils.PACKAGE_SEPARATOR_CHAR, 0, 6)) > -1) {
                    T substring = lastPathSegment.substring(n1);
                    C19383o.m32796f(substring, "this as java.lang.String).substring(startIndex)");
                    ref$ObjectRef.element = substring;
                    BrazeLogger.m11282d(BrazeLogger.f11932a, C4323z5.f9539e, BrazeLogger.Priority.V, (Throwable) null, new C4332g(ref$ObjectRef, str), 6);
                }
            }
            return IntentUtils.m11307b() + ((String) ref$ObjectRef.element);
        }

        /* renamed from: a */
        public final void mo14266a(File file, Map<String, String> map, Map<String, String> map2) {
            C19383o.m32797g(file, "triggeredAssetDirectory");
            C19383o.m32797g(map, "remoteToLocalAssetsMap");
            C19383o.m32797g(map2, "preservedLocalAssetMap");
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.V, (Throwable) null, new C4325a(listFiles), 6);
                try {
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    int length = listFiles.length;
                    while (i < length) {
                        File file2 = listFiles[i];
                        i++;
                        if (!map.containsValue(file2.getPath())) {
                            arrayList.add(file2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (!map2.containsValue(((File) next).getPath())) {
                            arrayList2.add(next);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        File file3 = (File) it2.next();
                        BrazeLogger.m11282d(BrazeLogger.f11932a, C4323z5.f9539e, (BrazeLogger.Priority) null, (Throwable) null, new C4327b(file3), 7);
                        C19383o.m32796f(file3, "obsoleteFile");
                        BrazeFileUtils.m11237a(file3);
                    }
                } catch (Exception e) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.E, e, C4328c.f9547b, 4);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0046 A[Catch:{ Exception -> 0x005d }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0027 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.util.Map<java.lang.String, java.lang.String> mo14262a(android.content.SharedPreferences r14) {
            /*
                r13 = this;
                java.lang.String r0 = "storagePrefs"
                kotlin.jvm.internal.C19383o.m32797g(r14, r0)
                java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
                r0.<init>()
                java.util.Map r1 = r14.getAll()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x001b
                boolean r4 = r1.isEmpty()
                if (r4 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r4 = r2
                goto L_0x001c
            L_0x001b:
                r4 = r3
            L_0x001c:
                if (r4 == 0) goto L_0x001f
                return r0
            L_0x001f:
                java.util.Set r1 = r1.keySet()
                java.util.Iterator r1 = r1.iterator()
            L_0x0027:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto L_0x006e
                java.lang.Object r4 = r1.next()
                java.lang.String r4 = (java.lang.String) r4
                r5 = 0
                java.lang.String r5 = r14.getString(r4, r5)     // Catch:{ Exception -> 0x005d }
                if (r5 == 0) goto L_0x0043
                boolean r6 = kotlin.text.C19457k.m33020X0(r5)     // Catch:{ Exception -> 0x005d }
                if (r6 == 0) goto L_0x0041
                goto L_0x0043
            L_0x0041:
                r6 = r2
                goto L_0x0044
            L_0x0043:
                r6 = r3
            L_0x0044:
                if (r6 != 0) goto L_0x0027
                com.braze.support.BrazeLogger r7 = com.braze.support.BrazeLogger.f11932a     // Catch:{ Exception -> 0x005d }
                r9 = 0
                r10 = 0
                bo.app.z5$a$h r11 = new bo.app.z5$a$h     // Catch:{ Exception -> 0x005d }
                r11.<init>(r5, r4)     // Catch:{ Exception -> 0x005d }
                r12 = 7
                r8 = r13
                com.braze.support.BrazeLogger.m11282d(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x005d }
                java.lang.String r6 = "remoteAssetKey"
                kotlin.jvm.internal.C19383o.m32796f(r4, r6)     // Catch:{ Exception -> 0x005d }
                r0.put(r4, r5)     // Catch:{ Exception -> 0x005d }
                goto L_0x0027
            L_0x005d:
                r5 = move-exception
                r9 = r5
                com.braze.support.BrazeLogger r6 = com.braze.support.BrazeLogger.f11932a
                com.braze.support.BrazeLogger$Priority r8 = com.braze.support.BrazeLogger.Priority.E
                bo.app.z5$a$i r10 = new bo.app.z5$a$i
                r10.<init>(r4)
                r11 = 4
                r7 = r13
                com.braze.support.BrazeLogger.m11282d(r6, r7, r8, r9, r10, r11)
                goto L_0x0027
            L_0x006e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C4323z5.C4324a.mo14262a(android.content.SharedPreferences):java.util.Map");
        }

        /* renamed from: a */
        public final void mo14265a(SharedPreferences.Editor editor, Map<String, String> map, Set<String> set, Map<String, String> map2) {
            C19383o.m32797g(editor, "editor");
            C19383o.m32797g(map, "localAssetPaths");
            C19383o.m32797g(set, "newRemotePathStrings");
            C19383o.m32797g(map2, "preservedLocalAssetPathMap");
            Iterator it = new HashSet(map.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (map2.containsKey(str)) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4329d(str), 7);
                } else if (!set.contains(str)) {
                    map.remove(str);
                    editor.remove(str);
                    String str2 = map.get(str);
                    if (!(str2 == null || C19457k.m33020X0(str2))) {
                        BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4330e(str2, str), 7);
                        BrazeFileUtils.m11237a(new File(str2));
                    }
                }
            }
        }

        /* renamed from: a */
        public final boolean mo14267a(String str) {
            C19383o.m32797g(str, ResponseConstants.PATH);
            return new File(str).exists();
        }

        /* renamed from: a */
        public final Pair<Set<C3929l4>, Set<String>> mo14263a(List<? extends C4275x2> list) {
            C19383o.m32797g(list, "triggeredActions");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (C4275x2 x2Var : list) {
                if (!x2Var.mo13683m()) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4335j(x2Var), 7);
                } else {
                    for (C3929l4 next : x2Var.mo13246b()) {
                        String b = next.mo13668b();
                        if (!C19457k.m33020X0(b)) {
                            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4336k(x2Var, b), 7);
                            linkedHashSet.add(next);
                            linkedHashSet2.add(b);
                        }
                    }
                }
            }
            return new Pair<>(linkedHashSet, linkedHashSet2);
        }
    }

    /* renamed from: a */
    public Map<String, String> mo13912a(C4275x2 x2Var) {
        C19383o.m32797g(x2Var, "triggeredAction");
        if (!x2Var.mo13683m()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4343h(x2Var), 7);
            return C19294b0.m32559p0();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C3929l4 b : x2Var.mo13246b()) {
            String b2 = b.mo13668b();
            String str = this.f9541b.get(b2);
            if (str == null || !f9539e.mo14267a(str)) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C4345j(b2), 6);
            } else {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4344i(str, b2), 7);
                this.f9542c.put(b2, str);
                linkedHashMap.put(b2, str);
            }
        }
        if (linkedHashMap.isEmpty()) {
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.W, (Throwable) null, new C4346k(x2Var), 6);
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final String mo14260a(C3929l4 l4Var) {
        C19383o.m32797g(l4Var, "remotePath");
        String b = l4Var.mo13668b();
        int i = C4337b.f9560a[l4Var.mo13667a().ordinal()];
        boolean z = true;
        if (i == 1) {
            String b2 = WebContentUtils.m11364b(this.f9543d, b);
            if (b2 != null && !C19457k.m33020X0(b2)) {
                z = false;
            }
            if (!z) {
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C4338c(b2, b), 6);
                return b2;
            }
            BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4339d(b), 7);
            return null;
        } else if (i == 2 || i == 3) {
            String b3 = f9539e.mo14268b(b);
            try {
                String file = this.f9543d.toString();
                C19383o.m32796f(file, "triggeredAssetDirectory.toString()");
                Uri fromFile = Uri.fromFile(BrazeFileUtils.m11238b(file, b, b3, (String) null));
                if (fromFile != null) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, this, BrazeLogger.Priority.I, (Throwable) null, new C4340e(fromFile, b), 6);
                    return fromFile.getPath();
                }
                BrazeLogger.m11282d(BrazeLogger.f11932a, this, (BrazeLogger.Priority) null, (Throwable) null, new C4341f(b), 7);
                return null;
            } catch (Exception e) {
                BrazeLogger brazeLogger = BrazeLogger.f11932a;
                BrazeLogger.Priority priority = BrazeLogger.Priority.E;
                C4342g gVar = new C4342g(b);
                BrazeLogger.m11282d(brazeLogger, this, priority, e, gVar, 4);
                return null;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
