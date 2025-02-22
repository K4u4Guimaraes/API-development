package me.dev.API_development.domain.model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.UUID;


@Entity(name = "tb_user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private AccountModel account;

    @OneToOne(cascade = CascadeType.ALL)
    private CardModel card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<FeatureModel> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<NewsModel> news;




    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountModel getAccount() {
        return account;
    }

    public void setAccount(AccountModel account) {
        this.account = account;
    }

    public CardModel getCard() {
        return card;
    }

    public void setCard(CardModel card) {
        this.card = card;
    }

    public List<FeatureModel> getFeatures() {
        return features;
    }

    public void setFeatures(List<FeatureModel> features) {
        this.features = features;
    }

    public List<NewsModel> getNews() {
        return news;
    }

    public void setNews(List<NewsModel> news) {
        this.news = news;
    }
}
