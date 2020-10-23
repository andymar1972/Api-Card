package com.everis.response;

import com.everis.entities.Card;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardResponse {
  
  private List<Card> cards;

}
