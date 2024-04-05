package com.etsy.android.uikit.viewholder;

import com.etsy.android.R;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.config.C8623e;
import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.jvm.internal.C19383o;

public abstract class ListingCardViewHolderOptions {

    /* renamed from: a */
    public final int f26584a = R.attr.clg_color_text_status_primary;

    /* renamed from: b */
    public final AdIndicator f26585b = AdIndicator.BADGE;

    /* renamed from: c */
    public final boolean f26586c;

    /* renamed from: d */
    public final boolean f26587d;

    public enum AdIndicator {
        BADGE,
        LABEL
    }

    public static final class ShopHome extends ListingCardViewHolderOptions {

        /* renamed from: e */
        public final String f26588e;

        /* renamed from: f */
        public final boolean f26589f = true;

        /* renamed from: g */
        public final boolean f26590g = true;

        /* renamed from: h */
        public final boolean f26591h = true;

        /* renamed from: i */
        public final boolean f26592i = true;

        /* renamed from: j */
        public final boolean f26593j = true;

        /* renamed from: k */
        public final int f26594k = R.attr.clg_color_text_urgency;

        /* renamed from: l */
        public final boolean f26595l = true;

        /* renamed from: m */
        public final boolean f26596m = true;

        /* renamed from: n */
        public final boolean f26597n = true;

        /* renamed from: o */
        public final boolean f26598o = true;

        /* renamed from: p */
        public final C19285c f26599p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ShopHome(String str, C8618c cVar) {
            super(cVar);
            C19383o.m32797g(cVar, "configMap");
            this.f26588e = str;
            this.f26599p = C19350d.m32677b(new ListingCardViewHolderOptions$ShopHome$showKebabMenu$2(cVar));
        }

        /* renamed from: b */
        public final boolean mo38788b() {
            return this.f26593j;
        }

        /* renamed from: c */
        public final int mo38789c() {
            return this.f26594k;
        }

        /* renamed from: d */
        public final String mo38790d() {
            return this.f26588e;
        }

        /* renamed from: e */
        public final Integer mo38791e() {
            return 0;
        }

        /* renamed from: i */
        public final boolean mo38795i() {
            return this.f26591h;
        }

        /* renamed from: l */
        public final boolean mo38798l() {
            return this.f26592i;
        }

        /* renamed from: n */
        public final boolean mo38800n() {
            return this.f26596m;
        }

        /* renamed from: o */
        public final boolean mo38801o() {
            return this.f26590g;
        }

        /* renamed from: p */
        public final boolean mo38802p() {
            return this.f26595l;
        }

        /* renamed from: q */
        public final boolean mo38803q() {
            return this.f26597n;
        }

        /* renamed from: s */
        public final boolean mo38805s() {
            return ((Boolean) this.f26599p.getValue()).booleanValue();
        }

        /* renamed from: w */
        public final boolean mo38809w() {
            return this.f26598o;
        }

        /* renamed from: y */
        public final boolean mo38811y() {
            return this.f26589f;
        }
    }

    /* renamed from: com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$a */
    public static final class C11967a extends ListingCardViewHolderOptions {

        /* renamed from: e */
        public final boolean f26600e = true;

        /* renamed from: f */
        public final boolean f26601f = true;

        /* renamed from: g */
        public final boolean f26602g = true;

        /* renamed from: h */
        public final boolean f26603h = true;

        /* renamed from: i */
        public final boolean f26604i = true;

        /* renamed from: j */
        public final int f26605j = R.attr.clg_color_text_urgency;

        /* renamed from: k */
        public final boolean f26606k = true;

        /* renamed from: l */
        public final AdIndicator f26607l = AdIndicator.LABEL;

        /* renamed from: m */
        public final C19285c f26608m;

        /* renamed from: n */
        public final boolean f26609n;

        /* renamed from: o */
        public final boolean f26610o;

        /* renamed from: p */
        public final boolean f26611p;

        public C11967a(C8623e eVar) {
            super(eVar);
            this.f26608m = C19350d.m32677b(new C11976x3379a092(eVar));
            this.f26609n = true;
            this.f26610o = true;
            this.f26611p = true;
        }

        /* renamed from: a */
        public final AdIndicator mo38787a() {
            return this.f26607l;
        }

        /* renamed from: c */
        public final int mo38789c() {
            return this.f26605j;
        }

        /* renamed from: i */
        public final boolean mo38795i() {
            return this.f26603h;
        }

