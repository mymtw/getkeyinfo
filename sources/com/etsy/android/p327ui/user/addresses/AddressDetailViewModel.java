package com.etsy.android.p327ui.user.addresses;

import android.support.p013v4.media.C0072d;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import com.etsy.android.extensions.UnexpectedResultException;
import com.etsy.android.lib.models.apiv3.addresses.UserAddress;
import com.etsy.android.p327ui.user.addresses.C11381a0;
import com.etsy.android.p327ui.user.addresses.C11463z;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.observers.ConsumerSingleObserver;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p287xp.C8339g;
import p346fa.C12703a;
import p456ua.C13461f;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel */
public final class AddressDetailViewModel extends C2866i0 {

    /* renamed from: b */
    public final C13461f f25050b;

    /* renamed from: c */
    public final C11393c0 f25051c;

    /* renamed from: d */
    public final C12703a f25052d;

    /* renamed from: e */
    public final C7091a f25053e = new C7091a();

    /* renamed from: f */
    public final C2895z<C11361a> f25054f = new C2895z<>();

    /* renamed from: g */
    public final C11425l f25055g = new C11425l();

    /* renamed from: h */
    public int f25056h;

    /* renamed from: i */
    public Integer f25057i = 0;

    /* renamed from: j */
    public AddressItemUI f25058j;

    /* renamed from: k */
    public Boolean f25059k = Boolean.FALSE;

    /* renamed from: l */
    public final C19861p<String, C19857l<? super List<PostalCodeSuggestion>, C19394m>, C19394m> f25060l = new AddressDetailViewModel$fetchSuggestedAddresses$1(this);

    /* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$a */
    public static abstract class C11361a {

        /* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$a$a */
        public static final class C11362a extends C11361a {

            /* renamed from: a */
            public static final C11362a f25061a = new C11362a();
        }

        /* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$a$b */
        public static final class C11363b extends C11361a {

            /* renamed from: a */
            public static final C11363b f25062a = new C11363b();
        }

        /* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$a$c */
        public static final class C11364c extends C11361a {

            /* renamed from: a */
            public static final C11364c f25063a = new C11364c();
        }

        /* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$a$d */
        public static final class C11365d extends C11361a {

            /* renamed from: a */
            public final UserAddress f25064a;

            public C11365d(UserAddress userAddress) {
                C19383o.m32797g(userAddress, "userAddress");
                this.f25064a = userAddress;
            }
        }

        /* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$a$e */
        public static final class C11366e extends C11361a {
            public C11366e(Throwable th) {
                C19383o.m32797g(th, "throwable");
            }
        }

        /* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$a$f */
        public static final class C11367f extends C11361a {

            /* renamed from: a */
            public static final C11367f f25065a = new C11367f();
        }

        /* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$a$g */
        public static final class C11368g extends C11361a {

            /* renamed from: a */
            public static final C11368g f25066a = new C11368g();
        }

        /* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$a$h */
        public static final class C11369h extends C11361a {

            /* renamed from: a */
            public final UserAddress f25067a;

            public C11369h(UserAddress userAddress) {
                C19383o.m32797g(userAddress, "userAddress");
                this.f25067a = userAddress;
            }
        }

        /* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$a$i */
        public static final class C11370i extends C11361a {

