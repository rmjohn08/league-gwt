package net.rmj.gwt.league.client;

import net.rmj.gwt.league.client.places.HomePlace;
import net.rmj.gwt.league.client.places.LeaguePlace;
import net.rmj.gwt.league.client.places.MainMenuPlace;
import net.rmj.gwt.league.client.places.TeamPlace;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({HomePlace.Tokenizer.class, LeaguePlace.Tokenizer.class,
	TeamPlace.Tokenizer.class, MainMenuPlace.Tokenizer.class})
public interface AppPlacesHistoryMapper extends PlaceHistoryMapper {
}
