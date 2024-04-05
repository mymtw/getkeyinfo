package com.paypal.pyplcheckout.home.view.adapters;

public final class CarouselAdapterTypesKt {
    public static final CarouselAdapterTypes toCarouselAdapterType(int i) {
        CarouselAdapterTypes carouselAdapterTypes;
        boolean z;
        CarouselAdapterTypes carouselAdapterTypes2 = CarouselAdapterTypes.FUNDING_OPTION;
        if (i != carouselAdapterTypes2.getValue()) {
            carouselAdapterTypes2 = CarouselAdapterTypes.BNPL_OFFER;
            if (i != carouselAdapterTypes2.getValue()) {
                carouselAdapterTypes2 = CarouselAdapterTypes.WEB_ADD_CARD;
                if (i != carouselAdapterTypes2.getValue()) {
                    carouselAdapterTypes2 = CarouselAdapterTypes.NATIVE_ADD_CARD;
                    if (i != carouselAdapterTypes2.getValue()) {
                        CarouselAdapterTypes[] values = CarouselAdapterTypes.values();
                        int length = values.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                carouselAdapterTypes = null;
                                break;
                            }
                            carouselAdapterTypes = values[i2];
                            i2++;
                            if (carouselAdapterTypes.getValue() == i) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        if (carouselAdapterTypes != null) {
                            throw new IllegalStateException(i + " should map to " + carouselAdapterTypes + ". Update toCarouselAdapterType to map " + i + " to " + carouselAdapterTypes);
                        }
                        throw new IllegalStateException(i + " does not correspond to a CarouselAdapterTypes. Add new CarouselAdapterTypes enum to map to " + i);
                    }
                }
            }
        }
        return carouselAdapterTypes2;
    }
}