            /* renamed from: a */
            public final ArrayList f25068a;

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Code restructure failed: missing block: B:215:0x03a7, code lost:
                r10 = r16;
                r15 = r17;
                r9 = r18;
                r6 = r19;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:239:0x0425, code lost:
                r10 = r16;
                r9 = r18;
                r6 = r19;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:248:0x045f, code lost:
                r19 = r6;
                r18 = r9;
                r16 = r10;
                r17 = r15;
             */
            /* JADX WARNING: Removed duplicated region for block: B:172:0x02d9  */
            /* JADX WARNING: Removed duplicated region for block: B:173:0x02e0  */
            /* JADX WARNING: Removed duplicated region for block: B:176:0x02e8  */
            /* JADX WARNING: Removed duplicated region for block: B:177:0x02ef  */
            /* JADX WARNING: Removed duplicated region for block: B:180:0x0301  */
            /* JADX WARNING: Removed duplicated region for block: B:183:0x030f  */
            /* JADX WARNING: Removed duplicated region for block: B:184:0x0314  */
            /* JADX WARNING: Removed duplicated region for block: B:187:0x031c  */
            /* JADX WARNING: Removed duplicated region for block: B:190:0x032b  */
            /* JADX WARNING: Removed duplicated region for block: B:191:0x0330  */
            /* JADX WARNING: Removed duplicated region for block: B:194:0x033f  */
            /* JADX WARNING: Removed duplicated region for block: B:195:0x0344  */
            /* JADX WARNING: Removed duplicated region for block: B:198:0x0354  */
            /* JADX WARNING: Removed duplicated region for block: B:199:0x035d  */
            /* JADX WARNING: Removed duplicated region for block: B:202:0x0362  */
            /* JADX WARNING: Removed duplicated region for block: B:208:0x0381  */
            /* JADX WARNING: Removed duplicated region for block: B:209:0x0386  */
            /* JADX WARNING: Removed duplicated region for block: B:213:0x039a  */
            /* JADX WARNING: Removed duplicated region for block: B:251:0x046e  */
            /* JADX WARNING: Removed duplicated region for block: B:254:0x0480 A[LOOP:1: B:254:0x0480->B:300:0x0570, LOOP_START, PHI: r0 
              PHI: (r0v7 int) = (r0v5 int), (r0v10 int) binds: [B:253:0x047e, B:300:0x0570] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARNING: Removed duplicated region for block: B:300:0x0570 A[LOOP:1: B:254:0x0480->B:300:0x0570, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:312:0x0573 A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C11370i(int r30, com.etsy.android.p327ui.user.addresses.AddressDetailsLayoutResponse r31, com.etsy.android.p327ui.user.addresses.AddressItemUI r32, java.lang.String r33, boolean r34) {
                /*
                    r29 = this;
                    r0 = r31
                    java.lang.String r1 = "addressDetailsLayoutResponse"
                    kotlin.jvm.internal.C19383o.m32797g(r0, r1)
                    r29.<init>()
                    java.lang.String r1 = r0.f25085n
                    java.lang.String r2 = "US"
                    boolean r1 = kotlin.jvm.internal.C19383o.m32792b(r1, r2)
                    if (r1 == 0) goto L_0x001e
                    com.etsy.android.ui.user.addresses.i r1 = new com.etsy.android.ui.user.addresses.i
                    java.lang.String r3 = r0.f25084m
                    com.etsy.android.ui.user.addresses.AddressFormatType r4 = com.etsy.android.p327ui.user.addresses.AddressFormatType.LOCAL_INPUT_FORMAT
                    r1.<init>(r3, r4)
                    goto L_0x0027
                L_0x001e:
                    com.etsy.android.ui.user.addresses.i r1 = new com.etsy.android.ui.user.addresses.i
                    java.lang.String r3 = r0.f25083l
                    com.etsy.android.ui.user.addresses.AddressFormatType r4 = com.etsy.android.p327ui.user.addresses.AddressFormatType.INPUT_FORMAT
                    r1.<init>(r3, r4)
                L_0x0027:
                    com.etsy.android.ui.user.addresses.AddressFormatType r3 = r1.f25167b
                    int[] r4 = com.etsy.android.p327ui.user.addresses.C11420j.C11421a.f25177a
                    int r3 = r3.ordinal()
                    r3 = r4[r3]
                    r4 = 4
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    if (r3 == r7) goto L_0x004c
                    if (r3 == r6) goto L_0x004c
                    if (r3 == r5) goto L_0x004c
                    if (r3 != r4) goto L_0x0046
                    java.lang.String r1 = r1.f25166a
                    java.lang.String r3 = "%name\\n%first_line\\n%second_line\\n%city\\n%state %zip\\n%country_name"
                    java.util.List r1 = com.etsy.android.p327ui.user.addresses.C11420j.m19268a(r1, r3)
                    goto L_0x0054
                L_0x0046:
                    kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                    r0.<init>()
                    throw r0
                L_0x004c:
                    java.lang.String r1 = r1.f25166a
                    java.lang.String r3 = "%name\\n%first_line\\n%second_line\\n%zip %city\\n%state\\n%country_name"
                    java.util.List r1 = com.etsy.android.p327ui.user.addresses.C11420j.m19268a(r1, r3)
                L_0x0054:
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    com.etsy.android.ui.user.addresses.m r8 = new com.etsy.android.ui.user.addresses.m
                    r9 = r32
                    r8.<init>(r0, r9)
                    com.etsy.android.ui.user.addresses.j0 r0 = new com.etsy.android.ui.user.addresses.j0
                    int r9 = android.view.View.generateViewId()
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r10 = r8.f25216a
                    java.util.List<java.lang.String> r10 = r10.f25074c
                    java.lang.String r11 = "name"
                    if (r10 == 0) goto L_0x0073
                    boolean r10 = r10.contains(r11)
                    goto L_0x0074
                L_0x0073:
                    r10 = 0
                L_0x0074:
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r13 = r8.f25216a
                    java.util.List<java.lang.String> r13 = r13.f25075d
                    if (r13 == 0) goto L_0x007f
                    boolean r13 = r13.contains(r11)
                    goto L_0x0080
                L_0x007f:
                    r13 = 0
                L_0x0080:
                    com.etsy.android.ui.user.addresses.FieldViewType r15 = com.etsy.android.p327ui.user.addresses.FieldViewType.TEXT_INPUT
                    r0.<init>(r9, r10, r13, r15)
                    com.etsy.android.ui.user.addresses.AddressItemUI r9 = r8.f25217b
                    if (r9 == 0) goto L_0x008e
                    java.lang.String r9 = r9.getName()
                    goto L_0x008f
                L_0x008e:
                    r9 = 0
                L_0x008f:
                    r0.f25184g = r9
                    com.etsy.android.ui.user.addresses.i0 r9 = new com.etsy.android.ui.user.addresses.i0
                    int r13 = android.view.View.generateViewId()
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r14 = r8.f25216a
                    java.util.List<java.lang.String> r14 = r14.f25074c
                    java.lang.String r10 = "first_line"
                    if (r14 == 0) goto L_0x00a4
                    boolean r14 = r14.contains(r10)
                    goto L_0x00a5
                L_0x00a4:
                    r14 = 0
                L_0x00a5:
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r12 = r8.f25216a
                    java.util.List<java.lang.String> r12 = r12.f25075d
                    if (r12 == 0) goto L_0x00b0
                    boolean r12 = r12.contains(r10)
                    goto L_0x00b1
                L_0x00b0:
                    r12 = 0
                L_0x00b1:
                    r9.<init>(r13, r14, r12, r15)
                    com.etsy.android.ui.user.addresses.AddressItemUI r12 = r8.f25217b
                    if (r12 == 0) goto L_0x00bd
                    java.lang.String r12 = r12.getFirst_line()
                    goto L_0x00be
                L_0x00bd:
                    r12 = 0
                L_0x00be:
                    r9.f25174g = r12
                    com.etsy.android.ui.user.addresses.n0 r12 = new com.etsy.android.ui.user.addresses.n0
                    int r13 = android.view.View.generateViewId()
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r14 = r8.f25216a
                    java.lang.String r14 = r14.f25080i
                    r16 = 2131951706(0x7f13005a, float:1.9539834E38)
                    r4 = -1
                    if (r14 == 0) goto L_0x00fd
                    java.util.Map<java.lang.String, com.etsy.android.ui.user.addresses.SecondLineType> r5 = r8.f25218c
                    java.lang.Object r5 = r5.get(r14)
                    com.etsy.android.ui.user.addresses.SecondLineType r5 = (com.etsy.android.p327ui.user.addresses.SecondLineType) r5
                    if (r5 != 0) goto L_0x00dc
                    r5 = r4
                    goto L_0x00e4
                L_0x00dc:
                    int[] r14 = com.etsy.android.p327ui.user.addresses.C11427m.C11428a.f25222a
                    int r5 = r5.ordinal()
                    r5 = r14[r5]
                L_0x00e4:
                    if (r5 == r4) goto L_0x00fd
                    if (r5 == r7) goto L_0x00f8
                    if (r5 == r6) goto L_0x00f4
                    r14 = 3
                    if (r5 != r14) goto L_0x00ee
                    goto L_0x00fd
                L_0x00ee:
                    kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                    r0.<init>()
                    throw r0
                L_0x00f4:
                    r5 = 2131952279(0x7f130297, float:1.9540996E38)
                    goto L_0x00fb
                L_0x00f8:
                    r5 = 2131951680(0x7f130040, float:1.9539781E38)
                L_0x00fb:
                    r16 = r5
                L_0x00fd:
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r5 = r8.f25216a
                    java.util.List<java.lang.String> r5 = r5.f25074c
                    java.lang.String r14 = "second_line"
                    if (r5 == 0) goto L_0x010c
                    boolean r5 = r5.contains(r14)
                    r17 = r5
                    goto L_0x010e
                L_0x010c:
                    r17 = 0
                L_0x010e:
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r5 = r8.f25216a
                    java.util.List<java.lang.String> r5 = r5.f25075d
                    if (r5 == 0) goto L_0x011b
                    boolean r5 = r5.contains(r14)
                    r18 = r5
                    goto L_0x011d
                L_0x011b:
                    r18 = 0
                L_0x011d:
                    java.util.Map<java.lang.String, com.etsy.android.ui.user.addresses.SecondLineType> r5 = r8.f25218c
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r6 = r8.f25216a
                    java.lang.String r6 = r6.f25080i
                    java.lang.Object r5 = r5.get(r6)
                    com.etsy.android.ui.user.addresses.SecondLineType r5 = (com.etsy.android.p327ui.user.addresses.SecondLineType) r5
                    if (r5 != 0) goto L_0x012d
                    com.etsy.android.ui.user.addresses.SecondLineType r5 = com.etsy.android.p327ui.user.addresses.SecondLineType.APT_SUITE_UNIT
                L_0x012d:
                    r19 = r5
                    r5 = r14
                    r14 = r12
                    r6 = r15
                    r15 = r13
                    r20 = r6
                    r14.<init>(r15, r16, r17, r18, r19, r20)
                    com.etsy.android.ui.user.addresses.AddressItemUI r13 = r8.f25217b
                    if (r13 == 0) goto L_0x0141
                    java.lang.String r13 = r13.getSecond_line()
                    goto L_0x0142
                L_0x0141:
                    r13 = 0
                L_0x0142:
                    r12.f25255h = r13
                    com.etsy.android.ui.user.addresses.k0 r13 = new com.etsy.android.ui.user.addresses.k0
                    int r15 = android.view.View.generateViewId()
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r14 = r8.f25216a
                    java.lang.String r14 = r14.f25078g
                    r16 = 2131951782(0x7f1300a6, float:1.9539988E38)
                    if (r14 == 0) goto L_0x0188
                    java.util.Map<java.lang.String, com.etsy.android.ui.user.addresses.LocalityType> r7 = r8.f25219d
                    java.lang.Object r7 = r7.get(r14)
                    com.etsy.android.ui.user.addresses.LocalityType r7 = (com.etsy.android.p327ui.user.addresses.LocalityType) r7
                    if (r7 != 0) goto L_0x015f
                    r7 = r4
                    goto L_0x0167
                L_0x015f:
                    int[] r14 = com.etsy.android.p327ui.user.addresses.C11427m.C11428a.f25223b
                    int r7 = r7.ordinal()
                    r7 = r14[r7]
                L_0x0167:
                    if (r7 == r4) goto L_0x0188
                    r14 = 1
                    if (r7 == r14) goto L_0x0183
                    r14 = 2
                    if (r7 == r14) goto L_0x017f
                    r14 = 3
                    if (r7 == r14) goto L_0x0188
                    r14 = 4
                    if (r7 != r14) goto L_0x0179
                    r7 = 2131952102(0x7f1301e6, float:1.9540637E38)
                    goto L_0x0186
                L_0x0179:
                    kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                    r0.<init>()
                    throw r0
                L_0x017f:
                    r7 = 2131951781(0x7f1300a5, float:1.9539986E38)
                    goto L_0x0186
                L_0x0183:
                    r7 = 2131951780(0x7f1300a4, float:1.9539984E38)
                L_0x0186:
                    r16 = r7
                L_0x0188:
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r7 = r8.f25216a
                    java.util.List<java.lang.String> r7 = r7.f25074c
                    java.lang.String r14 = "city"
                    if (r7 == 0) goto L_0x0197
                    boolean r7 = r7.contains(r14)
                    r17 = r7
                    goto L_0x0199
                L_0x0197:
                    r17 = 0
                L_0x0199:
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r7 = r8.f25216a
                    java.util.List<java.lang.String> r7 = r7.f25075d
                    if (r7 == 0) goto L_0x01a6
                    boolean r7 = r7.contains(r14)
                    r18 = r7
                    goto L_0x01a8
                L_0x01a6:
                    r18 = 0
                L_0x01a8:
                    java.util.Map<java.lang.String, com.etsy.android.ui.user.addresses.LocalityType> r7 = r8.f25219d
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r4 = r8.f25216a
                    java.lang.String r4 = r4.f25078g
                    java.lang.Object r4 = r7.get(r4)
                    com.etsy.android.ui.user.addresses.LocalityType r4 = (com.etsy.android.p327ui.user.addresses.LocalityType) r4
                    if (r4 != 0) goto L_0x01b8
                    com.etsy.android.ui.user.addresses.LocalityType r4 = com.etsy.android.p327ui.user.addresses.LocalityType.CITY_TOWN
                L_0x01b8:
                    r19 = r4
                    r4 = r14
                    r14 = r13
                    r20 = r6
                    r14.<init>(r15, r16, r17, r18, r19, r20)
                    com.etsy.android.ui.user.addresses.AddressItemUI r7 = r8.f25217b
                    if (r7 == 0) goto L_0x01ca
                    java.lang.String r7 = r7.getLocality()
                    goto L_0x01cb
                L_0x01ca:
                    r7 = 0
                L_0x01cb:
                    r13.f25195h = r7
                    int r22 = android.view.View.generateViewId()
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r7 = r8.f25216a
                    java.lang.String r7 = r7.f25077f
                    if (r7 == 0) goto L_0x0224
                    java.util.Map<java.lang.String, com.etsy.android.ui.user.addresses.AdministrativeAreaType> r14 = r8.f25221f
                    java.lang.Object r7 = r14.get(r7)
                    com.etsy.android.ui.user.addresses.AdministrativeAreaType r7 = (com.etsy.android.p327ui.user.addresses.AdministrativeAreaType) r7
                    if (r7 != 0) goto L_0x01e3
                    r7 = -1
                    goto L_0x01eb
                L_0x01e3:
                    int[] r14 = com.etsy.android.p327ui.user.addresses.C11427m.C11428a.f25224c
                    int r7 = r7.ordinal()
                    r7 = r14[r7]
                L_0x01eb:
                    switch(r7) {
                        case -1: goto L_0x0224;
                        case 0: goto L_0x01ee;
                        case 1: goto L_0x0224;
                        case 2: goto L_0x0220;
                        case 3: goto L_0x021c;
                        case 4: goto L_0x0218;
                        case 5: goto L_0x0214;
                        case 6: goto L_0x0210;
                        case 7: goto L_0x020c;
                        case 8: goto L_0x0208;
                        case 9: goto L_0x0204;
                        case 10: goto L_0x0200;
                        case 11: goto L_0x01fc;
                        case 12: goto L_0x01f8;
                        case 13: goto L_0x01f4;
                        default: goto L_0x01ee;
                    }
                L_0x01ee:
                    kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                    r0.<init>()
                    throw r0
                L_0x01f4:
                    r7 = 2131951689(0x7f130049, float:1.95398E38)
                    goto L_0x0227
                L_0x01f8:
                    r7 = 2131951709(0x7f13005d, float:1.953984E38)
                    goto L_0x0227
                L_0x01fc:
                    r7 = 2131952121(0x7f1301f9, float:1.9540676E38)
                    goto L_0x0227
                L_0x0200:
                    r7 = 2131952103(0x7f1301e7, float:1.954064E38)
                    goto L_0x0227
                L_0x0204:
                    r7 = 2131952705(0x7f130441, float:1.954186E38)
                    goto L_0x0227
                L_0x0208:
                    r7 = 2131953239(0x7f130657, float:1.9542943E38)
                    goto L_0x0227
                L_0x020c:
                    r7 = 2131952030(0x7f13019e, float:1.9540491E38)
                    goto L_0x0227
                L_0x0210:
                    r7 = 2131952090(0x7f1301da, float:1.9540613E38)
                    goto L_0x0227
                L_0x0214:
                    r7 = 2131952733(0x7f13045d, float:1.9541917E38)
                    goto L_0x0227
                L_0x0218:
                    r7 = 2131952391(0x7f130307, float:1.9541223E38)
                    goto L_0x0227
                L_0x021c:
                    r7 = 2131953591(0x7f1307b7, float:1.9543657E38)
                    goto L_0x0227
                L_0x0220:
                    r7 = 2131953272(0x7f130678, float:1.954301E38)
                    goto L_0x0227
                L_0x0224:
                    r7 = 2131953592(0x7f1307b8, float:1.954366E38)
                L_0x0227:
                    r23 = r7
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r7 = r8.f25216a
                    java.util.List<java.lang.String> r7 = r7.f25074c
                    java.lang.String r14 = "state"
                    if (r7 == 0) goto L_0x0238
                    boolean r7 = r7.contains(r14)
                    r24 = r7
                    goto L_0x023a
                L_0x0238:
                    r24 = 0
                L_0x023a:
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r7 = r8.f25216a
                    java.util.List<java.lang.String> r7 = r7.f25075d
                    if (r7 == 0) goto L_0x0247
                    boolean r7 = r7.contains(r14)
                    r25 = r7
                    goto L_0x0249
                L_0x0247:
                    r25 = 0
                L_0x0249:
                    java.util.Map<java.lang.String, com.etsy.android.ui.user.addresses.AdministrativeAreaType> r7 = r8.f25221f
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r15 = r8.f25216a
                    java.lang.String r15 = r15.f25077f
                    java.lang.Object r7 = r7.get(r15)
                    com.etsy.android.ui.user.addresses.AdministrativeAreaType r7 = (com.etsy.android.p327ui.user.addresses.AdministrativeAreaType) r7
                    if (r7 != 0) goto L_0x0259
                    com.etsy.android.ui.user.addresses.AdministrativeAreaType r7 = com.etsy.android.p327ui.user.addresses.AdministrativeAreaType.STATE_PROVINCE_REGION
                L_0x0259:
                    r26 = r7
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r7 = r8.f25216a
                    java.util.Map<java.lang.String, java.lang.String> r7 = r7.f25082k
                    if (r7 == 0) goto L_0x026e
                    boolean r7 = r7.isEmpty()
                    r15 = 1
                    r7 = r7 ^ r15
                    if (r7 == 0) goto L_0x026e
                    com.etsy.android.ui.user.addresses.FieldViewType r15 = com.etsy.android.p327ui.user.addresses.FieldViewType.DROPDOWN
                    r28 = r15
                    goto L_0x0270
                L_0x026e:
                    r28 = r6
                L_0x0270:
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r7 = r8.f25216a
                    java.util.Map<java.lang.String, java.lang.String> r7 = r7.f25082k
                    if (r7 != 0) goto L_0x027a
                    java.util.Map r7 = kotlin.collections.C19294b0.m32559p0()
                L_0x027a:
                    r27 = r7
                    com.etsy.android.ui.user.addresses.e0 r7 = new com.etsy.android.ui.user.addresses.e0
                    r21 = r7
                    r21.<init>(r22, r23, r24, r25, r26, r27, r28)
                    com.etsy.android.ui.user.addresses.AddressItemUI r15 = r8.f25217b
                    if (r15 == 0) goto L_0x028c
                    java.lang.String r15 = r15.getAdministrative_area()
                    goto L_0x028d
                L_0x028c:
                    r15 = 0
                L_0x028d:
                    r7.f25143i = r15
                    int r22 = android.view.View.generateViewId()
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r15 = r8.f25216a
                    java.lang.String r15 = r15.f25079h
                    r16 = 2131953237(0x7f130655, float:1.954294E38)
                    r17 = r9
                    if (r15 == 0) goto L_0x02cf
                    java.util.Map<java.lang.String, com.etsy.android.ui.user.addresses.PostalCodeType> r9 = r8.f25220e
                    java.lang.Object r9 = r9.get(r15)
                    com.etsy.android.ui.user.addresses.PostalCodeType r9 = (com.etsy.android.p327ui.user.addresses.PostalCodeType) r9
                    if (r9 != 0) goto L_0x02aa
                    r9 = -1
                    goto L_0x02b2
                L_0x02aa:
                    int[] r15 = com.etsy.android.p327ui.user.addresses.C11427m.C11428a.f25225d
                    int r9 = r9.ordinal()
                    r9 = r15[r9]
                L_0x02b2:
                    r15 = -1
                    if (r9 == r15) goto L_0x02cf
                    r15 = 1
                    if (r9 == r15) goto L_0x02c9
                    r15 = 2
                    if (r9 == r15) goto L_0x02c5
                    r15 = 3
                    if (r9 != r15) goto L_0x02bf
                    goto L_0x02cf
                L_0x02bf:
                    kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                    r0.<init>()
                    throw r0
                L_0x02c5:
                    r9 = 2131953745(0x7f130851, float:1.954397E38)
                    goto L_0x02cc
                L_0x02c9:
                    r9 = 2131953230(0x7f13064e, float:1.9542925E38)
                L_0x02cc:
                    r23 = r9
                    goto L_0x02d1
                L_0x02cf:
                    r23 = r16
                L_0x02d1:
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r9 = r8.f25216a
                    java.util.List<java.lang.String> r9 = r9.f25074c
                    java.lang.String r15 = "zip"
                    if (r9 == 0) goto L_0x02e0
                    boolean r9 = r9.contains(r15)
                    r24 = r9
                    goto L_0x02e2
                L_0x02e0:
                    r24 = 0
                L_0x02e2:
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r9 = r8.f25216a
                    java.util.List<java.lang.String> r9 = r9.f25075d
                    if (r9 == 0) goto L_0x02ef
                    boolean r9 = r9.contains(r15)
                    r25 = r9
                    goto L_0x02f1
                L_0x02ef:
                    r25 = 0
                L_0x02f1:
                    java.util.Map<java.lang.String, com.etsy.android.ui.user.addresses.PostalCodeType> r9 = r8.f25220e
                    r16 = r10
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r10 = r8.f25216a
                    java.lang.String r10 = r10.f25079h
                    java.lang.Object r9 = r9.get(r10)
                    com.etsy.android.ui.user.addresses.PostalCodeType r9 = (com.etsy.android.p327ui.user.addresses.PostalCodeType) r9
                    if (r9 != 0) goto L_0x0303
                    com.etsy.android.ui.user.addresses.PostalCodeType r9 = com.etsy.android.p327ui.user.addresses.PostalCodeType.POSTAL
                L_0x0303:
                    r26 = r9
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r9 = r8.f25216a
                    java.lang.String r9 = r9.f25085n
                    boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r9, r2)
                    if (r2 == 0) goto L_0x0314
                    com.etsy.android.ui.user.addresses.FieldViewType r2 = com.etsy.android.p327ui.user.addresses.FieldViewType.TYPE_AHEAD
                    r28 = r2
                    goto L_0x0316
                L_0x0314:
                    r28 = r6
                L_0x0316:
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r2 = r8.f25216a
                    java.lang.String r2 = r2.f25081j
                    if (r2 != 0) goto L_0x031e
                    java.lang.String r2 = ""
                L_0x031e:
                    r27 = r2
                    com.etsy.android.ui.user.addresses.m0 r2 = new com.etsy.android.ui.user.addresses.m0
                    r21 = r2
                    r21.<init>(r22, r23, r24, r25, r26, r27, r28)
                    com.etsy.android.ui.user.addresses.AddressItemUI r9 = r8.f25217b
                    if (r9 == 0) goto L_0x0330
                    java.lang.String r9 = r9.getPostal_code()
                    goto L_0x0331
                L_0x0330:
                    r9 = 0
                L_0x0331:
                    r2.f25234i = r9
                    com.etsy.android.ui.user.addresses.h0 r9 = new com.etsy.android.ui.user.addresses.h0
                    int r10 = android.view.View.generateViewId()
                    r18 = r2
                    com.etsy.android.ui.user.addresses.AddressItemUI r2 = r8.f25217b
                    if (r2 == 0) goto L_0x0344
                    boolean r2 = r2.is_default_address()
                    goto L_0x0345
                L_0x0344:
                    r2 = 0
                L_0x0345:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    r19 = r15
                    com.etsy.android.ui.user.addresses.FieldViewType r15 = com.etsy.android.p327ui.user.addresses.FieldViewType.CHECKBOX
                    r9.<init>(r10, r2, r15)
                    com.etsy.android.ui.user.addresses.AddressItemUI r2 = r8.f25217b
                    if (r2 == 0) goto L_0x035d
                    boolean r2 = r2.is_default_address()
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    goto L_0x035e
                L_0x035d:
                    r2 = 0
                L_0x035e:
                    r9.f25165f = r2
                    if (r34 != 0) goto L_0x036a
                    com.etsy.android.ui.user.addresses.e$c r2 = new com.etsy.android.ui.user.addresses.e$c
                    r2.<init>(r9)
                    r3.add(r2)
                L_0x036a:
                    com.etsy.android.ui.user.addresses.e$b r2 = new com.etsy.android.ui.user.addresses.e$b
                    com.etsy.android.ui.user.addresses.g0 r9 = new com.etsy.android.ui.user.addresses.g0
                    int r10 = android.view.View.generateViewId()
                    r9.<init>(r10, r6)
                    com.etsy.android.ui.user.addresses.AddressItemUI r6 = r8.f25217b
                    if (r6 == 0) goto L_0x037f
                    java.lang.String r6 = r6.getCountry_name()
                    if (r6 != 0) goto L_0x0388
                L_0x037f:
                    if (r33 != 0) goto L_0x0386
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r6 = r8.f25216a
                    java.lang.String r6 = r6.f25076e
                    goto L_0x0388
                L_0x0386:
                    r6 = r33
                L_0x0388:
                    r9.f25157e = r6
                    r2.<init>(r9)
                    r3.add(r2)
                    java.util.Iterator r1 = r1.iterator()
                L_0x0394:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0469
                    java.lang.Object r2 = r1.next()
                    java.lang.String r2 = (java.lang.String) r2
                    int r6 = r2.hashCode()
                    switch(r6) {
                        case -161037277: goto L_0x0446;
                        case 120609: goto L_0x042c;
                        case 3053931: goto L_0x0416;
                        case 3373707: goto L_0x0406;
                        case 106642798: goto L_0x03d1;
                        case 109757585: goto L_0x03c1;
                        case 265211103: goto L_0x03b1;
                        default: goto L_0x03a7;
                    }
                L_0x03a7:
                    r10 = r16
                    r15 = r17
                    r9 = r18
                    r6 = r19
                    goto L_0x045f
                L_0x03b1:
                    boolean r2 = r2.equals(r5)
                    if (r2 != 0) goto L_0x03b8
                    goto L_0x03a7
                L_0x03b8:
                    com.etsy.android.ui.user.addresses.e$k r2 = new com.etsy.android.ui.user.addresses.e$k
                    r2.<init>(r12)
                    r3.add(r2)
                    goto L_0x03a7
                L_0x03c1:
                    boolean r2 = r2.equals(r14)
                    if (r2 != 0) goto L_0x03c8
                    goto L_0x03a7
                L_0x03c8:
                    com.etsy.android.ui.user.addresses.e$a r2 = new com.etsy.android.ui.user.addresses.e$a
                    r2.<init>(r7)
                    r3.add(r2)
                    goto L_0x03a7
                L_0x03d1:
                    java.lang.String r6 = "phone"
                    boolean r2 = r2.equals(r6)
                    if (r2 != 0) goto L_0x03da
                    goto L_0x03a7
                L_0x03da:
                    com.etsy.android.ui.user.addresses.e$h r2 = new com.etsy.android.ui.user.addresses.e$h
                    com.etsy.android.ui.user.addresses.l0 r9 = new com.etsy.android.ui.user.addresses.l0
                    int r10 = android.view.View.generateViewId()
                    com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse r15 = r8.f25216a
                    java.util.List<java.lang.String> r15 = r15.f25074c
                    if (r15 == 0) goto L_0x03ed
                    boolean r6 = r15.contains(r6)
                    goto L_0x03ee
                L_0x03ed:
                    r6 = 0
                L_0x03ee:
                    com.etsy.android.ui.user.addresses.FieldViewType r15 = com.etsy.android.p327ui.user.addresses.FieldViewType.TEXT_INPUT
                    r9.<init>(r10, r6, r15)
                    com.etsy.android.ui.user.addresses.AddressItemUI r6 = r8.f25217b
                    if (r6 == 0) goto L_0x03fc
                    java.lang.String r6 = r6.getPhoneNumber()
                    goto L_0x03fd
                L_0x03fc:
                    r6 = 0
                L_0x03fd:
                    r9.f25213f = r6
                    r2.<init>(r9)
                    r3.add(r2)
                    goto L_0x03a7
                L_0x0406:
                    boolean r2 = r2.equals(r11)
                    if (r2 != 0) goto L_0x040d
                    goto L_0x041c
                L_0x040d:
                    com.etsy.android.ui.user.addresses.e$f r2 = new com.etsy.android.ui.user.addresses.e$f
                    r2.<init>(r0)
                    r3.add(r2)
                    goto L_0x0425
                L_0x0416:
                    boolean r2 = r2.equals(r4)
                    if (r2 != 0) goto L_0x041d
                L_0x041c:
                    goto L_0x0425
                L_0x041d:
                    com.etsy.android.ui.user.addresses.e$g r2 = new com.etsy.android.ui.user.addresses.e$g
                    r2.<init>(r13)
                    r3.add(r2)
                L_0x0425:
                    r10 = r16
                    r9 = r18
                    r6 = r19
                    goto L_0x0452
                L_0x042c:
                    r6 = r19
                    boolean r2 = r2.equals(r6)
                    if (r2 != 0) goto L_0x0439
                    r10 = r16
                    r9 = r18
                    goto L_0x0452
                L_0x0439:
                    com.etsy.android.ui.user.addresses.e$i r2 = new com.etsy.android.ui.user.addresses.e$i
                    r9 = r18
                    r2.<init>(r9)
                    r3.add(r2)
                    r10 = r16
                    goto L_0x0452
                L_0x0446:
                    r10 = r16
                    r9 = r18
                    r6 = r19
                    boolean r2 = r2.equals(r10)
                    if (r2 != 0) goto L_0x0455
                L_0x0452:
                    r15 = r17
                    goto L_0x045f
                L_0x0455:
                    com.etsy.android.ui.user.addresses.e$e r2 = new com.etsy.android.ui.user.addresses.e$e
                    r15 = r17
                    r2.<init>(r15)
                    r3.add(r2)
                L_0x045f:
                    r19 = r6
                    r18 = r9
                    r16 = r10
                    r17 = r15
                    goto L_0x0394
                L_0x0469:
                    r2 = r30
                    r0 = 1
                    if (r2 != r0) goto L_0x0473
                    com.etsy.android.ui.user.addresses.e$d r0 = com.etsy.android.p327ui.user.addresses.C11396e.C11400d.f25127a
                    r3.add(r0)
                L_0x0473:
                    com.etsy.android.ui.user.addresses.e$j r0 = com.etsy.android.p327ui.user.addresses.C11396e.C11406j.f25133a
                    r3.add(r0)
                    int r0 = r3.size()
                    r1 = -1
                    int r0 = r0 + r1
                    if (r0 < 0) goto L_0x0573
                L_0x0480:
                    int r1 = r0 + -1
                    java.lang.Object r0 = r3.get(r0)
                    com.etsy.android.ui.user.addresses.e r0 = (com.etsy.android.p327ui.user.addresses.C11396e) r0
                    boolean r2 = r0 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11401e
                    if (r2 == 0) goto L_0x04a5
                    com.etsy.android.ui.user.addresses.e$e r0 = (com.etsy.android.p327ui.user.addresses.C11396e.C11401e) r0
                    com.etsy.android.ui.user.addresses.i0 r2 = r0.f25128a
                    com.etsy.android.ui.user.addresses.FieldViewType r2 = r2.f25173f
                    int[] r4 = com.etsy.android.p327ui.user.addresses.C11395d0.f25123a
                    int r2 = r2.ordinal()
                    r2 = r4[r2]
                    r4 = 1
                    if (r2 != r4) goto L_0x0534
                    com.etsy.android.ui.user.addresses.i0 r0 = r0.f25128a
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    r0.f25176i = r1
                    goto L_0x0573
                L_0x04a5:
                    boolean r2 = r0 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11402f
                    if (r2 == 0) goto L_0x04c2
                    com.etsy.android.ui.user.addresses.e$f r0 = (com.etsy.android.p327ui.user.addresses.C11396e.C11402f) r0
                    com.etsy.android.ui.user.addresses.j0 r2 = r0.f25129a
                    com.etsy.android.ui.user.addresses.FieldViewType r2 = r2.f25183f
                    int[] r4 = com.etsy.android.p327ui.user.addresses.C11395d0.f25123a
                    int r2 = r2.ordinal()
                    r2 = r4[r2]
                    r4 = 1
                    if (r2 != r4) goto L_0x0534
                    com.etsy.android.ui.user.addresses.j0 r0 = r0.f25129a
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    r0.f25186i = r1
                    goto L_0x0573
                L_0x04c2:
                    boolean r2 = r0 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11407k
                    if (r2 == 0) goto L_0x04df
                    com.etsy.android.ui.user.addresses.e$k r0 = (com.etsy.android.p327ui.user.addresses.C11396e.C11407k) r0
                    com.etsy.android.ui.user.addresses.n0 r2 = r0.f25134a
                    com.etsy.android.ui.user.addresses.FieldViewType r2 = r2.f25254g
                    int[] r4 = com.etsy.android.p327ui.user.addresses.C11395d0.f25123a
                    int r2 = r2.ordinal()
                    r2 = r4[r2]
                    r4 = 1
                    if (r2 != r4) goto L_0x0534
                    com.etsy.android.ui.user.addresses.n0 r0 = r0.f25134a
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    r0.f25257j = r1
                    goto L_0x0573
                L_0x04df:
                    boolean r2 = r0 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11403g
                    if (r2 == 0) goto L_0x04fc
                    com.etsy.android.ui.user.addresses.e$g r0 = (com.etsy.android.p327ui.user.addresses.C11396e.C11403g) r0
                    com.etsy.android.ui.user.addresses.k0 r2 = r0.f25130a
                    com.etsy.android.ui.user.addresses.FieldViewType r2 = r2.f25194g
                    int[] r4 = com.etsy.android.p327ui.user.addresses.C11395d0.f25123a
                    int r2 = r2.ordinal()
                    r2 = r4[r2]
                    r4 = 1
                    if (r2 != r4) goto L_0x0534
                    com.etsy.android.ui.user.addresses.k0 r0 = r0.f25130a
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    r0.f25197j = r1
                    goto L_0x0573
                L_0x04fc:
                    boolean r2 = r0 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11397a
                    if (r2 == 0) goto L_0x0518
                    com.etsy.android.ui.user.addresses.e$a r0 = (com.etsy.android.p327ui.user.addresses.C11396e.C11397a) r0
                    com.etsy.android.ui.user.addresses.e0 r2 = r0.f25124a
                    com.etsy.android.ui.user.addresses.FieldViewType r2 = r2.f25142h
                    int[] r4 = com.etsy.android.p327ui.user.addresses.C11395d0.f25123a
                    int r2 = r2.ordinal()
                    r2 = r4[r2]
                    r4 = 1
                    if (r2 != r4) goto L_0x0534
                    com.etsy.android.ui.user.addresses.e0 r0 = r0.f25124a
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    r0.f25145k = r1
                    goto L_0x0573
                L_0x0518:
                    boolean r2 = r0 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11405i
                    if (r2 == 0) goto L_0x0536
                    com.etsy.android.ui.user.addresses.e$i r0 = (com.etsy.android.p327ui.user.addresses.C11396e.C11405i) r0
                    com.etsy.android.ui.user.addresses.m0 r2 = r0.f25132a
                    com.etsy.android.ui.user.addresses.FieldViewType r2 = r2.f25233h
                    int[] r4 = com.etsy.android.p327ui.user.addresses.C11395d0.f25123a
                    int r2 = r2.ordinal()
                    r2 = r4[r2]
                    r4 = 1
                    if (r2 != r4) goto L_0x0534
                    com.etsy.android.ui.user.addresses.m0 r0 = r0.f25132a
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    r0.f25236k = r1
                    goto L_0x0573
                L_0x0534:
                    r14 = 1
                    goto L_0x056d
                L_0x0536:
                    boolean r2 = r0 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11404h
                    if (r2 == 0) goto L_0x0552
                    com.etsy.android.ui.user.addresses.e$h r0 = (com.etsy.android.p327ui.user.addresses.C11396e.C11404h) r0
                    com.etsy.android.ui.user.addresses.l0 r2 = r0.f25131a
                    com.etsy.android.ui.user.addresses.FieldViewType r2 = r2.f25212e
                    int[] r4 = com.etsy.android.p327ui.user.addresses.C11395d0.f25123a
                    int r2 = r2.ordinal()
                    r2 = r4[r2]
                    r14 = 1
                    if (r2 != r14) goto L_0x056d
                    com.etsy.android.ui.user.addresses.l0 r0 = r0.f25131a
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    r0.f25215h = r1
                    goto L_0x0573
                L_0x0552:
                    r14 = 1
                    boolean r2 = r0 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11399c
                    if (r2 == 0) goto L_0x0559
                    r2 = r14
                    goto L_0x055b
                L_0x0559:
                    boolean r2 = r0 instanceof com.etsy.android.p327ui.user.addresses.C11396e.C11398b
                L_0x055b:
                    if (r2 == 0) goto L_0x055f
                    r2 = r14
                    goto L_0x0565
                L_0x055f:
                    com.etsy.android.ui.user.addresses.e$d r2 = com.etsy.android.p327ui.user.addresses.C11396e.C11400d.f25127a
                    boolean r2 = kotlin.jvm.internal.C19383o.m32792b(r0, r2)
                L_0x0565:
                    if (r2 == 0) goto L_0x0568
                    goto L_0x056d
                L_0x0568:
                    com.etsy.android.ui.user.addresses.e$j r2 = com.etsy.android.p327ui.user.addresses.C11396e.C11406j.f25133a
                    kotlin.jvm.internal.C19383o.m32792b(r0, r2)
                L_0x056d:
                    if (r1 >= 0) goto L_0x0570
                    goto L_0x0573
                L_0x0570:
                    r0 = r1
                    goto L_0x0480
                L_0x0573:
                    r0 = r29
                    r0.f25068a = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.user.addresses.AddressDetailViewModel.C11361a.C11370i.<init>(int, com.etsy.android.ui.user.addresses.AddressDetailsLayoutResponse, com.etsy.android.ui.user.addresses.AddressItemUI, java.lang.String, boolean):void");
            }
        }

        /* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$a$j */
        public static final class C11371j extends C11361a {

