import React from "react";
import { useNavigate } from "react-router-dom";
import TitleRegion from "../../region/TitleRegion";
import SignListRegion from "./SignListRegion/SignListRegion";

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
			<SignListRegion />
		</div>
	);
}

export default LandingView;
