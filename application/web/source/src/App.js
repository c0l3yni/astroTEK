import React from "react";
import { Route, Routes } from "react-router-dom";
import LandingView from "./landing/LandingView";
import LoginView from "./login/LoginView";
import DemographicView from "./demographic/DemographicView";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path="/landing" element={<LandingView />} />
        <Route path="/login" element={<LoginView />} />
        <Route path="/demographic" element={<DemographicView />} />
      </Routes>
    </div>
  );
}

export default App;
