package com.everis.service;

import com.everis.entities.Card;
import com.everis.response.CardResponse;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

  @Override
  public CardResponse findByDocument(String document) {

    List<Card> cards = new ArrayList<>();
    cards.add(new Card("1111222233334441", true));
    cards.add(new Card("1111222233334442", true));
    cards.add(new Card("1111222233334443", true));
    cards.add(new Card("1111222233334444", false));
    cards.add(new Card("1111222233334445", false));
    cards.add(new Card("1111222233334446", false));

    CardResponse cardResponse = new CardResponse();
    cardResponse.setCards(cards);
    return cardResponse;
  }

}