        /* renamed from: k */
        public final boolean mo38797k() {
            return this.f26600e;
        }

        /* renamed from: m */
        public final boolean mo38799m() {
            return this.f26601f;
        }

        /* renamed from: n */
        public final boolean mo38800n() {
            return this.f26609n;
        }

        /* renamed from: p */
        public final boolean mo38802p() {
            return this.f26606k;
        }

        /* renamed from: q */
        public final boolean mo38803q() {
            return this.f26610o;
        }

        /* renamed from: s */
        public final boolean mo38805s() {
            return ((Boolean) this.f26608m.getValue()).booleanValue();
        }

        /* renamed from: u */
        public final boolean mo38807u() {
            return this.f26604i;
        }

        /* renamed from: w */
        public final boolean mo38809w() {
            return this.f26611p;
        }

        /* renamed from: y */
        public final boolean mo38811y() {
            return this.f26602g;
        }
    }

    /* renamed from: com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$b */
    public static final class C11968b extends ListingCardViewHolderOptions {

        /* renamed from: e */
        public final int f26612e;

        /* renamed from: f */
        public final boolean f26613f = true;

        /* renamed from: g */
        public final boolean f26614g = true;

        /* renamed from: h */
        public final boolean f26615h = true;

        /* renamed from: i */
        public final C19285c f26616i;

        public C11968b(int i, C8623e eVar) {
            super(eVar);
            this.f26612e = i;
            this.f26616i = C19350d.m32677b(new ListingCardViewHolderOptions$EditorPicks$showKebabMenu$2(eVar));
        }

        /* renamed from: e */
        public final Integer mo38791e() {
            return Integer.valueOf(this.f26612e);
        }

        /* renamed from: k */
        public final boolean mo38797k() {
            return this.f26613f;
        }

        /* renamed from: s */
        public final boolean mo38805s() {
            return ((Boolean) this.f26616i.getValue()).booleanValue();
        }

        /* renamed from: u */
        public final boolean mo38807u() {
            return this.f26614g;
        }

        /* renamed from: y */
        public final boolean mo38811y() {
            return this.f26615h;
        }
    }

    /* renamed from: com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$c */
    public static final class C11969c extends ListingCardViewHolderOptions {

        /* renamed from: e */
        public final int f26617e;

        /* renamed from: f */
        public final boolean f26618f = true;

        /* renamed from: g */
        public final boolean f26619g = true;

        /* renamed from: h */
        public final int f26620h = R.attr.clg_color_text_urgency;

        /* renamed from: i */
        public final boolean f26621i = true;

        /* renamed from: j */
        public final boolean f26622j = true;

        /* renamed from: k */
        public final boolean f26623k = true;

        /* renamed from: l */
        public final boolean f26624l = true;

        /* renamed from: m */
        public final C19285c f26625m;

        /* renamed from: n */
        public final C19285c f26626n;

        /* renamed from: o */
        public final C19285c f26627o;

        /* renamed from: p */
        public final C19285c f26628p;

        public C11969c(int i, C8623e eVar) {
            super(eVar);
            this.f26617e = i;
            this.f26625m = C19350d.m32677b(new ListingCardViewHolderOptions$FavoriteItems$showKebabMenu$2(eVar));
            this.f26626n = C19350d.m32677b(new C11978x74624bce(eVar));
            this.f26627o = C19350d.m32677b(new C11977x6ceaa30a(eVar));
            this.f26628p = C19350d.m32677b(new ListingCardViewHolderOptions$FavoriteItems$showMinimalistGrid$2(eVar));
        }

        /* renamed from: c */
        public final int mo38789c() {
            return this.f26620h;
        }

        /* renamed from: e */
        public final Integer mo38791e() {
            return Integer.valueOf(this.f26617e);
        }

        /* renamed from: f */
        public final boolean mo38792f() {
            return this.f26623k;
        }

        /* renamed from: g */
        public final boolean mo38793g() {
            return ((Boolean) this.f26627o.getValue()).booleanValue();
        }

        /* renamed from: h */
        public final boolean mo38794h() {
            return ((Boolean) this.f26626n.getValue()).booleanValue();
        }

        /* renamed from: i */
        public final boolean mo38795i() {
            return this.f26619g;
        }

        /* renamed from: n */
        public final boolean mo38800n() {
            return this.f26622j;
        }

        /* renamed from: p */
        public final boolean mo38802p() {
            return this.f26621i;
        }

        /* renamed from: r */
        public final boolean mo38804r() {
            return this.f26624l;
        }

