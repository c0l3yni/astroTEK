import React from "react";
import { Route, Routes } from "react-router-dom";
import LandingView from "./view/landing/LandingView";
import LoginView from "./view/login/LoginView";
import DemographicsView from "./view/demographic/DemographicsView";
import ChartView from "./view/chart/ChartView";
import HoroscopeView from "./view/horoscope/HoroscopeView";
import CompatibilityView from "./view/compatability/CompatibilityView";
import SignDetailsView from "./view/signDetails/SignDetailsView";
import MemberLandingView from "./view/memberLanding/MemberLandingView";

function App() {
	return (
		<div className="App">
			<Routes>
				<Route path="/" element={<LandingView />} />
				<Route path="/login" element={<LoginView />} />
				<Route path="/demographics" element={<DemographicsView />} />
				<Route path="/chart" element={<ChartView />} />
				<Route path="/horoscope" element={<HoroscopeView />} />
				<Route path="/compatibility" element={<CompatibilityView />} />
				<Route path="/sign" element={<SignDetailsView />} />
				<Route path="/member-landing" element={<MemberLandingView />} />
			</Routes>
		</div>
	);
}

export default App;
