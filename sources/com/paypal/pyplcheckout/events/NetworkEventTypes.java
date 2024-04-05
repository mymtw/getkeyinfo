package com.paypal.pyplcheckout.events;

public enum NetworkEventTypes implements EventType {
    NETWORK_AVAILABILITY("Network availability");
    
    private final String description;

    private NetworkEventTypes(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }
}