        /* renamed from: s */
        public final boolean mo38805s() {
            return ((Boolean) this.f26625m.getValue()).booleanValue();
        }

        /* renamed from: t */
        public final boolean mo38806t() {
            return ((Boolean) this.f26628p.getValue()).booleanValue();
        }

        /* renamed from: y */
        public final boolean mo38811y() {
            return this.f26618f;
        }
    }

    /* renamed from: com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$d */
    public static final class C11970d extends ListingCardViewHolderOptions {

        /* renamed from: e */
        public final boolean f26629e = true;

        /* renamed from: f */
        public final boolean f26630f = true;

        /* renamed from: g */
        public final boolean f26631g = true;

        /* renamed from: h */
        public final int f26632h = R.attr.clg_color_text_urgency;

        /* renamed from: i */
        public final boolean f26633i = true;

        /* renamed from: j */
        public final boolean f26634j = true;

        /* renamed from: k */
        public final boolean f26635k = true;

        /* renamed from: l */
        public final C19285c f26636l;

        /* renamed from: m */
        public final C19285c f26637m;

        /* renamed from: n */
        public final C19285c f26638n;

        /* renamed from: o */
        public final C19285c f26639o;

        public C11970d(C8623e eVar) {
            super(eVar);
            this.f26636l = C19350d.m32677b(new ListingCardViewHolderOptions$FavoritesCollection$showKebabMenu$2(eVar));
            this.f26637m = C19350d.m32677b(new C11980x599af85d(eVar));
            this.f26638n = C19350d.m32677b(new C11979xfa6e191b(eVar));
            this.f26639o = C19350d.m32677b(new C11981xbffdd1f4(eVar));
        }

        /* renamed from: c */
        public final int mo38789c() {
            return this.f26632h;
        }

        /* renamed from: f */
        public final boolean mo38792f() {
            return this.f26635k;
        }

        /* renamed from: g */
        public final boolean mo38793g() {
            return ((Boolean) this.f26638n.getValue()).booleanValue();
        }

        /* renamed from: h */
        public final boolean mo38794h() {
            return ((Boolean) this.f26637m.getValue()).booleanValue();
        }

        /* renamed from: i */
        public final boolean mo38795i() {
            return this.f26630f;
        }

        /* renamed from: n */
        public final boolean mo38800n() {
            return this.f26634j;
        }

        /* renamed from: p */
        public final boolean mo38802p() {
            return this.f26633i;
        }

        /* renamed from: s */
        public final boolean mo38805s() {
            return ((Boolean) this.f26636l.getValue()).booleanValue();
        }

        /* renamed from: t */
        public final boolean mo38806t() {
            return ((Boolean) this.f26639o.getValue()).booleanValue();
        }

        /* renamed from: u */
        public final boolean mo38807u() {
            return this.f26631g;
        }

        /* renamed from: y */
        public final boolean mo38811y() {
            return this.f26629e;
        }
    }

    /* renamed from: com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$e */
    public static final class C11971e extends ListingCardViewHolderOptions {

        /* renamed from: e */
        public final int f26640e;

        /* renamed from: f */
        public final boolean f26641f = true;

        /* renamed from: g */
        public final boolean f26642g = true;

        /* renamed from: h */
        public final C19285c f26643h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11971e(int i, C8623e eVar) {
            super(eVar);
            C19383o.m32797g(eVar, "configMap");
            this.f26640e = i;
            this.f26643h = C19350d.m32677b(new ListingCardViewHolderOptions$HomeScreen$showKebabMenu$2(eVar));
        }

        /* renamed from: e */
        public final Integer mo38791e() {
            return Integer.valueOf(this.f26640e);
        }

        /* renamed from: k */
        public final boolean mo38797k() {
            return this.f26641f;
        }

        /* renamed from: s */
        public final boolean mo38805s() {
            return ((Boolean) this.f26643h.getValue()).booleanValue();
        }

        /* renamed from: u */
        public final boolean mo38807u() {
            return this.f26642g;
        }
    }

    /* renamed from: com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$f */
    public static final class C11972f extends ListingCardViewHolderOptions {

        /* renamed from: e */
        public final boolean f26644e = true;

        /* renamed from: f */
        public final boolean f26645f = true;

        /* renamed from: g */
        public final boolean f26646g = true;

        /* renamed from: h */
        public final boolean f26647h = true;

        /* renamed from: i */
        public final boolean f26648i = true;

