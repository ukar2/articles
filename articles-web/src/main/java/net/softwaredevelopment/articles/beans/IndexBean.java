package net.softwaredevelopment.articles.beans;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@RequestScoped
@Named
@Getter
@Setter
public class IndexBean implements Serializable {

    private String value;

    public IndexBean() {
    }

    @PostConstruct
    private void initialization() {
        this.value = "JSF 4.0 and CDI 4.0";
    }
}