            /* renamed from: a */
            public final List<C11396e> f25069a;

            public C11371j(ArrayList arrayList) {
                this.f25069a = arrayList;
            }
        }
    }

    /* renamed from: com.etsy.android.ui.user.addresses.AddressDetailViewModel$b */
    public static final class C11372b<T, R> implements C8339g {

        /* renamed from: b */
        public static final C11372b<T, R> f25070b = new C11372b<>();

        public final R apply(Object obj) {
            C19383o.m32797g(obj, "item");
            R r = (C11463z.C11469f) (!(obj instanceof C11463z.C11469f) ? null : obj);
            if (r != null) {
                return r;
            }
            StringBuilder h = C0072d.m201h("Expected value of type ");
            h.append(C11463z.C11469f.class.getSimpleName());
            h.append(", but it was ");
            h.append(obj.getClass().getSimpleName());
            throw new UnexpectedResultException(h.toString());
        }
    }

    public AddressDetailViewModel(C13461f fVar, C11393c0 c0Var, C12703a aVar) {
        C19383o.m32797g(fVar, "schedulers");
        C19383o.m32797g(c0Var, "addressesRepository");
        C19383o.m32797g(aVar, "grafana");
        this.f25050b = fVar;
        this.f25051c = c0Var;
        this.f25052d = aVar;
    }

