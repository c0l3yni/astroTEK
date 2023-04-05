import React from "react";
import TitleRegion from "../../region/TitleRegion";
import { useNavigate } from "react-router-dom";

function LandingView() {
	const navigate = useNavigate();

	function navToLogin() {
		navigate("/login");
	}

	function navToDemographics() {
		navigate("/demographics");
	}

	return (
		<div id="landing-view">
			<TitleRegion title="Home" />
			<button id="nav-to-login" type="button" onClick={navToLogin}>
				Login
			</button>
			<button id="nav-to-demographics" type="button" onClick={navToDemographics}>
				Guest/Demographics/Whatever
			</button>
		</div>
	);
}

export default LandingView;
