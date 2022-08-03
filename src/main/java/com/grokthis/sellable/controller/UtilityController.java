package com.grokthis.sellable.controller;

import com.grokthis.sellable.viewmodel.StatusView;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UtilityController {

  @GetMapping("/status")
  public StatusView getStatus(
      @Param("echo") String echo
  ) {
    return new StatusView(echo);
  }
}
