import React from "react";
import { Route, Routes } from "react-router-dom";
import LandingView from "./landing/LandingView";
import LoginView from "./login/LoginView";
import DemographicView from "./demographic/DemographicView";
import ChartView from "./chart/ChartView";
import HoroscopeView from "./horoscope/HoroscopeView";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path="/landing" element={<LandingView />} />
        <Route path="/login" element={<LoginView />} />
        <Route path="/demographic" element={<DemographicView />} />
        <Route path="/chart" element={<ChartView />} />
        <Route path="/horoscope" element={<HoroscopeView />} />
      </Routes>
    </div>
  );
}

export default App;
