package p478x9;

import android.net.Uri;
import android.support.p013v4.media.C0072d;
import android.text.TextUtils;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.deeplinks.EtsyAction;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyDeepLinkId;
import com.etsy.android.lib.util.CrashUtil;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import p010a9.C0048b;

/* renamed from: x9.f */
public final class C13858f {

    /* renamed from: e */
    public static final Pattern f30484e = Pattern.compile("your/purchases/[0-9]+/review/([0-9]+)");

    /* renamed from: f */
    public static final Pattern f30485f = Pattern.compile("([a-z-]+/)?transaction/([0-9]+)$");

    /* renamed from: g */
    public static final Pattern f30486g = Pattern.compile("([a-z-]+/)?your/purchases/([0-9]+)$");

    /* renamed from: h */
    public static final Pattern f30487h = Pattern.compile("([a-z-]+/)?your/orders/([0-9]+)/order_tracking/([0-9]+)$");

    /* renamed from: i */
    public static final Pattern f30488i = Pattern.compile("([a-z-]+/)?conversations/new$");

    /* renamed from: j */
    public static final Pattern f30489j = Pattern.compile("([a-z-]+/)?conversations/([0-9]+)$");

    /* renamed from: a */
    public DeepLinkEntity f30490a;

    /* renamed from: b */
    public EtsyDeepLinkId f30491b;

    /* renamed from: c */
    public C13858f f30492c;

    /* renamed from: d */
    public final HashMap<String, String> f30493d;

