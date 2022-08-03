package com.grokthis.sellable.viewmodel;

import com.grokthis.sellable.SellableApplication;
import lombok.Getter;

@Getter
public class StatusView {
  public enum HealthIndicator {
    UP, DOWN, UNKNOWN
  }

  private final HealthIndicator healthStatus;
  private final String echo;

  public StatusView(String echo) {
    this(HealthIndicator.UP, echo);
  }

  public StatusView(HealthIndicator indicator, String echo) {
    this.healthStatus = indicator;
    this.echo = echo;
  }

  public String getVersion() {
    return SellableApplication.version + "d";
  }
}
