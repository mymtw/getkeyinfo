package p034c3;

import android.os.Build;
import android.support.p013v4.media.C0069a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;

/* renamed from: c3.u */
public final class C4407u {

    /* renamed from: c3.u$a */
    public static /* synthetic */ class C4408a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9677a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f9678b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f9679c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f9680d;

        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|(2:19|20)|21|23|24|25|27|28|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|(3:43|44|46)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|(2:19|20)|21|23|24|25|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|19|20|21|23|24|25|27|28|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ad */
        static {
            /*
                androidx.work.OutOfQuotaPolicy[] r0 = androidx.work.OutOfQuotaPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9680d = r0
                r1 = 1
                androidx.work.OutOfQuotaPolicy r2 = androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f9680d     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.OutOfQuotaPolicy r3 = androidx.work.OutOfQuotaPolicy.DROP_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                androidx.work.NetworkType[] r2 = androidx.work.NetworkType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f9679c = r2
                androidx.work.NetworkType r3 = androidx.work.NetworkType.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f9679c     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.work.NetworkType r3 = androidx.work.NetworkType.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f9679c     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.work.NetworkType r4 = androidx.work.NetworkType.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                r3 = 4
                int[] r4 = f9679c     // Catch:{ NoSuchFieldError -> 0x004e }
                androidx.work.NetworkType r5 = androidx.work.NetworkType.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                r4 = 5
                int[] r5 = f9679c     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.work.NetworkType r6 = androidx.work.NetworkType.METERED     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                androidx.work.BackoffPolicy[] r5 = androidx.work.BackoffPolicy.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f9678b = r5
                androidx.work.BackoffPolicy r6 = androidx.work.BackoffPolicy.EXPONENTIAL     // Catch:{ NoSuchFieldError -> 0x006a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r5 = f9678b     // Catch:{ NoSuchFieldError -> 0x0074 }
                androidx.work.BackoffPolicy r6 = androidx.work.BackoffPolicy.LINEAR     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                androidx.work.WorkInfo$State[] r5 = androidx.work.WorkInfo$State.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f9677a = r5
                androidx.work.WorkInfo$State r6 = androidx.work.WorkInfo$State.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r1 = f9677a     // Catch:{ NoSuchFieldError -> 0x008f }
                androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo$State.RUNNING     // Catch:{ NoSuchFieldError -> 0x008f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = f9677a     // Catch:{ NoSuchFieldError -> 0x0099 }
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo$State.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = f9677a     // Catch:{ NoSuchFieldError -> 0x00a3 }
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo$State.FAILED     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r0 = f9677a     // Catch:{ NoSuchFieldError -> 0x00ad }
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo$State.BLOCKED     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = f9677a     // Catch:{ NoSuchFieldError -> 0x00b8 }
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo$State.CANCELLED     // Catch:{ NoSuchFieldError -> 0x00b8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b8 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b8 }
            L_0x00b8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p034c3.C4407u.C4408a.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a A[SYNTHETIC, Splitter:B:23:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f A[SYNTHETIC, Splitter:B:34:0x005f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C3378d m10105a(byte[] r7) {
        /*
            androidx.work.d r0 = new androidx.work.d
            r0.<init>()
            if (r7 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0041, all -> 0x003f }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0041, all -> 0x003f }
            int r7 = r2.readInt()     // Catch:{ IOException -> 0x003d }
        L_0x0017:
            if (r7 <= 0) goto L_0x0032
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException -> 0x003d }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x003d }
            boolean r4 = r2.readBoolean()     // Catch:{ IOException -> 0x003d }
            androidx.work.d$a r5 = new androidx.work.d$a     // Catch:{ IOException -> 0x003d }
            r5.<init>(r4, r3)     // Catch:{ IOException -> 0x003d }
            java.util.HashSet r3 = r0.f7894a     // Catch:{ IOException -> 0x003d }
            r3.add(r5)     // Catch:{ IOException -> 0x003d }
            int r7 = r7 + -1
            goto L_0x0017
        L_0x0032:
            r2.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x0052
        L_0x0036:
            r7 = move-exception
            r7.printStackTrace()
            goto L_0x0052
        L_0x003b:
            r7 = move-exception
            goto L_0x005b
        L_0x003d:
            r7 = move-exception
            goto L_0x0045
        L_0x003f:
            r0 = move-exception
            goto L_0x005d
        L_0x0041:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L_0x0045:
            r7.printStackTrace()     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0052
            r2.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0052:
            r1.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x005a
        L_0x0056:
            r7 = move-exception
            r7.printStackTrace()
        L_0x005a:
            return r0
        L_0x005b:
            r0 = r7
            r7 = r2
        L_0x005d:
            if (r7 == 0) goto L_0x0067
            r7.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0067:
            r1.close()     // Catch:{ IOException -> 0x006b }
            goto L_0x006f
        L_0x006b:
            r7 = move-exception
            r7.printStackTrace()
        L_0x006f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c3.C4407u.m10105a(byte[]):androidx.work.d");
    }

    /* renamed from: b */
    public static BackoffPolicy m10106b(int i) {
        if (i == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException(C0069a.m175f("Could not convert ", i, " to BackoffPolicy"));
    }

    /* renamed from: c */
    public static NetworkType m10107c(int i) {
        if (i == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i == 1) {
            return NetworkType.CONNECTED;
        }
        if (i == 2) {
            return NetworkType.UNMETERED;
        }
        if (i == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return NetworkType.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException(C0069a.m175f("Could not convert ", i, " to NetworkType"));
    }

    /* renamed from: d */
    public static OutOfQuotaPolicy m10108d(int i) {
        if (i == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(C0069a.m175f("Could not convert ", i, " to OutOfQuotaPolicy"));
    }

    /* renamed from: e */
    public static WorkInfo$State m10109e(int i) {
        if (i == 0) {
            return WorkInfo$State.ENQUEUED;
        }
        if (i == 1) {
            return WorkInfo$State.RUNNING;
        }
        if (i == 2) {
            return WorkInfo$State.SUCCEEDED;
        }
        if (i == 3) {
            return WorkInfo$State.FAILED;
        }
        if (i == 4) {
            return WorkInfo$State.BLOCKED;
        }
        if (i == 5) {
            return WorkInfo$State.CANCELLED;
        }
        throw new IllegalArgumentException(C0069a.m175f("Could not convert ", i, " to State"));
    }

    /* renamed from: f */
    public static int m10110f(WorkInfo$State workInfo$State) {
        switch (C4408a.f9677a[workInfo$State.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + workInfo$State + " to int");
        }
    }
}