    /* renamed from: x9.f$a */
    public static /* synthetic */ class C13859a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30494a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.etsy.android.lib.deeplinks.DeepLinkEntity[] r0 = com.etsy.android.lib.deeplinks.DeepLinkEntity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30494a = r0
                com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP_POLICY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30494a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP_ABOUT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30494a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP_REVIEWS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30494a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FAVORITE_ITEMS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30494a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FAVORITE_SHOPS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30494a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FAVORITE_SEARCHES     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30494a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FAVORITES     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p478x9.C13858f.C13859a.<clinit>():void");
        }
    }

    public C13858f(DeepLinkEntity deepLinkEntity, String str) {
        this.f30491b = new EtsyDeepLinkId();
        this.f30493d = new HashMap<>();
        this.f30491b.checkIdTypeAndSet(str);
        this.f30490a = deepLinkEntity;
    }

    @Deprecated
    /* renamed from: a */
    public static C13858f m21391a(Uri uri) {
        if (uri == null) {
            return null;
        }
        C13858f fVar = new C13858f(uri);
        if (fVar.f30490a != null) {
            return fVar;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        if (p478x9.C13858f.C13859a.f30494a[r2.ordinal()] == 7) goto L_0x0033;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.etsy.android.lib.deeplinks.DeepLinkEntity m21392c(com.etsy.android.lib.deeplinks.DeepLinkEntity r1, java.util.List r2, int r3) {
        /*
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            com.etsy.android.lib.deeplinks.DeepLinkEntity r2 = com.etsy.android.lib.deeplinks.DeepLinkEntity.fromEntityName(r2)
            if (r2 == 0) goto L_0x006c
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP
            if (r1 != r3) goto L_0x002b
            int[] r1 = p478x9.C13858f.C13859a.f30494a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x0028
            r2 = 2
            if (r1 == r2) goto L_0x0025
            r2 = 3
            if (r1 == r2) goto L_0x0022
            goto L_0x006c
        L_0x0022:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP_REVIEWS
            goto L_0x006d
        L_0x0025:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP_ABOUT
            goto L_0x006d
        L_0x0028:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.SHOP_POLICY
            goto L_0x006d
        L_0x002b:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.LISTING
            if (r1 != r3) goto L_0x0035
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.LISTINGS_SIMILAR
            if (r2 != r3) goto L_0x0035
        L_0x0033:
            r1 = r3
            goto L_0x006d
        L_0x0035:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.YOUR
            if (r1 != r3) goto L_0x003e
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.PURCHASES
            if (r2 != r3) goto L_0x003e
            goto L_0x0033
        L_0x003e:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r3 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FAVORITES
            if (r1 != r3) goto L_0x005d
            int[] r1 = p478x9.C13858f.C13859a.f30494a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 4
            if (r1 == r2) goto L_0x005a
            r2 = 5
            if (r1 == r2) goto L_0x0057
            r2 = 6
            if (r1 == r2) goto L_0x0054
            goto L_0x006c
        L_0x0054:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FAVORITE_SEARCHES
            goto L_0x006d
        L_0x0057:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FAVORITE_SHOPS
            goto L_0x006d
        L_0x005a:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.FAVORITE_ITEMS
            goto L_0x006d
        L_0x005d:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r0 = com.etsy.android.lib.deeplinks.DeepLinkEntity.PEOPLE
            if (r1 != r0) goto L_0x006c
            int[] r1 = p478x9.C13858f.C13859a.f30494a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 7
            if (r1 == r2) goto L_0x0033
        L_0x006c:
            r1 = 0
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p478x9.C13858f.m21392c(com.etsy.android.lib.deeplinks.DeepLinkEntity, java.util.List, int):com.etsy.android.lib.deeplinks.DeepLinkEntity");
    }

    /* renamed from: b */
    public final int mo46688b(DeepLinkEntity deepLinkEntity, List<String> list, int i) {
        if (deepLinkEntity == DeepLinkEntity.BROWSE || deepLinkEntity == DeepLinkEntity.TAXONOMY_CATEGORY || deepLinkEntity == DeepLinkEntity.SEARCH) {
            StringBuilder sb = new StringBuilder();
            while (i < list.size()) {
                int i2 = i + 1;
                String str = list.get(i);
                if (str.equals(ResponseConstants.HANDMADE) || str.equals("vintage")) {
                    this.f30493d.put("marketplace", str);
                } else {
                    if (sb.length() != 0) {
                        sb.append(".");
                    }
                    sb.append(str);
                }
                i = i2;
            }
            this.f30491b.setName(sb.toString());
            return i;
        }
        if (deepLinkEntity != DeepLinkEntity.SHOP_LISTING_FAVORITES && deepLinkEntity != DeepLinkEntity.SHOP_FAVORITES) {
            this.f30491b.checkIdTypeAndSet(list.get(i));
        } else if (list.size() == 2) {
            this.f30491b.checkIdTypeAndSet(list.get(i + 1));
            return i + 2;
        } else if (list.size() != 1 || !list.get(0).contains("/")) {
            StringBuilder h = C0072d.m201h("Notification object id incorrect. Entity: ");
            h.append(deepLinkEntity.getEntityName());
            h.append(" index=");
            h.append(i);
            h.append(" segments: ");
            String sb2 = h.toString();
            for (String a : list) {
                sb2 = C0048b.m163a(sb2, a, ", ");
            }
            CrashUtil.m17307a().mo30457b(new Throwable(sb2));
            return i + list.size();
        } else {
            this.f30491b.checkIdTypeAndSet(list.get(0).split("/")[1]);
        }
        return i + 1;
    }

    /* renamed from: d */
    public final void mo46689d(Uri uri) {
        DeepLinkEntity deepLinkEntity;
        DeepLinkEntity c;
        DeepLinkEntity c2;
        List<String> pathSegments = uri.getPathSegments();
        if (TextUtils.isEmpty(uri.getHost())) {
            this.f30490a = DeepLinkEntity.HOME;
        } else {
            this.f30490a = DeepLinkEntity.fromEntityName(uri.getHost());
        }
        if (pathSegments != null && pathSegments.size() > 0) {
            int i = 0;
            DeepLinkEntity deepLinkEntity2 = this.f30490a;
            if (!(deepLinkEntity2 == null || !deepLinkEntity2.equals(DeepLinkEntity.YOUR) || (c2 = m21392c(this.f30490a, pathSegments, 0)) == null)) {
                this.f30490a = c2;
                i = 1;
            }
            DeepLinkEntity deepLinkEntity3 = this.f30490a;
            if (!(deepLinkEntity3 == null || !deepLinkEntity3.equals(DeepLinkEntity.FAVORITES) || (c = m21392c(this.f30490a, pathSegments, i)) == null)) {
                this.f30490a = c;
            }
            int b = mo46688b(this.f30490a, pathSegments, i);
            EtsyAction.fromType(uri.getQueryParameter("app_action"));
            if (pathSegments.size() > b) {
                Uri.Builder builder = new Uri.Builder();
                builder.scheme("etsy").authority(pathSegments.get(b));
                for (int i2 = b + 1; i2 < pathSegments.size(); i2++) {
                    builder.appendPath(pathSegments.get(i2));
                }
                builder.encodedQuery(uri.getEncodedQuery());
                this.f30492c = m21391a(builder.build());
            }
        }
        for (String next : uri.getQueryParameterNames()) {
            this.f30493d.put(next, uri.getQueryParameter(next));
        }
        C13858f fVar = this.f30492c;
        if (fVar != null && fVar.f30490a == (deepLinkEntity = DeepLinkEntity.LISTINGS_SIMILAR)) {
            this.f30490a = deepLinkEntity;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x022f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C13858f(android.net.Uri r11) {
        /*
            r10 = this;
            r10.<init>()
            com.etsy.android.lib.models.datatypes.EtsyDeepLinkId r0 = new com.etsy.android.lib.models.datatypes.EtsyDeepLinkId
            r0.<init>()
            r10.f30491b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r10.f30493d = r0
            java.lang.String r1 = r11.getScheme()
            java.util.List<java.lang.String> r2 = com.etsy.android.lib.util.C8915n.f19672a
            java.lang.String r2 = "etsy"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0024
            r10.mo46689d(r11)
            goto L_0x028f
        L_0x0024:
            java.lang.String r1 = r11.getScheme()
            boolean r1 = com.etsy.android.lib.util.C8915n.m17355g(r1)
            if (r1 == 0) goto L_0x0280
            java.lang.String r1 = r11.getHost()
            boolean r1 = com.etsy.android.lib.util.C8915n.m17353e(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0059
            java.lang.String r1 = r11.getHost()
            boolean r4 = com.etsy.android.lib.util.C8885d0.m17323g(r1)
            if (r4 == 0) goto L_0x0054
            java.lang.String r4 = "etsy.bttn.io"
            boolean r5 = r4.equalsIgnoreCase(r1)
            if (r5 != 0) goto L_0x0052
            boolean r1 = com.etsy.android.lib.util.C8915n.m17354f(r1, r4)
            if (r1 == 0) goto L_0x0054
        L_0x0052:
            r1 = r3
            goto L_0x0055
        L_0x0054:
            r1 = r2
        L_0x0055:
            if (r1 != 0) goto L_0x0059
            goto L_0x028f
        L_0x0059:
            java.util.List r1 = r11.getPathSegments()
            if (r1 != 0) goto L_0x0061
            goto L_0x028f
        L_0x0061:
            java.lang.String r4 = "/"
            java.lang.String r4 = org.apache.commons.lang3.StringUtils.join((java.lang.Iterable<?>) r1, (java.lang.String) r4)
            java.util.regex.Pattern r5 = f30488i
            java.util.regex.Matcher r5 = r5.matcher(r4)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L_0x0099
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CONVERSATIONS
            r10.f30490a = r1
            com.etsy.android.lib.models.datatypes.EtsyDeepLinkId r1 = new com.etsy.android.lib.models.datatypes.EtsyDeepLinkId
            java.lang.String r2 = "new"
            r1.<init>((java.lang.String) r2)
            r10.f30491b = r1
            java.lang.String r1 = "with_id"
            java.lang.String r1 = r11.getQueryParameter(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x024c
            com.etsy.android.lib.deeplinks.DeepLinkEntity r2 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CONVERSATION_COMPOSE
            com.etsy.android.lib.deeplinks.EtsyAction$a r3 = com.etsy.android.lib.deeplinks.EtsyAction.Companion
            x9.f r3 = new x9.f
            r3.<init>(r2, r1)
            r10.f30492c = r3
            goto L_0x024c
        L_0x0099:
            java.util.regex.Pattern r5 = f30489j
            java.util.regex.Matcher r5 = r5.matcher(r4)
            boolean r6 = r5.matches()
            r7 = 2
            if (r6 == 0) goto L_0x00bb
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CONVERSATIONS
            r10.f30490a = r1
            com.etsy.android.lib.models.datatypes.EtsyDeepLinkId r1 = new com.etsy.android.lib.models.datatypes.EtsyDeepLinkId
            java.lang.String r2 = r5.group(r7)
            long r2 = java.lang.Long.parseLong(r2)
            r1.<init>((long) r2)
            r10.f30491b = r1
            goto L_0x024c
        L_0x00bb:
            java.util.regex.Pattern r5 = f30486g
            java.util.regex.Matcher r5 = r5.matcher(r4)
            boolean r6 = r5.matches()
            if (r6 == 0) goto L_0x00dc
            com.etsy.android.lib.models.datatypes.EtsyDeepLinkId r1 = new com.etsy.android.lib.models.datatypes.EtsyDeepLinkId
            java.lang.String r2 = r5.group(r7)
            long r2 = java.lang.Long.parseLong(r2)
            r1.<init>((long) r2)
            r10.f30491b = r1
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.ORDER
            r10.f30490a = r1
            goto L_0x024c
        L_0x00dc:
            java.util.regex.Pattern r5 = f30487h
            java.util.regex.Matcher r5 = r5.matcher(r4)
            boolean r6 = r5.matches()
            r8 = 3
            if (r6 == 0) goto L_0x010d
            com.etsy.android.lib.models.datatypes.EtsyDeepLinkId r11 = new com.etsy.android.lib.models.datatypes.EtsyDeepLinkId
            java.lang.String r0 = r5.group(r7)
            long r0 = java.lang.Long.parseLong(r0)
            r11.<init>((long) r0)
            r10.f30491b = r11
            com.etsy.android.lib.deeplinks.DeepLinkEntity r11 = com.etsy.android.lib.deeplinks.DeepLinkEntity.ORDER
            r10.f30490a = r11
            com.etsy.android.lib.deeplinks.DeepLinkEntity r11 = com.etsy.android.lib.deeplinks.DeepLinkEntity.TRACK_ORDER
            java.lang.String r0 = r5.group(r8)
            com.etsy.android.lib.deeplinks.EtsyAction$a r1 = com.etsy.android.lib.deeplinks.EtsyAction.Companion
            x9.f r1 = new x9.f
            r1.<init>(r11, r0)
            r10.f30492c = r1
            goto L_0x028f
        L_0x010d:
            java.util.regex.Pattern r5 = f30484e
            java.util.regex.Matcher r5 = r5.matcher(r4)
            boolean r6 = r5.matches()
            if (r6 == 0) goto L_0x012e
            com.etsy.android.lib.models.datatypes.EtsyDeepLinkId r11 = new com.etsy.android.lib.models.datatypes.EtsyDeepLinkId
            java.lang.String r0 = r5.group(r3)
            long r0 = java.lang.Long.parseLong(r0)
            r11.<init>((long) r0)
            r10.f30491b = r11
            com.etsy.android.lib.deeplinks.DeepLinkEntity r11 = com.etsy.android.lib.deeplinks.DeepLinkEntity.COMPOSE_REVIEW
            r10.f30490a = r11
            goto L_0x028f
        L_0x012e:
            java.util.regex.Pattern r5 = f30485f
            java.util.regex.Matcher r4 = r5.matcher(r4)
            boolean r5 = r4.matches()
            if (r5 == 0) goto L_0x014f
            com.etsy.android.lib.models.datatypes.EtsyDeepLinkId r11 = new com.etsy.android.lib.models.datatypes.EtsyDeepLinkId
            java.lang.String r0 = r4.group(r7)
            long r0 = java.lang.Long.parseLong(r0)
            r11.<init>((long) r0)
            r10.f30491b = r11
            com.etsy.android.lib.deeplinks.DeepLinkEntity r11 = com.etsy.android.lib.deeplinks.DeepLinkEntity.TRANSACTION
            r10.f30490a = r11
            goto L_0x028f
        L_0x014f:
            int r4 = r1.size()
            if (r4 <= 0) goto L_0x0248
            java.lang.Object r4 = r1.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            com.etsy.android.lib.deeplinks.DeepLinkEntity r5 = com.etsy.android.lib.deeplinks.DeepLinkEntity.fromEntityName(r4)
            r10.f30490a = r5
            java.lang.String r6 = "buyonetsy"
            if (r5 != 0) goto L_0x01f1
            int r5 = r4.length()
            if (r5 != r7) goto L_0x017f
            char r5 = r4.charAt(r2)
            boolean r5 = java.lang.Character.isLetter(r5)
            if (r5 == 0) goto L_0x017f
            char r5 = r4.charAt(r3)
            boolean r5 = java.lang.Character.isLetter(r5)
            if (r5 != 0) goto L_0x01b7
        L_0x017f:
            int r5 = r4.length()
            r9 = 5
            if (r5 != r9) goto L_0x01b8
            char r5 = r4.charAt(r2)
            boolean r5 = java.lang.Character.isLetter(r5)
            if (r5 == 0) goto L_0x01b8
            char r5 = r4.charAt(r3)
            boolean r5 = java.lang.Character.isLetter(r5)
            if (r5 == 0) goto L_0x01b8
            char r5 = r4.charAt(r7)
            r9 = 45
            if (r5 != r9) goto L_0x01b8
            char r5 = r4.charAt(r8)
            boolean r5 = java.lang.Character.isLetter(r5)
            if (r5 == 0) goto L_0x01b8
            r5 = 4
            char r5 = r4.charAt(r5)
            boolean r5 = java.lang.Character.isLetter(r5)
            if (r5 == 0) goto L_0x01b8
        L_0x01b7:
            r2 = r3
        L_0x01b8:
            if (r2 == 0) goto L_0x01f1
            int r2 = r1.size()
            if (r2 <= r3) goto L_0x01ed
            int r2 = r1.size()
            if (r2 <= r7) goto L_0x01e0
            java.lang.Object r2 = r1.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x01e0
            java.lang.Object r2 = r1.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            com.etsy.android.lib.deeplinks.DeepLinkEntity r2 = com.etsy.android.lib.deeplinks.DeepLinkEntity.fromEntityName(r2)
            r10.f30490a = r2
            r7 = r8
            goto L_0x01f2
        L_0x01e0:
            java.lang.Object r2 = r1.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            com.etsy.android.lib.deeplinks.DeepLinkEntity r2 = com.etsy.android.lib.deeplinks.DeepLinkEntity.fromEntityName(r2)
            r10.f30490a = r2
            goto L_0x01f2
        L_0x01ed:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r2 = com.etsy.android.lib.deeplinks.DeepLinkEntity.HOME
            r10.f30490a = r2
        L_0x01f1:
            r7 = r3
        L_0x01f2:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r2 = r10.f30490a
            if (r2 != 0) goto L_0x0215
            boolean r2 = r4.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x0215
            int r2 = r1.size()
            if (r2 <= r3) goto L_0x0211
            int r7 = r7 + 1
            java.lang.Object r2 = r1.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            com.etsy.android.lib.deeplinks.DeepLinkEntity r2 = com.etsy.android.lib.deeplinks.DeepLinkEntity.fromEntityName(r2)
            r10.f30490a = r2
            goto L_0x0215
        L_0x0211:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r2 = com.etsy.android.lib.deeplinks.DeepLinkEntity.HOME
            r10.f30490a = r2
        L_0x0215:
            int r2 = r1.size()
            if (r2 <= r7) goto L_0x0229
            com.etsy.android.lib.deeplinks.DeepLinkEntity r2 = r10.f30490a
            if (r2 == 0) goto L_0x0229
            com.etsy.android.lib.deeplinks.DeepLinkEntity r2 = m21392c(r2, r1, r7)
            if (r2 == 0) goto L_0x0229
            r10.f30490a = r2
            int r7 = r7 + 1
        L_0x0229:
            int r2 = r1.size()
            if (r2 <= r7) goto L_0x0235
            com.etsy.android.lib.deeplinks.DeepLinkEntity r2 = r10.f30490a
            int r7 = r10.mo46688b(r2, r1, r7)
        L_0x0235:
            int r2 = r1.size()
            if (r2 <= r7) goto L_0x024c
            com.etsy.android.lib.deeplinks.DeepLinkEntity r2 = r10.f30490a
            if (r2 == 0) goto L_0x024c
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = m21392c(r2, r1, r7)
            if (r1 == 0) goto L_0x024c
            r10.f30490a = r1
            goto L_0x024c
        L_0x0248:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = com.etsy.android.lib.deeplinks.DeepLinkEntity.HOME
            r10.f30490a = r1
        L_0x024c:
            com.etsy.android.lib.deeplinks.DeepLinkEntity r1 = r10.f30490a
            if (r1 == 0) goto L_0x0262
            com.etsy.android.lib.deeplinks.DeepLinkEntity r2 = com.etsy.android.lib.deeplinks.DeepLinkEntity.CYBER_WEEK_SALES
            if (r1 != r2) goto L_0x0262
            java.lang.String r1 = "page_type"
            java.lang.String r2 = "explore"
            r0.put(r1, r2)
            java.lang.String r1 = "api_path"
            java.lang.String r2 = "/etsyapps/v3/bespoke/public/boe/seasonal-sale/cyber-week"
            r0.put(r1, r2)
        L_0x0262:
            java.util.Set r0 = r11.getQueryParameterNames()
            java.util.Iterator r0 = r0.iterator()
        L_0x026a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x028f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r10.f30493d
            java.lang.String r3 = r11.getQueryParameter(r1)
            r2.put(r1, r3)
            goto L_0x026a
        L_0x0280:
            java.lang.String r0 = r11.getScheme()
            java.lang.String r1 = "etsybeta"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x028f
            r10.mo46689d(r11)
        L_0x028f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p478x9.C13858f.<init>(android.net.Uri):void");
    }
}
