package net.rmj.gwt.league.client;

import java.util.logging.Logger;

import net.rmj.gwt.league.client.places.HomePlace;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class AppRunner {

	public final Logger logger = Logger.getLogger("AppLogger");
	
	ClientFactory clientFactory = GWT.create(ClientFactory.class);
	Place defaultPlace = new HomePlace();
	
	public AppRunner() {
	}
	
	public void start() {
		EventBus eb = clientFactory.getEventBus();
		PlaceController placeController = clientFactory.getPlaceController();
		SiteLayout shell = new SiteLayout(clientFactory);
		
		AppPlacesHistoryMapper historyMapper= GWT.create(AppPlacesHistoryMapper.class);
        PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
        historyHandler.register(placeController, eb, defaultPlace);
		
		RootLayoutPanel.get().add(shell);
		
        // Goes to the place represented on URL else default place
        historyHandler.handleCurrentHistory();
        
        logger.info("started app...");

		
	}
}
