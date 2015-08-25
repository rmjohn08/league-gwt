package net.rmj.gwt.league.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class LeaguePlace extends Place {
	
	public static class Tokenizer implements PlaceTokenizer<LeaguePlace> {
		public LeaguePlace getPlace(String token) {
			return new LeaguePlace();
		}

		public String getToken(LeaguePlace place) {
			return null;
		}
	}

}
