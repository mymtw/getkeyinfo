package com.etsy.android.lib.models;

import com.squareup.moshi.C17387a0;
import com.squareup.moshi.C17412w;
import com.squareup.moshi.C17414y;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.C19383o;

public final class ReceiptApiModelJsonAdapter extends JsonAdapter<ReceiptApiModel> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<List<ReceiptShipment>> listOfReceiptShipmentAdapter;
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonAdapter<List<Transaction>> listOfTransactionAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonAdapter<Country> nullableCountryAdapter;
    private final JsonAdapter<Coupon> nullableCouponAdapter;
    private final JsonAdapter<GuestUser> nullableGuestUserAdapter;
    private final JsonAdapter<List<UserNote>> nullableListOfUserNoteAdapter;
    private final JsonAdapter<Location> nullableLocationAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<PaymentMethod> nullablePaymentMethodAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<User> nullableUserAdapter;
    private final JsonReader.C17362b options = JsonReader.C17362b.m29110a(ResponseConstants.RECEIPT_ID, "receipt_type", "payment_method_name", "payment_method_object", "flagged_for_manual_fraud_review", "was_paid", "was_giftcard_balance_applied", "buyer_primary_gc_amt", "total_tax_cost", "gift_wrap_price", "total_vat_cost", "vat_credit_note_ids", "donation_description", "donation_terms_link_url", "donation_terms_link_text", ResponseConstants.TOTAL_PRICE, "total_shipping_cost", "discount_amt", "etsy_coupon_discount_amt", "grandtotal", ResponseConstants.CURRENCY_CODE, ResponseConstants.TRANSPARENT_PRICE_MESSAGE, "was_shipped", "is_in_person", "is_anonymous_buyer", "shipping_carrier", "seller_email", "name", ResponseConstants.FIRST_LINE, ResponseConstants.SECOND_LINE, "city", "state", ResponseConstants.ZIP, "message_from_seller", "message_from_buyer", "shipping_note", "shipping_tracking_url", "shipping_details", ResponseConstants.CREATION_TSZ, "can_refund", "shipping_notification_date", "shipped_date", "estimated_shipped_tsz", "coupon", "country", "buyer", "guest_buyer", "seller", "locations", ResponseConstants.TRANSACTIONS, "shipments", "UserNotes", ResponseConstants.IS_GUEST, "multi_shop_note", "is_gift", "gift_message", "needs_gift_wrap");
    private final JsonAdapter<ReceiptShippingDetails> receiptShippingDetailsAdapter;
    private final JsonAdapter<String> stringAdapter;

    public ReceiptApiModelJsonAdapter(C17414y yVar) {
        C17414y yVar2 = yVar;
        Class<String> cls = String.class;
        C19383o.m32797g(yVar2, "moshi");
        Class cls2 = Long.TYPE;
        EmptySet emptySet = EmptySet.INSTANCE;
        this.longAdapter = yVar2.mo68558c(cls2, emptySet, "receiptId");
        this.intAdapter = yVar2.mo68558c(Integer.TYPE, emptySet, "receiptTypeCode");
        this.nullableStringAdapter = yVar2.mo68558c(cls, emptySet, "paymentMethodName");
        this.nullablePaymentMethodAdapter = yVar2.mo68558c(PaymentMethod.class, emptySet, "paymentMethod");
        this.booleanAdapter = yVar2.mo68558c(Boolean.TYPE, emptySet, "isFlaggedForManualFraudReview");
        this.stringAdapter = yVar2.mo68558c(cls, emptySet, "totalTaxCost");
        this.listOfStringAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, cls), emptySet, "vatCreditNoteIds");
        this.receiptShippingDetailsAdapter = yVar2.mo68558c(ReceiptShippingDetails.class, emptySet, "shippingDetails");
        this.nullableBooleanAdapter = yVar2.mo68558c(Boolean.class, emptySet, "canRefund");
        this.nullableLongAdapter = yVar2.mo68558c(Long.class, emptySet, "shippingNotificationTsz");
        this.nullableCouponAdapter = yVar2.mo68558c(Coupon.class, emptySet, "coupon");
        this.nullableCountryAdapter = yVar2.mo68558c(Country.class, emptySet, "country");
        this.nullableUserAdapter = yVar2.mo68558c(User.class, emptySet, "buyer");
        this.nullableGuestUserAdapter = yVar2.mo68558c(GuestUser.class, emptySet, "guestUser");
        this.nullableLocationAdapter = yVar2.mo68558c(Location.class, emptySet, "location");
        this.listOfTransactionAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, Transaction.class), emptySet, ResponseConstants.TRANSACTIONS);
        this.listOfReceiptShipmentAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, ReceiptShipment.class), emptySet, "shipments");
        this.nullableListOfUserNoteAdapter = yVar2.mo68558c(C17387a0.m29126d(List.class, UserNote.class), emptySet, "userNotes");
    }

    public String toString() {
        return "GeneratedJsonAdapter(ReceiptApiModel)";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0557, code lost:
        r15 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0559, code lost:
        r8 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x055b, code lost:
        r14 = r61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x055d, code lost:
        r13 = r63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x055f, code lost:
        r12 = r64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0561, code lost:
        r11 = r65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0563, code lost:
        r10 = r66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0565, code lost:
        r9 = r67;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0567, code lost:
        r7 = r68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0569, code lost:
        r6 = r69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x056b, code lost:
        r5 = r70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x056d, code lost:
        r4 = r71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x056f, code lost:
        r3 = r72;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0571, code lost:
        r2 = r73;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.etsy.android.lib.models.ReceiptApiModel fromJson(com.squareup.moshi.JsonReader r88) {
        /*
            r87 = this;
            r0 = r87
            r1 = r88
            java.lang.String r2 = "reader"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            r88.mo68410b()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
            r28 = r27
            r29 = r28
            r30 = r29
            r31 = r30
            r32 = r31
            r33 = r32
            r34 = r33
            r35 = r34
            r36 = r35
            r37 = r36
            r38 = r37
            r39 = r38
            r40 = r39
            r41 = r40
            r42 = r41
            r43 = r42
            r46 = r43
            r47 = r46
            r48 = r47
            r49 = r48
            r50 = r49
            r51 = r50
            r52 = r51
            r53 = r52
            r54 = r53
            r55 = r54
            r56 = r55
            r57 = r56
            r58 = r57
            r60 = r58
            r62 = r60
        L_0x0070:
            boolean r44 = r88.mo68414f()
            r45 = r15
            java.lang.String r15 = "totalPrice"
            r59 = r8
            java.lang.String r8 = "vat_credit_note_ids"
            r61 = r14
            java.lang.String r14 = "vatCreditNoteIds"
            r63 = r13
            java.lang.String r13 = "total_vat_cost"
            r64 = r12
            java.lang.String r12 = "totalVatCost"
            r65 = r11
            java.lang.String r11 = "total_tax_cost"
            r66 = r10
            java.lang.String r10 = "totalTaxCost"
            r67 = r9
            java.lang.String r9 = "was_giftcard_balance_applied"
            r68 = r7
            java.lang.String r7 = "wasGiftCardBalanceApplied"
            r69 = r6
            java.lang.String r6 = "was_paid"
            r70 = r5
            java.lang.String r5 = "wasPaid"
            r71 = r4
            java.lang.String r4 = "flagged_for_manual_fraud_review"
            r72 = r3
            java.lang.String r3 = "isFlaggedForManualFraudReview"
            r73 = r2
            java.lang.String r2 = "receipt_type"
            r74 = r2
            java.lang.String r2 = "receiptTypeCode"
            r75 = r2
            java.lang.String r2 = "receipt_id"
            r76 = r2
            java.lang.String r2 = "receiptId"
            r77 = r2
            java.lang.String r2 = "shipments"
            r78 = r3
            java.lang.String r3 = "transactions"
            r79 = r4
            java.lang.String r4 = "city"
            r80 = r5
            java.lang.String r5 = "name"
            if (r44 == 0) goto L_0x0575
            r44 = r6
            com.squareup.moshi.JsonReader$b r6 = r0.options
            int r6 = r1.mo68406Q(r6)
            switch(r6) {
                case -1: goto L_0x0551;
                case 0: goto L_0x0522;
                case 1: goto L_0x04f5;
                case 2: goto L_0x04e8;
                case 3: goto L_0x04dd;
                case 4: goto L_0x04b1;
                case 5: goto L_0x0487;
                case 6: goto L_0x0463;
                case 7: goto L_0x0457;
                case 8: goto L_0x0444;
                case 9: goto L_0x0438;
                case 10: goto L_0x0425;
                case 11: goto L_0x0412;
                case 12: goto L_0x0406;
                case 13: goto L_0x03fa;
                case 14: goto L_0x03ee;
                case 15: goto L_0x03d9;
                case 16: goto L_0x03c2;
                case 17: goto L_0x03ab;
                case 18: goto L_0x0394;
                case 19: goto L_0x037d;
                case 20: goto L_0x0366;
                case 21: goto L_0x034f;
                case 22: goto L_0x0329;
                case 23: goto L_0x0305;
                case 24: goto L_0x02e3;
                case 25: goto L_0x02d7;
                case 26: goto L_0x02cb;
                case 27: goto L_0x02b8;
                case 28: goto L_0x02a1;
                case 29: goto L_0x0295;
                case 30: goto L_0x0282;
                case 31: goto L_0x0276;
                case 32: goto L_0x026a;
                case 33: goto L_0x025e;
                case 34: goto L_0x0252;
                case 35: goto L_0x0246;
                case 36: goto L_0x023a;
                case 37: goto L_0x0223;
                case 38: goto L_0x0203;
                case 39: goto L_0x01f7;
                case 40: goto L_0x01eb;
                case 41: goto L_0x01df;
                case 42: goto L_0x01d3;
                case 43: goto L_0x01c7;
                case 44: goto L_0x01bb;
                case 45: goto L_0x01af;
                case 46: goto L_0x01a3;
                case 47: goto L_0x0197;
                case 48: goto L_0x018b;
                case 49: goto L_0x0178;
                case 50: goto L_0x0165;
                case 51: goto L_0x0159;
                case 52: goto L_0x013b;
                case 53: goto L_0x0124;
                case 54: goto L_0x0108;
                case 55: goto L_0x00f1;
                case 56: goto L_0x00d7;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            goto L_0x0557
        L_0x00d7:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r14 = r2
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            if (r14 == 0) goto L_0x00e8
            r15 = r45
            r8 = r59
            goto L_0x055d
        L_0x00e8:
            java.lang.String r2 = "needsGiftWrap"
            java.lang.String r3 = "needs_gift_wrap"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x00f1:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r62 = r2
            java.lang.String r62 = (java.lang.String) r62
            if (r62 == 0) goto L_0x00ff
            goto L_0x0557
        L_0x00ff:
            java.lang.String r2 = "giftMessage"
            java.lang.String r3 = "gift_message"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0108:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r13 = r2
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            if (r13 == 0) goto L_0x011b
            r15 = r45
            r8 = r59
            r14 = r61
            goto L_0x055f
        L_0x011b:
            java.lang.String r2 = "isGift"
            java.lang.String r3 = "is_gift"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0124:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r60 = r2
            java.lang.String r60 = (java.lang.String) r60
            if (r60 == 0) goto L_0x0132
            goto L_0x0557
        L_0x0132:
            java.lang.String r2 = "multiShopNote"
            java.lang.String r3 = "multi_shop_note"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x013b:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r12 = r2
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            if (r12 == 0) goto L_0x0150
            r15 = r45
            r8 = r59
            r14 = r61
            r13 = r63
            goto L_0x0561
        L_0x0150:
            java.lang.String r2 = "isGuest"
            java.lang.String r3 = "is_guest"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0159:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.UserNote>> r2 = r0.nullableListOfUserNoteAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r58 = r2
            java.util.List r58 = (java.util.List) r58
            goto L_0x0557
        L_0x0165:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.ReceiptShipment>> r3 = r0.listOfReceiptShipmentAdapter
            java.lang.Object r3 = r3.fromJson((com.squareup.moshi.JsonReader) r1)
            r57 = r3
            java.util.List r57 = (java.util.List) r57
            if (r57 == 0) goto L_0x0173
            goto L_0x0557
        L_0x0173:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r2, r1)
            throw r1
        L_0x0178:
            com.squareup.moshi.JsonAdapter<java.util.List<com.etsy.android.lib.models.Transaction>> r2 = r0.listOfTransactionAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r56 = r2
            java.util.List r56 = (java.util.List) r56
            if (r56 == 0) goto L_0x0186
            goto L_0x0557
        L_0x0186:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r3, r1)
            throw r1
        L_0x018b:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.Location> r2 = r0.nullableLocationAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r55 = r2
            com.etsy.android.lib.models.Location r55 = (com.etsy.android.lib.models.Location) r55
            goto L_0x0557
        L_0x0197:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.User> r2 = r0.nullableUserAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r54 = r2
            com.etsy.android.lib.models.User r54 = (com.etsy.android.lib.models.User) r54
            goto L_0x0557
        L_0x01a3:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.GuestUser> r2 = r0.nullableGuestUserAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r53 = r2
            com.etsy.android.lib.models.GuestUser r53 = (com.etsy.android.lib.models.GuestUser) r53
            goto L_0x0557
        L_0x01af:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.User> r2 = r0.nullableUserAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r52 = r2
            com.etsy.android.lib.models.User r52 = (com.etsy.android.lib.models.User) r52
            goto L_0x0557
        L_0x01bb:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.Country> r2 = r0.nullableCountryAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r51 = r2
            com.etsy.android.lib.models.Country r51 = (com.etsy.android.lib.models.Country) r51
            goto L_0x0557
        L_0x01c7:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.Coupon> r2 = r0.nullableCouponAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r50 = r2
            com.etsy.android.lib.models.Coupon r50 = (com.etsy.android.lib.models.Coupon) r50
            goto L_0x0557
        L_0x01d3:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r49 = r2
            java.lang.Long r49 = (java.lang.Long) r49
            goto L_0x0557
        L_0x01df:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r48 = r2
            java.lang.Long r48 = (java.lang.Long) r48
            goto L_0x0557
        L_0x01eb:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.nullableLongAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r47 = r2
            java.lang.Long r47 = (java.lang.Long) r47
            goto L_0x0557
        L_0x01f7:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.nullableBooleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r46 = r2
            java.lang.Boolean r46 = (java.lang.Boolean) r46
            goto L_0x0557
        L_0x0203:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r11 = r2
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto L_0x021a
            r15 = r45
            r8 = r59
            r14 = r61
            r13 = r63
            r12 = r64
            goto L_0x0563
        L_0x021a:
            java.lang.String r2 = "creationTsz"
            java.lang.String r3 = "creation_tsz"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0223:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.ReceiptShippingDetails> r2 = r0.receiptShippingDetailsAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r43 = r2
            com.etsy.android.lib.models.ReceiptShippingDetails r43 = (com.etsy.android.lib.models.ReceiptShippingDetails) r43
            if (r43 == 0) goto L_0x0231
            goto L_0x0557
        L_0x0231:
            java.lang.String r2 = "shippingDetails"
            java.lang.String r3 = "shipping_details"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x023a:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r42 = r2
            java.lang.String r42 = (java.lang.String) r42
            goto L_0x0557
        L_0x0246:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r41 = r2
            java.lang.String r41 = (java.lang.String) r41
            goto L_0x0557
        L_0x0252:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r40 = r2
            java.lang.String r40 = (java.lang.String) r40
            goto L_0x0557
        L_0x025e:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r39 = r2
            java.lang.String r39 = (java.lang.String) r39
            goto L_0x0557
        L_0x026a:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r38 = r2
            java.lang.String r38 = (java.lang.String) r38
            goto L_0x0557
        L_0x0276:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r37 = r2
            java.lang.String r37 = (java.lang.String) r37
            goto L_0x0557
        L_0x0282:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r36 = r2
            java.lang.String r36 = (java.lang.String) r36
            if (r36 == 0) goto L_0x0290
            goto L_0x0557
        L_0x0290:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r4, r4, r1)
            throw r1
        L_0x0295:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r35 = r2
            java.lang.String r35 = (java.lang.String) r35
            goto L_0x0557
        L_0x02a1:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r34 = r2
            java.lang.String r34 = (java.lang.String) r34
            if (r34 == 0) goto L_0x02af
            goto L_0x0557
        L_0x02af:
            java.lang.String r2 = "firstLine"
            java.lang.String r3 = "first_line"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x02b8:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r33 = r2
            java.lang.String r33 = (java.lang.String) r33
            if (r33 == 0) goto L_0x02c6
            goto L_0x0557
        L_0x02c6:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r5, r5, r1)
            throw r1
        L_0x02cb:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r32 = r2
            java.lang.String r32 = (java.lang.String) r32
            goto L_0x0557
        L_0x02d7:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r31 = r2
            java.lang.String r31 = (java.lang.String) r31
            goto L_0x0557
        L_0x02e3:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r10 = r2
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            if (r10 == 0) goto L_0x02fc
            r15 = r45
            r8 = r59
            r14 = r61
            r13 = r63
            r12 = r64
            r11 = r65
            goto L_0x0565
        L_0x02fc:
            java.lang.String r2 = "isAnonymousBuyer"
            java.lang.String r3 = "is_anonymous_buyer"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0305:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r9 = r2
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L_0x0320
            r15 = r45
            r8 = r59
            r14 = r61
            r13 = r63
            r12 = r64
            r11 = r65
            r10 = r66
            goto L_0x0567
        L_0x0320:
            java.lang.String r2 = "isInPerson"
            java.lang.String r3 = "is_in_person"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0329:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r7 = r2
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L_0x0346
            r15 = r45
            r8 = r59
            r14 = r61
            r13 = r63
            r12 = r64
            r11 = r65
            r10 = r66
            r9 = r67
            goto L_0x0569
        L_0x0346:
            java.lang.String r2 = "wasShipped"
            java.lang.String r3 = "was_shipped"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x034f:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r30 = r2
            java.lang.String r30 = (java.lang.String) r30
            if (r30 == 0) goto L_0x035d
            goto L_0x0557
        L_0x035d:
            java.lang.String r2 = "transparentPriceMessage"
            java.lang.String r3 = "transparent_price_message"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0366:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r29 = r2
            java.lang.String r29 = (java.lang.String) r29
            if (r29 == 0) goto L_0x0374
            goto L_0x0557
        L_0x0374:
            java.lang.String r2 = "currencyCode"
            java.lang.String r3 = "currency_code"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x037d:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r28 = r2
            java.lang.String r28 = (java.lang.String) r28
            if (r28 == 0) goto L_0x038b
            goto L_0x0557
        L_0x038b:
            java.lang.String r2 = "grandTotalAmount"
            java.lang.String r3 = "grandtotal"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x0394:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r27 = r2
            java.lang.String r27 = (java.lang.String) r27
            if (r27 == 0) goto L_0x03a2
            goto L_0x0557
        L_0x03a2:
            java.lang.String r2 = "etsyDiscountAmount"
            java.lang.String r3 = "etsy_coupon_discount_amt"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x03ab:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r26 = r2
            java.lang.String r26 = (java.lang.String) r26
            if (r26 == 0) goto L_0x03b9
            goto L_0x0557
        L_0x03b9:
            java.lang.String r2 = "discountAmount"
            java.lang.String r3 = "discount_amt"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x03c2:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r25 = r2
            java.lang.String r25 = (java.lang.String) r25
            if (r25 == 0) goto L_0x03d0
            goto L_0x0557
        L_0x03d0:
            java.lang.String r2 = "totalShippingCost"
            java.lang.String r3 = "total_shipping_cost"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r3, r1)
            throw r1
        L_0x03d9:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r24 = r2
            java.lang.String r24 = (java.lang.String) r24
            if (r24 == 0) goto L_0x03e7
            goto L_0x0557
        L_0x03e7:
            java.lang.String r2 = "total_price"
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r15, r2, r1)
            throw r1
        L_0x03ee:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r23 = r2
            java.lang.String r23 = (java.lang.String) r23
            goto L_0x0557
        L_0x03fa:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r22 = r2
            java.lang.String r22 = (java.lang.String) r22
            goto L_0x0557
        L_0x0406:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r21 = r2
            java.lang.String r21 = (java.lang.String) r21
            goto L_0x0557
        L_0x0412:
            com.squareup.moshi.JsonAdapter<java.util.List<java.lang.String>> r2 = r0.listOfStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r20 = r2
            java.util.List r20 = (java.util.List) r20
            if (r20 == 0) goto L_0x0420
            goto L_0x0557
        L_0x0420:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r14, r8, r1)
            throw r1
        L_0x0425:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r19 = r2
            java.lang.String r19 = (java.lang.String) r19
            if (r19 == 0) goto L_0x0433
            goto L_0x0557
        L_0x0433:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r12, r13, r1)
            throw r1
        L_0x0438:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r18 = r2
            java.lang.String r18 = (java.lang.String) r18
            goto L_0x0557
        L_0x0444:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.stringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r17 = r2
            java.lang.String r17 = (java.lang.String) r17
            if (r17 == 0) goto L_0x0452
            goto L_0x0557
        L_0x0452:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r10, r11, r1)
            throw r1
        L_0x0457:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r16 = r2
            java.lang.String r16 = (java.lang.String) r16
            goto L_0x0557
        L_0x0463:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r6 = r2
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L_0x0482
            r15 = r45
            r8 = r59
            r14 = r61
            r13 = r63
            r12 = r64
            r11 = r65
            r10 = r66
            r9 = r67
            r7 = r68
            goto L_0x056b
        L_0x0482:
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r7, r9, r1)
            throw r1
        L_0x0487:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r5 = r2
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L_0x04a8
            r15 = r45
            r8 = r59
            r14 = r61
            r13 = r63
            r12 = r64
            r11 = r65
            r10 = r66
            r9 = r67
            r7 = r68
            r6 = r69
            goto L_0x056d
        L_0x04a8:
            r6 = r44
            r2 = r80
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r2, r6, r1)
            throw r1
        L_0x04b1:
            com.squareup.moshi.JsonAdapter<java.lang.Boolean> r2 = r0.booleanAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r4 = r2
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x04d4
            r15 = r45
            r8 = r59
            r14 = r61
            r13 = r63
            r12 = r64
            r11 = r65
            r10 = r66
            r9 = r67
            r7 = r68
            r6 = r69
            r5 = r70
            goto L_0x056f
        L_0x04d4:
            r3 = r78
            r2 = r79
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r2, r1)
            throw r1
        L_0x04dd:
            com.squareup.moshi.JsonAdapter<com.etsy.android.lib.models.PaymentMethod> r2 = r0.nullablePaymentMethodAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r15 = r2
            com.etsy.android.lib.models.PaymentMethod r15 = (com.etsy.android.lib.models.PaymentMethod) r15
            goto L_0x0559
        L_0x04e8:
            com.squareup.moshi.JsonAdapter<java.lang.String> r2 = r0.nullableStringAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            r15 = r45
            goto L_0x055b
        L_0x04f5:
            com.squareup.moshi.JsonAdapter<java.lang.Integer> r2 = r0.intAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            r3 = r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0519
            r15 = r45
            r8 = r59
            r14 = r61
            r13 = r63
            r12 = r64
            r11 = r65
            r10 = r66
            r9 = r67
            r7 = r68
            r6 = r69
            r5 = r70
            r4 = r71
            goto L_0x0571
        L_0x0519:
            r2 = r74
            r3 = r75
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r2, r1)
            throw r1
        L_0x0522:
            com.squareup.moshi.JsonAdapter<java.lang.Long> r2 = r0.longAdapter
            java.lang.Object r2 = r2.fromJson((com.squareup.moshi.JsonReader) r1)
            java.lang.Long r2 = (java.lang.Long) r2
            if (r2 == 0) goto L_0x0548
            r15 = r45
            r8 = r59
            r14 = r61
            r13 = r63
            r12 = r64
            r11 = r65
            r10 = r66
            r9 = r67
            r7 = r68
            r6 = r69
            r5 = r70
            r4 = r71
            r3 = r72
            goto L_0x0070
        L_0x0548:
            r2 = r76
            r3 = r77
            com.squareup.moshi.JsonDataException r1 = p618lp.C18215a.m30734m(r3, r2, r1)
            throw r1
        L_0x0551:
            r88.mo68408S()
            r88.mo68411c0()
        L_0x0557:
            r15 = r45
        L_0x0559:
            r8 = r59
        L_0x055b:
            r14 = r61
        L_0x055d:
            r13 = r63
        L_0x055f:
            r12 = r64
        L_0x0561:
            r11 = r65
        L_0x0563:
            r10 = r66
        L_0x0565:
            r9 = r67
        L_0x0567:
            r7 = r68
        L_0x0569:
            r6 = r69
        L_0x056b:
            r5 = r70
        L_0x056d:
            r4 = r71
        L_0x056f:
            r3 = r72
        L_0x0571:
            r2 = r73
            goto L_0x0070
        L_0x0575:
            r83 = r74
            r84 = r75
            r85 = r76
            r86 = r77
            r82 = r78
            r81 = r79
            r0 = r80
            r88.mo68413e()
            com.etsy.android.lib.models.ReceiptApiModel r74 = new com.etsy.android.lib.models.ReceiptApiModel
            if (r73 == 0) goto L_0x0710
            long r75 = r73.longValue()
            if (r72 == 0) goto L_0x0707
            int r44 = r72.intValue()
            if (r71 == 0) goto L_0x06fe
            boolean r71 = r71.booleanValue()
            if (r70 == 0) goto L_0x06f9
            boolean r0 = r70.booleanValue()
            if (r69 == 0) goto L_0x06f4
            boolean r69 = r69.booleanValue()
            if (r17 == 0) goto L_0x06ef
            if (r19 == 0) goto L_0x06ea
            if (r20 == 0) goto L_0x06e5
            if (r24 == 0) goto L_0x06de
            if (r25 == 0) goto L_0x06d5
            if (r26 == 0) goto L_0x06cc
            if (r27 == 0) goto L_0x06c3
            if (r28 == 0) goto L_0x06ba
            if (r29 == 0) goto L_0x06b1
            if (r30 == 0) goto L_0x06a8
            if (r68 == 0) goto L_0x069f
            boolean r68 = r68.booleanValue()
            if (r67 == 0) goto L_0x0696
            boolean r67 = r67.booleanValue()
            if (r66 == 0) goto L_0x068d
            boolean r66 = r66.booleanValue()
            if (r33 == 0) goto L_0x0688
            if (r34 == 0) goto L_0x067f
            if (r36 == 0) goto L_0x067a
            if (r43 == 0) goto L_0x0671
            if (r65 == 0) goto L_0x0668
            long r72 = r65.longValue()
            if (r56 == 0) goto L_0x0663
            if (r57 == 0) goto L_0x065e
            if (r64 == 0) goto L_0x0655
            boolean r2 = r64.booleanValue()
            if (r60 == 0) goto L_0x064c
            if (r63 == 0) goto L_0x0643
            boolean r3 = r63.booleanValue()
            if (r62 == 0) goto L_0x063a
            if (r61 == 0) goto L_0x0631
            boolean r63 = r61.booleanValue()
            r4 = r74
            r5 = r75
            r7 = r44
            r8 = r59
            r9 = r45
            r10 = r71
            r11 = r0
            r12 = r69
            r13 = r16
            r14 = r17
            r15 = r18
            r16 = r19
            r17 = r20
            r18 = r21
            r19 = r22
            r20 = r23
            r21 = r24
            r22 = r25
            r23 = r26
            r24 = r27
            r25 = r28
            r26 = r29
            r27 = r30
            r28 = r68
            r29 = r67
            r30 = r66
            r44 = r72
            r59 = r2
            r61 = r3
            r4.<init>(r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            return r74
        L_0x0631:
            java.lang.String r0 = "needsGiftWrap"
            java.lang.String r2 = "needs_gift_wrap"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x063a:
            java.lang.String r0 = "giftMessage"
            java.lang.String r2 = "gift_message"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x0643:
            java.lang.String r0 = "isGift"
            java.lang.String r2 = "is_gift"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x064c:
            java.lang.String r0 = "multiShopNote"
            java.lang.String r2 = "multi_shop_note"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x0655:
            java.lang.String r0 = "isGuest"
            java.lang.String r2 = "is_guest"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x065e:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r2, r1)
            throw r0
        L_0x0663:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r3, r3, r1)
            throw r0
        L_0x0668:
            java.lang.String r0 = "creationTsz"
            java.lang.String r2 = "creation_tsz"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x0671:
            java.lang.String r0 = "shippingDetails"
            java.lang.String r2 = "shipping_details"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x067a:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r4, r4, r1)
            throw r0
        L_0x067f:
            java.lang.String r0 = "firstLine"
            java.lang.String r2 = "first_line"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x0688:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r5, r5, r1)
            throw r0
        L_0x068d:
            java.lang.String r0 = "isAnonymousBuyer"
            java.lang.String r2 = "is_anonymous_buyer"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x0696:
            java.lang.String r0 = "isInPerson"
            java.lang.String r2 = "is_in_person"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x069f:
            java.lang.String r0 = "wasShipped"
            java.lang.String r2 = "was_shipped"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x06a8:
            java.lang.String r0 = "transparentPriceMessage"
            java.lang.String r2 = "transparent_price_message"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x06b1:
            java.lang.String r0 = "currencyCode"
            java.lang.String r2 = "currency_code"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x06ba:
            java.lang.String r0 = "grandTotalAmount"
            java.lang.String r2 = "grandtotal"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x06c3:
            java.lang.String r0 = "etsyDiscountAmount"
            java.lang.String r2 = "etsy_coupon_discount_amt"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x06cc:
            java.lang.String r0 = "discountAmount"
            java.lang.String r2 = "discount_amt"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x06d5:
            java.lang.String r0 = "totalShippingCost"
            java.lang.String r2 = "total_shipping_cost"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r2, r1)
            throw r0
        L_0x06de:
            java.lang.String r0 = "total_price"
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r15, r0, r1)
            throw r0
        L_0x06e5:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r14, r8, r1)
            throw r0
        L_0x06ea:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r12, r13, r1)
            throw r0
        L_0x06ef:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r10, r11, r1)
            throw r0
        L_0x06f4:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r7, r9, r1)
            throw r0
        L_0x06f9:
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r0, r6, r1)
            throw r0
        L_0x06fe:
            r0 = r81
            r2 = r82
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        L_0x0707:
            r0 = r83
            r2 = r84
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        L_0x0710:
            r0 = r85
            r2 = r86
            com.squareup.moshi.JsonDataException r0 = p618lp.C18215a.m30728g(r2, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.models.ReceiptApiModelJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.etsy.android.lib.models.ReceiptApiModel");
    }

    public void toJson(C17412w wVar, ReceiptApiModel receiptApiModel) {
        C19383o.m32797g(wVar, "writer");
        if (receiptApiModel != null) {
            wVar.mo68522b();
            wVar.mo68529h(ResponseConstants.RECEIPT_ID);
            this.longAdapter.toJson(wVar, Long.valueOf(receiptApiModel.getReceiptId()));
            wVar.mo68529h("receipt_type");
            this.intAdapter.toJson(wVar, Integer.valueOf(receiptApiModel.getReceiptTypeCode()));
            wVar.mo68529h("payment_method_name");
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getPaymentMethodName());
            wVar.mo68529h("payment_method_object");
            this.nullablePaymentMethodAdapter.toJson(wVar, receiptApiModel.getPaymentMethod());
            wVar.mo68529h("flagged_for_manual_fraud_review");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(receiptApiModel.isFlaggedForManualFraudReview()));
            wVar.mo68529h("was_paid");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(receiptApiModel.getWasPaid()));
            wVar.mo68529h("was_giftcard_balance_applied");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(receiptApiModel.getWasGiftCardBalanceApplied()));
            wVar.mo68529h("buyer_primary_gc_amt");
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getGiftCardAmountApplied());
            wVar.mo68529h("total_tax_cost");
            this.stringAdapter.toJson(wVar, receiptApiModel.getTotalTaxCost());
            wVar.mo68529h("gift_wrap_price");
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getGiftPrice());
            wVar.mo68529h("total_vat_cost");
            this.stringAdapter.toJson(wVar, receiptApiModel.getTotalVatCost());
            wVar.mo68529h("vat_credit_note_ids");
            this.listOfStringAdapter.toJson(wVar, receiptApiModel.getVatCreditNoteIds());
            wVar.mo68529h("donation_description");
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getDonationDescription());
            wVar.mo68529h("donation_terms_link_url");
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getDonationTermsLinkUrl());
            wVar.mo68529h("donation_terms_link_text");
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getDonationTermsLinkText());
            wVar.mo68529h(ResponseConstants.TOTAL_PRICE);
            this.stringAdapter.toJson(wVar, receiptApiModel.getTotalPrice());
            wVar.mo68529h("total_shipping_cost");
            this.stringAdapter.toJson(wVar, receiptApiModel.getTotalShippingCost());
            wVar.mo68529h("discount_amt");
            this.stringAdapter.toJson(wVar, receiptApiModel.getDiscountAmount());
            wVar.mo68529h("etsy_coupon_discount_amt");
            this.stringAdapter.toJson(wVar, receiptApiModel.getEtsyDiscountAmount());
            wVar.mo68529h("grandtotal");
            this.stringAdapter.toJson(wVar, receiptApiModel.getGrandTotalAmount());
            wVar.mo68529h(ResponseConstants.CURRENCY_CODE);
            this.stringAdapter.toJson(wVar, receiptApiModel.getCurrencyCode());
            wVar.mo68529h(ResponseConstants.TRANSPARENT_PRICE_MESSAGE);
            this.stringAdapter.toJson(wVar, receiptApiModel.getTransparentPriceMessage());
            wVar.mo68529h("was_shipped");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(receiptApiModel.getWasShipped()));
            wVar.mo68529h("is_in_person");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(receiptApiModel.isInPerson()));
            wVar.mo68529h("is_anonymous_buyer");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(receiptApiModel.isAnonymousBuyer()));
            wVar.mo68529h("shipping_carrier");
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getShippingCarrier());
            wVar.mo68529h("seller_email");
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getSellerEmail());
            wVar.mo68529h("name");
            this.stringAdapter.toJson(wVar, receiptApiModel.getName());
            wVar.mo68529h(ResponseConstants.FIRST_LINE);
            this.stringAdapter.toJson(wVar, receiptApiModel.getFirstLine());
            wVar.mo68529h(ResponseConstants.SECOND_LINE);
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getSecondLine());
            wVar.mo68529h("city");
            this.stringAdapter.toJson(wVar, receiptApiModel.getCity());
            wVar.mo68529h("state");
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getState());
            wVar.mo68529h(ResponseConstants.ZIP);
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getZip());
            wVar.mo68529h("message_from_seller");
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getMessageFromSeller());
            wVar.mo68529h("message_from_buyer");
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getMessageFromBuyer());
            wVar.mo68529h("shipping_note");
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getShippingNote());
            wVar.mo68529h("shipping_tracking_url");
            this.nullableStringAdapter.toJson(wVar, receiptApiModel.getShippingTrackingUrl());
            wVar.mo68529h("shipping_details");
            this.receiptShippingDetailsAdapter.toJson(wVar, receiptApiModel.getShippingDetails());
            wVar.mo68529h(ResponseConstants.CREATION_TSZ);
            this.longAdapter.toJson(wVar, Long.valueOf(receiptApiModel.getCreationTsz()));
            wVar.mo68529h("can_refund");
            this.nullableBooleanAdapter.toJson(wVar, receiptApiModel.getCanRefund());
            wVar.mo68529h("shipping_notification_date");
            this.nullableLongAdapter.toJson(wVar, receiptApiModel.getShippingNotificationTsz());
            wVar.mo68529h("shipped_date");
            this.nullableLongAdapter.toJson(wVar, receiptApiModel.getShippedTsz());
            wVar.mo68529h("estimated_shipped_tsz");
            this.nullableLongAdapter.toJson(wVar, receiptApiModel.getEstimatedShippedTsz());
            wVar.mo68529h("coupon");
            this.nullableCouponAdapter.toJson(wVar, receiptApiModel.getCoupon());
            wVar.mo68529h("country");
            this.nullableCountryAdapter.toJson(wVar, receiptApiModel.getCountry());
            wVar.mo68529h("buyer");
            this.nullableUserAdapter.toJson(wVar, receiptApiModel.getBuyer());
            wVar.mo68529h("guest_buyer");
            this.nullableGuestUserAdapter.toJson(wVar, receiptApiModel.getGuestUser());
            wVar.mo68529h("seller");
            this.nullableUserAdapter.toJson(wVar, receiptApiModel.getSeller());
            wVar.mo68529h("locations");
            this.nullableLocationAdapter.toJson(wVar, receiptApiModel.getLocation());
            wVar.mo68529h(ResponseConstants.TRANSACTIONS);
            this.listOfTransactionAdapter.toJson(wVar, receiptApiModel.getTransactions());
            wVar.mo68529h("shipments");
            this.listOfReceiptShipmentAdapter.toJson(wVar, receiptApiModel.getShipments());
            wVar.mo68529h("UserNotes");
            this.nullableListOfUserNoteAdapter.toJson(wVar, receiptApiModel.getUserNotes());
            wVar.mo68529h(ResponseConstants.IS_GUEST);
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(receiptApiModel.isGuest()));
            wVar.mo68529h("multi_shop_note");
            this.stringAdapter.toJson(wVar, receiptApiModel.getMultiShopNote());
            wVar.mo68529h("is_gift");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(receiptApiModel.isGift()));
            wVar.mo68529h("gift_message");
            this.stringAdapter.toJson(wVar, receiptApiModel.getGiftMessage());
            wVar.mo68529h("needs_gift_wrap");
            this.booleanAdapter.toJson(wVar, Boolean.valueOf(receiptApiModel.getNeedsGiftWrap()));
            wVar.mo68526f();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }
}
