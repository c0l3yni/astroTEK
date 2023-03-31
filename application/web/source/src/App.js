import React from "react";
import { Route, Routes } from "react-router-dom";
import LandingView from "./landing/LandingView";
import LoginView from "./login/LoginView";

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path="/landing" element={<LandingView />} />
        <Route path="/login" element={<LoginView />} />
      </Routes>
    </div>
  );
}

export default App;
