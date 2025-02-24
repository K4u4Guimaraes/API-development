package me.dev.API_development.domain.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import me.dev.API_development.domain.model.AccountModel;
import me.dev.API_development.domain.model.CardModel;
import me.dev.API_development.domain.model.FeatureModel;
import me.dev.API_development.domain.model.NewsModel;

import java.util.List;

public record UserRecordDTO(@NotBlank String name, @NotNull AccountModel account, @NotNull CardModel card, @NotNull List<FeatureModel> features, @NotNull List<NewsModel> news){
}