        /* renamed from: j */
        public final int f26649j = R.attr.clg_color_text_urgency;

        /* renamed from: k */
        public final boolean f26650k = true;

        /* renamed from: l */
        public final boolean f26651l;

        /* renamed from: m */
        public final AdIndicator f26652m;

        /* renamed from: n */
        public final boolean f26653n;

        /* renamed from: o */
        public final boolean f26654o;

        /* renamed from: p */
        public final boolean f26655p;

        public C11972f(C8623e eVar) {
            super(eVar);
            this.f26651l = !eVar.mo21132b(C8592b.f18775a1);
            this.f26652m = AdIndicator.LABEL;
            this.f26653n = true;
            this.f26654o = true;
            this.f26655p = true;
        }

        /* renamed from: a */
        public final AdIndicator mo38787a() {
            return this.f26652m;
        }

        /* renamed from: c */
        public final int mo38789c() {
            return this.f26649j;
        }

        /* renamed from: i */
        public final boolean mo38795i() {
            return this.f26647h;
        }

        /* renamed from: k */
        public final boolean mo38797k() {
            return this.f26644e;
        }

        /* renamed from: m */
        public final boolean mo38799m() {
            return this.f26645f;
        }

        /* renamed from: n */
        public final boolean mo38800n() {
            return this.f26653n;
        }

        /* renamed from: p */
        public final boolean mo38802p() {
            return this.f26650k;
        }

        /* renamed from: q */
        public final boolean mo38803q() {
            return this.f26654o;
        }

        /* renamed from: s */
        public final boolean mo38805s() {
            return this.f26651l;
        }

        /* renamed from: u */
        public final boolean mo38807u() {
            return this.f26648i;
        }

        /* renamed from: w */
        public final boolean mo38809w() {
            return this.f26655p;
        }

        /* renamed from: y */
        public final boolean mo38811y() {
            return this.f26646g;
        }
    }

    /* renamed from: com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$g */
    public static final class C11973g extends ListingCardViewHolderOptions {

        /* renamed from: e */
        public final int f26656e;

        /* renamed from: f */
        public final boolean f26657f = true;

        /* renamed from: g */
        public final boolean f26658g = true;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11973g(int i, C8623e eVar) {
            super(eVar);
            C19383o.m32797g(eVar, "configMap");
            this.f26656e = i;
        }

        /* renamed from: e */
        public final Integer mo38791e() {
            return Integer.valueOf(this.f26656e);
        }

        /* renamed from: j */
        public final boolean mo38796j() {
            return this.f26657f;
        }

        /* renamed from: s */
        public final boolean mo38805s() {
            return false;
        }

        /* renamed from: u */
        public final boolean mo38807u() {
            return this.f26658g;
        }
    }

    /* renamed from: com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$h */
    public static final class C11974h extends ListingCardViewHolderOptions {

        /* renamed from: e */
        public final boolean f26659e = true;

        /* renamed from: f */
        public final boolean f26660f = true;

        /* renamed from: g */
        public final boolean f26661g = true;

        /* renamed from: h */
        public final boolean f26662h = true;

        /* renamed from: i */
        public final boolean f26663i = true;

        /* renamed from: j */
        public final int f26664j = R.attr.clg_color_text_urgency;

        /* renamed from: k */
        public final boolean f26665k = true;

        /* renamed from: l */
        public final boolean f26666l = true;

        /* renamed from: m */
        public final boolean f26667m = true;

        /* renamed from: n */
        public final C19285c f26668n;

        /* renamed from: o */
        public final AdIndicator f26669o;

        /* renamed from: p */
        public final C19285c f26670p;

        public C11974h(C8623e eVar) {
            super(eVar);
            this.f26668n = C19350d.m32677b(new ListingCardViewHolderOptions$SearchResults$showKebabMenu$2(eVar));
            this.f26669o = AdIndicator.LABEL;
            this.f26670p = C19350d.m32677b(new C11982x11556c68(eVar));
        }

        /* renamed from: a */
        public final AdIndicator mo38787a() {
            return this.f26669o;
        }

        /* renamed from: c */
        public final int mo38789c() {
            return this.f26664j;
        }

        /* renamed from: i */
        public final boolean mo38795i() {
            return this.f26661g;
        }

        /* renamed from: k */
        public final boolean mo38797k() {
            return this.f26659e;
        }

        /* renamed from: l */
        public final boolean mo38798l() {
            return this.f26662h;
        }

