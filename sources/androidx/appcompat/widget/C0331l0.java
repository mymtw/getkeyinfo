package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.p013v4.media.C0073e;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cursoradapter.widget.ResourceCursorAdapter;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.widget.l0 */
public final class C0331l0 extends ResourceCursorAdapter implements View.OnClickListener {

    /* renamed from: o */
    public static final /* synthetic */ int f833o = 0;

    /* renamed from: b */
    public final SearchView f834b;

    /* renamed from: c */
    public final SearchableInfo f835c;

    /* renamed from: d */
    public final Context f836d;

    /* renamed from: e */
    public final WeakHashMap<String, Drawable.ConstantState> f837e;

    /* renamed from: f */
    public final int f838f;

    /* renamed from: g */
    public int f839g = 1;

    /* renamed from: h */
    public ColorStateList f840h;

    /* renamed from: i */
    public int f841i = -1;

    /* renamed from: j */
    public int f842j = -1;

    /* renamed from: k */
    public int f843k = -1;

    /* renamed from: l */
    public int f844l = -1;

    /* renamed from: m */
    public int f845m = -1;

    /* renamed from: n */
    public int f846n = -1;

    /* renamed from: androidx.appcompat.widget.l0$a */
    public static final class C0332a {

        /* renamed from: a */
        public final TextView f847a;

        /* renamed from: b */
        public final TextView f848b;

        /* renamed from: c */
        public final ImageView f849c;

        /* renamed from: d */
        public final ImageView f850d;

        /* renamed from: e */
        public final ImageView f851e;

        public C0332a(View view) {
            this.f847a = (TextView) view.findViewById(16908308);
            this.f848b = (TextView) view.findViewById(16908309);
            this.f849c = (ImageView) view.findViewById(16908295);
            this.f850d = (ImageView) view.findViewById(16908296);
            this.f851e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public C0331l0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f834b = searchView;
        this.f835c = searchableInfo;
        this.f838f = searchView.getSuggestionCommitIconResId();
        this.f836d = context;
        this.f837e = weakHashMap;
    }

