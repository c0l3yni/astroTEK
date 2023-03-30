import React from "react";
import { Route, Routes } from "react-router-dom";
import LandingView from "./landing/LandingView";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path="/landing-page" element={<LandingView />} />
      </Routes>
    </div>
  );
}

export default App;
