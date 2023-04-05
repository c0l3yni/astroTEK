import React from "react";
import TitleRegion from "../region/TitleRegion";

function LoginView() {
	return (
		<div id="login-view">
			<TitleRegion title="Login" />
			<form id="login-region">
				<span id="username">Username: </span><input placeholder="username" type="text"></input>
				<span id="password">Password: </span><input placeholder="password" type="password"></input>
				<button id="submit-button" type="button">Login</button>
			</form>
		</div>
	);
}

export default LoginView;
