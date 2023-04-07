import React from "react";
import { Route, Routes } from "react-router-dom";
import LandingView from "./view/landing/LandingView";
import LoginView from "./view/login/LoginView";
import DemographicsView from "./view/demographic/DemographicsView";
import ChartView from "./view/chart/ChartView";
import HoroscopeView from "./view/horoscope/HoroscopeView";
import CompatabilityView from "./view/compatability/CompatabilityView";
import SignView from "./view/sign/SignView";

function App() {
	return (
		<div className="App">
			<Routes>
				<Route path="/landing" element={<LandingView />} />
				<Route path="/login" element={<LoginView />} />
				<Route path="/demographics" element={<DemographicsView />} />
				<Route path="/chart" element={<ChartView />} />
				<Route path="/horoscope" element={<HoroscopeView />} />
				<Route path="/compatability" element={<CompatabilityView />} />
				<Route path="/sign" element={<SignView />} />
			</Routes>
		</div>
	);
}

export default App;
