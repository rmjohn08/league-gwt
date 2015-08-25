package net.rmj.gwt.league.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class TeamPlace extends Place {
	
	public TeamPlace(){}

	public static class Tokenizer implements PlaceTokenizer<TeamPlace> {
		public TeamPlace getPlace(String token) {
			return new TeamPlace();
		}

		public String getToken(TeamPlace place) {
			return null;
		}
	}
	
}
