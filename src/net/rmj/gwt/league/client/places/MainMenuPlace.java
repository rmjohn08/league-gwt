package net.rmj.gwt.league.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class MainMenuPlace extends Place {


	public MainMenuPlace(){}

	public static class Tokenizer implements PlaceTokenizer<MainMenuPlace> {
		public MainMenuPlace getPlace(String token) {
			return new MainMenuPlace();
		}

		public String getToken(MainMenuPlace place) {
			return null;
		}
	}
}
