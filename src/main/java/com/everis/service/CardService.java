package com.everis.service;

import com.everis.response.CardResponse;

public interface CardService {
  
  public CardResponse findByDocument(String document);

}
