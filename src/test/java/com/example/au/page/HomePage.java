package com.example.au.page;


import org.fluentlenium.core.FluentPage;

import static org.assertj.core.api.Assertions.assertThat;


public class HomePage extends FluentPage {


    public void goToGoogleHomePage() {
        goTo(getBaseUrl());
        assertThat(isInGoogle()).isTrue();

    }

    public boolean isInGoogle() {
        return window().title().contains("Google");
    }


}


