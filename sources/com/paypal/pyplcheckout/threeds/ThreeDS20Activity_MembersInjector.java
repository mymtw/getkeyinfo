package com.paypal.pyplcheckout.threeds;

import com.paypal.pyplcheckout.events.Events;
import p634np.C18290b;
import p740eq.C19011a;

public final class ThreeDS20Activity_MembersInjector implements C18290b<ThreeDS20Activity> {
    private final C19011a<Events> eventsProvider;
    private final C19011a<ThreeDS20> threeDS20Provider;

    public ThreeDS20Activity_MembersInjector(C19011a<ThreeDS20> aVar, C19011a<Events> aVar2) {
        this.threeDS20Provider = aVar;
        this.eventsProvider = aVar2;
    }

    public static C18290b<ThreeDS20Activity> create(C19011a<ThreeDS20> aVar, C19011a<Events> aVar2) {
        return new ThreeDS20Activity_MembersInjector(aVar, aVar2);
    }

    public static void injectEvents(ThreeDS20Activity threeDS20Activity, Events events) {
        threeDS20Activity.events = events;
    }

    public static void injectThreeDS20(ThreeDS20Activity threeDS20Activity, ThreeDS20 threeDS20) {
        threeDS20Activity.threeDS20 = threeDS20;
    }

    public void injectMembers(ThreeDS20Activity threeDS20Activity) {
        injectThreeDS20(threeDS20Activity, this.threeDS20Provider.get());
        injectEvents(threeDS20Activity, this.eventsProvider.get());
    }
}
