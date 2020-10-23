package com.everis.apis;


import com.everis.response.CardResponse;
import com.everis.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardApi {

  @Autowired
  CardService cardService;

  @GetMapping("/core/cards/documentNumber/{document}")
  public CardResponse findByDocument(@PathVariable String document) {
    return cardService.findByDocument(document);
  }

}