    /* renamed from: d */
    public static String m876d(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: a */
    public final Drawable mo3079a(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f836d.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(C0073e.m206f("Single path segment is not a resource ID: ", uri));
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException(C0073e.m206f("More than two path segments: ", uri));
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException(C0073e.m206f("No resource found for: ", uri));
                }
                throw new FileNotFoundException(C0073e.m206f("No path: ", uri));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(C0073e.m206f("No package found for authority: ", uri));
            }
        } else {
            throw new FileNotFoundException(C0073e.m206f("No authority: ", uri));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b6, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00a0 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable mo3080b(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            r1 = 0
            if (r8 == 0) goto L_0x013c
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x013c
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0015
            goto L_0x013c
        L_0x0015:
            int r2 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r4 = "android.resource://"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.content.Context r4 = r7.f836d     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.f837e     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            if (r4 != 0) goto L_0x0044
            r4 = r1
            goto L_0x0048
        L_0x0044:
            android.graphics.drawable.Drawable r4 = r4.newDrawable()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
        L_0x0048:
            if (r4 == 0) goto L_0x004b
            return r4
        L_0x004b:
            android.content.Context r4 = r7.f836d     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.Object r5 = p260v0.C8184a.f17966a     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.graphics.drawable.Drawable r2 = p260v0.C8184a.C8187c.m16466b(r4, r2)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            if (r2 == 0) goto L_0x005e
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.f837e     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.graphics.drawable.Drawable$ConstantState r5 = r2.getConstantState()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r4.put(r3, r5)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
        L_0x005e:
            return r2
        L_0x005f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon resource not found: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            android.util.Log.w(r0, r8)
            return r1
        L_0x0074:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r2 = r7.f837e
            java.lang.Object r2 = r2.get(r8)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L_0x0080
            r2 = r1
            goto L_0x0084
        L_0x0080:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L_0x0084:
            if (r2 == 0) goto L_0x0087
            return r2
        L_0x0087:
            android.net.Uri r2 = android.net.Uri.parse(r8)
            java.lang.String r3 = "Error closing icon stream for "
            java.lang.String r4 = r2.getScheme()     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.String r5 = "android.resource"
            boolean r4 = r5.equals(r4)     // Catch:{ FileNotFoundException -> 0x0110 }
            if (r4 == 0) goto L_0x00b7
            android.graphics.drawable.Drawable r0 = r7.mo3079a(r2)     // Catch:{ NotFoundException -> 0x00a0 }
            r1 = r0
            goto L_0x0131
        L_0x00a0:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0110 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.String r5 = "Resource does not exist: "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0110 }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0110 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0110 }
            throw r3     // Catch:{ FileNotFoundException -> 0x0110 }
        L_0x00b7:
            android.content.Context r4 = r7.f836d     // Catch:{ FileNotFoundException -> 0x0110 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0110 }
            java.io.InputStream r4 = r4.openInputStream(r2)     // Catch:{ FileNotFoundException -> 0x0110 }
            if (r4 == 0) goto L_0x00f9
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r4, r1)     // Catch:{ all -> 0x00e0 }
            r4.close()     // Catch:{ IOException -> 0x00cb }
            goto L_0x00de
        L_0x00cb:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0110 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0110 }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x0110 }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x0110 }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x0110 }
        L_0x00de:
            r1 = r5
            goto L_0x0131
        L_0x00e0:
            r5 = move-exception
            r4.close()     // Catch:{ IOException -> 0x00e5 }
            goto L_0x00f8
        L_0x00e5:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0110 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0110 }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x0110 }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x0110 }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x0110 }
        L_0x00f8:
            throw r5     // Catch:{ FileNotFoundException -> 0x0110 }
        L_0x00f9:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0110 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.String r5 = "Failed to open "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0110 }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x0110 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0110 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0110 }
            throw r3     // Catch:{ FileNotFoundException -> 0x0110 }
        L_0x0110:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Icon not found: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", "
            r4.append(r2)
            java.lang.String r2 = r3.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r0, r2)
        L_0x0131:
            if (r1 == 0) goto L_0x013c
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r7.f837e
            android.graphics.drawable.Drawable$ConstantState r2 = r1.getConstantState()
            r0.put(r8, r2)
        L_0x013c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0331l0.mo3080b(java.lang.String):android.graphics.drawable.Drawable");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r20
            java.lang.Object r0 = r18.getTag()
            r3 = r0
            androidx.appcompat.widget.l0$a r3 = (androidx.appcompat.widget.C0331l0.C0332a) r3
            int r0 = r1.f846n
            r4 = -1
            r5 = 0
            if (r0 == r4) goto L_0x0017
            int r0 = r2.getInt(r0)
            r4 = r0
            goto L_0x0018
        L_0x0017:
            r4 = r5
        L_0x0018:
            android.widget.TextView r0 = r3.f847a
            r6 = 8
            if (r0 == 0) goto L_0x0036
            int r0 = r1.f841i
            java.lang.String r0 = m876d(r2, r0)
            android.widget.TextView r7 = r3.f847a
            r7.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0033
            r7.setVisibility(r6)
            goto L_0x0036
        L_0x0033:
            r7.setVisibility(r5)
        L_0x0036:
            android.widget.TextView r0 = r3.f848b
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x00bf
            int r0 = r1.f843k
            java.lang.String r0 = m876d(r2, r0)
            if (r0 == 0) goto L_0x0086
            android.content.res.ColorStateList r9 = r1.f840h
            if (r9 != 0) goto L_0x0067
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            android.content.Context r10 = r1.f836d
            android.content.res.Resources$Theme r10 = r10.getTheme()
            r11 = 2130970040(0x7f0405b8, float:1.7548779E38)
            r10.resolveAttribute(r11, r9, r8)
            android.content.Context r10 = r1.f836d
            android.content.res.Resources r10 = r10.getResources()
            int r9 = r9.resourceId
            android.content.res.ColorStateList r9 = r10.getColorStateList(r9)
            r1.f840h = r9
        L_0x0067:
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r11 = 0
            r12 = 0
            r13 = 0
            android.content.res.ColorStateList r14 = r1.f840h
            r16 = 0
            r10 = r15
            r6 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            int r0 = r0.length()
            r10 = 33
            r9.setSpan(r6, r5, r0, r10)
            goto L_0x008c
        L_0x0086:
            int r0 = r1.f842j
            java.lang.String r9 = m876d(r2, r0)
        L_0x008c:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x009f
            android.widget.TextView r0 = r3.f847a
            if (r0 == 0) goto L_0x00ab
            r0.setSingleLine(r5)
            android.widget.TextView r0 = r3.f847a
            r0.setMaxLines(r7)
            goto L_0x00ab
        L_0x009f:
            android.widget.TextView r0 = r3.f847a
            if (r0 == 0) goto L_0x00ab
            r0.setSingleLine(r8)
            android.widget.TextView r0 = r3.f847a
            r0.setMaxLines(r8)
        L_0x00ab:
            android.widget.TextView r0 = r3.f848b
            r0.setText(r9)
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            if (r6 == 0) goto L_0x00bc
            r6 = 8
            r0.setVisibility(r6)
            goto L_0x00bf
        L_0x00bc:
            r0.setVisibility(r5)
        L_0x00bf:
            android.widget.ImageView r6 = r3.f849c
            if (r6 == 0) goto L_0x0170
            int r0 = r1.f844l
            r9 = -1
            if (r0 != r9) goto L_0x00cb
            r0 = 0
            goto L_0x015d
        L_0x00cb:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.mo3080b(r0)
            if (r0 == 0) goto L_0x00d7
            goto L_0x015d
        L_0x00d7:
            android.app.SearchableInfo r0 = r1.f835c
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r9 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r10 = r1.f837e
            boolean r10 = r10.containsKey(r9)
            if (r10 == 0) goto L_0x0100
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f837e
            java.lang.Object r0 = r0.get(r9)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f5
            r0 = 0
            goto L_0x0150
        L_0x00f5:
            android.content.Context r9 = r1.f836d
            android.content.res.Resources r9 = r9.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r9)
            goto L_0x0150
        L_0x0100:
            java.lang.String r10 = "SuggestionsAdapter"
            android.content.Context r11 = r1.f836d
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            r12 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r12 = r11.getActivityInfo(r0, r12)     // Catch:{ NameNotFoundException -> 0x0138 }
            int r13 = r12.getIconResource()
            if (r13 != 0) goto L_0x0115
            goto L_0x0141
        L_0x0115:
            java.lang.String r14 = r0.getPackageName()
            android.content.pm.ApplicationInfo r12 = r12.applicationInfo
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r14, r13, r12)
            if (r11 != 0) goto L_0x0142
            java.lang.String r11 = "Invalid icon resource "
            java.lang.String r12 = " for "
            java.lang.StringBuilder r11 = android.support.p013v4.media.C0069a.m177h(r11, r13, r12)
            java.lang.String r0 = r0.flattenToShortString()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            android.util.Log.w(r10, r0)
            goto L_0x0141
        L_0x0138:
            r0 = move-exception
            r11 = r0
            java.lang.String r0 = r11.toString()
            android.util.Log.w(r10, r0)
        L_0x0141:
            r11 = 0
        L_0x0142:
            if (r11 != 0) goto L_0x0146
            r0 = 0
            goto L_0x014a
        L_0x0146:
            android.graphics.drawable.Drawable$ConstantState r0 = r11.getConstantState()
        L_0x014a:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r10 = r1.f837e
            r10.put(r9, r0)
            r0 = r11
        L_0x0150:
            if (r0 == 0) goto L_0x0153
            goto L_0x015d
        L_0x0153:
            android.content.Context r0 = r1.f836d
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x015d:
            r9 = 4
            r6.setImageDrawable(r0)
            if (r0 != 0) goto L_0x0167
            r6.setVisibility(r9)
            goto L_0x0170
        L_0x0167:
            r6.setVisibility(r5)
            r0.setVisible(r5, r5)
            r0.setVisible(r8, r5)
        L_0x0170:
            android.widget.ImageView r0 = r3.f850d
            if (r0 == 0) goto L_0x0197
            int r6 = r1.f845m
            r9 = -1
            if (r6 != r9) goto L_0x017b
            r2 = 0
            goto L_0x0183
        L_0x017b:
            java.lang.String r2 = r2.getString(r6)
            android.graphics.drawable.Drawable r2 = r1.mo3080b(r2)
        L_0x0183:
            r0.setImageDrawable(r2)
            if (r2 != 0) goto L_0x018e
            r6 = 8
            r0.setVisibility(r6)
            goto L_0x0197
        L_0x018e:
            r0.setVisibility(r5)
            r2.setVisible(r5, r5)
            r2.setVisible(r8, r5)
        L_0x0197:
            int r0 = r1.f839g
            if (r0 == r7) goto L_0x01aa
            if (r0 != r8) goto L_0x01a2
            r0 = r4 & 1
            if (r0 == 0) goto L_0x01a2
            goto L_0x01aa
        L_0x01a2:
            android.widget.ImageView r0 = r3.f851e
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x01bf
        L_0x01aa:
            android.widget.ImageView r0 = r3.f851e
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r3.f851e
            android.widget.TextView r2 = r3.f847a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.f851e
            r0.setOnClickListener(r1)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0331l0.bindView(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    /* renamed from: c */
    public final Cursor mo3082c(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(ResponseConstants.CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        Uri build = fragment.build();
        return this.f836d.getContentResolver().query(build, (String[]) null, suggestSelection, strArr, (String) null);
    }

    public final void changeCursor(Cursor cursor) {
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.f841i = cursor.getColumnIndex("suggest_text_1");
                this.f842j = cursor.getColumnIndex("suggest_text_2");
                this.f843k = cursor.getColumnIndex("suggest_text_2_url");
                this.f844l = cursor.getColumnIndex("suggest_icon_1");
                this.f845m = cursor.getColumnIndex("suggest_icon_2");
                this.f846n = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public final CharSequence convertToString(Cursor cursor) {
        String d;
        String d2;
        if (cursor == null) {
            return null;
        }
        String d3 = m876d(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (d3 != null) {
            return d3;
        }
        if (this.f835c.shouldRewriteQueryFromData() && (d2 = m876d(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return d2;
        }
        if (!this.f835c.shouldRewriteQueryFromText() || (d = m876d(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return d;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View newDropDownView = newDropDownView(this.f836d, getCursor(), viewGroup);
            if (newDropDownView != null) {
                ((C0332a) newDropDownView.getTag()).f847a.setText(e.toString());
            }
            return newDropDownView;
        }
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View newView = newView(this.f836d, getCursor(), viewGroup);
            ((C0332a) newView.getTag()).f847a.setText(e.toString());
            return newView;
        }
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View newView = super.newView(context, cursor, viewGroup);
        newView.setTag(new C0332a(newView));
        ((ImageView) newView.findViewById(R.id.edit_query)).setImageResource(this.f838f);
        return newView;
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = getCursor();
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = getCursor();
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f834b.onQueryRefine((CharSequence) tag);
        }
    }

    public final Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f834b.getVisibility() == 0 && this.f834b.getWindowVisibility() == 0) {
            try {
                Cursor c = mo3082c(this.f835c, charSequence2);
                if (c != null) {
                    c.getCount();
                    return c;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }
}
