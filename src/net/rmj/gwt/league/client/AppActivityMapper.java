package net.rmj.gwt.league.client;

import net.rmj.gwt.league.client.home.HomeActivity;
import net.rmj.gwt.league.client.league.LeagueActivity;
import net.rmj.gwt.league.client.places.HomePlace;
import net.rmj.gwt.league.client.places.LeaguePlace;
import net.rmj.gwt.league.client.places.TeamPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class AppActivityMapper implements ActivityMapper {
	
	ClientFactory clientFactory;
	
	// not gonna work for now 
	// private Map<Class<? extends Place>, Activity> activityMap; 
	public AppActivityMapper(ClientFactory clientFactory) {
		
		super();
		this.clientFactory = clientFactory;
		
		//activityMap = new HashMap<Class<? extends Place>, Activity>();
		// activityMap.put(HomePlace.class, new HomeActivity());
		// more activities
		
	}
	

	@Override
	public Activity getActivity(Place place) {
		/* Class<? extends Place> placeClass = place.getClass();
		if (!activityMap.containsKey(placeClass)) {
			throw new RuntimeException("There is no activity mapped for place " + placeClass.getName());
		}
		return activityMap.get(place);
		*/
		
		if (place instanceof HomePlace) {
			return new HomeActivity(place, clientFactory);
		} else if (place instanceof LeaguePlace){
			return new LeagueActivity(place, clientFactory);
		} else if(place instanceof TeamPlace) {
			return null; //new TeamActivity(place, clientFactory);
		}
		else 
			return null;
	}

}
