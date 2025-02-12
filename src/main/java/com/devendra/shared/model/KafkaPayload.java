package com.devendra.shared.model;

import java.time.LocalDateTime;
import java.util.List;

public class KafkaPayload {

  private String id;

  private String productName;
  private String productDescription;
  private AdTone adTone;
  private AdType adType;
  private Language language;
  private Platform platform;
  private List<TargetAudience> targetAudience;
  private List<AgeGroup> ageGroup;
  private List<Ads> ads;

  private LocalDateTime timestamp;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public String getCallToAction() {
    return callToAction;
  }

  public void setCallToAction(String callToAction) {
    this.callToAction = callToAction;
  }

  private String callToAction;

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public AdTone getAdTone() {
    return adTone;
  }

  public void setAdTone(AdTone adTone) {
    this.adTone = adTone;
  }

  public AdType getAdType() {
    return adType;
  }

  public void setAdType(AdType adType) {
    this.adType = adType;
  }

  public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }

  public Platform getPlatform() {
    return platform;
  }

  public void setPlatform(Platform platform) {
    this.platform = platform;
  }

  public List<TargetAudience> getTargetAudience() {
    return targetAudience;
  }

  public void setTargetAudience(List<TargetAudience> targetAudience) {
    this.targetAudience = targetAudience;
  }

  public List<AgeGroup> getAgeGroup() {
    return ageGroup;
  }

  public void setAgeGroup(List<AgeGroup> ageGroup) {
    this.ageGroup = ageGroup;
  }

  public List<Ads> getAds() {
    return ads;
  }

  public void setAds(List<Ads> ads) {
    this.ads = ads;
  }
}

