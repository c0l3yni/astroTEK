import { useNavigate } from "react-router-dom";
import HeadingRegion from "../../region/HeadingRegion";
import SignListRegion from "./SignListRegion/SignListRegion";
import "./landingView.css";

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
			<HeadingRegion heading="Home" />
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
