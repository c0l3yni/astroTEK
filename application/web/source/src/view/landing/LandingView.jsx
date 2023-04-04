import React from "react";
import TitleRegion from "../../region/TitleRegion";
import { useNavigate } from "react-router-dom";

function LandingView() {
	const navigate = useNavigate();

	const navToLogin = () => {
		navigate("/login");
	};

	return (
		<div id="landing-view">
			<TitleRegion title="Home" />
			<button id="nav-to-login" type="button" onClick={navToLogin}>
				Login
			</button>
		</div>
	);
}

export default LandingView;
