import React from "react";

function LoginRegion() {
	return (
		<>
			<form id="login-region">
				<span id="username">Username: </span><input placeholder="username" type="text"></input>
				<span id="password">Password: </span><input placeholder="password" type="password"></input>
				<button id="submit-button" type="button">Login</button>
			</form>
		</>
	);
}

export default LoginRegion;
