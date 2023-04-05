import React from "react";

function LoginRegion() {
	return (
		<form id="login-region">
			<div id="row">
				<span id="username">Username: </span>
				<input placeholder="username" type="text"></input>
			</div>
			<div id="row">
				<span id="password">Password: </span>
				<input placeholder="password" type="password"></input>
			</div>
			<button id="submit-button" type="button">Login</button>
		</form>
	);
}

export default LoginRegion;
