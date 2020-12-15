package com.antocecere77.springselenium.config.page.google;

import com.antocecere77.springselenium.config.page.Base;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class GooglePage extends Base {

    @Autowired
    private SearchComponent searchComponent;

    @Autowired
    private SearchResult searchResult;

    @Value("${application.url}")
    private String url;

    public void goTo() {
        this.driver.get(url);
    }

    @Override
    public boolean isAt() {
        return this.searchComponent.isAt();
    }
}