        /* renamed from: p */
        public final boolean mo38802p() {
            return this.f26665k;
        }

        /* renamed from: q */
        public final boolean mo38803q() {
            return this.f26663i;
        }

        /* renamed from: s */
        public final boolean mo38805s() {
            return ((Boolean) this.f26668n.getValue()).booleanValue();
        }

        /* renamed from: u */
        public final boolean mo38807u() {
            return this.f26667m;
        }

        /* renamed from: v */
        public final boolean mo38808v() {
            return this.f26666l;
        }

        /* renamed from: x */
        public final boolean mo38810x() {
            return ((Boolean) this.f26670p.getValue()).booleanValue();
        }

        /* renamed from: y */
        public final boolean mo38811y() {
            return this.f26660f;
        }
    }

    /* renamed from: com.etsy.android.uikit.viewholder.ListingCardViewHolderOptions$i */
    public static final class C11975i extends ListingCardViewHolderOptions {

        /* renamed from: e */
        public final boolean f26671e = true;

        /* renamed from: f */
        public final boolean f26672f = true;

        /* renamed from: g */
        public final boolean f26673g = true;

        /* renamed from: h */
        public final boolean f26674h = true;

        /* renamed from: i */
        public final boolean f26675i = true;

        /* renamed from: j */
        public final int f26676j = R.attr.clg_color_text_urgency;

        /* renamed from: k */
        public final boolean f26677k = true;

        /* renamed from: l */
        public final C19285c f26678l;

        public C11975i(C8623e eVar) {
            super(eVar);
            this.f26678l = C19350d.m32677b(new C11983x23def6a6(eVar));
        }

        /* renamed from: c */
        public final int mo38789c() {
            return this.f26676j;
        }

        /* renamed from: i */
        public final boolean mo38795i() {
            return this.f26674h;
        }

        /* renamed from: k */
        public final boolean mo38797k() {
            return this.f26671e;
        }

        /* renamed from: m */
        public final boolean mo38799m() {
            return this.f26672f;
        }

        /* renamed from: p */
        public final boolean mo38802p() {
            return this.f26677k;
        }

        /* renamed from: s */
        public final boolean mo38805s() {
            return ((Boolean) this.f26678l.getValue()).booleanValue();
        }

        /* renamed from: u */
        public final boolean mo38807u() {
            return this.f26675i;
        }

        /* renamed from: y */
        public final boolean mo38811y() {
            return this.f26673g;
        }
    }

    public ListingCardViewHolderOptions(C8618c cVar) {
        this.f26586c = cVar.mo21132b(C8592b.C8598f.f18877g);
        this.f26587d = cVar.mo21132b(C8592b.C8598f.f18878h);
    }

    /* renamed from: a */
    public AdIndicator mo38787a() {
        return this.f26585b;
    }

    /* renamed from: b */
    public boolean mo38788b() {
        return false;
    }

    /* renamed from: c */
    public int mo38789c() {
        return this.f26584a;
    }

    /* renamed from: d */
    public String mo38790d() {
        return null;
    }

    /* renamed from: e */
    public Integer mo38791e() {
        return null;
    }

    /* renamed from: f */
    public boolean mo38792f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo38793g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo38794h() {
        return false;
    }

    /* renamed from: i */
    public boolean mo38795i() {
        return false;
    }

    /* renamed from: j */
    public boolean mo38796j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo38797k() {
        return false;
    }

    /* renamed from: l */
    public boolean mo38798l() {
        return false;
    }

    /* renamed from: m */
    public boolean mo38799m() {
        return false;
    }

    /* renamed from: n */
    public boolean mo38800n() {
        return false;
    }

    /* renamed from: o */
    public boolean mo38801o() {
        return false;
    }

    /* renamed from: p */
    public boolean mo38802p() {
        return false;
    }

    /* renamed from: q */
    public boolean mo38803q() {
        return false;
    }

    /* renamed from: r */
    public boolean mo38804r() {
        return false;
    }

    /* renamed from: s */
    public abstract boolean mo38805s();

    /* renamed from: t */
    public boolean mo38806t() {
        return false;
    }

    /* renamed from: u */
    public boolean mo38807u() {
        return false;
    }

    /* renamed from: v */
    public boolean mo38808v() {
        return false;
    }

    /* renamed from: w */
    public boolean mo38809w() {
        return false;
    }

    /* renamed from: x */
    public boolean mo38810x() {
        return false;
    }

    /* renamed from: y */
    public boolean mo38811y() {
        return false;
    }
}
