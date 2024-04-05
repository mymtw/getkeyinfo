package com.etsy.android.p327ui.user.inappnotifications;

import com.etsy.android.lib.models.apiv3.inappnotifications.IANListingCard;
import com.etsy.android.lib.models.apiv3.inappnotifications.IANShopCard;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationAbandonedCartOffer;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationCLOS;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationFBIS;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationListRec;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationNFYFS;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationOneFavoriteLeft;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRFC;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRecommendedShopsHighlighted;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationRecommendedShopsStandard;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationShopSale;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotificationYFNOS;
import com.etsy.android.p327ui.user.inappnotifications.C11554h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p400mf.C13074b;
import p400mf.C13078c;

/* renamed from: com.etsy.android.ui.user.inappnotifications.d */
public final class C11550d implements C13078c {

    /* renamed from: a */
    public final /* synthetic */ C11553g f25574a;

    public C11550d(C11553g gVar) {
        this.f25574a = gVar;
    }

    /* renamed from: a */
    public final void mo31411a(C13074b bVar) {
        C19383o.m32797g(bVar, "update");
        if (bVar instanceof C13074b.C13075a) {
            C11562o oVar = this.f25574a.f25581b;
            C13074b.C13075a aVar = (C13074b.C13075a) bVar;
            long j = aVar.f28745a;
            boolean z = aVar.f28746b;
            List<InAppNotification> list = oVar.f25610d.f25590b;
            if (list != null) {
                for (InAppNotification inAppNotification : list) {
                    switch (C11554h.C11555a.f25591a[inAppNotification.getNotification_type().ordinal()]) {
                        case 3:
                            List<IANListingCard> listings = ((InAppNotificationRFC) inAppNotification).getListings();
                            if (listings == null) {
                                break;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                for (T next : listings) {
                                    Long listingId = ((IANListingCard) next).getListingId();
                                    if (listingId != null && listingId.longValue() == j) {
                                        arrayList.add(next);
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((IANListingCard) it.next()).setHasCollections(z);
                                }
                                C19394m mVar = C19394m.f43287a;
                                break;
                            }
                        case 4:
                            List<IANListingCard> listings2 = ((InAppNotificationAbandonedCartOffer) inAppNotification).getListings();
                            if (listings2 == null) {
                                break;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                for (T next2 : listings2) {
                                    Long listingId2 = ((IANListingCard) next2).getListingId();
                                    if (listingId2 != null && listingId2.longValue() == j) {
                                        arrayList2.add(next2);
                                    }
                                }
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    ((IANListingCard) it2.next()).setHasCollections(z);
                                }
                                C19394m mVar2 = C19394m.f43287a;
                                break;
                            }
                        case 5:
                            List<IANListingCard> listings3 = ((InAppNotificationYFNOS) inAppNotification).getListings();
                            if (listings3 == null) {
                                break;
                            } else {
                                ArrayList arrayList3 = new ArrayList();
                                for (T next3 : listings3) {
                                    Long listingId3 = ((IANListingCard) next3).getListingId();
                                    if (listingId3 != null && listingId3.longValue() == j) {
                                        arrayList3.add(next3);
                                    }
                                }
                                Iterator it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    ((IANListingCard) it3.next()).setHasCollections(z);
                                }
                                C19394m mVar3 = C19394m.f43287a;
                                break;
                            }
                        case 6:
                            List<IANListingCard> listings4 = ((InAppNotificationNFYFS) inAppNotification).getListings();
                            if (listings4 == null) {
                                break;
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                for (T next4 : listings4) {
                                    Long listingId4 = ((IANListingCard) next4).getListingId();
                                    if (listingId4 != null && listingId4.longValue() == j) {
                                        arrayList4.add(next4);
                                    }
                                }
                                Iterator it4 = arrayList4.iterator();
                                while (it4.hasNext()) {
                                    ((IANListingCard) it4.next()).setHasCollections(z);
                                }
                                C19394m mVar4 = C19394m.f43287a;
                                break;
                            }
                        case 7:
                            List<IANListingCard> listings5 = ((InAppNotificationShopSale) inAppNotification).getListings();
                            if (listings5 == null) {
                                break;
                            } else {
                                ArrayList arrayList5 = new ArrayList();
                                for (T next5 : listings5) {
                                    Long listingId5 = ((IANListingCard) next5).getListingId();
                                    if (listingId5 != null && listingId5.longValue() == j) {
                                        arrayList5.add(next5);
                                    }
                                }
                                Iterator it5 = arrayList5.iterator();
                                while (it5.hasNext()) {
                                    ((IANListingCard) it5.next()).setHasCollections(z);
                                }
                                C19394m mVar5 = C19394m.f43287a;
                                break;
                            }
                        case 8:
                            List<IANListingCard> listings6 = ((InAppNotificationCLOS) inAppNotification).getListings();
                            if (listings6 == null) {
                                break;
                            } else {
                                ArrayList arrayList6 = new ArrayList();
                                for (T next6 : listings6) {
                                    Long listingId6 = ((IANListingCard) next6).getListingId();
                                    if (listingId6 != null && listingId6.longValue() == j) {
                                        arrayList6.add(next6);
                                    }
                                }
                                Iterator it6 = arrayList6.iterator();
                                while (it6.hasNext()) {
                                    ((IANListingCard) it6.next()).setHasCollections(z);
                                }
                                C19394m mVar6 = C19394m.f43287a;
                                break;
                            }
                        case 9:
                            List<IANListingCard> listings7 = ((InAppNotificationFBIS) inAppNotification).getListings();
                            if (listings7 == null) {
                                break;
                            } else {
                                ArrayList arrayList7 = new ArrayList();
                                for (T next7 : listings7) {
                                    Long listingId7 = ((IANListingCard) next7).getListingId();
                                    if (listingId7 != null && listingId7.longValue() == j) {
                                        arrayList7.add(next7);
                                    }
                                }
                                Iterator it7 = arrayList7.iterator();
                                while (it7.hasNext()) {
                                    ((IANListingCard) it7.next()).setHasCollections(z);
                                }
                                C19394m mVar7 = C19394m.f43287a;
                                break;
                            }
                        case 10:
                            List<IANListingCard> listings8 = ((InAppNotificationListRec) inAppNotification).getListings();
                            if (listings8 == null) {
                                break;
                            } else {
                                ArrayList arrayList8 = new ArrayList();
                                for (T next8 : listings8) {
                                    Long listingId8 = ((IANListingCard) next8).getListingId();
                                    if (listingId8 != null && listingId8.longValue() == j) {
                                        arrayList8.add(next8);
                                    }
                                }
                                Iterator it8 = arrayList8.iterator();
                                while (it8.hasNext()) {
                                    ((IANListingCard) it8.next()).setHasCollections(z);
                                }
                                C19394m mVar8 = C19394m.f43287a;
                                break;
                            }
                        case 11:
                            List<IANListingCard> listings9 = ((InAppNotificationOneFavoriteLeft) inAppNotification).getListings();
                            if (listings9 == null) {
                                break;
                            } else {
                                ArrayList arrayList9 = new ArrayList();
                                for (T next9 : listings9) {
                                    Long listingId9 = ((IANListingCard) next9).getListingId();
                                    if (listingId9 != null && listingId9.longValue() == j) {
                                        arrayList9.add(next9);
                                    }
                                }
                                Iterator it9 = arrayList9.iterator();
                                while (it9.hasNext()) {
                                    ((IANListingCard) it9.next()).setHasCollections(z);
                                }
                                C19394m mVar9 = C19394m.f43287a;
                                break;
                            }
                    }
                }
                C19394m mVar10 = C19394m.f43287a;
            }
        } else if (bVar instanceof C13074b.C13076b) {
            C11562o oVar2 = this.f25574a.f25581b;
            C13074b.C13076b bVar2 = (C13074b.C13076b) bVar;
            long j2 = bVar2.f28749a;
            boolean z2 = bVar2.f28750b;
            List<InAppNotification> list2 = oVar2.f25610d.f25590b;
            if (list2 != null) {
                for (InAppNotification inAppNotification2 : list2) {
                    switch (C11554h.C11555a.f25591a[inAppNotification2.getNotification_type().ordinal()]) {
                        case 3:
                            List<IANListingCard> listings10 = ((InAppNotificationRFC) inAppNotification2).getListings();
                            if (listings10 == null) {
                                break;
                            } else {
                                ArrayList arrayList10 = new ArrayList();
                                for (T next10 : listings10) {
                                    Long listingId10 = ((IANListingCard) next10).getListingId();
                                    if (listingId10 != null && listingId10.longValue() == j2) {
                                        arrayList10.add(next10);
                                    }
                                }
                                Iterator it10 = arrayList10.iterator();
                                while (it10.hasNext()) {
                                    ((IANListingCard) it10.next()).setFav(z2);
                                }
                                C19394m mVar11 = C19394m.f43287a;
                                break;
                            }
                            break;
                        case 4:
                            List<IANListingCard> listings11 = ((InAppNotificationAbandonedCartOffer) inAppNotification2).getListings();
                            if (listings11 == null) {
                                break;
                            } else {
                                ArrayList arrayList11 = new ArrayList();
                                for (T next11 : listings11) {
                                    Long listingId11 = ((IANListingCard) next11).getListingId();
                                    if (listingId11 != null && listingId11.longValue() == j2) {
                                        arrayList11.add(next11);
                                    }
                                }
                                Iterator it11 = arrayList11.iterator();
                                while (it11.hasNext()) {
                                    ((IANListingCard) it11.next()).setFav(z2);
                                }
                                C19394m mVar12 = C19394m.f43287a;
                                break;
                            }
                            break;
                        case 5:
                            List<IANListingCard> listings12 = ((InAppNotificationYFNOS) inAppNotification2).getListings();
                            if (listings12 == null) {
                                break;
                            } else {
                                ArrayList arrayList12 = new ArrayList();
                                for (T next12 : listings12) {
                                    Long listingId12 = ((IANListingCard) next12).getListingId();
                                    if (listingId12 != null && listingId12.longValue() == j2) {
                                        arrayList12.add(next12);
                                    }
                                }
                                Iterator it12 = arrayList12.iterator();
                                while (it12.hasNext()) {
                                    ((IANListingCard) it12.next()).setFav(z2);
                                }
                                C19394m mVar13 = C19394m.f43287a;
                                break;
                            }
                            break;
                        case 6:
                            List<IANListingCard> listings13 = ((InAppNotificationNFYFS) inAppNotification2).getListings();
                            if (listings13 == null) {
                                break;
                            } else {
                                ArrayList arrayList13 = new ArrayList();
                                for (T next13 : listings13) {
                                    Long listingId13 = ((IANListingCard) next13).getListingId();
                                    if (listingId13 != null && listingId13.longValue() == j2) {
                                        arrayList13.add(next13);
                                    }
                                }
                                Iterator it13 = arrayList13.iterator();
                                while (it13.hasNext()) {
                                    ((IANListingCard) it13.next()).setFav(z2);
                                }
                                C19394m mVar14 = C19394m.f43287a;
                                break;
                            }
                        case 7:
                            List<IANListingCard> listings14 = ((InAppNotificationShopSale) inAppNotification2).getListings();
                            if (listings14 == null) {
                                break;
                            } else {
                                ArrayList arrayList14 = new ArrayList();
                                for (T next14 : listings14) {
                                    Long listingId14 = ((IANListingCard) next14).getListingId();
                                    if (listingId14 != null && listingId14.longValue() == j2) {
                                        arrayList14.add(next14);
                                    }
                                }
                                Iterator it14 = arrayList14.iterator();
                                while (it14.hasNext()) {
                                    ((IANListingCard) it14.next()).setFav(z2);
                                }
                                C19394m mVar15 = C19394m.f43287a;
                                break;
                            }
                            break;
                        case 8:
                            List<IANListingCard> listings15 = ((InAppNotificationCLOS) inAppNotification2).getListings();
                            if (listings15 == null) {
                                break;
                            } else {
                                ArrayList arrayList15 = new ArrayList();
                                for (T next15 : listings15) {
                                    Long listingId15 = ((IANListingCard) next15).getListingId();
                                    if (listingId15 != null && listingId15.longValue() == j2) {
                                        arrayList15.add(next15);
                                    }
                                }
                                Iterator it15 = arrayList15.iterator();
                                while (it15.hasNext()) {
                                    ((IANListingCard) it15.next()).setFav(z2);
                                }
                                C19394m mVar16 = C19394m.f43287a;
                                break;
                            }
                        case 9:
                            List<IANListingCard> listings16 = ((InAppNotificationFBIS) inAppNotification2).getListings();
                            if (listings16 == null) {
                                break;
                            } else {
                                ArrayList arrayList16 = new ArrayList();
                                for (T next16 : listings16) {
                                    Long listingId16 = ((IANListingCard) next16).getListingId();
                                    if (listingId16 != null && listingId16.longValue() == j2) {
                                        arrayList16.add(next16);
                                    }
                                }
                                Iterator it16 = arrayList16.iterator();
                                while (it16.hasNext()) {
                                    ((IANListingCard) it16.next()).setFav(z2);
                                }
                                C19394m mVar17 = C19394m.f43287a;
                                break;
                            }
                            break;
                        case 10:
                            List<IANListingCard> listings17 = ((InAppNotificationListRec) inAppNotification2).getListings();
                            if (listings17 == null) {
                                break;
                            } else {
                                ArrayList arrayList17 = new ArrayList();
                                for (T next17 : listings17) {
                                    Long listingId17 = ((IANListingCard) next17).getListingId();
                                    if (listingId17 != null && listingId17.longValue() == j2) {
                                        arrayList17.add(next17);
                                    }
                                }
                                Iterator it17 = arrayList17.iterator();
                                while (it17.hasNext()) {
                                    ((IANListingCard) it17.next()).setFav(z2);
                                }
                                C19394m mVar18 = C19394m.f43287a;
                                break;
                            }
                            break;
                        case 11:
                            List<IANListingCard> listings18 = ((InAppNotificationOneFavoriteLeft) inAppNotification2).getListings();
                            if (listings18 == null) {
                                break;
                            } else {
                                ArrayList arrayList18 = new ArrayList();
                                for (T next18 : listings18) {
                                    Long listingId18 = ((IANListingCard) next18).getListingId();
                                    if (listingId18 != null && listingId18.longValue() == j2) {
                                        arrayList18.add(next18);
                                    }
                                }
                                Iterator it18 = arrayList18.iterator();
                                while (it18.hasNext()) {
                                    ((IANListingCard) it18.next()).setFav(z2);
                                }
                                C19394m mVar19 = C19394m.f43287a;
                                break;
                            }
                            break;
                    }
                }
                C19394m mVar20 = C19394m.f43287a;
            }
        } else if (bVar instanceof C13074b.C13077c) {
            C11562o oVar3 = this.f25574a.f25581b;
            C13074b.C13077c cVar = (C13074b.C13077c) bVar;
            long j3 = cVar.f28752a;
            boolean z3 = cVar.f28753b;
            List<InAppNotification> list3 = oVar3.f25610d.f25590b;
            if (list3 != null) {
                for (InAppNotification inAppNotification3 : list3) {
                    int i = C11554h.C11555a.f25591a[inAppNotification3.getNotification_type().ordinal()];
                    if (i == 1) {
                        List<IANShopCard> recommendedShops = ((InAppNotificationRecommendedShopsStandard) inAppNotification3).getRecommendedShops();
                        ArrayList arrayList19 = new ArrayList();
                        for (T next19 : recommendedShops) {
                            if (((IANShopCard) next19).getUserId() == j3) {
                                arrayList19.add(next19);
                            }
                        }
                        Iterator it19 = arrayList19.iterator();
                        while (it19.hasNext()) {
                            ((IANShopCard) it19.next()).setFavorite(z3);
                        }
                    } else if (i == 2) {
                        List<IANShopCard> recommendedShops2 = ((InAppNotificationRecommendedShopsHighlighted) inAppNotification3).getRecommendedShops();
                        ArrayList arrayList20 = new ArrayList();
                        for (T next20 : recommendedShops2) {
                            if (((IANShopCard) next20).getUserId() == j3) {
                                arrayList20.add(next20);
                            }
                        }
                        Iterator it20 = arrayList20.iterator();
                        while (it20.hasNext()) {
                            ((IANShopCard) it20.next()).setFavorite(z3);
                        }
                    }
                }
            }
        }
        this.f25574a.f25580a.updateViews(bVar);
    }
}
