import React from "react";
import TitleRegion from "../region/TitleRegion";
import LoginRegion from './loginregion/LoginRegion'
import './login.css'

function LoginView() {
	return (
		<div id="login-view">
			<TitleRegion title="Login" />
			<LoginRegion />
		</div>
	);
}

export default LoginView;
