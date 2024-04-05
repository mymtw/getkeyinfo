package com.etsy.android.p327ui.listing.p329ui.buyitnow;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import androidx.appcompat.widget.C0326j;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8915n;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0023f;
import p504ai.C13983i;
import p628nj.C18263b;

/* renamed from: com.etsy.android.ui.listing.ui.buyitnow.UiState */
public abstract class UiState {
    public static final int $stable = 0;

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.UiState$a */
    public static final class C10366a extends UiState {

        /* renamed from: b */
        public static final C10366a f22722b = new C10366a();

        public C10366a() {
            super((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.UiState$b */
    public static final class C10367b extends UiState {

        /* renamed from: b */
        public static final C10367b f22723b = new C10367b();

        public C10367b() {
            super((DefaultConstructorMarker) null);
        }
    }

    private UiState() {
    }

    public /* synthetic */ UiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.UiState$Summary */
    public static final class Summary extends UiState implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Summary> CREATOR = new Creator();
        private final List<PaymentMethod> availablePaymentMethods;
        private final List<ShippingAddress> availableShippingAddresses;
        private final List<ShippingMethod> availableShippingMethods;
        private final String checkoutButtonLabel;
        private final String listingImageUrl;
        private final String listingPersonalization;
        private final int listingQuantity;
        private final String listingTitle;
        private final String listingVariation1;
        private final String listingVariation2;
        private final boolean orderSummaryExpanded;
        private final PaymentMethod paymentMethod;
        private final ShippingAddress selectedShippingAddress;
        private final ShippingMethod shippingMethod;
        private final List<SubtotalLineItem> subtotalLineItems;
        private final String termsAndConditions;
        private final String total;

        /* renamed from: com.etsy.android.ui.listing.ui.buyitnow.UiState$Summary$Creator */
        public static final class Creator implements Parcelable.Creator<Summary> {
            public final Summary createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                C19383o.m32797g(parcel2, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                int readInt = parcel.readInt();
                ShippingMethod createFromParcel = ShippingMethod.CREATOR.createFromParcel(parcel2);
                ShippingAddress createFromParcel2 = ShippingAddress.CREATOR.createFromParcel(parcel2);
                PaymentMethod createFromParcel3 = PaymentMethod.CREATOR.createFromParcel(parcel2);
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    arrayList.add(SubtotalLineItem.CREATOR.createFromParcel(parcel2));
                }
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                int readInt3 = parcel.readInt();
                String str = readString8;
                ArrayList arrayList2 = new ArrayList(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    arrayList2.add(ShippingMethod.CREATOR.createFromParcel(parcel2));
                    i2++;
                    readInt3 = readInt3;
                }
                int readInt4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt4);
                ArrayList arrayList4 = arrayList2;
                int i3 = 0;
                while (i3 != readInt4) {
                    arrayList3.add(ShippingAddress.CREATOR.createFromParcel(parcel2));
                    i3++;
                    readInt4 = readInt4;
                }
                int readInt5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt5);
                ArrayList arrayList6 = arrayList3;
                int i4 = 0;
                while (i4 != readInt5) {
                    arrayList5.add(PaymentMethod.CREATOR.createFromParcel(parcel2));
                    i4++;
                    readInt5 = readInt5;
                }
                return new Summary(readString, readString2, readString3, readString4, readString5, readInt, createFromParcel, createFromParcel2, createFromParcel3, arrayList, readString6, readString7, str, arrayList4, arrayList6, arrayList5, parcel.readInt() != 0);
            }

            public final Summary[] newArray(int i) {
                return new Summary[i];
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Summary(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, com.etsy.android.p327ui.listing.p329ui.buyitnow.ShippingMethod r28, com.etsy.android.p327ui.listing.p329ui.buyitnow.ShippingAddress r29, com.etsy.android.p327ui.listing.p329ui.buyitnow.PaymentMethod r30, java.util.List r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.util.List r35, java.util.List r36, java.util.List r37, boolean r38, int r39, kotlin.jvm.internal.DefaultConstructorMarker r40) {
            /*
                r21 = this;
                r0 = r39
                r1 = r0 & 4
                java.lang.String r2 = ""
                if (r1 == 0) goto L_0x000a
                r6 = r2
                goto L_0x000c
            L_0x000a:
                r6 = r24
            L_0x000c:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0012
                r7 = r2
                goto L_0x0014
            L_0x0012:
                r7 = r25
            L_0x0014:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x001a
                r8 = r2
                goto L_0x001c
            L_0x001a:
                r8 = r26
            L_0x001c:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0023
                r1 = 1
                r9 = r1
                goto L_0x0025
            L_0x0023:
                r9 = r27
            L_0x0025:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0035
                com.etsy.android.ui.listing.ui.buyitnow.ShippingMethod r1 = new com.etsy.android.ui.listing.ui.buyitnow.ShippingMethod
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 7
                r15 = 0
                r10 = r1
                r10.<init>(r11, r12, r13, r14, r15)
                goto L_0x0037
            L_0x0035:
                r10 = r28
            L_0x0037:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0044
                com.etsy.android.ui.listing.ui.buyitnow.ShippingAddress r1 = new com.etsy.android.ui.listing.ui.buyitnow.ShippingAddress
                r3 = 3
                r4 = 0
                r1.<init>(r4, r4, r3, r4)
                r11 = r1
                goto L_0x0046
            L_0x0044:
                r11 = r29
            L_0x0046:
                r1 = r0 & 256(0x100, float:3.59E-43)
                if (r1 == 0) goto L_0x0062
                com.etsy.android.ui.listing.ui.buyitnow.PaymentMethod r1 = new com.etsy.android.ui.listing.ui.buyitnow.PaymentMethod
                r3 = 0
                r4 = 0
                r5 = 0
                r12 = 7
                r13 = 0
                r24 = r1
                r25 = r3
                r26 = r4
                r27 = r5
                r28 = r12
                r29 = r13
                r24.<init>(r25, r26, r27, r28, r29)
                r12 = r1
                goto L_0x0064
            L_0x0062:
                r12 = r30
            L_0x0064:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x006c
                kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
                r13 = r1
                goto L_0x006e
            L_0x006c:
                r13 = r31
            L_0x006e:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L_0x0074
                r14 = r2
                goto L_0x0076
            L_0x0074:
                r14 = r32
            L_0x0076:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L_0x007c
                r15 = r2
                goto L_0x007e
            L_0x007c:
                r15 = r33
            L_0x007e:
                r1 = r0 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L_0x0085
                r16 = r2
                goto L_0x0087
            L_0x0085:
                r16 = r34
            L_0x0087:
                r1 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r1 == 0) goto L_0x0090
                kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
                r17 = r1
                goto L_0x0092
            L_0x0090:
                r17 = r35
            L_0x0092:
                r1 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r1 == 0) goto L_0x009b
                kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
                r18 = r1
                goto L_0x009d
            L_0x009b:
                r18 = r36
            L_0x009d:
                r1 = 32768(0x8000, float:4.5918E-41)
                r1 = r1 & r0
                if (r1 == 0) goto L_0x00a8
                kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.INSTANCE
                r19 = r1
                goto L_0x00aa
            L_0x00a8:
                r19 = r37
            L_0x00aa:
                r1 = 65536(0x10000, float:9.18355E-41)
                r0 = r0 & r1
                if (r0 == 0) goto L_0x00b3
                r0 = 0
                r20 = r0
                goto L_0x00b5
            L_0x00b3:
                r20 = r38
            L_0x00b5:
                r3 = r21
                r4 = r22
                r5 = r23
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.listing.p329ui.buyitnow.UiState.Summary.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.etsy.android.ui.listing.ui.buyitnow.ShippingMethod, com.etsy.android.ui.listing.ui.buyitnow.ShippingAddress, com.etsy.android.ui.listing.ui.buyitnow.PaymentMethod, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public static /* synthetic */ Summary copy$default(Summary summary, String str, String str2, String str3, String str4, String str5, int i, ShippingMethod shippingMethod2, ShippingAddress shippingAddress, PaymentMethod paymentMethod2, List list, String str6, String str7, String str8, List list2, List list3, List list4, boolean z, int i2, Object obj) {
            Summary summary2 = summary;
            int i3 = i2;
            return summary.copy((i3 & 1) != 0 ? summary2.listingTitle : str, (i3 & 2) != 0 ? summary2.listingImageUrl : str2, (i3 & 4) != 0 ? summary2.listingPersonalization : str3, (i3 & 8) != 0 ? summary2.listingVariation1 : str4, (i3 & 16) != 0 ? summary2.listingVariation2 : str5, (i3 & 32) != 0 ? summary2.listingQuantity : i, (i3 & 64) != 0 ? summary2.shippingMethod : shippingMethod2, (i3 & 128) != 0 ? summary2.selectedShippingAddress : shippingAddress, (i3 & 256) != 0 ? summary2.paymentMethod : paymentMethod2, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN) != 0 ? summary2.subtotalLineItems : list, (i3 & RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? summary2.total : str6, (i3 & RecyclerView.C3084b0.FLAG_MOVED) != 0 ? summary2.checkoutButtonLabel : str7, (i3 & RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? summary2.termsAndConditions : str8, (i3 & 8192) != 0 ? summary2.availableShippingMethods : list2, (i3 & PrimitiveArrayBuilder.SMALL_CHUNK_SIZE) != 0 ? summary2.availableShippingAddresses : list3, (i3 & 32768) != 0 ? summary2.availablePaymentMethods : list4, (i3 & 65536) != 0 ? summary2.orderSummaryExpanded : z);
        }

        public final String component1() {
            return this.listingTitle;
        }

        public final List<SubtotalLineItem> component10() {
            return this.subtotalLineItems;
        }

        public final String component11() {
            return this.total;
        }

        public final String component12() {
            return this.checkoutButtonLabel;
        }

        public final String component13() {
            return this.termsAndConditions;
        }

        public final List<ShippingMethod> component14() {
            return this.availableShippingMethods;
        }

        public final List<ShippingAddress> component15() {
            return this.availableShippingAddresses;
        }

        public final List<PaymentMethod> component16() {
            return this.availablePaymentMethods;
        }

        public final boolean component17() {
            return this.orderSummaryExpanded;
        }

        public final String component2() {
            return this.listingImageUrl;
        }

        public final String component3() {
            return this.listingPersonalization;
        }

        public final String component4() {
            return this.listingVariation1;
        }

        public final String component5() {
            return this.listingVariation2;
        }

        public final int component6() {
            return this.listingQuantity;
        }

        public final ShippingMethod component7() {
            return this.shippingMethod;
        }

        public final ShippingAddress component8() {
            return this.selectedShippingAddress;
        }

        public final PaymentMethod component9() {
            return this.paymentMethod;
        }

        public final Summary copy(String str, String str2, String str3, String str4, String str5, int i, ShippingMethod shippingMethod2, ShippingAddress shippingAddress, PaymentMethod paymentMethod2, List<SubtotalLineItem> list, String str6, String str7, String str8, List<ShippingMethod> list2, List<ShippingAddress> list3, List<PaymentMethod> list4, boolean z) {
            String str9 = str;
            C19383o.m32797g(str9, "listingTitle");
            C19383o.m32797g(str2, "listingImageUrl");
            C19383o.m32797g(str3, "listingPersonalization");
            C19383o.m32797g(str4, "listingVariation1");
            C19383o.m32797g(str5, "listingVariation2");
            C19383o.m32797g(shippingMethod2, "shippingMethod");
            C19383o.m32797g(shippingAddress, "selectedShippingAddress");
            C19383o.m32797g(paymentMethod2, "paymentMethod");
            C19383o.m32797g(list, "subtotalLineItems");
            C19383o.m32797g(str6, ResponseConstants.TOTAL);
            C19383o.m32797g(str7, "checkoutButtonLabel");
            C19383o.m32797g(str8, "termsAndConditions");
            C19383o.m32797g(list2, "availableShippingMethods");
            C19383o.m32797g(list3, "availableShippingAddresses");
            C19383o.m32797g(list4, "availablePaymentMethods");
            return new Summary(str9, str2, str3, str4, str5, i, shippingMethod2, shippingAddress, paymentMethod2, list, str6, str7, str8, list2, list3, list4, z);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) obj;
            return C19383o.m32792b(this.listingTitle, summary.listingTitle) && C19383o.m32792b(this.listingImageUrl, summary.listingImageUrl) && C19383o.m32792b(this.listingPersonalization, summary.listingPersonalization) && C19383o.m32792b(this.listingVariation1, summary.listingVariation1) && C19383o.m32792b(this.listingVariation2, summary.listingVariation2) && this.listingQuantity == summary.listingQuantity && C19383o.m32792b(this.shippingMethod, summary.shippingMethod) && C19383o.m32792b(this.selectedShippingAddress, summary.selectedShippingAddress) && C19383o.m32792b(this.paymentMethod, summary.paymentMethod) && C19383o.m32792b(this.subtotalLineItems, summary.subtotalLineItems) && C19383o.m32792b(this.total, summary.total) && C19383o.m32792b(this.checkoutButtonLabel, summary.checkoutButtonLabel) && C19383o.m32792b(this.termsAndConditions, summary.termsAndConditions) && C19383o.m32792b(this.availableShippingMethods, summary.availableShippingMethods) && C19383o.m32792b(this.availableShippingAddresses, summary.availableShippingAddresses) && C19383o.m32792b(this.availablePaymentMethods, summary.availablePaymentMethods) && this.orderSummaryExpanded == summary.orderSummaryExpanded;
        }

        public final List<PaymentMethod> getAvailablePaymentMethods() {
            return this.availablePaymentMethods;
        }

        public final List<ShippingAddress> getAvailableShippingAddresses() {
            return this.availableShippingAddresses;
        }

        public final List<ShippingMethod> getAvailableShippingMethods() {
            return this.availableShippingMethods;
        }

        public final String getCheckoutButtonLabel() {
            return this.checkoutButtonLabel;
        }

        public final String getListingImageUrl() {
            return this.listingImageUrl;
        }

        public final String getListingPersonalization() {
            return this.listingPersonalization;
        }

        public final int getListingQuantity() {
            return this.listingQuantity;
        }

        public final String getListingTitle() {
            return this.listingTitle;
        }

        public final String getListingVariation1() {
            return this.listingVariation1;
        }

        public final String getListingVariation2() {
            return this.listingVariation2;
        }

        public final boolean getOrderSummaryExpanded() {
            return this.orderSummaryExpanded;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final ShippingAddress getSelectedShippingAddress() {
            return this.selectedShippingAddress;
        }

        public final ShippingMethod getShippingMethod() {
            return this.shippingMethod;
        }

        public final Spanned getSpannedTermsAndConditions() {
            boolean z;
            Spanned s0 = C18263b.m30867s0(this.termsAndConditions);
            URLSpan[] uRLSpanArr = (URLSpan[]) s0.getSpans(0, s0.length(), URLSpan.class);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s0);
            C19383o.m32796f(uRLSpanArr, "urlSpans");
            for (URLSpan uRLSpan : uRLSpanArr) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                spannableStringBuilder.removeSpan(uRLSpan);
                String url = uRLSpan.getURL();
                List<String> list = C8915n.f19672a;
                try {
                    z = "www.etsy.com".equals(new URL(url).getHost());
                } catch (MalformedURLException unused) {
                    z = false;
                }
                if (!z) {
                    url = C0326j.m864i("http://www.etsy.com", url);
                }
                spannableStringBuilder.setSpan(new EtsyLinkify.UnderlineURLSpan(url, true, true), spanStart, spanEnd, 33);
            }
            return spannableStringBuilder;
        }

        public final List<SubtotalLineItem> getSubtotalLineItems() {
            return this.subtotalLineItems;
        }

        public final String getTermsAndConditions() {
            return this.termsAndConditions;
        }

        public final String getTotal() {
            return this.total;
        }

        public int hashCode() {
            int a = C0069a.m170a(this.listingQuantity, C0023f.m105e(this.listingVariation2, C0023f.m105e(this.listingVariation1, C0023f.m105e(this.listingPersonalization, C0023f.m105e(this.listingImageUrl, this.listingTitle.hashCode() * 31, 31), 31), 31), 31), 31);
            int hashCode = this.selectedShippingAddress.hashCode();
            int hashCode2 = this.paymentMethod.hashCode();
            int g = C13983i.m21488g(this.availablePaymentMethods, C13983i.m21488g(this.availableShippingAddresses, C13983i.m21488g(this.availableShippingMethods, C0023f.m105e(this.termsAndConditions, C0023f.m105e(this.checkoutButtonLabel, C0023f.m105e(this.total, C13983i.m21488g(this.subtotalLineItems, (hashCode2 + ((hashCode + ((this.shippingMethod.hashCode() + a) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31);
            boolean z = this.orderSummaryExpanded;
            if (z) {
                z = true;
            }
            return g + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("Summary(listingTitle=");
            h.append(this.listingTitle);
            h.append(", listingImageUrl=");
            h.append(this.listingImageUrl);
            h.append(", listingPersonalization=");
            h.append(this.listingPersonalization);
            h.append(", listingVariation1=");
            h.append(this.listingVariation1);
            h.append(", listingVariation2=");
            h.append(this.listingVariation2);
            h.append(", listingQuantity=");
            h.append(this.listingQuantity);
            h.append(", shippingMethod=");
            h.append(this.shippingMethod);
            h.append(", selectedShippingAddress=");
            h.append(this.selectedShippingAddress);
            h.append(", paymentMethod=");
            h.append(this.paymentMethod);
            h.append(", subtotalLineItems=");
            h.append(this.subtotalLineItems);
            h.append(", total=");
            h.append(this.total);
            h.append(", checkoutButtonLabel=");
            h.append(this.checkoutButtonLabel);
            h.append(", termsAndConditions=");
            h.append(this.termsAndConditions);
            h.append(", availableShippingMethods=");
            h.append(this.availableShippingMethods);
            h.append(", availableShippingAddresses=");
            h.append(this.availableShippingAddresses);
            h.append(", availablePaymentMethods=");
            h.append(this.availablePaymentMethods);
            h.append(", orderSummaryExpanded=");
            return C0391c.m1058d(h, this.orderSummaryExpanded, ')');
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19383o.m32797g(parcel, "out");
            parcel.writeString(this.listingTitle);
            parcel.writeString(this.listingImageUrl);
            parcel.writeString(this.listingPersonalization);
            parcel.writeString(this.listingVariation1);
            parcel.writeString(this.listingVariation2);
            parcel.writeInt(this.listingQuantity);
            this.shippingMethod.writeToParcel(parcel, i);
            this.selectedShippingAddress.writeToParcel(parcel, i);
            this.paymentMethod.writeToParcel(parcel, i);
            List<SubtotalLineItem> list = this.subtotalLineItems;
            parcel.writeInt(list.size());
            for (SubtotalLineItem writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
            parcel.writeString(this.total);
            parcel.writeString(this.checkoutButtonLabel);
            parcel.writeString(this.termsAndConditions);
            List<ShippingMethod> list2 = this.availableShippingMethods;
            parcel.writeInt(list2.size());
            for (ShippingMethod writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, i);
            }
            List<ShippingAddress> list3 = this.availableShippingAddresses;
            parcel.writeInt(list3.size());
            for (ShippingAddress writeToParcel3 : list3) {
                writeToParcel3.writeToParcel(parcel, i);
            }
            List<PaymentMethod> list4 = this.availablePaymentMethods;
            parcel.writeInt(list4.size());
            for (PaymentMethod writeToParcel4 : list4) {
                writeToParcel4.writeToParcel(parcel, i);
            }
            parcel.writeInt(this.orderSummaryExpanded ? 1 : 0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Summary(String str, String str2, String str3, String str4, String str5, int i, ShippingMethod shippingMethod2, ShippingAddress shippingAddress, PaymentMethod paymentMethod2, List<SubtotalLineItem> list, String str6, String str7, String str8, List<ShippingMethod> list2, List<ShippingAddress> list3, List<PaymentMethod> list4, boolean z) {
            super((DefaultConstructorMarker) null);
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            String str13 = str5;
            ShippingMethod shippingMethod3 = shippingMethod2;
            ShippingAddress shippingAddress2 = shippingAddress;
            PaymentMethod paymentMethod3 = paymentMethod2;
            List<SubtotalLineItem> list5 = list;
            String str14 = str6;
            String str15 = str7;
            String str16 = str8;
            List<ShippingMethod> list6 = list2;
            List<ShippingAddress> list7 = list3;
            C19383o.m32797g(str9, "listingTitle");
            C19383o.m32797g(str10, "listingImageUrl");
            C19383o.m32797g(str11, "listingPersonalization");
            C19383o.m32797g(str12, "listingVariation1");
            C19383o.m32797g(str13, "listingVariation2");
            C19383o.m32797g(shippingMethod3, "shippingMethod");
            C19383o.m32797g(shippingAddress2, "selectedShippingAddress");
            C19383o.m32797g(paymentMethod3, "paymentMethod");
            C19383o.m32797g(list5, "subtotalLineItems");
            C19383o.m32797g(str14, ResponseConstants.TOTAL);
            C19383o.m32797g(str15, "checkoutButtonLabel");
            C19383o.m32797g(str16, "termsAndConditions");
            C19383o.m32797g(list6, "availableShippingMethods");
            C19383o.m32797g(list7, "availableShippingAddresses");
            C19383o.m32797g(list4, "availablePaymentMethods");
            this.listingTitle = str9;
            this.listingImageUrl = str10;
            this.listingPersonalization = str11;
            this.listingVariation1 = str12;
            this.listingVariation2 = str13;
            this.listingQuantity = i;
            this.shippingMethod = shippingMethod3;
            this.selectedShippingAddress = shippingAddress2;
            this.paymentMethod = paymentMethod3;
            this.subtotalLineItems = list5;
            this.total = str14;
            this.checkoutButtonLabel = str15;
            this.termsAndConditions = str16;
            this.availableShippingMethods = list6;
            this.availableShippingAddresses = list7;
            this.availablePaymentMethods = list4;
            this.orderSummaryExpanded = z;
        }
    }
}