    /* renamed from: c */
    public static C11462y m19247c(C11425l lVar) {
        String str = lVar.f25199b;
        String str2 = str == null ? "" : str;
        String str3 = lVar.f25200c;
        String str4 = str3 == null ? "" : str3;
        String str5 = lVar.f25201d;
        String str6 = str5 == null ? "" : str5;
        String str7 = lVar.f25202e;
        String str8 = str7 == null ? "" : str7;
        String str9 = lVar.f25203f;
        String str10 = str9 == null ? "" : str9;
        String str11 = lVar.f25204g;
        String str12 = str11 == null ? "" : str11;
        Boolean bool = lVar.f25207j;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Integer num = lVar.f25205h;
        return new C11462y(str2, str4, str6, str8, str10, str12, num != null ? num.intValue() : 0, lVar.f25206i, booleanValue);
    }

    /* renamed from: b */
    public final void mo37150b(Integer num, String str, Boolean bool) {
        this.f25059k = bool;
        if (num != null) {
            this.f25057i = num;
            this.f25055g.f25205h = num;
            this.f25054f.postValue(C11361a.C11367f.f25065a);
            ConsumerSingleObserver e = SubscribersKt.m32500e(new C19208j(C0391c.m1056b(this.f25050b, C0326j.m860e(this.f25050b, this.f25051c.mo37264a(new C11381a0.C11386e(num.intValue())))), C11372b.f25070b), new AddressDetailViewModel$getLayoutForCountry$1(this), new AddressDetailViewModel$getLayoutForCountry$2(this, str, bool));
            C7091a aVar = this.f25053e;
            C19383o.m32798h(aVar, "compositeDisposable");
            aVar.mo19403b(e);
        }
    }
}
