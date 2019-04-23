package io.onedev.server.event.build2;

import io.onedev.server.model.Build;

public class BuildPending extends BuildEvent {

	public BuildPending(Build build) {
		super(null, build.getPendingDate(), build);
	}

}