import React from "react";

function SignDetailsRegion({ sign }) {
	function renderSignDetails() {
		return sign ? (
			<>
				<li id="sign-name">{sign.name}</li>
				<li id="sign-description">{sign.description}</li>
				<li id="sign-start-date">{sign.startDate}</li>
				<li id="sign-end-date">{sign.endDate}</li>
				<li id="sign-tarot-card">{sign.tarotCard}</li>
				<li id="sign-element">{sign.element}</li>
				<li id="sign-ruling-planet">{sign.rulingPlanet}</li>
				<li id="sign-ruling-house">{sign.rulingHouse}</li>
				<li id="sign-color">{sign.color}</li>
				<li id="sign-sister">{sign.sisterSign}</li>
				<li id="sign-modality">{sign.modality}</li>
			</>
		) : null;
	}

	return <div id="sign-details-region">{renderSignDetails()}</div>;
}

export default SignDetailsRegion;
