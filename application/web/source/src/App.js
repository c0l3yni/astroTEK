import React from "react";
import { Route, Routes } from "react-router-dom";
import LandingView from "./landing/LandingView";
import LoginView from "./login/LoginView";
import DemographicsView from "./demographic/DemographicsView";
import ChartView from "./chart/ChartView";
import HoroscopeView from "./horoscope/HoroscopeView";
import CompatabilityView from "./compatability/CompatabilityView";

function App() {
	return (
		<div className="App">
			<Routes>
				<Route path="/landing" element={<LandingView />} />
				<Route path="/login" element={<LoginView />} />
				<Route path="/demographic" element={<DemographicsView />} />
				<Route path="/chart" element={<ChartView />} />
				<Route path="/horoscope" element={<HoroscopeView />} />
				<Route path="/compatability" element={<CompatabilityView />} />
			</Routes>
		</div>
	);
}

export default App;
